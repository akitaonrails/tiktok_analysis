package X;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: X.18kF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21370918kF {
    public final TextPaint LIZ;
    public final TextDirectionHeuristic LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final PrecomputedText.Params LJ;

    public final int hashCode() {
        return Build.VERSION.SDK_INT >= 24 ? Objects.hash(Float.valueOf(this.LIZ.getTextSize()), Float.valueOf(this.LIZ.getTextScaleX()), Float.valueOf(this.LIZ.getTextSkewX()), Float.valueOf(this.LIZ.getLetterSpacing()), Integer.valueOf(this.LIZ.getFlags()), this.LIZ.getTextLocales(), this.LIZ.getTypeface(), Boolean.valueOf(this.LIZ.isElegantTextHeight()), this.LIZIZ, Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL)) : Objects.hash(Float.valueOf(this.LIZ.getTextSize()), Float.valueOf(this.LIZ.getTextScaleX()), Float.valueOf(this.LIZ.getTextSkewX()), Float.valueOf(this.LIZ.getLetterSpacing()), Integer.valueOf(this.LIZ.getFlags()), this.LIZ.getTextLocale(), this.LIZ.getTypeface(), Boolean.valueOf(this.LIZ.isElegantTextHeight()), this.LIZIZ, Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("textSize=");
        sbLIZ.append(this.LIZ.getTextSize());
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(", textScaleX=");
        sbLIZ2.append(this.LIZ.getTextScaleX());
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(", textSkewX=");
        sbLIZ3.append(this.LIZ.getTextSkewX());
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(", letterSpacing=");
        sbLIZ4.append(this.LIZ.getLetterSpacing());
        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(", elegantTextHeight=");
        sbLIZ5.append(this.LIZ.isElegantTextHeight());
        sb.append(C2188811AlT.LIZIZ(sbLIZ5));
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(", textLocale=");
            sbLIZ6.append(this.LIZ.getTextLocales());
            sb.append(C2188811AlT.LIZIZ(sbLIZ6));
        } else {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(", textLocale=");
            sbLIZ7.append(this.LIZ.getTextLocale());
            sb.append(C2188811AlT.LIZIZ(sbLIZ7));
        }
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append(", typeface=");
        sbLIZ8.append(this.LIZ.getTypeface());
        sb.append(C2188811AlT.LIZIZ(sbLIZ8));
        if (i >= 26) {
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append(", variationSettings=");
            sbLIZ9.append(this.LIZ.getFontVariationSettings());
            sb.append(C2188811AlT.LIZIZ(sbLIZ9));
        }
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append(", textDir=");
        sbLIZ10.append(this.LIZIZ);
        sb.append(C2188811AlT.LIZIZ(sbLIZ10));
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append(", breakStrategy=");
        sbLIZ11.append(this.LIZJ);
        sb.append(C2188811AlT.LIZIZ(sbLIZ11));
        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
        sbLIZ12.append(", hyphenationFrequency=");
        sbLIZ12.append(this.LIZLLL);
        sb.append(C2188811AlT.LIZIZ(sbLIZ12));
        sb.append("}");
        return sb.toString();
    }

    public C21370918kF(PrecomputedText.Params params) {
        this.LIZ = params.getTextPaint();
        this.LIZIZ = params.getTextDirection();
        this.LIZJ = params.getBreakStrategy();
        this.LIZLLL = params.getHyphenationFrequency();
        this.LJ = Build.VERSION.SDK_INT < 29 ? null : params;
    }

    public final boolean LIZ(C21370918kF c21370918kF) {
        if (this.LIZJ != c21370918kF.LIZJ || this.LIZLLL != c21370918kF.LIZLLL || this.LIZ.getTextSize() != c21370918kF.LIZ.getTextSize() || this.LIZ.getTextScaleX() != c21370918kF.LIZ.getTextScaleX() || this.LIZ.getTextSkewX() != c21370918kF.LIZ.getTextSkewX() || this.LIZ.getLetterSpacing() != c21370918kF.LIZ.getLetterSpacing() || !TextUtils.equals(this.LIZ.getFontFeatureSettings(), c21370918kF.LIZ.getFontFeatureSettings()) || this.LIZ.getFlags() != c21370918kF.LIZ.getFlags()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (!this.LIZ.getTextLocales().equals(c21370918kF.LIZ.getTextLocales())) {
                return false;
            }
        } else if (!this.LIZ.getTextLocale().equals(c21370918kF.LIZ.getTextLocale())) {
            return false;
        }
        if (this.LIZ.getTypeface() == null) {
            if (c21370918kF.LIZ.getTypeface() != null) {
                return false;
            }
            return true;
        }
        if (!this.LIZ.getTypeface().equals(c21370918kF.LIZ.getTypeface())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C21370918kF)) {
            return false;
        }
        C21370918kF c21370918kF = (C21370918kF) obj;
        if (LIZ(c21370918kF) && this.LIZIZ == c21370918kF.LIZIZ) {
            return true;
        }
        return false;
    }

    public C21370918kF(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.LJ = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        } else {
            this.LJ = null;
        }
        this.LIZ = textPaint;
        this.LIZIZ = textDirectionHeuristic;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
