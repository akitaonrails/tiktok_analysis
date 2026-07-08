package X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.0HmR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451050HmR {
    public static final /* synthetic */ int LIZ = 0;

    public static Rect LIZ(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }
}
