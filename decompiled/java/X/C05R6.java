package X;

import Y.AgS162S0300000_2;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05R6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem$RenderUi$3$3$1$3", f = "TakoContentPreviewAssem.kt", l = {310, 314}, m = "invokeSuspend")
public final class C05R6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05UN LLILLJJLI;
    public final /* synthetic */ TakoContentPreviewAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05R6(TakoContentPreviewAssem takoContentPreviewAssem, C05UN c05un, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05un;
        this.LLILLL = takoContentPreviewAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05R6(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoContentPreviewAssem@36ab.RenderUi$3$3$1$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$3$1$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS546S0100000_2(this.LLILLJJLI, 859));
            C059V c059v = new C059V(null);
            this.LL = 1;
            if (C09IC.LJIJ(c095dLJIIIZ, this, c059v) == objLJFF) {
                C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$3$1$3");
                return objLJFF;
            }
        }
        C259800zU c259800zU = new C259800zU();
        C095D c095dLJIIIZ2 = C20028913Yh.LJIIIZ(new AwS546S0100000_2(this.LLILLJJLI, 860));
        AgS162S0300000_2 agS162S0300000_2 = new AgS162S0300000_2(this.LLILLJJLI, c259800zU, this.LLILLL, 1);
        this.LL = 2;
        if (c095dLJIIIZ2.collect(agS162S0300000_2, this) == objLJFF) {
            C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$3$1$3");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$3$1$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
