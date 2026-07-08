package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0bee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.competition.game.connection.invitee.CatchBeansInviteeCoordinator$presentInvitationView$1", f = "CatchBeansInviteeCoordinator.kt", l = {196}, m = "invokeSuspend")
public final class C981740bee extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C981680beY LLILLJJLI;
    public final /* synthetic */ C982480bfq LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C981740bee(C981680beY c981680beY, C982480bfq c982480bfq, boolean z, boolean z2, InterfaceC1364105Vn<? super C981740bee> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c981680beY;
        this.LLILLL = c982480bfq;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C981740bee(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CatchBeansInviteeCoordinator@e746.presentInvitationView$1");
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
            boolean z = this.LLILZ;
            boolean z2 = this.LLILZIL;
            this.LL = 1;
            if (c981680beY.LJJJJJL(c982480bfq, z, z2, this) == objLJFF) {
                C1C7U.LIZIZ("CatchBeansInviteeCoordinator@e746.presentInvitationView$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CatchBeansInviteeCoordinator@e746.presentInvitationView$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
