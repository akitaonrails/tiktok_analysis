package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mm5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.switchmode.ImageVideoSeparateModeSwitchComponent$realSeparateSwitch$1$1", f = "ImageVideoSeparateModeSwitchApi.kt", l = {}, m = "invokeSuspend")
public final class C578230Mm5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C578250Mm7 LL;
    public final /* synthetic */ C578160Mly LLILLJJLI;
    public final /* synthetic */ InterfaceC332260D0u<EnumC578300MmC> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C578230Mm5(C578250Mm7 c578250Mm7, C578160Mly c578160Mly, InterfaceC332260D0u<EnumC578300MmC> interfaceC332260D0u, InterfaceC1364105Vn<? super C578230Mm5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c578250Mm7;
        this.LLILLJJLI = c578160Mly;
        this.LLILLL = interfaceC332260D0u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C578230Mm5(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageVideoSeparateModeSwitchComponent@6927.realSeparateSwitch$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.c3().Yw2(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageVideoSeparateModeSwitchComponent@6927.realSeparateSwitch$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
