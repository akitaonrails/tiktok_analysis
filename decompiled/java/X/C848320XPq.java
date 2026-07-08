package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XPq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848320XPq extends C09AY implements Function0<C848290XPn<User>> {
    public final /* synthetic */ C848300XPo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C848320XPq(C848300XPo c848300XPo) {
        super(0);
        this.LL = c848300XPo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C848290XPn<User> invoke() {
        String str = this.LL.LIZ;
        User user = new User();
        user.setUid(str);
        user.setAllowStatus(1);
        return new C848290XPn<>(str, "aweme_user_info", user);
    }
}
