package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0beg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.competition.game.connection.inviter.CatchBeansInviterCoordinator$checkGameAvailabilityAndShowDialog$gameAvailabilityException$1", f = "CatchBeansInviterCoordinator.kt", l = {208}, m = "invokeSuspend")
public final class C981760beg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Throwable>, Object> {
    public int LL;
    public final /* synthetic */ C981670beX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C981760beg(C981670beX c981670beX, InterfaceC1364105Vn<? super C981760beg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c981670beX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C981760beg(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CatchBeansInviterCoordinator@5d96.checkGameAvailabilityAndShowDialog$gameAvailabilityException$1");
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
            C981670beX c981670beX = this.LLILLJJLI;
            this.LL = 1;
            obj = c981670beX.LJJJJL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CatchBeansInviterCoordinator@5d96.checkGameAvailabilityAndShowDialog$gameAvailabilityException$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CatchBeansInviterCoordinator@5d96.checkGameAvailabilityAndShowDialog$gameAvailabilityException$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Throwable> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
