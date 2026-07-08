package X;

import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0TGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C744110TGv<T> implements C09JN {
    public static final C744110TGv<T> LL = new C744110TGv<>();

    @Override // X.C09JN
    public final void accept(Object obj) {
        long currentUserId;
        C1C7U.LIZ("GameWiredCastManager@89ef.observerUserState$1");
        C784060UpI c784060UpI = (C784060UpI) obj;
        long j = C744020TGm.LJIIIIZZ;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            currentUserId = interfaceC500940JkiUser.getCurrentUserId();
        } else {
            currentUserId = 0;
        }
        if (j != currentUserId || (c784060UpI != null && c784060UpI.LIZ == EnumC1098720ehK.Logout)) {
            C744020TGm.LJIIIZ(true);
        }
        C1C7U.LIZIZ("GameWiredCastManager@89ef.observerUserState$1");
    }
}
