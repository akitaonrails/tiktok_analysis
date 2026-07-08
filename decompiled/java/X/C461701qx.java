package X;

import com.ss.android.ugc.slideslip.fullwidthhorizontal.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01qx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.FullWidthCarouselBottomComponent$observeEffectSelectStateToShowBottomWidget$1", f = "FullWidthCarouselBottomComponent.kt", l = {86}, m = "invokeSuspend")
public final class C461701qx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ g LLILLJJLI;
    public final /* synthetic */ InterfaceC332260D0u<Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C461701qx(g gVar, InterfaceC332260D0u<Boolean> interfaceC332260D0u, InterfaceC1364105Vn<? super C461701qx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = gVar;
        this.LLILLL = interfaceC332260D0u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C461701qx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullWidthCarouselBottomComponent@d6b5.observeEffectSelectStateToShowBottomWidget$1");
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
            C414301jJ c414301jJ = new C414301jJ(C09IC.LJIILJJIL(AnonymousClass0208.get$arr$(12), this.LLILLJJLI.LLJJL.LJLJL()), this.LLILLL, new C461601qw(null));
            C517001zs c517001zs = new C517001zs(this.LLILLJJLI, 7);
            this.LL = 1;
            if (c414301jJ.collect(c517001zs, this) == objLJFF) {
                C1C7U.LIZIZ("FullWidthCarouselBottomComponent@d6b5.observeEffectSelectStateToShowBottomWidget$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullWidthCarouselBottomComponent@d6b5.observeEffectSelectStateToShowBottomWidget$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
