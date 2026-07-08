package X;

import android.R;
import android.view.View;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.LiveCommentPanelFitsystemFixSetting;

/* JADX INFO: renamed from: X.10ih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19322910ih {
    public final InterfaceC19323110ij LIZ;
    public final View LIZIZ;
    public final boolean LIZJ;
    public final View LIZLLL;

    public C19322910ih(InterfaceC19323110ij interfaceC19323110ij, View view, Window window, boolean z, int i) {
        Object parent;
        View view2;
        View viewFindViewById;
        this.LIZ = interfaceC19323110ij;
        this.LIZIZ = view;
        this.LIZJ = z;
        View view3 = this.LIZIZ;
        if (view3 != null) {
            view3.setFitsSystemWindows(true);
            C14JX.LIZIZ(view3, new C19323010ii(this));
        }
        if (z && LiveCommentPanelFitsystemFixSetting.INSTANCE.getValue()) {
            View view4 = null;
            if (view != null && (viewFindViewById = view.findViewById(R.id.content)) != null) {
                parent = viewFindViewById.getParent();
            } else {
                parent = null;
            }
            if ((parent instanceof View) && (view2 = (View) parent) != null && view2.getFitsSystemWindows()) {
                view4 = view2;
            }
            this.LIZLLL = view4;
        }
        if (window != null) {
            C1145100fu8.LIZ(window);
            if (!z) {
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i);
            }
        }
    }
}
