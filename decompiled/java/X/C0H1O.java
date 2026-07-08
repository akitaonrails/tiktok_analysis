package X;

import Y.ARunnableS0S0303000_6;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H1O, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselInnerIndicatorAssem$updateIndicatorStyleOpt$1$1$getImageDarknessAndUpdate$1$1", f = "PdpCarouselInnerIndicatorAssem.kt", l = {143}, m = "invokeSuspend")
public final class C0H1O extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C424040Gjy LLILLJJLI;
    public final /* synthetic */ Image LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ float LLIZLLLIL;
    public final /* synthetic */ float LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H1O(C424040Gjy c424040Gjy, Image image, float f, int i, float f2, int i2, float f3, float f4, int i3, InterfaceC1364105Vn<? super C0H1O> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c424040Gjy;
        this.LLILLL = image;
        this.LLILZ = f;
        this.LLILZIL = i;
        this.LLILZLL = f2;
        this.LLIZ = i2;
        this.LLIZLLLIL = f3;
        this.LLJ = f4;
        this.LLJI = i3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H1O(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpCarouselInnerIndicatorAssem@ce2b.updateIndicatorStyleOpt$1$1$getImageDarknessAndUpdate$1$1");
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
            C0H1J c0h1j = C0H1L.LIZ;
            boolean zLJ = C1744700vVE.LJ(this.LLILLJJLI.getContext(), null);
            Image image = this.LLILLL;
            float fLIZJ$3 = ARunnableS0S0303000_6.LIZJ$3(this.LLILZ, this.LLILZIL);
            float fLIZJ$32 = ARunnableS0S0303000_6.LIZJ$3(this.LLILZLL, this.LLIZ);
            float fLIZJ$33 = ARunnableS0S0303000_6.LIZJ$3(this.LLIZLLLIL, this.LLILZIL);
            float fLIZJ$34 = ARunnableS0S0303000_6.LIZJ$3(this.LLJ, this.LLIZ);
            boolean z = C1507930pLL.LIZIZ;
            this.LL = 1;
            obj = c0h1j.LIZ(zLJ, image, fLIZJ$3, fLIZJ$32, fLIZJ$33, fLIZJ$34, z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PdpCarouselInnerIndicatorAssem@ce2b.updateIndicatorStyleOpt$1$1$getImageDarknessAndUpdate$1$1");
                return objLJFF;
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            C0CNO.LIZLLL(0L, new C0H1P(this.LLILLJJLI, bool.booleanValue(), this.LLJI));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpCarouselInnerIndicatorAssem@ce2b.updateIndicatorStyleOpt$1$1$getImageDarknessAndUpdate$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
