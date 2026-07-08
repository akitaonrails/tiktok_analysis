package X;

import com.bytedance.speech.speechengine.SpeechEngine;
import com.bytedance.speech.speechengine.SpeechEngineGenerator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yHv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851770yHv {
    public static final C1851770yHv LIZ = new C1851770yHv();
    public static final ExecutorService LIZIZ = C786410Ut5.h4();
    public static final Map<String, RunnableC1851790yHx> LIZJ = new LinkedHashMap();
    public static final Map<String, InterfaceC1840520xzm> LIZLLL = new LinkedHashMap();

    public static void LIZ(byte[] bArr, C1840490xzj c1840490xzj) {
        boolean z;
        if (bArr == null) {
            c1840490xzj.invoke(EnumC1840510xzl.FINGER_ERROR, Boolean.FALSE, null, -2, "media stream null");
            return;
        }
        SpeechEngine speechEngineGenerator = SpeechEngineGenerator.getInstance();
        long jCreateEngine = speechEngineGenerator.createEngine();
        speechEngineGenerator.setOptionString(jCreateEngine, "log_level", "TRACE");
        speechEngineGenerator.setOptionString(jCreateEngine, "engine_name", "afp");
        int iInitEngine = speechEngineGenerator.initEngine(jCreateEngine);
        if (iInitEngine != 0) {
            c1840490xzj.invoke(EnumC1840510xzl.FINGER_ERROR, Boolean.FALSE, null, Integer.valueOf(iInitEngine), "init engine fail");
            return;
        }
        speechEngineGenerator.resetEngine(jCreateEngine);
        int length = bArr.length / 640;
        for (int i = 0; i < length; i++) {
            byte[] bArr2 = new byte[640];
            System.arraycopy(bArr, i * 640, bArr2, 0, 640);
            speechEngineGenerator.feedAudio(jCreateEngine, bArr2, 640);
        }
        byte[] bArr3 = new byte[bArr.length];
        int iFetchResult = speechEngineGenerator.fetchResult(jCreateEngine, bArr3);
        if (iFetchResult < 0) {
            c1840490xzj.invoke(EnumC1840510xzl.FINGER_ERROR, Boolean.FALSE, null, Integer.valueOf(iFetchResult), "engine.fetchResult failed");
        }
        byte[] bArr4 = new byte[iFetchResult];
        System.arraycopy(bArr3, 0, bArr4, 0, iFetchResult);
        if (iFetchResult >= 0) {
            z = true;
        } else {
            z = false;
        }
        String strLIZ = C1796580wqu.LIZ(bArr4);
        EnumC1840510xzl enumC1840510xzl = EnumC1840510xzl.FINGER_END;
        Boolean boolValueOf = Boolean.valueOf(z);
        List listLJIIL = C1697810uHb.LJIIL(strLIZ);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIL, 10));
        Iterator it2 = listLJIIL.iterator();
        while (it2.hasNext()) {
            arrayList.add(new Pair(it2.next(), 0));
        }
        c1840490xzj.invoke(enumC1840510xzl, boolValueOf, arrayList, Integer.valueOf(iFetchResult), null);
        speechEngineGenerator.destroyEngine(jCreateEngine);
    }
}
