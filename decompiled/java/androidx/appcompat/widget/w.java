package androidx.appcompat.widget;

import X.AbstractC20142713rd;
import X.C14MG;
import X.C14MH;
import X.C21410818qg;
import X.C21411918qr;
import X.C21412518qx;
import X.C2188811AlT;
import Y.ARunnableS16S0201000_9;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.w;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes33.dex */
public class w {
    public final TextView LIZ;
    public C14MH LIZIZ;
    public C14MH LIZJ;
    public C14MH LIZLLL;
    public C14MH LJ;
    public C14MH LJFF;
    public C14MH LJI;
    public C14MH LJII;
    public final y LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ = -1;
    public Typeface LJIIJJI;
    public boolean LJIIL;

    public final void LIZIZ() {
        if (this.LIZIZ != null || this.LIZJ != null || this.LIZLLL != null || this.LJ != null) {
            Drawable[] compoundDrawables = this.LIZ.getCompoundDrawables();
            LIZ(compoundDrawables[0], this.LIZIZ);
            LIZ(compoundDrawables[1], this.LIZJ);
            LIZ(compoundDrawables[2], this.LIZLLL);
            LIZ(compoundDrawables[3], this.LJ);
        }
        if (this.LJFF == null && this.LJI == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.LIZ.getCompoundDrawablesRelative();
        LIZ(compoundDrawablesRelative[0], this.LJFF);
        LIZ(compoundDrawablesRelative[2], this.LJI);
    }

    public final ColorStateList LIZLLL() {
        C14MH c14mh = this.LJII;
        if (c14mh != null) {
            return c14mh.LIZ;
        }
        return null;
    }

    public final PorterDuff.Mode LJ() {
        C14MH c14mh = this.LJII;
        if (c14mh != null) {
            return c14mh.LIZIZ;
        }
        return null;
    }

    public w(TextView textView) {
        this.LIZ = textView;
        this.LJIIIIZZ = new y(textView);
    }

    public final void LJIIIZ(int i) {
        y yVar = this.LJIIIIZZ;
        if (yVar.LJIIIIZZ()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = yVar.LJIIIZ.getResources().getDisplayMetrics();
                    yVar.LJIIIZ(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (yVar.LJI()) {
                        yVar.LIZ();
                        return;
                    }
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown auto-size text type: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            yVar.LIZ = 0;
            yVar.LIZLLL = -1.0f;
            yVar.LJ = -1.0f;
            yVar.LIZJ = -1.0f;
            yVar.LJFF = new int[0];
            yVar.LIZIZ = false;
        }
    }

    public final void LJIIJ(ColorStateList colorStateList) {
        boolean z;
        if (this.LJII == null) {
            this.LJII = new C14MH();
        }
        C14MH c14mh = this.LJII;
        c14mh.LIZ = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        c14mh.LIZLLL = z;
        this.LIZIZ = c14mh;
        this.LIZJ = c14mh;
        this.LIZLLL = c14mh;
        this.LJ = c14mh;
        this.LJFF = c14mh;
        this.LJI = c14mh;
    }

    public final void LJIIJJI(PorterDuff.Mode mode) {
        boolean z;
        if (this.LJII == null) {
            this.LJII = new C14MH();
        }
        C14MH c14mh = this.LJII;
        c14mh.LIZIZ = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        c14mh.LIZJ = z;
        this.LIZIZ = c14mh;
        this.LIZJ = c14mh;
        this.LIZLLL = c14mh;
        this.LJ = c14mh;
        this.LJFF = c14mh;
        this.LJI = c14mh;
    }

    public final void LIZ(Drawable drawable, C14MH c14mh) {
        if (drawable != null && c14mh != null) {
            C14MG.LJ(drawable, c14mh, this.LIZ.getDrawableState());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:232:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.LJFF(android.util.AttributeSet, int):void");
    }

    public final void LJI(int i, Context context) {
        String strLJIIIZ;
        C21411918qr c21411918qr = new C21411918qr(context, context.obtainStyledAttributes(i, R$styleable.TextAppearance));
        if (c21411918qr.LJIIJJI(R$styleable.TextAppearance_textAllCaps)) {
            this.LIZ.setAllCaps(c21411918qr.LIZ(R$styleable.TextAppearance_textAllCaps, false));
        }
        if (c21411918qr.LJIIJJI(R$styleable.TextAppearance_android_textSize) && c21411918qr.LIZLLL(R$styleable.TextAppearance_android_textSize, -1) == 0) {
            this.LIZ.setTextSize(0, 0.0f);
        }
        LJIIL(context, c21411918qr);
        if (Build.VERSION.SDK_INT >= 26 && c21411918qr.LJIIJJI(R$styleable.TextAppearance_fontVariationSettings) && (strLJIIIZ = c21411918qr.LJIIIZ(R$styleable.TextAppearance_fontVariationSettings)) != null) {
            C21410818qg.LIZLLL(this.LIZ, strLJIIIZ);
        }
        c21411918qr.LJIILJJIL();
        Typeface typeface = this.LJIIJJI;
        if (typeface != null) {
            this.LIZ.setTypeface(typeface, this.LJIIIZ);
        }
    }

    public final void LJIIIIZZ(int[] iArr, int i) {
        y yVar = this.LJIIIIZZ;
        if (yVar.LJIIIIZZ()) {
            int length = iArr.length;
            int i2 = 0;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = yVar.LJIIIZ.getResources().getDisplayMetrics();
                    do {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                        i2++;
                    } while (i2 < length);
                }
                yVar.LJFF = y.LIZIZ(iArrCopyOf);
                if (!yVar.LJII()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                yVar.LJI = false;
            }
            if (yVar.LJI()) {
                yVar.LIZ();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.18qn] */
    public final void LJIIL(Context context, C21411918qr c21411918qr) {
        int i;
        String strLJIIIZ;
        boolean z;
        boolean z2;
        this.LJIIIZ = c21411918qr.LJII(R$styleable.TextAppearance_android_textStyle, this.LJIIIZ);
        int i2 = Build.VERSION.SDK_INT;
        boolean z3 = false;
        if (i2 >= 28) {
            int iLJII = c21411918qr.LJII(R$styleable.TextAppearance_android_textFontWeight, -1);
            this.LJIIJ = iLJII;
            if (iLJII != -1) {
                this.LJIIIZ &= 2;
            }
        }
        if (!c21411918qr.LJIIJJI(R$styleable.TextAppearance_android_fontFamily) && !c21411918qr.LJIIJJI(R$styleable.TextAppearance_fontFamily)) {
            if (c21411918qr.LJIIJJI(R$styleable.TextAppearance_android_typeface)) {
                this.LJIIL = false;
                int iLJII2 = c21411918qr.LJII(R$styleable.TextAppearance_android_typeface, 1);
                if (iLJII2 != 1) {
                    if (iLJII2 != 2) {
                        if (iLJII2 == 3) {
                            this.LJIIJJI = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.LJIIJJI = Typeface.SERIF;
                    return;
                }
                this.LJIIJJI = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.LJIIJJI = null;
        if (c21411918qr.LJIIJJI(R$styleable.TextAppearance_fontFamily)) {
            i = R$styleable.TextAppearance_fontFamily;
        } else {
            i = R$styleable.TextAppearance_android_fontFamily;
        }
        final int i3 = this.LJIIJ;
        final int i4 = this.LJIIIZ;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.LIZ);
            try {
                Typeface typefaceLJI = c21411918qr.LJI(i, this.LJIIIZ, new AbstractC20142713rd() { // from class: X.18qn
                    @Override // X.AbstractC20142713rd
                    public final void LIZJ(int i5) {
                    }

                    @Override // X.AbstractC20142713rd
                    public final void LIZLLL(Typeface typeface) {
                        int i5;
                        boolean z4;
                        if (Build.VERSION.SDK_INT >= 28 && (i5 = i3) != -1) {
                            if ((i4 & 2) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            typeface = C21412518qx.LIZ(typeface, i5, z4);
                        }
                        w wVar = this.LIZLLL;
                        WeakReference weakReference2 = weakReference;
                        if (wVar.LJIIL) {
                            wVar.LJIIJJI = typeface;
                            TextView textView = (TextView) weakReference2.get();
                            if (textView != null) {
                                if (textView.isAttachedToWindow()) {
                                    textView.post(new ARunnableS16S0201000_9(wVar.LJIIIZ, typeface, textView, 0));
                                } else {
                                    textView.setTypeface(typeface, wVar.LJIIIZ);
                                }
                            }
                        }
                    }
                });
                if (typefaceLJI != null) {
                    if (i2 >= 28 && this.LJIIJ != -1) {
                        Typeface typefaceCreate = Typeface.create(typefaceLJI, 0);
                        int i5 = this.LJIIJ;
                        if ((this.LJIIIZ & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.LJIIJJI = C21412518qx.LIZ(typefaceCreate, i5, z2);
                    } else {
                        this.LJIIJJI = typefaceLJI;
                    }
                }
                if (this.LJIIJJI == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJIIL = z;
            } catch (Resources.NotFoundException | UnsupportedOperationException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (this.LJIIJJI == null && (strLJIIIZ = c21411918qr.LJIIIZ(i)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.LJIIJ != -1) {
                Typeface typefaceCreate2 = Typeface.create(strLJIIIZ, 0);
                int i6 = this.LJIIJ;
                if ((this.LJIIIZ & 2) != 0) {
                    z3 = true;
                }
                this.LJIIJJI = C21412518qx.LIZ(typefaceCreate2, i6, z3);
                return;
            }
            this.LJIIJJI = Typeface.create(strLJIIIZ, this.LJIIIZ);
        }
    }

    public static C14MH LIZJ(Context context, C14MG c14mg, int i) {
        ColorStateList colorStateListLJIIIIZZ;
        synchronized (c14mg) {
            colorStateListLJIIIIZZ = c14mg.LIZ.LJIIIIZZ(i, context);
        }
        if (colorStateListLJIIIIZZ != null) {
            C14MH c14mh = new C14MH();
            c14mh.LIZLLL = true;
            c14mh.LIZ = colorStateListLJIIIIZZ;
            return c14mh;
        }
        return null;
    }

    public final void LJII(int i, int i2, int i3, int i4) {
        y yVar = this.LJIIIIZZ;
        if (yVar.LJIIIIZZ()) {
            DisplayMetrics displayMetrics = yVar.LJIIIZ.getResources().getDisplayMetrics();
            yVar.LJIIIZ(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (yVar.LJI()) {
                yVar.LIZ();
            }
        }
    }
}
