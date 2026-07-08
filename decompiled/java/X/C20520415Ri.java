package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAndroidBackgroundOptSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Ri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20520415Ri extends Drawable {
    public int LIZJ;
    public int LIZLLL;
    public Rect LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public List<String> LJIIIIZZ;
    public boolean LJIIIZ;
    public BitmapDrawable LJIILIIL;
    public final C20520615Rk LIZ = new C20520615Rk();
    public final Paint LIZIZ = new Paint(6);
    public final boolean[] LJIIJ = new boolean[4];
    public final C01GW LJIIJJI = C930540aK4.LJJIJIL(AFwS221S0000000_31.get$arr$(69));
    public final C01GW LJIIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(68));

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final boolean LIZIZ() {
        return MultiGuestAndroidBackgroundOptSetting.INSTANCE.isOptSetBg() && this.LJII;
    }

    public final void LIZJ() {
        List<String> list;
        if (this.LJIILIIL == null && (list = this.LJIIIIZZ) != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = C1322200kVm.LIZ().LJI(C1325700kbQ.LIZLLL(UriProtector.parse(it2.next())).LIZ(), null);
                if (interfaceC1320200kSYLJI != null) {
                    interfaceC1320200kSYLJI.LIZJ(new AbstractC447090Hg3() { // from class: X.15Qp
                        @Override // X.C0HWE
                        public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                            C20441214yg.LIZIZ("WindowMaskDrawable resize", "resize image fail");
                            if (interfaceC1320200kSY != null) {
                                interfaceC1320200kSY.close();
                            }
                        }

                        @Override // X.AbstractC447090Hg3
                        public final void LJI(Bitmap bitmap) {
                            int i;
                            int i2;
                            int i3;
                            int i4;
                            if (bitmap != null) {
                                C20520415Ri c20520415Ri = this.LIZ;
                                c20520415Ri.getClass();
                                int width = bitmap.getWidth();
                                int height = bitmap.getHeight();
                                int iLJJI = (int) C497740JfY.LJJI(c20520415Ri.LIZJ);
                                int iLJJI2 = (int) C497740JfY.LJJI(c20520415Ri.LIZLLL);
                                if (((double) width) / ((double) height) > ((double) iLJJI) / ((double) iLJJI2)) {
                                    i2 = (iLJJI * height) / iLJJI2;
                                    i = height;
                                } else {
                                    i = (iLJJI2 * width) / iLJJI;
                                    i2 = width;
                                }
                                if (width > i2) {
                                    i3 = (width - i2) / 2;
                                } else {
                                    i3 = 0;
                                }
                                if (height > i) {
                                    i4 = (height - i) / 2;
                                } else {
                                    i4 = 0;
                                }
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i3, i4, i2, i, (Matrix) null, false);
                                this.LIZ.LJIILIIL = new BitmapDrawable(C497740JfY.LJIILJJIL(), bitmapCreateBitmap);
                                C500260Jjc.LJJLIIIJJIZ(new AwS575S0100000_31(this.LIZ, 140));
                            }
                            C20441214yg.LIZIZ("WindowMaskDrawable resize", "resize image success");
                            InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY = interfaceC1320200kSYLJI;
                            if (interfaceC1320200kSY != null) {
                                interfaceC1320200kSY.close();
                            }
                        }
                    }, C2126108Up.LIZ);
                }
            }
        }
    }

    public final void LIZ(Canvas canvas) {
        if (this.LJIIJ[0]) {
            ((ColorDrawable) this.LIZ.LIZ.getValue()).draw(canvas);
        }
        if (this.LJIIJ[1]) {
            ((ColorDrawable) this.LIZ.LIZJ.getValue()).draw(canvas);
        }
        if (this.LJIIJ[2]) {
            ((ColorDrawable) this.LIZ.LIZIZ.getValue()).draw(canvas);
        }
        if (this.LJIIJ[3]) {
            ((ColorDrawable) this.LIZ.LIZLLL.getValue()).draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = this.LJ;
        BitmapDrawable bitmapDrawable = this.LJIILIIL;
        if (this.LJIIIZ) {
            LIZ(canvas);
            return;
        }
        if (rect != null && bitmapDrawable != null && LIZIZ()) {
            bitmapDrawable.setBounds(0, 0, this.LIZJ, this.LIZLLL);
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.LIZJ, this.LIZLLL, this.LIZIZ);
            bitmapDrawable.draw(canvas);
            this.LIZIZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawRect(new RectF(rect), this.LIZIZ);
            this.LIZIZ.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
            return;
        }
        LIZ(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.LIZIZ.getAlpha() != i) {
            this.LIZIZ.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (!Intrinsics.LJFF(this.LIZIZ.getColorFilter(), colorFilter)) {
            this.LIZIZ.setColorFilter(colorFilter);
            invalidateSelf();
        }
    }
}
