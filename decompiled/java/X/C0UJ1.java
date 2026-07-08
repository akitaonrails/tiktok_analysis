package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGuestLayoutZoomSurfaceWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UJ1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGuestLayoutZoomSurfaceWidget$requireCurBitmap$2", f = "PreviewGuestLayoutZoomSurfaceWidget.kt", l = {299}, m = "invokeSuspend")
public final class C0UJ1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ PreviewGuestLayoutZoomSurfaceWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UJ1(PreviewGuestLayoutZoomSurfaceWidget previewGuestLayoutZoomSurfaceWidget, InterfaceC1364105Vn<? super C0UJ1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = previewGuestLayoutZoomSurfaceWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0UJ1(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreviewGuestLayoutZoomSurfaceWidget@44fd.requireCurBitmap$2");
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
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            if (previewGuestLayoutZoomSurfaceWidget.LLJ == null) {
                previewGuestLayoutZoomSurfaceWidget.LLJ = C770730ULf.LIZ(previewGuestLayoutZoomSurfaceWidget.dataChannel);
            }
            C0UJY c0ujy = previewGuestLayoutZoomSurfaceWidget.LLJ;
            if (c0ujy == null) {
                C189200o6.m2constructorimpl(null);
                c23260099m.resumeWith(null);
            } else {
                try {
                    c0ujy.LJJIIJ(new C0UJ0(previewGuestLayoutZoomSurfaceWidget, c23260099m));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    String str = previewGuestLayoutZoomSurfaceWidget.LLILZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("requireCurBitmap failed ");
                    sbLIZ.append(th);
                    C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
                    C189200o6.m2constructorimpl(null);
                    c23260099m.resumeWith(null);
                }
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PreviewGuestLayoutZoomSurfaceWidget@44fd.requireCurBitmap$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PreviewGuestLayoutZoomSurfaceWidget@44fd.requireCurBitmap$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
