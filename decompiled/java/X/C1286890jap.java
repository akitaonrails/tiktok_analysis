package X;

import com.bef.effectsdk.EffectWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286890jap {
    public static void LIZ(int i, String str) {
        try {
            EffectWrapper.nativeSetGradeModelDownloadStatus(str, i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyGradeModelDownloadStatus failed: ");
            sbLIZ.append(e);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZIZ("AlgorithmModelInfoSender", strLIZIZ, null);
        }
    }
}
