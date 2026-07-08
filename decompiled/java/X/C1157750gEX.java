package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publicgroup.data.model.InvitationListCellType;

/* JADX INFO: renamed from: X.0gEX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public /* synthetic */ class C1157750gEX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[InvitationListCellType.values().length];
        try {
            iArr[InvitationListCellType.INVITATION_LIST_CELL_TYPE_UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[InvitationListCellType.INVITATION_LIST_CELL_TYPE_SECTION_NAME.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[InvitationListCellType.INVITATION_LIST_CELL_TYPE_USER.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
