package X;

import com.ss.android.ugc.slideslip.fullwidthhorizontal.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05NI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.FullWidthEffectCarouselComponent$prefetchInitialCarouselIcons$1", f = "FullWidthEffectCarouselComponent.kt", l = {1757}, m = "invokeSuspend")
public final class C05NI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ o LLILLJJLI;
    public final /* synthetic */ InterfaceC1664360tPe<C1350505Qh> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05NI(o oVar, InterfaceC1664360tPe<C1350505Qh> interfaceC1664360tPe, InterfaceC1364105Vn<? super C05NI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = oVar;
        this.LLILLL = interfaceC1664360tPe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05NI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iRa;
        C1C7U.LIZ("FullWidthEffectCarouselComponent@e1ee.prefetchInitialCarouselIcons$1");
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
            this.LLILLJJLI.LLLLIILL = false;
            if (((Boolean) C05NJ.LIZ.getValue()).booleanValue()) {
                iRa = this.LLILLJJLI.ra();
            } else {
                iRa = Integer.MAX_VALUE;
            }
            o oVar = this.LLILLJJLI;
            InterfaceC1664360tPe<C1350505Qh> interfaceC1664360tPe = this.LLILLL;
            this.LL = 1;
            if (oVar.nd(interfaceC1664360tPe, iRa, this) == objLJFF) {
                C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.prefetchInitialCarouselIcons$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.prefetchInitialCarouselIcons$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
