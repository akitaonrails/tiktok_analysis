package X;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UyR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789730UyR {
    public static final /* synthetic */ int LIZ = 0;

    public static Activity LIZ(Dialog dialog) {
        if (dialog != null) {
            for (Context context = dialog.getContext(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
            }
        }
        return null;
    }

    public static Activity LIZIZ(View view) {
        if (view == null) {
            return null;
        }
        if (Intrinsics.LJFF(view.getClass().getName(), "com.android.internal.policy.DecorView")) {
            return LIZIZ(view.findViewById(R.id.content));
        }
        for (Context context = view.getContext(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public static Activity LIZJ(Object obj) {
        if (obj instanceof Activity) {
            return (Activity) obj;
        }
        if (obj instanceof Fragment) {
            return ((Fragment) obj).getActivity();
        }
        if (obj instanceof Dialog) {
            return LIZ((Dialog) obj);
        }
        if (obj instanceof View) {
            return LIZIZ((View) obj);
        }
        return null;
    }

    public static Map.Entry LIZLLL(Map map) {
        entry = null;
        for (Map.Entry entry : map.entrySet()) {
        }
        return entry;
    }
}
