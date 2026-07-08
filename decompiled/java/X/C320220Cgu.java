package X;

import defpackage.k9;
import defpackage.r2;
import defpackage.w2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Cgu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$handleMessagePullNewComplete$1", f = "MessageOperatorHandler.kt", l = {2057, 2058}, m = "invokeSuspend")
public final class C320220Cgu extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ r2 LLILLJJLI;
    public final /* synthetic */ k9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320220Cgu(r2 r2Var, k9 k9Var, InterfaceC1364105Vn<? super C320220Cgu> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = r2Var;
        this.LLILLL = k9Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320220Cgu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@b589.handleMessagePullNewComplete$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MessageOperatorHandler@b589.handleMessagePullNewComplete$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1863400yag c1863400yag = C1863400yag.LIZ;
            C1863380yae c1863380yae = this.LLILLJJLI.LJIILLIIL;
            this.LL = 1;
            if (C1863400yag.LIZLLL(c1863400yag, c1863380yae, null, this, 6) == objLJFF) {
                C1C7U.LIZIZ("MessageOperatorHandler@b589.handleMessagePullNewComplete$1");
                return objLJFF;
            }
        }
        C05YC c05ycLIZ = C1863380yae.LJJII.LIZ(C2286608xc.LJ(this.LLILLJJLI.LJIILLIIL.LJIIIIZZ), C2286608xc.LJFF(this.LLILLJJLI.LJIILLIIL.LJII), this.LLILLJJLI.LJIILLIIL.LJIILIIL);
        if (c05ycLIZ != null) {
            w2 w2Var = new w2(w2.a.PULL_NEW_COMPLETE, C13BV.INSTANCE, false, false, false, 0, null, null, this.LLILLL, 252);
            this.LL = 2;
            if (c05ycLIZ.emit(w2Var, this) == objLJFF) {
                C1C7U.LIZIZ("MessageOperatorHandler@b589.handleMessagePullNewComplete$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MessageOperatorHandler@b589.handleMessagePullNewComplete$1");
        return unit2;
    }
}
