package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aOj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C933430aOj extends C2217421BqW implements Function1<Boolean, Unit> {
    public final /* synthetic */ User LL;
    public final /* synthetic */ C933390aOf LLILLJJLI;
    public final /* synthetic */ C1112330f3H LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C933430aOj(User user, C933390aOf c933390aOf, C1112330f3H c1112330f3H) {
        super(1, C1449605lu.class, "reportInviteGuide", "handleClick$lambda$9$reportInviteGuide(Lcom/bytedance/android/live/base/model/user/User;Lcom/bytedance/android/live/liveinteract/multiguestv3/main/publicscreen/MultiGuestInviteGuideCapsuleHandler;Lcom/bytedance/android/live/publicscreen/api/model/PublicScreenCapsuleMessageModel;Ljava/lang/Boolean;)V", 0);
        this.LL = user;
        this.LLILLJJLI = c933390aOf;
        this.LLILLL = c1112330f3H;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        C933390aOf.LJIIJ(this.LL, this.LLILLJJLI, this.LLILLL, bool);
        return Unit.LIZ;
    }
}
