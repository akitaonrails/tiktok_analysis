package Y;

import X.C11NZ;
import X.C20441214yg;
import X.InterfaceC1478005qU;
import X.InterfaceC1487280oo2;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: loaded from: classes8.dex */
public class AkS9S0010000_7 implements InterfaceC1487280oo2 {
    public final int $t;
    public boolean z0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            default:
                return null;
        }
    }

    public AkS9S0010000_7(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }

    public static final Object apply$0(AkS9S0010000_7 akS9S0010000_7, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C20441214yg.LIZIZ("LocalLottieBitmapAsset", "load bitmapOrigin");
        boolean z = akS9S0010000_7.z0;
        float width = 192.0f / bitmap.getWidth();
        Matrix matrix = new Matrix();
        matrix.preScale(width, width);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(192, 192, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        float f = 192;
        RectF rectF = new RectF(0.0f, 0.0f, f, f);
        float f2 = 2;
        float fMax = Math.max(192, 192) / f2;
        canvas.drawRoundRect(rectF, fMax, fMax, paint);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint2.setStrokeWidth(8.0f);
        float f3 = 8.0f / f2;
        float f4 = f3 - 1;
        float f5 = 193 - f3;
        canvas.drawRoundRect(new RectF(f4, f4, f5, f5), fMax, fMax, paint2);
        bitmap.recycle();
        BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        return C11NZ.LJJJJZ(bitmapCreateBitmap2);
    }

    public static final Object apply$1(AkS9S0010000_7 akS9S0010000_7, Object obj) {
        final Bitmap bitmap = (Bitmap) obj;
        C20441214yg.LIZIZ("LocalLottieBitmapAsset", "load roundBitmap");
        if (akS9S0010000_7.z0) {
            final float f = 8.0f;
            return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0KZ8
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<Bitmap> c09aj) {
                    C1C7U.LIZ("LocalLottieBitmapAsset@1a0d.stroke$1");
                    try {
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint();
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                        paint.setAntiAlias(true);
                        paint.setColor(-1);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeWidth(f);
                        float f2 = width * 1.0f;
                        float f3 = 2;
                        float f4 = f2 / f3;
                        canvas.drawCircle(f4, (height * 1.0f) / f3, f4 - ((f - 1) / f3), paint);
                        c09aj.onNext(bitmapCreateBitmap);
                        c09aj.onComplete();
                        C786410Ut5.LJJJJ(bitmap);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        c09aj.onNext(bitmap);
                        c09aj.onComplete();
                    }
                    C1C7U.LIZIZ("LocalLottieBitmapAsset@1a0d.stroke$1");
                }
            });
        }
        return C11NZ.LJJJJZ(bitmap);
    }

    public static final Object apply$2(AkS9S0010000_7 akS9S0010000_7, Object obj) {
        final Bitmap bitmap = (Bitmap) obj;
        C20441214yg.LIZIZ("LocalLottieBitmapAsset", "load roundBitmap");
        if (akS9S0010000_7.z0) {
            final float f = 8.0f;
            return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0KZ9
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<Bitmap> c09aj) {
                    C1C7U.LIZ("LocalLottieBitmapAsset@d70b.stroke$1");
                    try {
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint();
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                        paint.setAntiAlias(true);
                        paint.setColor(-1);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeWidth(f);
                        float f2 = width * 1.0f;
                        float f3 = 2;
                        float f4 = f2 / f3;
                        canvas.drawCircle(f4, (height * 1.0f) / f3, f4 - ((f - 1) / f3), paint);
                        c09aj.onNext(bitmapCreateBitmap);
                        c09aj.onComplete();
                        C786410Ut5.LJJJJ(bitmap);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        c09aj.onNext(bitmap);
                        c09aj.onComplete();
                    }
                    C1C7U.LIZIZ("LocalLottieBitmapAsset@d70b.stroke$1");
                }
            });
        }
        return C11NZ.LJJJJZ(bitmap);
    }
}
