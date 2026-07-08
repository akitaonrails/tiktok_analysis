package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.08Yu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2137008Yu implements InterfaceC908170Zjz {
    public static final C2137008Yu LL;

    static {
        C2137008Yu c2137008Yu = new C2137008Yu();
        LL = c2137008Yu;
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZLLL(c2137008Yu);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2136908Yt(null), 3);
    }

    @Override // X.InterfaceC908170Zjz
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (user != null && user.getUid() != null && user.getUid().length() > 0) {
            C603760NmA.LL.LJIIIZ(user.getUid());
        }
    }
}
