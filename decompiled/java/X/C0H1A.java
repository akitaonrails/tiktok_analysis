package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H1A, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.utils.ImageColorHelper$Companion$processShopBackground$2", f = "ImageColorHelper.kt", l = {55}, m = "invokeSuspend")
public final class C0H1A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public int LL;
    public final /* synthetic */ Image LLILLJJLI;
    public final /* synthetic */ C0H1C LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H1A(Image image, C0H1C c0h1c, InterfaceC1364105Vn<? super C0H1A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = image;
        this.LLILLL = c0h1c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H1A(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageColorHelper$Companion@66ea.processShopBackground$2");
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
            Image image = this.LLILLJJLI;
            C0H1C c0h1c = this.LLILLL;
            this.LL = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            C1331660kl2.LJIIJ(image.toImageUrlModel()).LJJII(new C463060IDw(c0h1c, c23260099m, 0));
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ImageColorHelper$Companion@66ea.processShopBackground$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ImageColorHelper$Companion@66ea.processShopBackground$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
