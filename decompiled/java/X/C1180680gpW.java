package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.ContextThemeWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0gpW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180680gpW {
    public static final C1180670gpV LIZ = new C1180670gpV();

    public static final Bitmap LIZ(int i, int i2, Bitmap bitmap) {
        Pair pair;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        if (width / height > f3) {
            pair = new Pair(Integer.valueOf((int) (f3 * height)), Integer.valueOf((int) height));
        } else {
            pair = new Pair(Integer.valueOf((int) width), Integer.valueOf((int) (width / f3)));
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        float f4 = iIntValue;
        float f5 = 2;
        float f6 = iIntValue2;
        Matrix matrix = new Matrix();
        matrix.setScale(f / f4, f2 / f6);
        return Bitmap.createBitmap(bitmap, (int) ((width - f4) / f5), (int) ((height - f6) / f5), iIntValue, iIntValue2, matrix, true);
    }

    public static final Integer LIZLLL(Context context, int i, boolean z) {
        if (z) {
            if (C960203pA.LIZIZ(context)) {
                return C1308910kAL.LIZJ(i, new ContextThemeWrapper(context, R.style.y3));
            }
            return C1308910kAL.LIZJ(i, new ContextThemeWrapper(context, R.style.y0));
        }
        return C1308910kAL.LIZJ(i, context);
    }

    public static final C443530HaJ LIZJ(Context context, Bitmap bitmap, int i, int i2, float f) {
        int iIntValue;
        try {
            bitmap = LIZ(i, i2, bitmap);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        int iLJIIL = C2441009hQ.LJIIL(iIntValue, 30);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), f, f, paint);
        Paint paint2 = new Paint(1);
        paint2.setColor(iLJIIL);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(1.0f);
        float f2 = 1.0f / 2;
        canvas.drawRoundRect(new RectF(f2, f2, bitmap.getWidth() - f2, bitmap.getHeight() - f2), f, f, paint2);
        C443530HaJ c443530HaJ = new C443530HaJ(context.getResources(), bitmapCreateBitmap);
        c443530HaJ.LIZJ(f);
        return c443530HaJ;
    }

    public static final Object LIZIZ(final Context context, final String str, final int i, final int i2, final float f, String str2, boolean z, AbstractC23140094w abstractC23140094w) {
        AbstractC443520HaI abstractC443520HaI;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(abstractC23140094w));
        c2252611DEt.LJIJJ();
        SoftReference<AbstractC443520HaI> softReferenceLIZJ = LIZ.LIZ.LIZJ(new C1180660gpU(i, i2, f, str));
        if (softReferenceLIZJ != null && (abstractC443520HaI = softReferenceLIZJ.get()) != null) {
            if (c2252611DEt.isActive()) {
                C189200o6.m2constructorimpl(abstractC443520HaI);
                c2252611DEt.resumeWith(abstractC443520HaI);
            }
        } else if (z) {
            if (c2252611DEt.isActive()) {
                C189200o6.m2constructorimpl(null);
                c2252611DEt.resumeWith(null);
            }
        } else {
            C1189360h3W c1189360h3WLIZIZ = new C1180600gpO(str2, "poi_marker", null).LIZIZ(str);
            c1189360h3WLIZIZ.LIZ.LJJIIZI(C1308910kAL.LJ(R.attr.a03, context));
            c1189360h3WLIZIZ.LIZ.LJIL = Bitmap.Config.RGB_565;
            c1189360h3WLIZIZ.LJI(i, i2);
            c1189360h3WLIZIZ.LIZ.LJJ = EnumC1338240kve.CENTER_CROP;
            c1189360h3WLIZIZ.LJ(new InterfaceC1331910klR() { // from class: X.0gpT
                @Override // X.InterfaceC1331910klR
                public final void onProgress(float f2) {
                }

                @Override // X.InterfaceC1331910klR
                public final void onCanceled() {
                    if (c2252611DEt.isActive()) {
                        c2252611DEt.LJJIIZ(null);
                    }
                }

                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    C443530HaJ c443530HaJLIZJ;
                    if (!c2252611DEt.isActive()) {
                        return;
                    }
                    InterfaceC20236714Gf<AbstractC443520HaI> interfaceC20236714Gf = c2252611DEt;
                    if (bitmap != null) {
                        Context context2 = context;
                        int i3 = i;
                        int i4 = i2;
                        float f2 = f;
                        String str3 = str;
                        c443530HaJLIZJ = C1180680gpW.LIZJ(context2, bitmap, i3, i4, f2);
                        C1180670gpV c1180670gpV = C1180680gpW.LIZ;
                        c1180670gpV.LIZ.LIZLLL(new C1180660gpU(i3, i4, f2, str3), new SoftReference<>(c443530HaJLIZJ));
                    } else {
                        c443530HaJLIZJ = null;
                    }
                    C189200o6.m2constructorimpl(c443530HaJLIZJ);
                    interfaceC20236714Gf.resumeWith(c443530HaJLIZJ);
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    if (!c2252611DEt.isActive()) {
                        return;
                    }
                    InterfaceC20236714Gf<AbstractC443520HaI> interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(null);
                    interfaceC20236714Gf.resumeWith(null);
                }
            });
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLJIJ;
    }
}
