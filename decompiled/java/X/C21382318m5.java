package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* JADX INFO: renamed from: X.18m5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21382318m5 {
    public static int LIZ(TextView textView) {
        return textView.getBreakStrategy();
    }

    public static ColorStateList LIZIZ(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    public static PorterDuff.Mode LIZJ(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    public static int LIZLLL(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    public static void LJ(TextView textView, int i) {
        textView.setBreakStrategy(i);
    }

    public static void LJFF(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void LJI(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void LJII(TextView textView, int i) {
        textView.setHyphenationFrequency(i);
    }
}
