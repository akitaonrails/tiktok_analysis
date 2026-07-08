package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0Z9u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895160Z9u implements InterfaceC1357440lQc {
    public static final C895160Z9u LL = new C895160Z9u();

    @Override // X.InterfaceC1357440lQc
    public final boolean LJJJJI(User user) {
        C869590Y9l lastShowMessage;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(C0YNP.LJ(user.getUid()));
        if (c0y8tLIZ != null && (lastShowMessage = c0y8tLIZ.getLastShowMessage()) != null) {
            return C1387310mCn.LJII(lastShowMessage.getCreatedAt());
        }
        return false;
    }
}
