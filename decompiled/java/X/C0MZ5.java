package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0MZ5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MZ5 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(String str, String str2) {
        try {
            C2354709Kn.LJIJJLI(str);
            C2354709Kn.LJIJJLI(str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Delete BGV failed, videoPath: ");
            sbLIZ.append(str);
            sbLIZ.append(" audioPath: ");
            sbLIZ.append(str2);
            sbLIZ.append(" error: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
