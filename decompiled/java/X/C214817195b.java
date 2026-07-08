package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.widget.WidgetHost;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.195b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214817195b {
    public static C214820195e LIZ(View view, Fragment fragment) {
        WidgetHost widgetHost;
        String str = WidgetHost._pnsPageId;
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        String str2 = WidgetHost.LLIZ;
        Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI(str2);
        if (!(fragmentLJJJJZI instanceof WidgetHost) || (widgetHost = (WidgetHost) fragmentLJJJJZI) == null) {
            widgetHost = new WidgetHost();
            widgetHost.LL = fragment;
            FragmentManager fragmentManager = fragment.getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager.LJZL(new C19LM(widgetHost, 0), false);
            }
            C19EH c19ehLJIIJ = childFragmentManager.LJIIJ();
            c19ehLJIIJ.LIZLLL(widgetHost, str2);
            c19ehLJIIJ.LJIIL();
        }
        Lifecycle lifecycle = widgetHost.getLifecycle();
        C214820195e c214820195e = (C214820195e) ((WeakHashMap) widgetHost.LLILZ).get(lifecycle);
        if (c214820195e == null) {
            C214820195e c214820195e2 = new C214820195e(view, lifecycle, widgetHost);
            ((WeakHashMap) widgetHost.LLILZ).put(lifecycle, c214820195e2);
            return c214820195e2;
        }
        return c214820195e;
    }
}
