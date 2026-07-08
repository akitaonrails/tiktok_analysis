package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0T4G, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T4G {
    public static Activity LIZ(View view) {
        ViewGroup viewGroup;
        Context baseContext;
        View childAt;
        if (view.getParent() != null && !(view.getParent() instanceof View)) {
            try {
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (viewGroup == null || (childAt = viewGroup.getChildAt(0)) == null) {
                    baseContext = null;
                } else {
                    baseContext = childAt.getContext();
                }
                while (baseContext instanceof ContextWrapper) {
                    if (baseContext instanceof Activity) {
                        return (Activity) baseContext;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }
}
