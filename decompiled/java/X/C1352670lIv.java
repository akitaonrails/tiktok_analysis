package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.appdiff.ICommentAppDiffProtocol;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VEAudioRecorder;
import com.ss.android.vesdk.VERTAudioWaveformMgr;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0lIv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352670lIv {
    public static VEAudioRecorder LIZIZ;
    public static VERTAudioWaveformMgr LIZJ;
    public static boolean LIZLLL;
    public static long LJ;
    public static boolean LJII;
    public static InterfaceC1352650lIt LJIIIIZZ;
    public static final C1352670lIv LIZ = new C1352670lIv();
    public static final List<Float> LJFF = new ArrayList();
    public static final List<Float> LJI = new ArrayList();
    public static final C1352680lIw LJIIIZ = new InterfaceC2218151Brh() { // from class: X.0lIw
        @Override // X.InterfaceC2218151Brh
        public final void LIZ(int i, byte[] bArr) {
            float[] fArr;
            C1352670lIv.LIZ.getClass();
            if (!C1352670lIv.LIZLLL) {
                return;
            }
            int length = bArr.length / 2;
            short[] sArr = new short[length];
            ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
            VERTAudioWaveformMgr vERTAudioWaveformMgrCreateRTAudioWaveformMgr = C1352670lIv.LIZJ;
            if (vERTAudioWaveformMgrCreateRTAudioWaveformMgr == null) {
                try {
                    vERTAudioWaveformMgrCreateRTAudioWaveformMgr = VEUtils.createRTAudioWaveformMgr(2, C1352690lIx.LIZ().channelCount, C1352690lIx.LIZ().sampleRate, C1352690lIx.LIZ().pointRate, 2);
                    C1352670lIv.LIZJ = vERTAudioWaveformMgrCreateRTAudioWaveformMgr;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Failed to create audio waveform manager: ");
                    sbLIZ.append(e.getMessage());
                    C1344030l4z.LIZ("CommentAudioRecorder", C2188811AlT.LIZIZ(sbLIZ));
                    vERTAudioWaveformMgrCreateRTAudioWaveformMgr = null;
                }
            }
            if (vERTAudioWaveformMgrCreateRTAudioWaveformMgr == null) {
                fArr = new float[0];
            } else {
                int iProcess = vERTAudioWaveformMgrCreateRTAudioWaveformMgr.process(sArr, 0, length / 2);
                fArr = new float[iProcess];
                vERTAudioWaveformMgrCreateRTAudioWaveformMgr.getRemainedPoints(fArr, 0, iProcess);
            }
            List<Float> listLJJLIL = C13LQ.LJJLIL(fArr);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIL, 10));
            Iterator<Float> it2 = listLJJLIL.iterator();
            while (it2.hasNext()) {
                float fFloatValue = it2.next().floatValue() * 2.8f;
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
                arrayList.add(Float.valueOf(fFloatValue));
            }
            synchronized (C1352670lIv.LIZ) {
                try {
                    ((ArrayList) C1352670lIv.LJFF).addAll(arrayList);
                    ((ArrayList) C1352670lIv.LJI).addAll(arrayList);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Received audio data, wave points: ");
            sbLIZ2.append(arrayList.size());
            C2188811AlT.LIZIZ(sbLIZ2);
        }

        @Override // X.InterfaceC2218151Brh
        public final void onError(int i, int i2, String str) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Audio recorder error: type=");
            sbLIZ.append(i);
            sbLIZ.append(", ret=");
            sbLIZ.append(i2);
            sbLIZ.append(", msg=");
            sbLIZ.append(str);
            C1344030l4z.LIZ("CommentAudioRecorder", C2188811AlT.LIZIZ(sbLIZ));
            C1352670lIv.LIZLLL = false;
            InterfaceC1352650lIt interfaceC1352650lIt = C1352670lIv.LJIIIIZZ;
            if (interfaceC1352650lIt != null) {
                interfaceC1352650lIt.LIZ(null);
            }
        }

        @Override // X.InterfaceC2218151Brh
        public final void onInfo(int i, int i2, double d, Object obj) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Audio recorder info: type=");
            sbLIZ.append(i);
            sbLIZ.append(", ext=");
            sbLIZ.append(i2);
            sbLIZ.append(", ext2=");
            sbLIZ.append(d);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    };

    public static void LIZ() {
        ICommentAppDiffProtocol.LIZ.getClass();
        C1352700lIy.LIZIZ.getValue().LIZ();
        Context context = C1383370m6R.LIZ;
        if (LIZIZ(context) && !LJII) {
            C0CHQ.LIZ().LJJIZ();
            C1352710lIz.LIZ.getClass();
            try {
                C1352710lIz.LIZLLL(C1352710lIz.LJFF(context));
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            LJII = true;
        }
    }

    public static VEAudioRecorder LIZJ() {
        VEAudioRecorder vEAudioRecorder = LIZIZ;
        if (vEAudioRecorder != null) {
            return vEAudioRecorder;
        }
        VEAudioRecorder vEAudioRecorder2 = new VEAudioRecorder();
        LIZIZ = vEAudioRecorder2;
        vEAudioRecorder2.setRecorderListener(LJIIIZ);
        return vEAudioRecorder2;
    }

    public static void LIZLLL() throws Exception {
        if (LIZIZ(C1383370m6R.LIZ) && !LIZLLL) {
            try {
                LIZ();
                VEAudioEncodeSettings.Builder builder = new VEAudioEncodeSettings.Builder();
                builder.setSampleRate(C1352690lIx.LIZ().sampleRate);
                builder.setBps(C1352690lIx.LIZ().bitRate);
                VEAudioEncodeSettings vEAudioEncodeSettingsBuild = builder.Build();
                VEAudioRecorder vEAudioRecorderLIZJ = LIZJ();
                C1352710lIz c1352710lIz = C1352710lIz.LIZ;
                Context applicationContext = C2213981Bky.LIZIZ.getApplicationContext();
                c1352710lIz.getClass();
                vEAudioRecorderLIZJ.init(C1352710lIz.LIZIZ(applicationContext), vEAudioEncodeSettingsBuild, C538540LAe.LLJJJIL);
                LIZJ().startRecord(1.0f, 0, C538540LAe.LLJJJIL);
                ((ArrayList) LJFF).clear();
                LJ = SystemClock.uptimeMillis();
                LIZLLL = true;
                InterfaceC1352650lIt interfaceC1352650lIt = LJIIIIZZ;
                if (interfaceC1352650lIt != null) {
                    interfaceC1352650lIt.onStart();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed to start recording: ");
                sbLIZ.append(e.getMessage());
                C1344030l4z.LIZ("CommentAudioRecorder", C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC1352650lIt interfaceC1352650lIt2 = LJIIIIZZ;
                if (interfaceC1352650lIt2 != null) {
                    interfaceC1352650lIt2.LIZ(null);
                }
                throw e;
            }
        }
    }

    public static boolean LIZIZ(Context context) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LJI(context)) {
            return false;
        }
        return true;
    }
}
