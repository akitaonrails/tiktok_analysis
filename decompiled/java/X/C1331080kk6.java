package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331080kk6 {
    public static final Drawable LIZ = new ColorDrawable(0);

    public static void LIZIZ(InterfaceC1331120kkA interfaceC1331120kkA, C1331100kk8 c1331100kk8) {
        interfaceC1331120kkA.LJIIIIZZ(c1331100kk8.LIZIZ);
        interfaceC1331120kkA.LJ(c1331100kk8.LIZJ);
        interfaceC1331120kkA.LJIIJ(c1331100kk8.LJ, c1331100kk8.LJFF);
        interfaceC1331120kkA.LJIIJJI(c1331100kk8.LJI);
        interfaceC1331120kkA.LJII(c1331100kk8.LJII);
    }

    public static Drawable LIZLLL(Drawable drawable, C1331100kk8 c1331100kk8) {
        try {
            C1336010ks3.LIZIZ();
            if (drawable != null && c1331100kk8 != null && c1331100kk8.LIZ == EnumC1321320kUM.OVERLAY_COLOR) {
                C1322840kWo c1322840kWo = new C1322840kWo(drawable);
                LIZIZ(c1322840kWo, c1331100kk8);
                c1322840kWo.LLJJ = c1331100kk8.LIZLLL;
                c1322840kWo.invalidateSelf();
                C1336010ks3.LIZIZ();
                return c1322840kWo;
            }
            C1336010ks3.LIZIZ();
            return drawable;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
    }

    public static Drawable LIZ(Drawable drawable, C1331100kk8 c1331100kk8, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            C1331470kkj c1331470kkj = new C1331470kkj(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            LIZIZ(c1331470kkj, c1331100kk8);
            return c1331470kkj;
        }
        if (drawable instanceof NinePatchDrawable) {
            final NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) drawable;
            AbstractC1331460kki abstractC1331460kki = new AbstractC1331460kki(ninePatchDrawable) { // from class: X.0kkk
                @Override // X.AbstractC1331460kki, android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    C1336010ks3.LIZIZ();
                    if (!this.LLILLJJLI && !this.LLILLL && this.LLILZ <= 0.0f) {
                        super.draw(canvas);
                        C1336010ks3.LIZIZ();
                        return;
                    }
                    LIZIZ();
                    LIZ();
                    canvas.clipPath(this.LLILZIL);
                    super.draw(canvas);
                    C1336010ks3.LIZIZ();
                }
            };
            LIZIZ(abstractC1331460kki, c1331100kk8);
            return abstractC1331460kki;
        }
        if (drawable instanceof ColorDrawable) {
            C440190HNx c440190HNx = new C440190HNx(((ColorDrawable) drawable).getColor());
            LIZIZ(c440190HNx, c1331100kk8);
            return c440190HNx;
        }
        Object[] objArr = {drawable};
        if (C1328570kg3.LIZ.LIZIZ(5)) {
            C1328570kg3.LIZ.w("WrappingUtils", C786410Ut5.k4(null, "Don't know how to round that drawable: %s", objArr));
        }
        return drawable;
    }

    public static Drawable LIZJ(Drawable drawable, C1331100kk8 c1331100kk8, Resources resources) {
        try {
            C1336010ks3.LIZIZ();
            if (drawable != null && c1331100kk8 != null && c1331100kk8.LIZ == EnumC1321320kUM.BITMAP_ONLY) {
                if (drawable instanceof C1331050kk3) {
                    InterfaceC722050STz interfaceC722050STz = (C1331050kk3) drawable;
                    while (true) {
                        Object objLIZ = interfaceC722050STz.LIZ();
                        if (objLIZ == interfaceC722050STz || !(objLIZ instanceof InterfaceC722050STz)) {
                            break;
                        }
                        interfaceC722050STz = (InterfaceC722050STz) objLIZ;
                    }
                    interfaceC722050STz.LIZJ(LIZ(interfaceC722050STz.LIZJ(LIZ), c1331100kk8, resources));
                    C1336010ks3.LIZIZ();
                    return drawable;
                }
                Drawable drawableLIZ = LIZ(drawable, c1331100kk8, resources);
                C1336010ks3.LIZIZ();
                return drawableLIZ;
            }
            C1336010ks3.LIZIZ();
            return drawable;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
    }

    public static Drawable LJ(Drawable drawable, InterfaceC1320380kSq interfaceC1320380kSq, PointF pointF) {
        C1336010ks3.LIZIZ();
        if (drawable != null && interfaceC1320380kSq != null) {
            C1319910kS5 c1319910kS5 = new C1319910kS5(drawable, interfaceC1320380kSq);
            if (pointF != null) {
                c1319910kS5.LJIJ(pointF);
            }
            C1336010ks3.LIZIZ();
            return c1319910kS5;
        }
        C1336010ks3.LIZIZ();
        return drawable;
    }
}
