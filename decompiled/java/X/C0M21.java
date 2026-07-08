package X;

import com.ss.android.ugc.aweme.tools.draft.ab.DraftManagementConfigModel;

/* JADX INFO: renamed from: X.0M21, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M21 {
    public static final int LIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_draft_management_condition", true);
    }

    public static final C0M22 LIZIZ() {
        C0M22 c0m20;
        DraftManagementConfigModel draftManagementConfigModelLIZ = C561710M1h.LIZ();
        int iLIZ = LIZ();
        if (iLIZ == 1) {
            c0m20 = new C0M20(draftManagementConfigModelLIZ.totalDraft, draftManagementConfigModelLIZ.halfYearDraft, C2540809xW.LIZ());
        } else {
            if (iLIZ != 2) {
                return null;
            }
            c0m20 = new C561890M1z(((long) draftManagementConfigModelLIZ.totalMemorySizeGB) * 1024 * 1024 * 1024, ((long) draftManagementConfigModelLIZ.halfYearMemorySizeGB) * 1024 * 1024 * 1024, C2540809xW.LIZ());
        }
        C05JA.LJ = draftManagementConfigModelLIZ.pushShowInterval;
        C05JA.LJFF = draftManagementConfigModelLIZ.pushExitNum;
        return c0m20;
    }
}
