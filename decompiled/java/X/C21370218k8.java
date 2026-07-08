package X;

import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18k8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21370218k8 {
    public static boolean LJIILL;
    public CharSequence LIZ;
    public float LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public float LJ;
    public float LJFF;
    public boolean LJI;
    public int LJII;
    public int LJIIIIZZ;
    public TextDirectionHeuristic LJIIIZ;
    public final Paint LJIIJ = new Paint();
    public final Paint LJIIJJI = new Paint();
    public int LJIIL;
    public Layout.Alignment LJIILIIL;
    public int LJIILJJIL;

    public final boolean LIZIZ(float f, int i, int i2, TextView textView) {
        CharSequence transformation;
        if (!LJIILL) {
            return false;
        }
        CharSequence text = textView.getText();
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
            text = transformation;
        }
        if (!Intrinsics.LJFF(this.LIZ, text) || f != this.LIZIZ || this.LIZLLL != i || this.LIZJ != i2 || this.LJ != textView.getLineSpacingExtra() || this.LJFF != textView.getLineSpacingMultiplier() || this.LJIIIIZZ != textView.getMaxLines() || this.LJI != textView.getIncludeFontPadding() || C789710UyP.LIZIZ(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL) != this.LJIILIIL || this.LJII != textView.getBreakStrategy() || this.LJIIL != textView.getHyphenationFrequency()) {
            return false;
        }
        if (!Intrinsics.LJFF(this.LJIIIZ, C789710UyP.LIZIZ(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR))) {
            return false;
        }
        this.LJIIJJI.reset();
        this.LJIIJJI.set(textView.getPaint());
        Paint paint = this.LJIIJJI;
        if (!Intrinsics.LJFF(paint.getTypeface(), this.LJIIJ.getTypeface()) || paint.getTextScaleX() != this.LJIIJ.getTextScaleX() || paint.getTextSkewX() != this.LJIIJ.getTextSkewX() || paint.getFlags() != this.LJIIJ.getFlags() || paint.getTextSize() != this.LJIIJ.getTextSize() || paint.getLetterSpacing() != this.LJIIJ.getLetterSpacing() || !Intrinsics.LJFF(paint.getFontFeatureSettings(), this.LJIIJ.getFontFeatureSettings()) || (Build.VERSION.SDK_INT >= 26 && !Intrinsics.LJFF(paint.getFontVariationSettings(), this.LJIIJ.getFontVariationSettings()))) {
            return false;
        }
        return true;
    }

    public final void LIZ(int i, float f, int i2, int i3, TextView textView) {
        CharSequence transformation;
        if (!LJIILL) {
            return;
        }
        this.LJIILJJIL = i;
        CharSequence text = textView.getText();
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
            text = transformation;
        }
        this.LIZ = text;
        this.LIZIZ = f;
        this.LIZJ = i3;
        this.LIZLLL = i2;
        this.LJ = textView.getLineSpacingExtra();
        this.LJFF = textView.getLineSpacingMultiplier();
        this.LJIIIIZZ = textView.getMaxLines();
        this.LJI = textView.getIncludeFontPadding();
        this.LJIILIIL = (Layout.Alignment) C789710UyP.LIZIZ(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        this.LJII = textView.getBreakStrategy();
        this.LJIIL = textView.getHyphenationFrequency();
        this.LJIIIZ = (TextDirectionHeuristic) C789710UyP.LIZIZ(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        this.LJIIJ.reset();
        this.LJIIJ.set(textView.getPaint());
    }
}
