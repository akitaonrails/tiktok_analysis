package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.19LH, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19LH extends C16GD {
    public static final PorterDuff.Mode LLJI = PorterDuff.Mode.SRC_IN;
    public C21541219Ry LLILLJJLI;
    public PorterDuffColorFilter LLILLL;
    public ColorFilter LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final float[] LLIZ;
    public final Matrix LLIZLLLIL;
    public final Rect LLJ;

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.LL;
        if (drawable == null) {
            return false;
        }
        C16GF.LIZIZ(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.LL;
        return drawable != null ? drawable.getAlpha() : this.LLILLJJLI.LIZIZ.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.LL;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.LLILLJJLI.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.LL;
        return drawable != null ? C16GF.LIZJ(drawable) : this.LLILZ;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.LL != null && Build.VERSION.SDK_INT >= 24) {
            final Drawable.ConstantState constantState = this.LL.getConstantState();
            return new Drawable.ConstantState(constantState) { // from class: X.19SY
                public final Drawable.ConstantState LIZ;

                @Override // android.graphics.drawable.Drawable.ConstantState
                public final boolean canApplyTheme() {
                    return this.LIZ.canApplyTheme();
                }

                @Override // android.graphics.drawable.Drawable.ConstantState
                public int getChangingConfigurations() {
                    return this.LIZ.getChangingConfigurations();
                }

                @Override // android.graphics.drawable.Drawable.ConstantState
                public final Drawable newDrawable() {
                    C19LH c19lh = new C19LH();
                    c19lh.LL = this.LIZ.newDrawable();
                    return c19lh;
                }

                {
                    this.LIZ = constantState;
                }

                @Override // android.graphics.drawable.Drawable.ConstantState
                public final Drawable newDrawable(Resources resources) {
                    C19LH c19lh = new C19LH();
                    c19lh.LL = this.LIZ.newDrawable(resources);
                    return c19lh;
                }

                @Override // android.graphics.drawable.Drawable.ConstantState
                public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
                    C19LH c19lh = new C19LH();
                    c19lh.LL = this.LIZ.newDrawable(resources, theme);
                    return c19lh;
                }
            };
        }
        this.LLILLJJLI.LIZ = getChangingConfigurations();
        return this.LLILLJJLI;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.LL;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.LLILLJJLI.LIZIZ.LJIIIIZZ;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.LL;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.LLILLJJLI.LIZIZ.LJII;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.LL;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.LL;
        return drawable != null ? drawable.isAutoMirrored() : this.LLILLJJLI.LJ;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.LL;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C21541219Ry c21541219Ry = this.LLILLJJLI;
        if (c21541219Ry == null) {
            return false;
        }
        C19LG c19lg = c21541219Ry.LIZIZ;
        if (c19lg.LJIILIIL == null) {
            c19lg.LJIILIIL = Boolean.valueOf(c19lg.LJI.LIZ());
        }
        if (c19lg.LJIILIIL.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.LLILLJJLI.LIZJ;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.LLILZIL && super.mutate() == this) {
            this.LLILLJJLI = new C21541219Ry(this.LLILLJJLI);
            this.LLILZIL = true;
        }
        return this;
    }

    public C19LH() {
        this.LLILZLL = true;
        this.LLIZ = new float[9];
        this.LLIZLLLIL = new Matrix();
        this.LLJ = new Rect();
        this.LLILLJJLI = new C21541219Ry();
    }

    public C19LH(C21541219Ry c21541219Ry) {
        this.LLILZLL = true;
        this.LLIZ = new float[9];
        this.LLIZLLLIL = new Matrix();
        this.LLJ = new Rect();
        this.LLILLJJLI = c21541219Ry;
        this.LLILLL = LIZIZ(c21541219Ry.LIZJ, c21541219Ry.LIZLLL);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.LLJ);
        if (this.LLJ.width() > 0 && this.LLJ.height() > 0) {
            ColorFilter colorFilter = this.LLILZ;
            if (colorFilter == null) {
                colorFilter = this.LLILLL;
            }
            canvas.getMatrix(this.LLIZLLLIL);
            this.LLIZLLLIL.getValues(this.LLIZ);
            boolean z = false;
            float fAbs = Math.abs(this.LLIZ[0]);
            float fAbs2 = Math.abs(this.LLIZ[4]);
            float fAbs3 = Math.abs(this.LLIZ[1]);
            float fAbs4 = Math.abs(this.LLIZ[3]);
            if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
                fAbs = 1.0f;
                fAbs2 = 1.0f;
            }
            int iMin = Math.min(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE, (int) (this.LLJ.width() * fAbs));
            int iMin2 = Math.min(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE, (int) (this.LLJ.height() * fAbs2));
            if (iMin > 0 && iMin2 > 0) {
                int iSave = canvas.save();
                Rect rect = this.LLJ;
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && C16G6.LIZ(this) == 1) {
                    canvas.translate(this.LLJ.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.LLJ.offsetTo(0, 0);
                C21541219Ry c21541219Ry = this.LLILLJJLI;
                Bitmap bitmap = c21541219Ry.LJFF;
                if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c21541219Ry.LJFF.getHeight()) {
                    c21541219Ry.LJFF = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                    c21541219Ry.LJIIJ = true;
                }
                if (!this.LLILZLL) {
                    C21541219Ry c21541219Ry2 = this.LLILLJJLI;
                    c21541219Ry2.LJFF.eraseColor(0);
                    Canvas canvas2 = new Canvas(c21541219Ry2.LJFF);
                    C19LG c19lg = c21541219Ry2.LIZIZ;
                    c19lg.LIZ(c19lg.LJI, C19LG.LJIILL, canvas2, iMin, iMin2);
                } else {
                    C21541219Ry c21541219Ry3 = this.LLILLJJLI;
                    if (c21541219Ry3.LJIIJ || c21541219Ry3.LJI != c21541219Ry3.LIZJ || c21541219Ry3.LJII != c21541219Ry3.LIZLLL || c21541219Ry3.LJIIIZ != c21541219Ry3.LJ || c21541219Ry3.LJIIIIZZ != c21541219Ry3.LIZIZ.getRootAlpha()) {
                        C21541219Ry c21541219Ry4 = this.LLILLJJLI;
                        c21541219Ry4.LJFF.eraseColor(0);
                        Canvas canvas3 = new Canvas(c21541219Ry4.LJFF);
                        C19LG c19lg2 = c21541219Ry4.LIZIZ;
                        c19lg2.LIZ(c19lg2.LJI, C19LG.LJIILL, canvas3, iMin, iMin2);
                        C21541219Ry c21541219Ry5 = this.LLILLJJLI;
                        c21541219Ry5.LJI = c21541219Ry5.LIZJ;
                        c21541219Ry5.LJII = c21541219Ry5.LIZLLL;
                        c21541219Ry5.LJIIIIZZ = c21541219Ry5.LIZIZ.getRootAlpha();
                        c21541219Ry5.LJIIIZ = c21541219Ry5.LJ;
                        c21541219Ry5.LJIIJ = false;
                    }
                }
                C21541219Ry c21541219Ry6 = this.LLILLJJLI;
                Rect rect2 = this.LLJ;
                if (c21541219Ry6.LIZIZ.getRootAlpha() < 255) {
                    z = true;
                }
                if (!z && colorFilter == null) {
                    paint = null;
                } else {
                    if (c21541219Ry6.LJIIJJI == null) {
                        Paint paint2 = new Paint();
                        c21541219Ry6.LJIIJJI = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    c21541219Ry6.LJIIJJI.setAlpha(c21541219Ry6.LIZIZ.getRootAlpha());
                    c21541219Ry6.LJIIJJI.setColorFilter(colorFilter);
                    paint = c21541219Ry6.LJIIJJI;
                }
                canvas.drawBitmap(c21541219Ry6.LJFF, (Rect) null, rect2, paint);
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.LL;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C21541219Ry c21541219Ry = this.LLILLJJLI;
        ColorStateList colorStateList = c21541219Ry.LIZJ;
        if (colorStateList != null && (mode = c21541219Ry.LIZLLL) != null) {
            this.LLILLL = LIZIZ(colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        C19LG c19lg = c21541219Ry.LIZIZ;
        if (c19lg.LJIILIIL == null) {
            c19lg.LJIILIIL = Boolean.valueOf(c19lg.LJI.LIZ());
        }
        if (c19lg.LJIILIIL.booleanValue()) {
            boolean zLIZIZ = c21541219Ry.LIZIZ.LJI.LIZIZ(iArr);
            c21541219Ry.LJIIJ |= zLIZIZ;
            if (zLIZIZ) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.LLILLJJLI.LIZIZ.getRootAlpha() != i) {
            this.LLILLJJLI.LIZIZ.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.LLILLJJLI.LJ = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.LLILZ = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            C16GF.LJI(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            C16GF.LJII(drawable, colorStateList);
            return;
        }
        C21541219Ry c21541219Ry = this.LLILLJJLI;
        if (c21541219Ry.LIZJ != colorStateList) {
            c21541219Ry.LIZJ = colorStateList;
            this.LLILLL = LIZIZ(colorStateList, c21541219Ry.LIZLLL);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            C16GF.LJIIIIZZ(drawable, mode);
            return;
        }
        C21541219Ry c21541219Ry = this.LLILLJJLI;
        if (c21541219Ry.LIZLLL != mode) {
            c21541219Ry.LIZLLL = mode;
            this.LLILLL = LIZIZ(c21541219Ry.LIZJ, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public final PorterDuffColorFilter LIZIZ(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public static C19LH LIZ(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C19LH c19lh = new C19LH();
            c19lh.LL = C420660GeW.LIZ(resources, i, theme);
            return c19lh;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    C19LH c19lh2 = new C19LH();
                    c19lh2.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                    return c19lh2;
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (XmlPullParserException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            C16GF.LIZLLL(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C21541219Ry c21541219Ry = this.LLILLJJLI;
        c21541219Ry.LIZIZ = new C19LG();
        TypedArray typedArrayLJI = C19KG.LJI(resources, theme, attributeSet, C21518719Jh.LIZ);
        C21541219Ry c21541219Ry2 = this.LLILLJJLI;
        C19LG c19lg = c21541219Ry2.LIZIZ;
        int iLIZLLL = C19KG.LIZLLL(typedArrayLJI, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (iLIZLLL != 3) {
            if (iLIZLLL != 5) {
                if (iLIZLLL != 9) {
                    switch (iLIZLLL) {
                        case 14:
                            mode = PorterDuff.Mode.MULTIPLY;
                            break;
                        case 15:
                            mode = PorterDuff.Mode.SCREEN;
                            break;
                        case 16:
                            mode = PorterDuff.Mode.ADD;
                            break;
                    }
                } else {
                    mode = PorterDuff.Mode.SRC_ATOP;
                }
            }
        } else {
            mode = PorterDuff.Mode.SRC_OVER;
        }
        c21541219Ry2.LIZLLL = mode;
        ColorStateList colorStateListLIZ = C19KG.LIZ(typedArrayLJI, xmlPullParser, theme);
        if (colorStateListLIZ != null) {
            c21541219Ry2.LIZJ = colorStateListLIZ;
        }
        boolean z = c21541219Ry2.LJ;
        if (C19KG.LJFF(xmlPullParser, "autoMirrored")) {
            z = typedArrayLJI.getBoolean(5, z);
        }
        c21541219Ry2.LJ = z;
        c19lg.LJIIIZ = C19KG.LIZJ(typedArrayLJI, xmlPullParser, "viewportWidth", 7, c19lg.LJIIIZ);
        float fLIZJ = C19KG.LIZJ(typedArrayLJI, xmlPullParser, "viewportHeight", 8, c19lg.LJIIJ);
        c19lg.LJIIJ = fLIZJ;
        if (c19lg.LJIIIZ > 0.0f) {
            if (fLIZJ > 0.0f) {
                c19lg.LJII = typedArrayLJI.getDimension(3, c19lg.LJII);
                int i = 2;
                float dimension = typedArrayLJI.getDimension(2, c19lg.LJIIIIZZ);
                c19lg.LJIIIIZZ = dimension;
                if (c19lg.LJII > 0.0f) {
                    if (dimension > 0.0f) {
                        c19lg.setAlpha(C19KG.LIZJ(typedArrayLJI, xmlPullParser, "alpha", 4, c19lg.getAlpha()));
                        String strXd = C786410Ut5.Xd(typedArrayLJI, 0);
                        if (strXd != null) {
                            c19lg.LJIIL = strXd;
                            c19lg.LJIILJJIL.put(strXd, c19lg);
                        }
                        typedArrayLJI.recycle();
                        c21541219Ry.LIZ = getChangingConfigurations();
                        int i2 = 1;
                        c21541219Ry.LJIIJ = true;
                        C21541219Ry c21541219Ry3 = this.LLILLJJLI;
                        C19LG c19lg2 = c21541219Ry3.LIZIZ;
                        ArrayDeque arrayDeque = new ArrayDeque();
                        arrayDeque.push(c19lg2.LJI);
                        int eventType = xmlPullParser.getEventType();
                        int depth = xmlPullParser.getDepth() + 1;
                        boolean z2 = true;
                        for (int i3 = 3; eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != i3); i3 = 3) {
                            if (eventType == i) {
                                String name = xmlPullParser.getName();
                                C19LF c19lf = (C19LF) arrayDeque.peek();
                                if (c19lf != null) {
                                    if ("path".equals(name)) {
                                        C21530219Ns c21530219Ns = new C21530219Ns();
                                        TypedArray typedArrayLJI2 = C19KG.LJI(resources, theme, attributeSet, C21518719Jh.LIZJ);
                                        if (C19KG.LJFF(xmlPullParser, "pathData")) {
                                            String strXd2 = C786410Ut5.Xd(typedArrayLJI2, 0);
                                            if (strXd2 != null) {
                                                c21530219Ns.LIZIZ = strXd2;
                                            }
                                            String strXd3 = C786410Ut5.Xd(typedArrayLJI2, 2);
                                            if (strXd3 != null) {
                                                c21530219Ns.LIZ = C21518819Ji.LIZJ(strXd3);
                                            }
                                            c21530219Ns.LJI = C19KG.LIZIZ(typedArrayLJI2, xmlPullParser, theme, "fillColor", 1);
                                            c21530219Ns.LJIIIIZZ = C19KG.LIZJ(typedArrayLJI2, xmlPullParser, "fillAlpha", 12, c21530219Ns.LJIIIIZZ);
                                            int iLIZLLL2 = C19KG.LIZLLL(typedArrayLJI2, xmlPullParser, "strokeLineCap", 8, -1);
                                            Paint.Cap cap = c21530219Ns.LJIIL;
                                            if (iLIZLLL2 != 0) {
                                                if (iLIZLLL2 != 1) {
                                                    if (iLIZLLL2 == 2) {
                                                        cap = Paint.Cap.SQUARE;
                                                    }
                                                } else {
                                                    cap = Paint.Cap.ROUND;
                                                }
                                            } else {
                                                cap = Paint.Cap.BUTT;
                                            }
                                            c21530219Ns.LJIIL = cap;
                                            int iLIZLLL3 = C19KG.LIZLLL(typedArrayLJI2, xmlPullParser, "strokeLineJoin", 9, -1);
                                            Paint.Join join = c21530219Ns.LJIILIIL;
                                            if (iLIZLLL3 != 0) {
                                                if (iLIZLLL3 != 1) {
                                                    if (iLIZLLL3 == 2) {
                                                        join = Paint.Join.BEVEL;
                                                    }
                                                } else {
                                                    join = Paint.Join.ROUND;
                                                }
                                            } else {
                                                join = Paint.Join.MITER;
                                            }
                                            c21530219Ns.LJIILIIL = join;
                                            c21530219Ns.LJIILJJIL = C19KG.LIZJ(typedArrayLJI2, xmlPullParser, "strokeMiterLimit", 10, c21530219Ns.LJIILJJIL);
                                            c21530219Ns.LJ = C19KG.LIZIZ(typedArrayLJI2, xmlPullParser, theme, "strokeColor", 3);
                                            c21530219Ns.LJII = C19KG.LIZJ(typedArrayLJI2, xmlPullParser, "strokeAlpha", 11, c21530219Ns.LJII);
                                            c21530219Ns.LJFF = C19KG.LIZJ(typedArrayLJI2, xmlPullParser, "strokeWidth", 4, c21530219Ns.LJFF);
                                            c21530219Ns.LJIIJ = C19KG.LIZJ(typedArrayLJI2, xmlPullParser, "trimPathEnd", 6, c21530219Ns.LJIIJ);
                                            c21530219Ns.LJIIJJI = C19KG.LIZJ(typedArrayLJI2, xmlPullParser, "trimPathOffset", 7, c21530219Ns.LJIIJJI);
                                            c21530219Ns.LJIIIZ = C19KG.LIZJ(typedArrayLJI2, xmlPullParser, "trimPathStart", 5, c21530219Ns.LJIIIZ);
                                            c21530219Ns.LIZJ = C19KG.LIZLLL(typedArrayLJI2, xmlPullParser, "fillType", 13, c21530219Ns.LIZJ);
                                        }
                                        typedArrayLJI2.recycle();
                                        c19lf.LIZIZ.add(c21530219Ns);
                                        if (c21530219Ns.getPathName() != null) {
                                            c19lg2.LJIILJJIL.put(c21530219Ns.getPathName(), c21530219Ns);
                                        }
                                        c21541219Ry3.LIZ = c21530219Ns.LIZLLL | c21541219Ry3.LIZ;
                                        z2 = false;
                                    } else if ("clip-path".equals(name)) {
                                        C21519219Jm c21519219Jm = new C21519219Jm();
                                        if (C19KG.LJFF(xmlPullParser, "pathData")) {
                                            TypedArray typedArrayLJI3 = C19KG.LJI(resources, theme, attributeSet, C21518719Jh.LIZLLL);
                                            String strXd4 = C786410Ut5.Xd(typedArrayLJI3, 0);
                                            if (strXd4 != null) {
                                                c21519219Jm.LIZIZ = strXd4;
                                            }
                                            String strXd5 = C786410Ut5.Xd(typedArrayLJI3, 1);
                                            if (strXd5 != null) {
                                                c21519219Jm.LIZ = C21518819Ji.LIZJ(strXd5);
                                            }
                                            c21519219Jm.LIZJ = C19KG.LIZLLL(typedArrayLJI3, xmlPullParser, "fillType", 2, 0);
                                            typedArrayLJI3.recycle();
                                        }
                                        c19lf.LIZIZ.add(c21519219Jm);
                                        if (c21519219Jm.getPathName() != null) {
                                            c19lg2.LJIILJJIL.put(c21519219Jm.getPathName(), c21519219Jm);
                                        }
                                        c21541219Ry3.LIZ |= c21519219Jm.LIZLLL;
                                    } else if ("group".equals(name)) {
                                        C19LF c19lf2 = new C19LF();
                                        TypedArray typedArrayLJI4 = C19KG.LJI(resources, theme, attributeSet, C21518719Jh.LIZIZ);
                                        c19lf2.LIZJ = C19KG.LIZJ(typedArrayLJI4, xmlPullParser, "rotation", 5, c19lf2.LIZJ);
                                        c19lf2.LIZLLL = typedArrayLJI4.getFloat(1, c19lf2.LIZLLL);
                                        c19lf2.LJ = typedArrayLJI4.getFloat(2, c19lf2.LJ);
                                        c19lf2.LJFF = C19KG.LIZJ(typedArrayLJI4, xmlPullParser, "scaleX", 3, c19lf2.LJFF);
                                        c19lf2.LJI = C19KG.LIZJ(typedArrayLJI4, xmlPullParser, "scaleY", 4, c19lf2.LJI);
                                        c19lf2.LJII = C19KG.LIZJ(typedArrayLJI4, xmlPullParser, "translateX", 6, c19lf2.LJII);
                                        c19lf2.LJIIIIZZ = C19KG.LIZJ(typedArrayLJI4, xmlPullParser, "translateY", 7, c19lf2.LJIIIIZZ);
                                        String strXd6 = C786410Ut5.Xd(typedArrayLJI4, 0);
                                        if (strXd6 != null) {
                                            c19lf2.LJIIJJI = strXd6;
                                        }
                                        c19lf2.LIZJ();
                                        typedArrayLJI4.recycle();
                                        c19lf.LIZIZ.add(c19lf2);
                                        arrayDeque.push(c19lf2);
                                        if (c19lf2.getGroupName() != null) {
                                            c19lg2.LJIILJJIL.put(c19lf2.getGroupName(), c19lf2);
                                        }
                                        c21541219Ry3.LIZ = c19lf2.LJIIJ | c21541219Ry3.LIZ;
                                    }
                                }
                            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                arrayDeque.pop();
                            }
                            eventType = xmlPullParser.next();
                            i2 = 1;
                            i = 2;
                        }
                        if (!z2) {
                            this.LLILLL = LIZIZ(c21541219Ry.LIZJ, c21541219Ry.LIZLLL);
                            return;
                        }
                        throw new XmlPullParserException("no path defined");
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(typedArrayLJI.getPositionDescription());
                    sbLIZ.append("<vector> tag requires height > 0");
                    throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ));
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(typedArrayLJI.getPositionDescription());
                sbLIZ2.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(typedArrayLJI.getPositionDescription());
            sbLIZ3.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ3));
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(typedArrayLJI.getPositionDescription());
        sbLIZ4.append("<vector> tag requires viewportWidth > 0");
        throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ4));
    }
}
