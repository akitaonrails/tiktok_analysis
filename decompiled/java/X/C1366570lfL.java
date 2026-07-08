package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lfL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366570lfL implements InterfaceC908170Zjz {
    public static final C1366570lfL LL;
    public static final C01GW LLILLJJLI;
    public static String LLILLL;

    static {
        C1366570lfL c1366570lfL = new C1366570lfL();
        LL = c1366570lfL;
        LLILLJJLI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(524));
        LLILLL = C461720I8s.LIZIZ();
        C0I0B.LJFF.LIZ().LIZLLL(c1366570lfL);
    }

    public static final Keva LIZIZ() {
        return (Keva) LLILLJJLI.getValue();
    }

    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("display_count_no_action_");
        sbLIZ.append(LLILLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = LIZIZ().getInt(strLIZIZ, 0);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("update_time_");
        sbLIZ2.append(LLILLL);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        LIZIZ().storeInt(strLIZIZ, i + 1);
        LIZIZ().storeLong(strLIZIZ2, System.currentTimeMillis());
    }

    public final void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("display_count_no_action_");
        sbLIZ.append(LLILLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("update_time_");
        sbLIZ2.append(LLILLL);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        LIZIZ().storeInt(strLIZIZ, 0);
        LIZIZ().storeLong(strLIZIZ2, System.currentTimeMillis());
    }

    @Override // X.InterfaceC908170Zjz
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        String uid;
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        LLILLL = uid;
    }
}
