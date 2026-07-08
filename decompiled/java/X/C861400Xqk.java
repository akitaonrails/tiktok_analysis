package X;

import com.bytedance.als.h0;
import com.ss.android.ugc.slideslip.a6;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.SlideSlipEffectGroupComponent$getBottomComponentAttachConfig$job$1", f = "SlideSlipEffectGroupComponent.kt", l = {542}, m = "invokeSuspend")
public final class C861400Xqk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ a6 LLILLJJLI;
    public final /* synthetic */ h0<Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861400Xqk(a6 a6Var, h0<Boolean> h0Var, InterfaceC1364105Vn<? super C861400Xqk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = a6Var;
        this.LLILLL = h0Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861400Xqk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SlideSlipEffectGroupComponent@6915.getBottomComponentAttachConfig$job$1");
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
            C05YC<C1627860sSm> c05yc = this.LLILLJJLI.LLLILZLLLI;
            this.LL = 1;
            if (C09IC.LJIIZILJ(c05yc, this) == objLJFF) {
                C1C7U.LIZIZ("SlideSlipEffectGroupComponent@6915.getBottomComponentAttachConfig$job$1");
                return objLJFF;
            }
        }
        this.LLILLL.LJFF(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SlideSlipEffectGroupComponent@6915.getBottomComponentAttachConfig$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
