package X;

import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: renamed from: X.00iX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C154700iX extends User {
    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC2262081DgM
    public final long getId() {
        return 0L;
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final int getUserRole() {
        return 0;
    }

    public C154700iX(String str) {
        setNickName(C497740JfY.LJIJJ(2131843673, str));
        setDisplayId(getNickName());
    }
}
