package X;

import defpackage.r2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Cgm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$handleBotNotPausable$1", f = "MessageOperatorHandler.kt", l = {2112}, m = "invokeSuspend")
public final class C320140Cgm extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1863280yaU LLILLJJLI;
    public final /* synthetic */ r2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320140Cgm(r2 r2Var, C1863280yaU c1863280yaU, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1863280yaU;
        this.LLILLL = r2Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320140Cgm(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@b589.handleBotNotPausable$1");
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
            InterfaceC332260D0u interfaceC332260D0uLIZJ = C1863380yae.LJJII.LIZJ(C2286608xc.LJ(this.LLILLJJLI.LJ), C2286608xc.LJFF(this.LLILLJJLI.LIZLLL), this.LLILLL.LJIILLIIL.LJIILIIL);
            if (interfaceC332260D0uLIZJ != null) {
                this.LL = 1;
                if (interfaceC332260D0uLIZJ.emit(false, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageOperatorHandler@b589.handleBotNotPausable$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageOperatorHandler@b589.handleBotNotPausable$1");
        return unit;
    }
}
