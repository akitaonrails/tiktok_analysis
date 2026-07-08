package X;

import com.bytedance.common.jato.JatoXL;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.video.experiment.JatoBoostConfig;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: renamed from: X.1AkT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2188191AkT {
    public static boolean LIZ;

    public static final void LIZIZ() {
        C2413309cx.LIZ(new C2188201AkU());
    }

    public static final void LIZJ() {
        C2413309cx.LIZ(AFwS224S0000000_33.get$arr$(609));
    }

    public static final void LIZLLL() {
        boolean zLJI = MethodIDManager.LJI(71640);
        C2413309cx.LIZ(AFwS224S0000000_33.get$arr$(610));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LIZ(JatoBoostConfig jatoBoostConfig) {
        if (!LIZ) {
            LIZ = true;
        }
        long j = jatoBoostConfig.cpuBoost;
        if (j > 0) {
            JatoXL.tryCpuBoost(j);
        }
        long j2 = jatoBoostConfig.gpuBoost;
        if (j2 > 0) {
            JatoXL.tryGpuBoost(j2);
        }
        long j3 = jatoBoostConfig.gcBlock;
        if (j3 > 0) {
            JatoXL.requestBlockGc(j3);
        }
    }
}
