package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SEl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718010SEl {
    public static final C718010SEl LIZ = new C718010SEl();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(359));
    public static volatile String LIZJ;

    public static Keva LJI() {
        return (Keva) LIZIZ.getValue();
    }

    public static void LIZ() {
        String strLJ = LJ();
        if (!Intrinsics.LJFF(strLJ, "TTKStoryEducationDebugIsNewUser_") && !LJI().contains(strLJ)) {
            LJI().storeBoolean(strLJ, false);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTKStoryViewerInsightDebugViewCount_");
        sbLIZ.append(LIZLLL());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(strLIZIZ, "TTKStoryViewerInsightDebugViewCount_") || LJI().contains(strLIZIZ)) {
            return;
        }
        LJI().storeLong(strLIZIZ, -1L);
    }

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTKStory24hEducationShownAt_");
        sbLIZ.append(LIZLLL());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTKStory24hNewUserEducationShown_");
        sbLIZ.append(LIZLLL());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL() {
        User curUser;
        String uid;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        return (iAccountUserServiceLJFF == null || (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) == null || (uid = curUser.getUid()) == null) ? "" : uid;
    }

    public static String LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTKStoryEducationDebugIsNewUser_");
        sbLIZ.append(LIZLLL());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTKStoryEducationPublishState_");
        sbLIZ.append(LIZLLL());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTKStoryViewerInsightViewListOpened_");
        sbLIZ.append(LIZLLL());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJIIIZ() {
        LIZ();
        return C0M9T.LIZ().enableDebugNewUserFromStorage ? LJI().getBoolean(LJ(), false) : LJI().getInt(LJFF(), 0) == 1;
    }

    public static boolean LJIIJ() {
        return !C0M9T.LIZ().enableCyclicalNewUserEducation && C0M9T.LIZ().enableReduceRequestAfterHasPublishedStory && LJI().getInt(LJFF(), 0) == 2;
    }

    public static void LJIIIIZZ(boolean z) {
        LIZ();
        int i = LJI().getInt(LJFF(), 0);
        if (z) {
            String strLJFF = LJFF();
            if (!Intrinsics.LJFF(strLJFF, "TTKStoryEducationPublishState_")) {
                LJI().storeInt(strLJFF, 2);
                return;
            }
            return;
        }
        LJI().storeInt(LJFF(), 1);
        Keva kevaLJI = LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTKStoryViewerInsightEligibleNewUser_");
        sbLIZ.append(LIZLLL());
        kevaLJI.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        if (!C0M9T.LIZ().enableCyclicalNewUserEducation || i != 2) {
            return;
        }
        LJI().storeBoolean(LIZJ(), false);
        LJI().storeBoolean(LJII(), false);
    }
}
