package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGuestLayoutZoomSurfaceWidget;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGuestLayoutZoomSurfaceWidget", f = "PreviewGuestLayoutZoomSurfaceWidget.kt", l = {504}, m = "zoomOut")
public final class C774690UaB extends AbstractC23140094w {
    public AwS556S0100000_12 LL;
    public C774700UaC LLILLJJLI;
    public C774700UaC LLILLL;
    public C259800zU LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ PreviewGuestLayoutZoomSurfaceWidget LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C774690UaB(PreviewGuestLayoutZoomSurfaceWidget previewGuestLayoutZoomSurfaceWidget, InterfaceC1364105Vn<? super C774690UaB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = previewGuestLayoutZoomSurfaceWidget;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreviewGuestLayoutZoomSurfaceWidget@44fd.zoomOut$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objO1 = this.LLILZLL.O1(false, this);
        C1C7U.LIZIZ("PreviewGuestLayoutZoomSurfaceWidget@44fd.zoomOut$1");
        return objO1;
    }
}
