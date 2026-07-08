package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* JADX INFO: renamed from: X.0sA0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1616220sA0 extends ViewGroup {
    public abstract void LIZJ(InterfaceC469360Ias interfaceC469360Ias);

    public void LIZLLL(InterfaceC469360Ias interfaceC469360Ias) {
    }

    public abstract PagerAdapter getAdapter();

    public abstract int getCurrentItem();

    public AbstractC1616220sA0(Context context) {
        super(context);
    }

    public AbstractC1616220sA0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
