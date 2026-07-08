package X;

import android.graphics.Rect;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0eMH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085670eMH {
    public final HashSet<View> LIZ = new HashSet<>();

    public static float LIZ(View view) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null || !view.isShown()) {
            return 0.0f;
        }
        float height = view.getHeight() * view.getWidth();
        if (height <= 0.0f) {
            return 0.0f;
        }
        if (!view.getGlobalVisibleRect(new Rect())) {
            return 0.0f;
        }
        return Math.abs(r2.height() * r2.width()) / height;
    }

    public static void LIZIZ(View view, float f) {
        view.setTag(R.id.hh2, Float.valueOf(f));
    }
}
