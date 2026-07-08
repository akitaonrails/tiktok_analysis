package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ddv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.preloader.ImageLogReporter$onComplete$3$2", f = "ImageLogReporter.kt", l = {}, m = "invokeSuspend")
public final class C1058170ddv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1066100dqi LL;
    public final /* synthetic */ C238400w2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1058170ddv(C1066100dqi c1066100dqi, C238400w2 c238400w2, InterfaceC1364105Vn<? super C1058170ddv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1066100dqi;
        this.LLILLJJLI = c238400w2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1058170ddv(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageLogReporter@b0a1.onComplete$3$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1066100dqi c1066100dqi = this.LL;
        c1066100dqi.LJII = this.LLILLJJLI.element;
        c1066100dqi.LJIIJJI++;
        c1066100dqi.LJFF();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageLogReporter@b0a1.onComplete$3$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
