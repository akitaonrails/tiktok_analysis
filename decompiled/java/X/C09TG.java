package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09TG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09TG {
    public static final String LIZJ;
    public static final Object LIZLLL;
    public C09TF LIZ;
    public final ConcurrentLinkedQueue<C09TF> LIZIZ = new ConcurrentLinkedQueue<>();

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTS_IN_TT_");
        sbLIZ.append("TTSManager ");
        LIZJ = C2188811AlT.LIZIZ(sbLIZ);
        LIZLLL = new Object();
    }

    public final void LIZJ(C09TF c09tf) {
        synchronized (LIZLLL) {
            try {
                this.LIZ = c09tf;
                if (!this.LIZIZ.contains(c09tf)) {
                    this.LIZIZ.add(c09tf);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C11YP c11yp = C11YP.LIZIZ;
        String str = LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTTSAudio speakId：");
        sbLIZ.append(c09tf.LIZ);
        C201955140j.LIZLLL(c11yp, str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C09TF LIZ(String str, String str2) {
        if (this.LIZIZ.size() == 0) {
            return null;
        }
        for (C09TF c09tf : this.LIZIZ) {
            if (Intrinsics.LJFF(str, c09tf.LIZ) && Intrinsics.LJFF(str2, c09tf.LIZIZ)) {
                return c09tf;
            }
        }
        C11YP c11yp = C11YP.LIZIZ;
        String str3 = LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getTaskBySpeakId can not find task：");
        sbLIZ.append(str);
        C201955140j.LJIIIIZZ(c11yp, str3, C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    public final void LIZIZ(String str, String str2) {
        String str3;
        String str4;
        synchronized (LIZLLL) {
            try {
                C09TF c09tfLIZ = LIZ(str, str2);
                if (this.LIZIZ.contains(c09tfLIZ)) {
                    this.LIZIZ.remove(c09tfLIZ);
                    C11YP c11yp = C11YP.LIZIZ;
                    String str5 = LIZJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("removeTTSAudio speakId：");
                    sbLIZ.append(str);
                    C201955140j.LIZLLL(c11yp, str5, C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    C11YP c11yp2 = C11YP.LIZIZ;
                    String str6 = LIZJ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("removeTTSAudio can not find speakId：");
                    sbLIZ2.append(str);
                    C201955140j.LIZLLL(c11yp2, str6, C2188811AlT.LIZIZ(sbLIZ2));
                }
                C09TF c09tf = this.LIZ;
                if (c09tf != null) {
                    str3 = c09tf.LIZ;
                } else {
                    str3 = null;
                }
                if (Intrinsics.LJFF(str, str3)) {
                    C09TF c09tf2 = this.LIZ;
                    if (c09tf2 != null) {
                        str4 = c09tf2.LIZIZ;
                    } else {
                        str4 = null;
                    }
                    if (Intrinsics.LJFF(str2, str4)) {
                        this.LIZ = null;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
