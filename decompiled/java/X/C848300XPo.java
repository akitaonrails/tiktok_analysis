package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.user.UserStore;

/* JADX INFO: renamed from: X.0XPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848300XPo {
    public final String LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C848320XPq(this));
    public final C01GW LIZJ = C452501pT.LIZIZ(new C848330XPr(this));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C848340XPs(this));

    public final C848290XPn<UserStore.AccountUser> LIZ() {
        return (C848290XPn) this.LIZJ.getValue();
    }

    public final C848290XPn<User> LIZIZ() {
        return (C848290XPn) this.LIZIZ.getValue();
    }

    public final C848290XPn<SignificantUserInfo> LIZJ() {
        return (C848290XPn) this.LIZLLL.getValue();
    }

    public final void LIZLLL() {
        LIZIZ().LIZ();
        LIZ().LIZ();
        LIZJ().LIZ();
    }

    public C848300XPo(String str) {
        this.LIZ = str;
    }
}
