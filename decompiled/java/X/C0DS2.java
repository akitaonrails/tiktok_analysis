package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGuestLayoutZoomSurfaceWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DS2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGuestLayoutZoomSurfaceWidget$onWidgetCreated$4$1", f = "PreviewGuestLayoutZoomSurfaceWidget.kt", l = {168}, m = "invokeSuspend")
public final class C0DS2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PreviewGuestLayoutZoomSurfaceWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DS2(PreviewGuestLayoutZoomSurfaceWidget previewGuestLayoutZoomSurfaceWidget, InterfaceC1364105Vn<? super C0DS2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = previewGuestLayoutZoomSurfaceWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DS2(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreviewGuestLayoutZoomSurfaceWidget@44fd.onWidgetCreated$4$1");
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
            PreviewGuestLayoutZoomSurfaceWidget previewGuestLayoutZoomSurfaceWidget = this.LLILLJJLI;
            this.LL = 1;
            if (previewGuestLayoutZoomSurfaceWidget.O1(true, this) == objLJFF) {
                C1C7U.LIZIZ("PreviewGuestLayoutZoomSurfaceWidget@44fd.onWidgetCreated$4$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreviewGuestLayoutZoomSurfaceWidget@44fd.onWidgetCreated$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
