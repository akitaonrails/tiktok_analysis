package X;

import a3.e0;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0uDZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695310uDZ {
    public final TextPaint LIZ;
    public final TextUtils.TruncateAt LIZIZ;
    public final boolean LIZJ;
    public final boolean LJ;
    public C1695180uDM LJFF;
    public final Layout LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final float LJIIJ;
    public final float LJIIJJI;
    public final boolean LJIIL;
    public final Paint.FontMetricsInt LJIILIIL;
    public final int LJIILJJIL;
    public final C1695350uDd[] LJIILL;
    public C1695340uDc LJIIZILJ;
    public final boolean LIZLLL = true;
    public final Rect LJIILLIIL = new Rect();

    public final int LIZ() {
        return (this.LJ ? this.LJI.getLineBottom(this.LJII - 1) : this.LJI.getHeight()) + this.LJIIIIZZ + this.LJIIIZ + this.LJIILJJIL;
    }

    public final C1695340uDc LIZIZ() {
        C1695340uDc c1695340uDc = this.LJIIZILJ;
        if (c1695340uDc != null) {
            return c1695340uDc;
        }
        C1695340uDc c1695340uDc2 = new C1695340uDc(this.LJI);
        this.LJIIZILJ = c1695340uDc2;
        return c1695340uDc2;
    }

    public final CharSequence LJIIIZ() {
        return this.LJI.getText();
    }

    public final C1695180uDM LJIIJ() {
        C1695180uDM c1695180uDM = this.LJFF;
        if (c1695180uDM != null) {
            return c1695180uDM;
        }
        C1695180uDM c1695180uDM2 = new C1695180uDM(this.LJI.getText(), this.LJI.getText().length(), this.LIZ.getTextLocale());
        this.LJFF = c1695180uDM2;
        return c1695180uDM2;
    }

    public final float LIZJ(int i) {
        float lineBaseline;
        float f = this.LJIIIIZZ;
        if (i == this.LJII - 1 && this.LJIILIIL != null) {
            lineBaseline = LJI(i) - this.LJIILIIL.ascent;
        } else {
            lineBaseline = this.LJI.getLineBaseline(i);
        }
        return f + lineBaseline;
    }

    public final float LIZLLL(int i) {
        int i2;
        if (i == this.LJII - 1 && this.LJIILIIL != null) {
            return this.LJI.getLineBottom(i - 1) + this.LJIILIIL.bottom;
        }
        float lineBottom = this.LJIIIIZZ + this.LJI.getLineBottom(i);
        if (i == this.LJII - 1) {
            i2 = this.LJIIIZ;
        } else {
            i2 = 0;
        }
        return lineBottom + i2;
    }

    public final int LJ(int i) {
        Layout layout = this.LJI;
        C1319890kS3 c1319890kS3 = e0.LIZ;
        if (layout.getEllipsisCount(i) > 0 && this.LIZIZ == TextUtils.TruncateAt.END) {
            return this.LJI.getText().length();
        }
        return this.LJI.getLineEnd(i);
    }

    public final int LJFF(int i) {
        return this.LJI.getLineForOffset(i);
    }

    public final float LJI(int i) {
        int i2;
        float lineTop = this.LJI.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.LJIIIIZZ;
        }
        return lineTop + i2;
    }

    public final float LJII(int i, boolean z) {
        float f;
        float fLIZJ = LIZIZ().LIZJ(i, true, z);
        if (LJFF(i) == this.LJII - 1) {
            f = this.LJIIJ + this.LJIIJJI;
        } else {
            f = 0.0f;
        }
        return fLIZJ + f;
    }

    public final float LJIIIIZZ(int i, boolean z) {
        float f;
        float fLIZJ = LIZIZ().LIZJ(i, false, z);
        if (LJFF(i) == this.LJII - 1) {
            f = this.LJIIJ + this.LJIIJJI;
        } else {
            f = 0.0f;
        }
        return fLIZJ + f;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1695310uDZ(java.lang.CharSequence r45, float r46, X.C1695130uDH r47, int r48, android.text.TextUtils.TruncateAt r49, int r50, boolean r51, int r52, int r53, int r54, int r55, int r56, int r57, X.C1695320uDa r58) {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1695310uDZ.<init>(java.lang.CharSequence, float, X.0uDH, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, X.0uDa):void");
    }
}
