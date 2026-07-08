package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.18qO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21409018qO {
    public CharSequence LIZ;
    public final TextPaint LIZIZ;
    public final int LIZJ;
    public int LIZLLL;
    public boolean LJII;
    public Layout.Alignment LJ = Layout.Alignment.ALIGN_NORMAL;
    public int LJFF = Integer.MAX_VALUE;
    public boolean LJI = true;
    public TextUtils.TruncateAt LJIIIIZZ = null;

    public final StaticLayout LIZ() {
        if (this.LIZ == null) {
            this.LIZ = "";
        }
        int iMax = Math.max(0, this.LIZJ);
        CharSequence charSequenceEllipsize = this.LIZ;
        if (this.LJFF == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.LIZIZ, iMax, this.LJIIIIZZ);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.LIZLLL);
        this.LIZLLL = iMin;
        if (this.LJII) {
            this.LJ = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, this.LIZIZ, iMax);
        builderObtain.setAlignment(this.LJ);
        builderObtain.setIncludePad(this.LJI);
        builderObtain.setTextDirection(this.LJII ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.LJIIIIZZ;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.LJFF);
        return builderObtain.build();
    }

    public C21409018qO(int i, TextPaint textPaint, CharSequence charSequence) {
        this.LIZ = charSequence;
        this.LIZIZ = textPaint;
        this.LIZJ = i;
        this.LIZLLL = charSequence.length();
    }
}
