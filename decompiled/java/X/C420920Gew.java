package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Gew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420920Gew {
    public static void LIZ(Activity activity, View view) {
        if (view == null || view.getContext() == null) {
            return;
        }
        if (view.getContext() == activity) {
            if (view.getBackground() != null) {
                try {
                    view.getBackground().setCallback(null);
                    view.setBackgroundDrawable(null);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                Drawable drawable = imageView.getDrawable();
                if (drawable != null) {
                    drawable.setCallback(null);
                }
                imageView.setImageDrawable(null);
            }
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                for (Drawable drawable2 : textView.getCompoundDrawables()) {
                    if (drawable2 != null) {
                        drawable2.setCallback(null);
                    }
                }
                textView.setCompoundDrawables(null, null, null, null);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                LIZ(activity, viewGroup.getChildAt(i));
            }
        }
    }
}
