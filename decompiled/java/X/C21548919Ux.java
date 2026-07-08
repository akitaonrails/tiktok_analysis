package X;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.19Ux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21548919Ux extends FrameLayout implements InterfaceC21550519Vn {
    public final CollapsibleActionView LL;

    @Override // X.InterfaceC21550519Vn
    public final void onActionViewCollapsed() {
        this.LL.onActionViewCollapsed();
    }

    @Override // X.InterfaceC21550519Vn
    public final void onActionViewExpanded() {
        this.LL.onActionViewExpanded();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21548919Ux(View view) {
        super(view.getContext());
        this.LL = (CollapsibleActionView) view;
        addView(view);
    }
}
