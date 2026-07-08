package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.invitation.newdesign.assem.GroupInvitationBottomLineAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0i8E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230720i8E extends C09AY implements Function0<Unit> {
    public final /* synthetic */ GroupInvitationBottomLineAssem LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230720i8E(GroupInvitationBottomLineAssem groupInvitationBottomLineAssem, long j) {
        super(0);
        this.LL = groupInvitationBottomLineAssem;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.LL.Go().getState().LLIZ) {
            this.LL.Go();
            Context context = this.LL.LJJIJL().getContext();
            long j = this.LLILLJJLI;
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
            smartRouteBuildRoute.withParam("uid", String.valueOf(j));
            smartRouteBuildRoute.withParam("enter_from", "group_join_panel");
            smartRouteBuildRoute.open();
        }
        return Unit.LIZ;
    }
}
