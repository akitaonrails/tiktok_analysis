package X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.0Pj4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652800Pj4 {
    public static final Rect LIZ(InterfaceC652740Piy interfaceC652740Piy) {
        View view = interfaceC652740Piy.getView();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
        return rect;
    }
}
