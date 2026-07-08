package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewShowLocationWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.AnchorLocationSettingsReadResponse;

/* JADX INFO: renamed from: X.0Tg1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.PreviewShowLocationWidget$readLocationWithDelay$1$1", f = "PreviewShowLocationWidget.kt", l = {}, m = "invokeSuspend")
public final class C752830Tg1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PreviewShowLocationWidget LL;
    public final /* synthetic */ AnchorLocationSettingsReadResponse.ResponseData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C752830Tg1(PreviewShowLocationWidget previewShowLocationWidget, AnchorLocationSettingsReadResponse.ResponseData responseData, InterfaceC1364105Vn<? super C752830Tg1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = previewShowLocationWidget;
        this.LLILLJJLI = responseData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C752830Tg1(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreviewShowLocationWidget@d654.readLocationWithDelay$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C16F5 c16f5 = this.LL.LLILZLL;
        if (c16f5 != null) {
            c16f5.setText(this.LLILLJJLI.location);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreviewShowLocationWidget@d654.readLocationWithDelay$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
