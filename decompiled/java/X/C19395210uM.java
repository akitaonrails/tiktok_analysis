package X;

import android.graphics.Point;
import android.view.View;

/* JADX INFO: renamed from: X.10uM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19395210uM {
    public static final /* synthetic */ Point LIZ(View view) {
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }
}
