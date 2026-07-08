package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.middlepage.AdMiddlePageBannerView$1$1", f = "AdMiddlePageBannerView.kt", l = {}, m = "invokeSuspend")
public final class C818780WAa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1037430d6T LL;
    public final /* synthetic */ C259800zU<C818790WAb> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C818780WAa(C1037430d6T c1037430d6T, C259800zU<C818790WAb> c259800zU, InterfaceC1364105Vn<? super C818780WAa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1037430d6T;
        this.LLILLJJLI = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C818780WAa(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdMiddlePageBannerView@aa55.<init>$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        System.currentTimeMillis();
        this.LL.setBrowserInfo(this.LLILLJJLI.element);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdMiddlePageBannerView@aa55.<init>$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
