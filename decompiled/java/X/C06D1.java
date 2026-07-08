package X;

import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS438S0200000_2;
import njp.a;

/* JADX INFO: renamed from: X.06D1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.flow.StreakInviteFlowRouter$flowStreakInviteOnInbox$followDialogData$1$1$1", f = "StreakInviteFlowRouter.kt", l = {}, m = "invokeSuspend")
public final class C06D1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ C15496064w LLILLJJLI;
    public final /* synthetic */ C1397510mTF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06D1(C19EG c19eg, C15496064w c15496064w, C1397510mTF c1397510mTF, InterfaceC1364105Vn<? super C06D1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
        this.LLILLJJLI = c15496064w;
        this.LLILLL = c1397510mTF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06D1(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakInviteFlowRouter@4643.flowStreakInviteOnInbox$followDialogData$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMFriendsService.LIZ.getClass();
        IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
        if (iMFriendsServiceLIZ != null) {
            C19EG c19eg = this.LL;
            C0OVM c0ovm = new C0OVM();
            c0ovm.LIZJ(this.LLILLJJLI.LIZJ);
            c0ovm.LIZIZ(this.LLILLJJLI.LIZLLL);
            c0ovm.LIZ.LIZLLL = 1;
            iMFriendsServiceLIZ.LJ(c19eg, c0ovm.LIZ(), "streak_reflow", new AwS438S0200000_2(this.LLILLJJLI, this.LLILLL, 21));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakInviteFlowRouter@4643.flowStreakInviteOnInbox$followDialogData$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
