package X;

import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848340XPs extends C09AY implements Function0<C848290XPn<SignificantUserInfo>> {
    public final /* synthetic */ C848300XPo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C848340XPs(C848300XPo c848300XPo) {
        super(0);
        this.LL = c848300XPo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C848290XPn<SignificantUserInfo> invoke() {
        return new C848290XPn<>(this.LL.LIZ, "significant_user_info", new SignificantUserInfo(this.LL.LIZ, "", "", "", "", "", "", "", ""));
    }
}
