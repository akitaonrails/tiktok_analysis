package X;

import a3.d;
import a3.e0;
import android.os.Build;
import android.text.BoringLayout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: X.0uDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695320uDa {
    public final CharSequence LIZ;
    public final TextPaint LIZIZ;
    public final int LIZJ;
    public float LIZLLL = Float.NaN;
    public float LJ = Float.NaN;
    public BoringLayout.Metrics LJFF;
    public boolean LJI;
    public CharSequence LJII;

    public final BoringLayout.Metrics LIZ() {
        if (!this.LJI) {
            TextDirectionHeuristic textDirectionHeuristicLIZ = e0.LIZ(this.LIZJ);
            d dVar = d.LIZ;
            CharSequence charSequence = this.LIZ;
            TextPaint textPaint = this.LIZIZ;
            dVar.getClass();
            BoringLayout.Metrics metricsIsBoring = null;
            if (Build.VERSION.SDK_INT >= 33) {
                metricsIsBoring = BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicLIZ, true, null);
            } else if (!textDirectionHeuristicLIZ.isRtl(charSequence, 0, charSequence.length())) {
                metricsIsBoring = BoringLayout.isBoring(charSequence, textPaint, null);
            }
            this.LJFF = metricsIsBoring;
            this.LJI = true;
        }
        return this.LJFF;
    }

    public final CharSequence LIZIZ() {
        CharSequence charSequence = this.LJII;
        if (charSequence == null) {
            charSequence = this.LIZ;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (C1695570uDz.LIZ(spanned, CharacterStyle.class)) {
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class);
                    if (characterStyleArr != null && characterStyleArr.length != 0) {
                        SpannableString spannableString = null;
                        for (CharacterStyle characterStyle : characterStyleArr) {
                            if (!(characterStyle instanceof MetricAffectingSpan)) {
                                if (spannableString == null) {
                                    spannableString = new SpannableString(charSequence);
                                }
                                spannableString.removeSpan(characterStyle);
                            }
                        }
                        if (spannableString != null) {
                            charSequence = spannableString;
                        }
                    }
                }
            }
            this.LJII = charSequence;
        }
        return charSequence;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float LIZJ() {
        /*
            r6 = this;
            float r0 = r6.LIZLLL
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r4 = r6.LIZLLL
            return r4
        Lb:
            android.text.BoringLayout$Metrics r0 = r6.LIZ()
            if (r0 == 0) goto L5f
            int r0 = r0.width
        L13:
            float r4 = (float) r0
            r5 = 0
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r3 = 0
            if (r0 >= 0) goto L32
            java.lang.CharSequence r0 = r6.LIZIZ()
            int r2 = r0.length()
            java.lang.CharSequence r1 = r6.LIZIZ()
            android.text.TextPaint r0 = r6.LIZIZ
            float r0 = android.text.Layout.getDesiredWidth(r1, r3, r2, r0)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r4 = (float) r0
        L32:
            java.lang.CharSequence r2 = r6.LIZ
            android.text.TextPaint r1 = r6.LIZIZ
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 == 0) goto L58
            boolean r0 = r2 instanceof android.text.Spanned
            if (r0 == 0) goto L50
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<X.0uDo> r0 = X.C1695460uDo.class
            boolean r0 = X.C1695570uDz.LIZ(r2, r0)
            if (r0 != 0) goto L5b
            java.lang.Class<X.0uDs> r0 = X.C1695500uDs.class
            boolean r0 = X.C1695570uDz.LIZ(r2, r0)
            if (r0 != 0) goto L5b
        L50:
            float r0 = r1.getLetterSpacing()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L5b
        L58:
            r6.LIZLLL = r4
            return r4
        L5b:
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r0
            goto L58
        L5f:
            r0 = -1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1695320uDa.LIZJ():float");
    }

    public C1695320uDa(int i, C1695130uDH c1695130uDH, CharSequence charSequence) {
        this.LIZ = charSequence;
        this.LIZIZ = c1695130uDH;
        this.LIZJ = i;
    }
}
