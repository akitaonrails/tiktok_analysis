package X;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.DisplayCutout;

/* JADX INFO: renamed from: X.0tv9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1683890tv9 {
    public static Insets LIZIZ(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static DisplayCutout LIZ(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
        return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
    }
}
