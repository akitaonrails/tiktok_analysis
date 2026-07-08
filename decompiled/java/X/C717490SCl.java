package X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.0SCl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717490SCl {
    public static final boolean LIZ(View view) {
        if (!view.isShown()) {
            return false;
        }
        return view.getGlobalVisibleRect(new Rect());
    }
}
