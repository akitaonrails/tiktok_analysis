package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.18nX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21391318nX {
    public static final BPEAHandler LJIIJJI = new BPEAHandler(Looper.getMainLooper());
    public volatile Bitmap LIZ;
    public WeakReference<View> LIZJ;
    public WeakReference<View> LIZLLL;
    public WeakReference<View> LJFF;
    public float LJII;
    public float LJIIIIZZ;
    public volatile C21391618na LJIIIZ;
    public volatile String LJIIJ;
    public final Rect LIZIZ = new Rect();
    public float LJ = 1.0f;
    public float LJI = 1.0f;

    public final void LIZ() {
        this.LIZIZ.setEmpty();
        this.LJIIJ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJFF = null;
        this.LJII = 0.0f;
        this.LJIIIIZZ = 0.0f;
        C21391618na c21391618na = this.LJIIIZ;
        if (c21391618na != null) {
            c21391618na.LIZIZ.setImageBitmap(null);
            c21391618na.LIZIZ();
        }
        this.LJIIIZ = null;
    }

    public final void LIZLLL() {
        View view;
        View view2;
        WeakReference<View> weakReference = this.LIZJ;
        if (weakReference != null && (view2 = weakReference.get()) != null) {
            C786410Ut5.T4(view2, this.LJ);
        }
        WeakReference<View> weakReference2 = this.LJFF;
        if (weakReference2 == null || (view = weakReference2.get()) == null) {
            return;
        }
        C786410Ut5.T4(view, this.LJI);
    }

    public final boolean LIZIZ(View view, View view2, View view3, View view4) {
        View view5;
        int width;
        float width2;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        boolean z = false;
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
        WeakReference<View> weakReference = null;
        if (view4 != null && view4.getWidth() > 0 && view4.getHeight() > 0) {
            view5 = view4;
            width = view4.getWidth();
        } else {
            view4 = null;
            view5 = view2;
            width = view.getWidth();
        }
        float alpha = 1.0f;
        if (width > 0) {
            width2 = view.getWidth() / width;
        } else {
            width2 = 1.0f;
        }
        if (!LIZJ(rect, view5, width2, view3)) {
            return false;
        }
        this.LIZJ = new WeakReference<>(view2);
        this.LJ = view2.getAlpha();
        this.LIZLLL = new WeakReference<>(view);
        if (view3 != null && view3.getVisibility() == 0 && view3.getWidth() > 0 && view3.getHeight() > 0) {
            weakReference = new WeakReference<>(view3);
        } else {
            view3 = null;
        }
        this.LJFF = weakReference;
        if (view3 != null) {
            alpha = view3.getAlpha();
        }
        this.LJI = alpha;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshFromSkylight: useInner=");
        if (view4 != null) {
            z = true;
        }
        sbLIZ.append(z);
        sbLIZ.append(", scale=");
        sbLIZ.append(width2);
        sbLIZ.append(", rect=");
        sbLIZ.append(this.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        return true;
    }

    public final boolean LIZJ(Rect rect, View view, float f, View view2) {
        int[] iArr;
        float fMin;
        float fMin2;
        View view3 = view2;
        int iLIZIZ = C814420VxA.LIZIZ(view.getWidth() * f);
        int iLIZIZ2 = C814420VxA.LIZIZ(view.getHeight() * f);
        if (iLIZIZ > 0 && iLIZIZ2 > 0) {
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            float f2 = iLIZIZ;
            float f3 = fExactCenterX - (f2 / 2.0f);
            float f4 = iLIZIZ2;
            float f5 = fExactCenterY - (f4 / 2.0f);
            float fMax = f2 + f3;
            float fMax2 = f4 + f5;
            if (view3 != null && view3.getVisibility() == 0 && view3.getWidth() > 0 && view3.getHeight() > 0) {
                iArr = new int[2];
                view3.getLocationOnScreen(iArr);
                fMin2 = Math.min(f3, iArr[0]);
                fMin = Math.min(f5, iArr[1]);
                fMax = Math.max(fMax, iArr[0] + view3.getWidth());
                fMax2 = Math.max(fMax2, iArr[1] + view3.getHeight());
            } else {
                view3 = null;
                iArr = null;
                fMin = f5;
                fMin2 = f3;
            }
            int iLIZIZ3 = C814420VxA.LIZIZ(fMax - fMin2);
            int iLIZIZ4 = C814420VxA.LIZIZ(fMax2 - fMin);
            if (iLIZIZ3 > 0 && iLIZIZ4 > 0) {
                Bitmap bitmapCreateBitmap = this.LIZ;
                if (bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled() || bitmapCreateBitmap.getWidth() != iLIZIZ3 || bitmapCreateBitmap.getHeight() != iLIZIZ4) {
                    bitmapCreateBitmap = Bitmap.createBitmap(iLIZIZ3, iLIZIZ4, Bitmap.Config.ARGB_8888);
                }
                bitmapCreateBitmap.eraseColor(0);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.save();
                canvas.translate(f3 - fMin2, f5 - fMin);
                canvas.scale(f, f);
                view.draw(canvas);
                canvas.restore();
                if (view3 != null && iArr != null) {
                    canvas.save();
                    canvas.translate(iArr[0] - fMin2, iArr[1] - fMin);
                    view3.draw(canvas);
                    canvas.restore();
                }
                if (bitmapCreateBitmap != this.LIZ) {
                    Bitmap bitmap = this.LIZ;
                    if (bitmap != null) {
                        bitmap.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                    }
                    this.LIZ = null;
                    this.LIZ = bitmapCreateBitmap;
                }
                this.LIZIZ.set(rect);
                this.LJII = fExactCenterX - fMin2;
                this.LJIIIIZZ = fExactCenterY - fMin;
                return true;
            }
        }
        return false;
    }
}
