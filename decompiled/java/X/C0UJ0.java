package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGuestLayoutZoomSurfaceWidget;

/* JADX INFO: renamed from: X.0UJ0, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UJ0 implements InterfaceC770080UIs {
    public final /* synthetic */ PreviewGuestLayoutZoomSurfaceWidget LIZ;
    public final /* synthetic */ InterfaceC1364105Vn<Bitmap> LIZIZ;

    public C0UJ0(PreviewGuestLayoutZoomSurfaceWidget previewGuestLayoutZoomSurfaceWidget, C23260099m c23260099m) {
        this.LIZ = previewGuestLayoutZoomSurfaceWidget;
        this.LIZIZ = c23260099m;
    }

    @Override // X.InterfaceC770080UIs
    public final void LIZ(Bitmap bitmap) {
        Integer numValueOf;
        String str = this.LIZ.LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requireCurBitmap ");
        Integer numValueOf2 = null;
        if (bitmap != null) {
            numValueOf = Integer.valueOf(bitmap.getWidth());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", ");
        if (bitmap != null) {
            numValueOf2 = Integer.valueOf(bitmap.getHeight());
        }
        sbLIZ.append(numValueOf2);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1364105Vn<Bitmap> interfaceC1364105Vn = this.LIZIZ;
        C189200o6.m2constructorimpl(bitmap);
        interfaceC1364105Vn.resumeWith(bitmap);
    }
}
