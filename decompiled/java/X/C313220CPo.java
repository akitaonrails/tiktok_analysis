package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0CPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313220CPo {
    public static long LIZ(String str) {
        try {
            return new C0VSJ(str).length();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Download Music, getFileSize fail ");
            sbLIZ.append(e.getMessage());
            C2344809Gs.LIZLLL(6, "Music", C2188811AlT.LIZIZ(sbLIZ));
            return -1L;
        }
    }
}
