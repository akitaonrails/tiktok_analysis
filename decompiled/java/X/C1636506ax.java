package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.06ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1636506ax {
    public static final boolean LIZ(Fragment fragment) {
        Context context;
        if (fragment == null || (context = fragment.getContext()) == null || !fragment.isAdded() || !C06W7.LIZIZ(context)) {
            return false;
        }
        return true;
    }

    public static final C19ME LIZIZ(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C19ME) {
            return (C19ME) layoutParams;
        }
        return null;
    }
}
