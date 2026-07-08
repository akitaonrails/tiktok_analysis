package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.UsHeaderVH;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H1Q, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.UsHeaderVH$updateIndicatorStyleOpt$1$1$1$getImageDarknessAndUpdate$1$1", f = "UsHeaderVH.kt", l = {540}, m = "invokeSuspend")
public final class C0H1Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UsHeaderVH LLILLJJLI;
    public final /* synthetic */ Image LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ float LLIZLLLIL;
    public final /* synthetic */ float LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H1Q(UsHeaderVH usHeaderVH, Image image, float f, int i, float f2, int i2, float f3, float f4, int i3, InterfaceC1364105Vn<? super C0H1Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = usHeaderVH;
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
        return new C0H1Q(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UsHeaderVH@175a.updateIndicatorStyleOpt$1$1$1$getImageDarknessAndUpdate$1$1");
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
            boolean zLJ = C1744700vVE.LJ(this.LLILLJJLI.z6().getContext(), null);
            Image image = this.LLILLL;
            float f = this.LLILZ;
            float f2 = this.LLILZIL;
            float f3 = this.LLILZLL;
            float f4 = this.LLIZ;
            float f5 = this.LLIZLLLIL / f2;
            float f6 = this.LLJ / f4;
            boolean z = C1507930pLL.LIZIZ;
            this.LL = 1;
            obj = c0h1j.LIZ(zLJ, image, f / f2, f3 / f4, f5, f6, z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UsHeaderVH@175a.updateIndicatorStyleOpt$1$1$1$getImageDarknessAndUpdate$1$1");
                return objLJFF;
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            final UsHeaderVH usHeaderVH = this.LLILLJJLI;
            final int i2 = this.LLJI;
            final boolean zBooleanValue = bool.booleanValue();
            C1260120ite.LIZIZ(new Runnable() { // from class: X.0H1R
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("UsHeaderVH@175a.updateIndicatorStyleOpt$1$1$1$getImageDarknessAndUpdate$1$1$1$1");
                    try {
                        usHeaderVH.z6().LJIIJ(i2, zBooleanValue);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("UsHeaderVH@175a.updateIndicatorStyleOpt$1$1$1$getImageDarknessAndUpdate$1$1$1$1");
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UsHeaderVH@175a.updateIndicatorStyleOpt$1$1$1$getImageDarknessAndUpdate$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
