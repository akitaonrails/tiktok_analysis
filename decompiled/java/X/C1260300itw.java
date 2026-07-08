package X;

import android.os.Build;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0itw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260300itw {
    public View LIZ;
    public InterfaceC1258040iqI LIZIZ;
    public final int LIZJ = Build.VERSION.SDK_INT;

    public final View LIZ() {
        InterfaceC1258040iqI interfaceC1258040iqI = this.LIZIZ;
        return interfaceC1258040iqI == null ? this.LIZ : interfaceC1258040iqI.LJJLIIIJILLIZJL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LIZIZ() {
        View viewLIZ = LIZ();
        if (viewLIZ == 0) {
            return false;
        }
        if (viewLIZ instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) viewLIZ;
            int firstVisiblePosition = adapterView.getFirstVisiblePosition();
            View childAt = adapterView.getChildAt(0);
            return childAt == null || (firstVisiblePosition == 0 && childAt.getTop() == 0);
        }
        if (viewLIZ instanceof ScrollView) {
            return viewLIZ.getScrollY() <= 0;
        }
        if (viewLIZ instanceof InterfaceC1055730dZz) {
            return ((InterfaceC1055730dZz) viewLIZ).x0();
        }
        if (viewLIZ instanceof RecyclerView) {
            return !viewLIZ.canScrollVertically(-1);
        }
        if (viewLIZ instanceof WebView) {
            return viewLIZ.getScrollY() <= 0;
        }
        throw new IllegalStateException("scrollableView must be a instance of AdapterView|ScrollView|RecyclerView");
    }
}
