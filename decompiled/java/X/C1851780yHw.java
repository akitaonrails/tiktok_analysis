package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.speech.speechengine.SpeechEngine;
import com.bytedance.speech.speechengine.SpeechEngineGenerator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.vesdk.VEUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: renamed from: X.0yHw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851780yHw {
    public static final C1851780yHw LIZ = new C1851780yHw();

    public static Object LIZIZ(String str) {
        try {
            C0VSP c0vsp = new C0VSP(new C0VSJ(str));
            if (c0vsp.getChannel().size() == 0) {
                C098200Yq c098200Yq = new C098200Yq(new Exception("empty file"));
                C189200o6.m2constructorimpl(c098200Yq);
                return c098200Yq;
            }
            byte[] bArr = new byte[c0vsp.available()];
            c0vsp.read(bArr);
            C189200o6.m2constructorimpl(bArr);
            return bArr;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C098200Yq c098200Yq2 = new C098200Yq(e);
            C189200o6.m2constructorimpl(c098200Yq2);
            return c098200Yq2;
        }
    }

    public static void LIZ(String str, String str2, C895660ZBs c895660ZBs) {
        Object objLIZIZ;
        boolean z;
        AwS628S0100000_14 awS628S0100000_14 = new AwS628S0100000_14(c895660ZBs, 49);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append("/audio_temp.wav");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        awS628S0100000_14.invoke(EnumC895710ZBx.AUDIO_START, null);
        boolean z2 = true;
        if (((Boolean) C277100AtY.LIZ.getValue()).booleanValue()) {
            objLIZIZ = LIZIZ(str);
            awS628S0100000_14.invoke(EnumC895710ZBx.AUDIO_END, Boolean.TRUE);
        } else {
            int iTransCodeAudio = VEUtils.transCodeAudio(str, strLIZIZ, 1, -1, 8000);
            objLIZIZ = LIZIZ(strLIZIZ);
            EnumC895710ZBx enumC895710ZBx = EnumC895710ZBx.AUDIO_END;
            if (iTransCodeAudio == 0) {
                z = true;
            } else {
                z = false;
            }
            awS628S0100000_14.invoke(enumC895710ZBx, Boolean.valueOf(z));
        }
        if (C189200o6.m8isSuccessimpl(objLIZIZ)) {
            byte[] bArr = (byte[]) objLIZIZ;
            LIZ.getClass();
            if (bArr == null) {
                c895660ZBs.invoke(EnumC895710ZBx.FINGER_ERROR, Boolean.FALSE, null, -2, "media stream null");
            } else {
                SpeechEngine speechEngineGenerator = SpeechEngineGenerator.getInstance();
                long jCreateEngine = speechEngineGenerator.createEngine();
                speechEngineGenerator.setOptionString(jCreateEngine, "log_level", "TRACE");
                speechEngineGenerator.setOptionString(jCreateEngine, "engine_name", "afp");
                int iInitEngine = speechEngineGenerator.initEngine(jCreateEngine);
                if (iInitEngine != 0) {
                    c895660ZBs.invoke(EnumC895710ZBx.FINGER_ERROR, Boolean.FALSE, null, Integer.valueOf(iInitEngine), "init engine fail");
                } else {
                    speechEngineGenerator.resetEngine(jCreateEngine);
                    int length = bArr.length / 640;
                    for (int i = 0; i < length; i++) {
                        byte[] bArr2 = new byte[640];
                        System.arraycopy(bArr, i * 640, bArr2, 0, 640);
                        speechEngineGenerator.feedAudio(jCreateEngine, bArr2, 640);
                    }
                    if (!C0C64.LJIILLIIL().LJIIIZ(31744, "enable_afp_fetch_slice", true, false)) {
                        byte[] bArr3 = new byte[bArr.length];
                        int iFetchResult = speechEngineGenerator.fetchResult(jCreateEngine, bArr3);
                        byte[] bArr4 = new byte[iFetchResult];
                        System.arraycopy(bArr3, 0, bArr4, 0, iFetchResult);
                        EnumC895710ZBx enumC895710ZBx2 = EnumC895710ZBx.FINGER_END;
                        if (iFetchResult < 0) {
                            z2 = false;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z2);
                        List listLJIIL = C1697810uHb.LJIIL(C1796580wqu.LIZ(bArr4));
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIL, 10));
                        Iterator it2 = listLJIIL.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new Pair(it2.next(), 0));
                        }
                        c895660ZBs.invoke(enumC895710ZBx2, boolValueOf, arrayList, Integer.valueOf(iFetchResult), "");
                        speechEngineGenerator.destroyEngine(jCreateEngine);
                    } else {
                        n nVar = (n) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), speechEngineGenerator.fetchResult(1201), n.class);
                        int iLJIIJJI = nVar.LJJIIZ("err_code").LJIIJJI();
                        if (iLJIIJJI != 0) {
                            c895660ZBs.invoke(EnumC895710ZBx.FINGER_ERROR, Boolean.FALSE, null, Integer.valueOf(iLJIIJJI), "");
                        } else {
                            h hVarLJIIL = nVar.LJJIIZ("data").LJIIL();
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(hVarLJIIL, 10));
                            Iterator<k> it3 = hVarLJIIL.iterator();
                            while (it3.hasNext()) {
                                n nVarLJIILIIL = it3.next().LJIILIIL();
                                arrayList2.add(new Pair(nVarLJIILIIL.LJJIIZ("fingerprint").LJIL(), Integer.valueOf(nVarLJIILIIL.LJJIIZ("start_time").LJIIJJI())));
                            }
                            c895660ZBs.invoke(EnumC895710ZBx.FINGER_END, Boolean.valueOf(!arrayList2.isEmpty()), arrayList2, 0, "");
                        }
                        speechEngineGenerator.destroyEngine(jCreateEngine);
                    }
                }
            }
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLIZIZ);
        if (thM5exceptionOrNullimpl != null) {
            if (C786410Ut5.u3().isInterrupted()) {
                c895660ZBs.invoke(EnumC895710ZBx.PROCESS_CANCEL, Boolean.FALSE, null, -2, "copyright detect canceled");
                return;
            }
            EnumC895710ZBx enumC895710ZBx3 = EnumC895710ZBx.FINGER_ERROR;
            Boolean bool = Boolean.FALSE;
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "media stream null";
            }
            c895660ZBs.invoke(enumC895710ZBx3, bool, null, -2, message);
        }
    }
}
