package X;

import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import j27.s;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jmI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1294000jmI extends AbstractC1291220jho {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final InterfaceC1320380kSq LJIIJJI;
    public final WeakReference<s> LJIIL;

    @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
    public final String getName() {
        return "ShadowPostProcessor";
    }

    @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
    public final InterfaceC1324680kZm getPostprocessorCacheKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.LIZ);
        sb.append(this.LIZIZ);
        sb.append(this.LJ);
        sb.append(this.LJFF);
        sb.append(this.LIZJ);
        sb.append(this.LIZLLL);
        sb.append(this.LJIIJJI);
        sb.append(this.LJI);
        sb.append(this.LJII);
        sb.append(this.LJIIIIZZ);
        sb.append(this.LJIIIZ);
        sb.append(this.LJIIJ);
        return new C592490NLr(sb.toString());
    }

    public final Bitmap LIZIZ(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf) {
        int i;
        RectF rectF;
        int i2 = this.LIZ;
        if (i2 == 0 || (i = this.LIZIZ) == 0) {
            return bitmap;
        }
        Bitmap bitmap2 = abstractC1301670jyf.LJFF(i2, i, bitmap.getConfig()).get();
        Matrix matrix = new Matrix();
        Canvas canvas = new Canvas(bitmap2);
        canvas.translate(this.LIZJ, this.LJFF);
        canvas.clipRect(0, 0, i2 - this.LIZLLL, i - this.LJ);
        canvas.drawARGB(0, 0, 0, 0);
        Paint paint = new Paint(1);
        float f = (i2 - this.LIZJ) - this.LIZLLL;
        float f2 = (i - this.LJFF) - this.LJ;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        InterfaceC1320380kSq interfaceC1320380kSq = this.LJIIJJI;
        if (interfaceC1320380kSq == InterfaceC1320380kSq.LIZ) {
            matrix.setScale(f / width, f2 / height);
            matrix.postTranslate(0.0f, 0.0f);
            rectF = new RectF(0.0f, 0.0f, f + 0.0f, f2 + 0.0f);
        } else if (interfaceC1320380kSq == InterfaceC1320380kSq.LIZJ) {
            float f3 = f / width;
            float f4 = f2 / height;
            if (f3 > f4) {
                float f5 = width * f4;
                float f6 = ((f - f5) / 2.0f) + 0.0f;
                rectF = new RectF(f6, 0.0f, f5 + f6, f2 + 0.0f);
                matrix.setScale(f4, f4);
                matrix.postTranslate(f6, 0.0f);
            } else {
                float f7 = height * f3;
                float f8 = ((f2 - f7) / 2.0f) + 0.0f;
                rectF = new RectF(0.0f, f8, f + 0.0f, f7 + f8);
                matrix.setScale(f3, f3);
                matrix.postTranslate(0.0f, f8);
            }
        } else if (interfaceC1320380kSq == InterfaceC1320380kSq.LJI) {
            float f9 = f / width;
            float f10 = f2 / height;
            if (f9 > f10) {
                rectF = new RectF(0.0f, 0.0f, f + 0.0f, f2 + 0.0f);
                matrix.setScale(f9, f9);
                matrix.postTranslate(0.0f, ((f2 - (height * f9)) / 2.0f) + 0.0f);
            } else {
                rectF = new RectF(0.0f, 0.0f, f + 0.0f, f2 + 0.0f);
                matrix.setScale(f10, f10);
                matrix.postTranslate(((f - (width * f10)) / 2.0f) + 0.0f, 0.0f);
            }
        } else {
            rectF = new RectF(0.0f, 0.0f, f, f2);
            matrix.setTranslate(Math.round((f - width) * 0.5f), Math.round((f2 - height) * 0.5f));
        }
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        paint.setFilterBitmap(true);
        canvas.drawRect(rectF, paint);
        return bitmap2;
    }

    @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
    public final C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf) {
        Bitmap.Config config = bitmap.getConfig();
        int i = this.LIZ;
        int i2 = this.LIZIZ;
        if (config == null) {
            config = AbstractC1291220jho.FALLBACK_BITMAP_CONFIGURATION;
        }
        C1323050kX9<Bitmap> c1323050kX9LJFF = abstractC1301670jyf.LJFF(i, i2, config);
        try {
            try {
                if (this.LIZ == 0 || this.LIZIZ == 0 || (this.LJIIIZ == 0 && this.LJIIIIZZ == 0 && this.LJIIJ == 0)) {
                    process(c1323050kX9LJFF.get(), bitmap);
                    C1323050kX9<Bitmap> c1323050kX9LJFF2 = C1323050kX9.LJFF(c1323050kX9LJFF);
                    C1323050kX9.LJII(c1323050kX9LJFF);
                    return c1323050kX9LJFF2;
                }
                Bitmap bitmapLIZIZ = LIZIZ(bitmap, abstractC1301670jyf);
                Canvas canvas = new Canvas(c1323050kX9LJFF.get());
                if (this.LJIIIIZZ != 0) {
                    Paint paint = new Paint();
                    paint.setFlags(3);
                    paint.setColorFilter(new PorterDuffColorFilter(this.LJIIIIZZ, PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmapLIZIZ, this.LJI, this.LJII, paint);
                }
                if (this.LJIIIZ != 0) {
                    NativeBlurFilter.iterativeBoxBlur(c1323050kX9LJFF.get(), 3, this.LJIIIZ);
                }
                canvas.drawBitmap(bitmapLIZIZ, 0.0f, 0.0f, (Paint) null);
                if (this.LJIIJ != 0) {
                    NativeBlurFilter.iterativeBoxBlur(c1323050kX9LJFF.get(), 3, this.LJIIJ);
                }
                C1323050kX9<Bitmap> c1323050kX9LJFF3 = C1323050kX9.LJFF(c1323050kX9LJFF);
                C1323050kX9.LJII(c1323050kX9LJFF);
                return c1323050kX9LJFF3;
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                C1289620jfE.LIZJ(new ARunnableS120S0100000_20(this, 65));
                C1323050kX9<Bitmap> c1323050kX9LJFF4 = C1323050kX9.LJFF(c1323050kX9LJFF);
                C1323050kX9.LJII(c1323050kX9LJFF);
                return c1323050kX9LJFF4;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323050kX9.LJII(c1323050kX9LJFF);
            throw th;
        }
    }

    public C1294000jmI(int i, int i2, int i3, int i4, int i5, int i6, InterfaceC1320380kSq interfaceC1320380kSq, int i7, int i8, int i9, int i10, int i11, Context context) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LJFF = i4;
        this.LIZLLL = i5;
        this.LJ = i6;
        this.LJIIJJI = interfaceC1320380kSq;
        this.LJI = i7;
        this.LJII = i8;
        this.LJIIIIZZ = i9;
        this.LJIIIZ = i10;
        this.LJIIJ = i11;
        this.LJIIL = new WeakReference<>(C1298530jtb.LIZIZ(context));
    }
}
