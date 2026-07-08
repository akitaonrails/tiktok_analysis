package X;

import android.widget.TextView;

/* JADX INFO: renamed from: X.18qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21410818qg {
    public static int LIZ(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static boolean LIZLLL(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }

    public static void LIZJ(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public static void LIZIZ(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }
}
