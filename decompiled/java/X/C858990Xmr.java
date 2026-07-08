package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xmr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.EffectET$addEffectApplyETData$1", f = "EffectET.kt", l = {}, m = "invokeSuspend")
public final class C858990Xmr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1448710nnp LL;
    public final /* synthetic */ C0LAB LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C858990Xmr(C1448710nnp c1448710nnp, C0LAB c0lab, Function0<Unit> function0, InterfaceC1364105Vn<? super C858990Xmr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1448710nnp;
        this.LLILLJJLI = c0lab;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C858990Xmr(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectET@c9c7.addEffectApplyETData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLIZJ = this.LL.LIZJ(3);
        if (C123100dR.LIZ(strLIZJ)) {
            this.LL.LIZ(this.LLILLJJLI, strLIZJ);
        }
        this.LLILLL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectET@c9c7.addEffectApplyETData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
