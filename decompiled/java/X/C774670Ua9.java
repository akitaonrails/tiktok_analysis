package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGuestLayoutZoomSurfaceWidget;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ua9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGuestLayoutZoomSurfaceWidget$zoomOut$2", f = "PreviewGuestLayoutZoomSurfaceWidget.kt", l = {506}, m = "invokeSuspend")
public final class C774670Ua9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public PreviewGuestLayoutZoomSurfaceWidget LL;
    public int LLILLJJLI;
    public final /* synthetic */ PreviewGuestLayoutZoomSurfaceWidget LLILLL;
    public final /* synthetic */ C774700UaC LLILZ;
    public final /* synthetic */ C259800zU<Bitmap> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C774670Ua9(PreviewGuestLayoutZoomSurfaceWidget previewGuestLayoutZoomSurfaceWidget, C774700UaC c774700UaC, C259800zU<Bitmap> c259800zU, InterfaceC1364105Vn<? super C774670Ua9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = previewGuestLayoutZoomSurfaceWidget;
        this.LLILZ = c774700UaC;
        this.LLILZIL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C774670Ua9(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [T, android.graphics.Bitmap] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PreviewGuestLayoutZoomSurfaceWidget previewGuestLayoutZoomSurfaceWidget;
        Integer numLJ;
        Integer numLJ2;
        C1C7U.LIZ("PreviewGuestLayoutZoomSurfaceWidget@44fd.zoomOut$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        Unit unit = null;
        if (i != 0) {
            if (i == 1) {
                previewGuestLayoutZoomSurfaceWidget = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            previewGuestLayoutZoomSurfaceWidget = this.LLILLL;
            this.LL = previewGuestLayoutZoomSurfaceWidget;
            this.LLILLJJLI = 1;
            previewGuestLayoutZoomSurfaceWidget.getClass();
            obj = C099A.LIZJ(500L, new C0UJ1(previewGuestLayoutZoomSurfaceWidget, null), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PreviewGuestLayoutZoomSurfaceWidget@44fd.zoomOut$2");
                return objLJFF;
            }
        }
        C774700UaC c774700UaC = this.LLILZ;
        Bitmap bitmapI1 = PreviewGuestLayoutZoomSurfaceWidget.I1(previewGuestLayoutZoomSurfaceWidget, (Bitmap) obj, c774700UaC.LIZ / 2, c774700UaC.LIZIZ / 2);
        String str = this.LLILLL.LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("zoomOut centerCropAndCompress ");
        if (bitmapI1 != null) {
            numLJ = C2286608xc.LJ(bitmapI1.getWidth());
        } else {
            numLJ = null;
        }
        sbLIZ.append(numLJ);
        sbLIZ.append(", ");
        if (bitmapI1 != null) {
            numLJ2 = C2286608xc.LJ(bitmapI1.getHeight());
        } else {
            numLJ2 = null;
        }
        sbLIZ.append(numLJ2);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZIL.element = C1100040ejS.LIZ(this.LLILLL.context, bitmapI1);
        if (bitmapI1 != null) {
            bitmapI1.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapI1);
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("PreviewGuestLayoutZoomSurfaceWidget@44fd.zoomOut$2");
        return unit;
    }
}
