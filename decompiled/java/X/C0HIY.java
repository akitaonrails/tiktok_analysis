package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HIY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoModeLastImageHintAssem$onViewCreated$1$onPageSelected$3", f = "PhotoModeLastImageHintAssem.kt", l = {}, m = "invokeSuspend")
public final class C0HIY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<C21647019ng> LL;
    public final /* synthetic */ C259800zU<C21647019ng> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HIY(C259800zU<C21647019ng> c259800zU, C259800zU<C21647019ng> c259800zU2, InterfaceC1364105Vn<? super C0HIY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HIY(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoModeLastImageHintAssem@a033.onViewCreated$1$onPageSelected$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C21647019ng c21647019ng = this.LL.element;
        if (c21647019ng != null) {
            c21647019ng.LJI(true);
        }
        C21647019ng c21647019ng2 = this.LLILLJJLI.element;
        if (c21647019ng2 != null) {
            c21647019ng2.LJI(true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoModeLastImageHintAssem@a033.onViewCreated$1$onPageSelected$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
