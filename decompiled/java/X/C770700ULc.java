package X;

import android.view.View;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewDecouplingWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ULc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.PreviewDecouplingWidget$checkDecouplingWidgetShow$1$1$1", f = "PreviewDecouplingWidget.kt", l = {}, m = "invokeSuspend")
public final class C770700ULc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ PreviewDecouplingWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C770700ULc(View view, PreviewDecouplingWidget previewDecouplingWidget, InterfaceC1364105Vn<? super C770700ULc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = view;
        this.LLILLJJLI = previewDecouplingWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C770700ULc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreviewDecouplingWidget@41d5.checkDecouplingWidgetShow$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C500260Jjc.LJJJI(Boolean.valueOf(!C500260Jjc.LJJJJIZL(this.LL))) && this.LLILLJJLI.LLJ) {
            C20441214yg.LIZIZ("VideoModeContainer", "decoupling_center_banner visible");
            this.LLILLJJLI.show();
            this.LLILLJJLI.G1();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreviewDecouplingWidget@41d5.checkDecouplingWidgetShow$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
