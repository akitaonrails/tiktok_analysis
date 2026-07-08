package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mmc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.inspiration.ui.panel.ImageInspirationPanelUIComponent$fetchDataAndShow$1$2", f = "ImageInspirationPanelUIComponent.kt", l = {}, m = "invokeSuspend")
public final class C1409520mmc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1409690mmt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409520mmc(C1409690mmt c1409690mmt, InterfaceC1364105Vn<? super C1409520mmc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1409690mmt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409520mmc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageInspirationPanelUIComponent@f986.fetchDataAndShow$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.R5(-1, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageInspirationPanelUIComponent@f986.fetchDataAndShow$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
