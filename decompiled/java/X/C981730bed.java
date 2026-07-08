package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0bed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.competition.game.connection.invitee.CatchBeansInviteeCoordinator$checkGameAvailabilityAndShowDialog$gameRejectReason$1", f = "CatchBeansInviteeCoordinator.kt", l = {217}, m = "invokeSuspend")
public final class C981730bed extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super EnumC981560beM>, Object> {
    public int LL;
    public final /* synthetic */ C981680beY LLILLJJLI;
    public final /* synthetic */ C982480bfq LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C981730bed(C981680beY c981680beY, C982480bfq c982480bfq, InterfaceC1364105Vn<? super C981730bed> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c981680beY;
        this.LLILLL = c982480bfq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C981730bed(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CatchBeansInviteeCoordinator@e746.checkGameAvailabilityAndShowDialog$gameRejectReason$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C981680beY c981680beY = this.LLILLJJLI;
            C982480bfq c982480bfq = this.LLILLL;
            this.LL = 1;
            obj = c981680beY.LJJJJL(c982480bfq, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CatchBeansInviteeCoordinator@e746.checkGameAvailabilityAndShowDialog$gameRejectReason$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CatchBeansInviteeCoordinator@e746.checkGameAvailabilityAndShowDialog$gameRejectReason$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super EnumC981560beM> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
