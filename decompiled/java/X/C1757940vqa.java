package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0vqa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.popup.view.SeaPdpBasePopup$load$1$onComponentLoadFail$1", f = "SeaPdpBasePopup.kt", l = {}, m = "invokeSuspend")
public final class C1757940vqa extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1760060vu0 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1757940vqa(AbstractC1760060vu0 abstractC1760060vu0, String str, String str2, InterfaceC1364105Vn<? super C1757940vqa> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = abstractC1760060vu0;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1757940vqa(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpBasePopup@4beb.load$1$onComponentLoadFail$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZJ.LIZIZ(this.LLILLJJLI, this.LLILLL, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpBasePopup@4beb.load$1$onComponentLoadFail$1");
        return unit;
    }
}
