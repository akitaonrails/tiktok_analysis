package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0DWL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DWL extends ViewOnAttachStateChangeListenerC20604515jv {
    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    public C0DWL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0DWL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
