package X;

import android.util.Log;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MTE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MTE {
    public static final C0MTE LIZ = new C0MTE();
    public static Keva LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("celebration_entrance_keva_");
        sbLIZ.append(C10EU.LIZ().getUid());
        LIZIZ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(337));
        LIZLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(336));
        C0XQ7.LJFF().LJJIFFI(new InterfaceC427710Gpt() { // from class: X.0MTF
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i, User user, User user2) {
                String uid;
                String uid2 = null;
                if (user != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                if (user2 != null) {
                    uid2 = user2.getUid();
                }
                if (!Intrinsics.LJFF(uid, uid2) && user2 != null) {
                    C0MTE c0mte = C0MTE.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("celebration_entrance_keva_");
                    sbLIZ2.append(user2.getUid());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    C0MTE c0mte2 = C0MTE.LIZ;
                    C0MTE.LIZIZ = Keva.getRepo(strLIZIZ);
                }
            }
        });
    }

    public static String LIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZIZ(int i) {
        Object c098200Yq;
        try {
            LIZ.getClass();
            String string = ((Keva) LIZLLL.getValue()).getString(LIZ(i), "");
            if (string.length() > 0) {
                LIZJ(i, new String[]{string});
                ICelebrationCreateService iCelebrationCreateService = (ICelebrationCreateService) PluggableExtentionKt.pluggableSpi$default(ICelebrationCreateService.class, false, false, false, 14, null);
                if (iCelebrationCreateService != null) {
                    iCelebrationCreateService.recordTodayExitCelebration(i);
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static void LIZJ(int i, String[] strArr) {
        Object c098200Yq;
        try {
            LIZIZ.storeStringArray(String.valueOf(i), (String[]) C13DL.LJIIIZ(LIZIZ.getStringArray(String.valueOf(i), new String[0]), strArr));
            ICelebrationCreateService iCelebrationCreateService = (ICelebrationCreateService) PluggableExtentionKt.pluggableSpi$default(ICelebrationCreateService.class, false, false, false, 14, null);
            if (iCelebrationCreateService != null) {
                iCelebrationCreateService.recordTodayExitCelebration(i);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZIZ.hashCode());
            sbLIZ.append(" recordInboxEntranceClicked: uniqueId: ");
            sbLIZ.append(strArr);
            sbLIZ.append(" celebrationType: ");
            sbLIZ.append(i);
            sbLIZ.append(" \n repo get celebration: ");
            sbLIZ.append(((Object[]) C12848051a.LIZ(LIZIZ, new String[0], String.valueOf(i))).length);
            c098200Yq = Integer.valueOf(Log.d("CelebrationKeva-", C2188811AlT.LIZIZ(sbLIZ)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }
}
