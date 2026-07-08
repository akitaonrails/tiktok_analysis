package Y;

import X.C12ES;
import X.C1AF0;
import X.C1C7U;
import X.C201955140j;
import X.C2474509mp;
import X.C2474609mq;
import X.C786410Ut5;
import X.InterfaceC2474709mr;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.Locale;
import lth.o;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS12S0400000_3 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Bitmap bitmapCreateBitmap;
        float fMin = (Math.min(((Bitmap) this.l0).getWidth(), ((Bitmap) this.l0).getHeight()) * 1.0f) / 1920.0f;
        float width = ((Bitmap) this.l1).getWidth() * fMin;
        float height = ((Bitmap) this.l1).getHeight() * fMin;
        int i = (int) width;
        int width2 = (((Bitmap) this.l0).getWidth() - ((int) C12ES.LIZJ(11.0f, o.LIZ))) - i;
        int i2 = (int) height;
        int height2 = (((Bitmap) this.l0).getHeight() - ((int) C12ES.LIZJ(10.5f, o.LIZ))) - i2;
        try {
            Bitmap bitmap = (Bitmap) this.l1;
            int width3 = bitmap.getWidth();
            int height3 = bitmap.getHeight();
            Matrix matrix = new Matrix();
            matrix.postScale(i / width3, i2 / height3);
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width3, height3, matrix, true);
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            String strK4 = C786410Ut5.k4(Locale.US, "%s width:%d height:%d waterMaskScaledWidth:%f waterMaskScaledHeight:%f", new Object[]{"ResizeBitmapException", Integer.valueOf(((Bitmap) this.l1).getWidth()), Integer.valueOf(((Bitmap) this.l1).getHeight()), Float.valueOf(width), Float.valueOf(height)});
            C1AF0.LJFF((Exception) this.l2, strK4);
            C201955140j.LJIIL(strK4);
            try {
                Bitmap bitmap2 = (Bitmap) this.l1;
                int width4 = bitmap2.getWidth();
                int height4 = bitmap2.getHeight();
                Matrix matrix2 = new Matrix();
                matrix2.postScale(width / width4, height / height4);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width4, height4, matrix2, true);
                bitmap2.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
            } catch (IllegalArgumentException e2) {
                TryCatchGuardChecker.doCheck(e2);
                InterfaceC2474709mr interfaceC2474709mr = (InterfaceC2474709mr) this.l3;
                if (interfaceC2474709mr != null) {
                    interfaceC2474709mr.getClass();
                    return;
                }
                return;
            }
        }
        Bitmap bitmap3 = (Bitmap) this.l0;
        Bitmap bitmap4 = null;
        if (C2474609mq.LIZIZ(bitmap3) && C2474609mq.LIZIZ(bitmapCreateBitmap)) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap3.getWidth(), bitmap3.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap2);
            canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(bitmapCreateBitmap, width2, height2, (Paint) null);
            canvas.save();
            canvas.restore();
            bitmap4 = bitmapCreateBitmap2;
        }
        C786410Ut5.LJJJJ((Bitmap) this.l0);
        if (C2474609mq.LIZIZ(bitmapCreateBitmap)) {
            C786410Ut5.LJJJJ(bitmapCreateBitmap);
        }
        C2474509mp.LIZ(new ARunnableS72S0200000_3(bitmap4, this, 49));
    }

    public static final void run$0(ARunnableS12S0400000_3 aRunnableS12S0400000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ImageUtils@c081.dealGenWaterMask$1");
        try {
            aRunnableS12S0400000_3.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageUtils@c081.dealGenWaterMask$1");
    }

    public static final void run$1(ARunnableS12S0400000_3 aRunnableS12S0400000_3) {
        boolean zLIZ;
        C1C7U.LIZ("CameraVideoCapturer@8f5e.postAndWait$1");
        try {
            ((Runnable) aRunnableS12S0400000_3.l0).run();
            ((boolean[]) aRunnableS12S0400000_3.l1)[0] = true;
            synchronized (aRunnableS12S0400000_3.l2) {
                try {
                    aRunnableS12S0400000_3.l2.notify();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraVideoCapturer@8f5e.postAndWait$1");
    }

    public ARunnableS12S0400000_3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
