package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kSQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320120kSQ implements InterfaceC1320130kSR {
    public final Resources LIZ;
    public final InterfaceC1320130kSR LIZIZ;

    @Override // X.InterfaceC1320130kSR
    public final boolean LIZIZ(AbstractC1327750kej abstractC1327750kej) {
        return true;
    }

    @Override // X.InterfaceC1320130kSR
    public final Drawable LIZJ(AbstractC1327750kej abstractC1327750kej) {
        boolean z;
        try {
            C1336010ks3.LIZIZ();
            if (abstractC1327750kej instanceof C1325120kaU) {
                C1325120kaU c1325120kaU = (C1325120kaU) abstractC1327750kej;
                final BitmapDrawable bitmapDrawable = new BitmapDrawable(this.LIZ, c1325120kaU.getUnderlyingBitmap());
                int i = c1325120kaU.mRotationAngle;
                boolean z2 = true;
                if (i != 0 && i != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    int i2 = c1325120kaU.mExifOrientation;
                    if (i2 == 1 || i2 == 0) {
                        z2 = false;
                    }
                    if (!z2) {
                        C1336010ks3.LIZIZ();
                        return bitmapDrawable;
                    }
                }
                final int i3 = c1325120kaU.mRotationAngle;
                final int i4 = c1325120kaU.mExifOrientation;
                C1331050kk3 c1331050kk3 = new C1331050kk3(bitmapDrawable, i3, i4) { // from class: X.0kS7
                    public final Matrix LLILZIL;
                    public final int LLILZLL;
                    public final int LLIZ;
                    public final Matrix LLIZLLLIL = new Matrix();
                    public final RectF LLJ = new RectF();

                    @Override // X.C1331050kk3, android.graphics.drawable.Drawable
                    public final int getIntrinsicHeight() {
                        int i5 = this.LLIZ;
                        return (i5 == 5 || i5 == 7 || this.LLILZLL % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
                    }

                    @Override // X.C1331050kk3, android.graphics.drawable.Drawable
                    public final int getIntrinsicWidth() {
                        int i5 = this.LLIZ;
                        return (i5 == 5 || i5 == 7 || this.LLILZLL % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
                    }

                    @Override // X.C1331050kk3, X.InterfaceC1331140kkC
                    public final void LJFF(Matrix matrix) {
                        LJIIL(matrix);
                        if (!this.LLILZIL.isIdentity()) {
                            matrix.preConcat(this.LLILZIL);
                        }
                    }

                    @Override // X.C1331050kk3, android.graphics.drawable.Drawable
                    public final void draw(Canvas canvas) {
                        int i5;
                        if (this.LLILZLL <= 0 && ((i5 = this.LLIZ) == 0 || i5 == 1)) {
                            super.draw(canvas);
                            return;
                        }
                        int iSave = canvas.save();
                        canvas.concat(this.LLILZIL);
                        super.draw(canvas);
                        canvas.restoreToCount(iSave);
                    }

                    @Override // X.C1331050kk3, android.graphics.drawable.Drawable
                    public final void onBoundsChange(Rect rect) {
                        int i5;
                        Drawable drawable = this.LL;
                        int i6 = this.LLILZLL;
                        if (i6 > 0 || ((i5 = this.LLIZ) != 0 && i5 != 1)) {
                            int i7 = this.LLIZ;
                            if (i7 != 2) {
                                if (i7 != 7) {
                                    if (i7 != 4) {
                                        if (i7 != 5) {
                                            this.LLILZIL.setRotate(i6, rect.centerX(), rect.centerY());
                                        } else {
                                            this.LLILZIL.setRotate(270.0f, rect.centerX(), rect.centerY());
                                            this.LLILZIL.postScale(1.0f, -1.0f);
                                        }
                                    } else {
                                        this.LLILZIL.setScale(1.0f, -1.0f);
                                    }
                                } else {
                                    this.LLILZIL.setRotate(270.0f, rect.centerX(), rect.centerY());
                                    this.LLILZIL.postScale(-1.0f, 1.0f);
                                }
                            } else {
                                this.LLILZIL.setScale(-1.0f, 1.0f);
                            }
                            this.LLIZLLLIL.reset();
                            this.LLILZIL.invert(this.LLIZLLLIL);
                            this.LLJ.set(rect);
                            this.LLIZLLLIL.mapRect(this.LLJ);
                            RectF rectF = this.LLJ;
                            drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            return;
                        }
                        drawable.setBounds(rect);
                    }

                    {
                        boolean z3;
                        if (i3 % 90 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        C1322350kW1.LIZIZ(z3);
                        C1322350kW1.LIZIZ(i4 >= 0 && i4 <= 8);
                        this.LLILZIL = new Matrix();
                        this.LLILZLL = i3;
                        this.LLIZ = i4;
                    }
                };
                C1336010ks3.LIZIZ();
                return c1331050kk3;
            }
            InterfaceC1320130kSR interfaceC1320130kSR = this.LIZIZ;
            if (interfaceC1320130kSR != null && interfaceC1320130kSR.LIZIZ(abstractC1327750kej)) {
                Drawable drawableLIZJ = this.LIZIZ.LIZJ(abstractC1327750kej);
                C1336010ks3.LIZIZ();
                return drawableLIZJ;
            }
            C1336010ks3.LIZIZ();
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
    }

    public C1320120kSQ(Resources resources, InterfaceC1320130kSR interfaceC1320130kSR) {
        this.LIZ = resources;
        this.LIZIZ = interfaceC1320130kSR;
    }

    @Override // X.InterfaceC1320130kSR
    public final Drawable LIZ(AbstractC1327750kej abstractC1327750kej, Drawable drawable) {
        try {
            C1336010ks3.LIZIZ();
            if (abstractC1327750kej instanceof C1325120kaU) {
                Drawable drawableLIZJ = LIZJ(abstractC1327750kej);
                C1336010ks3.LIZIZ();
                return drawableLIZJ;
            }
            InterfaceC1320130kSR interfaceC1320130kSR = this.LIZIZ;
            if (interfaceC1320130kSR != null && interfaceC1320130kSR.LIZIZ(abstractC1327750kej)) {
                Drawable drawableLIZ = this.LIZIZ.LIZ(abstractC1327750kej, drawable);
                C1336010ks3.LIZIZ();
                return drawableLIZ;
            }
            C1336010ks3.LIZIZ();
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
    }
}
