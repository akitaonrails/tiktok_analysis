package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UrL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C785330UrL extends C214906198m {
    public int LL;

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        View contentView = getContentView();
        if (contentView != null) {
            Object parent = contentView.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                if (view.getVisibility() != 0) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
            }
        }
    }

    public C785330UrL(C1091700eW0 c1091700eW0) {
        super(c1091700eW0);
        this.LL = 3;
    }
}
