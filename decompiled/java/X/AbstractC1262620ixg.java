package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0ixg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1262620ixg extends FrameLayout implements InterfaceC1262800ixy {
    @Override // X.InterfaceC1262800ixy, X.InterfaceC1262810ixz
    public void LJI(AbstractC1264080j02<C1261860iwS> abstractC1264080j02) {
    }

    @Override // X.InterfaceC1262810ixz
    public abstract /* synthetic */ C1075800e6M getCurrentState();

    @Override // X.InterfaceC1262810ixz
    public abstract /* synthetic */ AbstractC21673719rz getItemAnimator();

    @Override // X.InterfaceC1262800ixy
    public abstract /* synthetic */ AbstractC1262620ixg getLayout();

    @Override // X.InterfaceC1262800ixy
    public abstract /* synthetic */ ViewOnAttachStateChangeListenerC20604515jv getPowerList();

    @Override // X.InterfaceC1262800ixy
    public abstract /* synthetic */ C1749280vcc getStatusView();

    @Override // X.InterfaceC1262800ixy
    public abstract /* synthetic */ void setConfigInner(C1262300ixA c1262300ixA);

    public AbstractC1262620ixg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AbstractC1262620ixg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
