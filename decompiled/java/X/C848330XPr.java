package X;

import com.ss.android.ugc.aweme.user.UserStore;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XPr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848330XPr extends C09AY implements Function0<C848290XPn<UserStore.AccountUser>> {
    public final /* synthetic */ C848300XPo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C848330XPr(C848300XPo c848300XPo) {
        super(0);
        this.LL = c848300XPo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C848290XPn<UserStore.AccountUser> invoke() {
        return new C848290XPn<>(this.LL.LIZ, "account_user_info", new UserStore.AccountUser(this.LL.LIZ, "", "", false, "", "", false, 0, 0));
    }
}
