package X;

import defpackage.r2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Cgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$handleBotReplied$2", f = "MessageOperatorHandler.kt", l = {2088}, m = "invokeSuspend")
public final class C320130Cgl extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ r2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320130Cgl(r2 r2Var, InterfaceC1364105Vn<? super C320130Cgl> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = r2Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320130Cgl(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@b589.handleBotReplied$2");
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
            InterfaceC332260D0u interfaceC332260D0uLIZLLL = C1863380yae.LJJII.LIZLLL(C2286608xc.LJ(this.LLILLJJLI.LJIILLIIL.LJIIIIZZ), C2286608xc.LJFF(this.LLILLJJLI.LJIILLIIL.LJII), this.LLILLJJLI.LJIILLIIL.LJIILIIL);
            if (interfaceC332260D0uLIZLLL != null) {
                this.LL = 1;
                if (interfaceC332260D0uLIZLLL.emit(false, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageOperatorHandler@b589.handleBotReplied$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageOperatorHandler@b589.handleBotReplied$2");
        return unit;
    }
}
