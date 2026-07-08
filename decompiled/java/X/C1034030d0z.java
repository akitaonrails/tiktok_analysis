package X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.0d0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1034030d0z {
    public final View LIZ;

    public C1034030d0z(View view, String str) {
        this.LIZ = view;
    }

    public static Rect LIZ(Rect rect, Rect rect2) {
        int i = rect2.left - rect.left;
        int i2 = rect2.top - rect.top;
        return new Rect(i, i2, rect2.width() + i, rect2.height() + i2);
    }
}
