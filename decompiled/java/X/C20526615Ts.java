package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Ts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20526615Ts implements InterfaceC427710Gpt {
    public static final C20526615Ts LL = new C20526615Ts();

    @Override // X.InterfaceC427710Gpt
    public final void LLLLLLZZ(int i, User user, User user2) {
        String uid;
        String uid2;
        if (i != 1 && i != 2) {
            return;
        }
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        if (user2 != null) {
            uid2 = user2.getUid();
        } else {
            uid2 = null;
        }
        if (Intrinsics.LJFF(uid, uid2)) {
            return;
        }
        C20526815Tu.LIZ.getClass();
        C20526815Tu.LIZIZ.clear();
        C20526815Tu.LIZJ.clear();
        C1865180ydY.LIZ.clear();
        C1865180ydY.LIZIZ = null;
    }
}
