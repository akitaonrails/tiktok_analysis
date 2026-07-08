package X;

import com.ss.android.ugc.slideslip.fullwidthhorizontal.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ZW, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.FullWidthCarouselBottomComponent$onClickViewAll$2", f = "FullWidthCarouselBottomComponent.kt", l = {198}, m = "invokeSuspend")
public final class C01ZW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ g LLILLJJLI;
    public final /* synthetic */ C259800zU<C1627790sSf> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01ZW(g gVar, C259800zU<C1627790sSf> c259800zU, InterfaceC1364105Vn<? super C01ZW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = gVar;
        this.LLILLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01ZW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullWidthCarouselBottomComponent@d6b5.onClickViewAll$2");
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
            C05YC<C05N3> c05ycJ = this.LLILLJJLI.J();
            C1627790sSf c1627790sSf = this.LLILLL.element;
            this.LL = 1;
            if (c05ycJ.emit(c1627790sSf, this) == objLJFF) {
                C1C7U.LIZIZ("FullWidthCarouselBottomComponent@d6b5.onClickViewAll$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullWidthCarouselBottomComponent@d6b5.onClickViewAll$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
