package X;

import android.content.Context;
import com.ss.android.ugc.aweme.notification.followrequest.vh.FollowRequestViewHolderInFollower;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0iVG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.followrequest.vh.FollowRequestViewHolderInFollower$showFollowBtn$1", f = "FollowRequestViewHolderInFollower.kt", l = {}, m = "invokeSuspend")
public final class C1245000iVG extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ User LL;
    public final /* synthetic */ FollowRequestViewHolderInFollower LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1245000iVG(User user, FollowRequestViewHolderInFollower followRequestViewHolderInFollower, InterfaceC1364105Vn<? super C1245000iVG> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = user;
        this.LLILLJJLI = followRequestViewHolderInFollower;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1245000iVG(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1260930iux enumC1260930iux;
        C1C7U.LIZ("FollowRequestViewHolderInFollower@563c.showFollowBtn$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C01GW c01gw = C1245020iVI.LIZ;
        if (C1245020iVI.LIZJ(this.LL)) {
            if (this.LL.getFollowStatus() == C0SY7.UNFOLLOW.ordinal()) {
                enumC1260930iux = EnumC1260930iux.FOLLOW;
            } else {
                enumC1260930iux = EnumC1260930iux.ENTER_CHAT;
            }
            C1260910iuv c1260910iuv = new C1260910iuv(0);
            c1260910iuv.LJJJJZI(this.LL);
            c1260910iuv.LJJIJLIJ("notification_page");
            c1260910iuv.LJJJJIZL("follow_request");
            c1260910iuv.LJJLIIIJJI = enumC1260930iux;
            c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.RELATION_LABEL;
            c1260910iuv.LJJJJLL();
            c1260910iuv.LJIILJJIL();
        }
        FollowRequestViewHolderInFollower followRequestViewHolderInFollower = this.LLILLJJLI;
        followRequestViewHolderInFollower.markHasReadWhenFollowRequest(followRequestViewHolderInFollower.followRequestData);
        C1252240igw c1252240igw = C1252240igw.LIZ;
        Context context = this.LLILLJJLI.itemView.getContext();
        FollowRequestViewHolderInFollower followRequestViewHolderInFollower2 = this.LLILLJJLI;
        Boolean boolValueOf = Boolean.valueOf(C1252240igw.LIZ(c1252240igw, context, followRequestViewHolderInFollower2.curUser, followRequestViewHolderInFollower2.enterFrom, !C1336205Ku.LIZJ().LIZJ(), null, 760));
        C1C7U.LIZIZ("FollowRequestViewHolderInFollower@563c.showFollowBtn$1");
        return boolValueOf;
    }
}
