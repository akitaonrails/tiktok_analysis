package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: renamed from: X.0Hmd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451170Hmd extends ViewOnAttachStateChangeListenerC20604515jv {
    public final void setMaxLineCount(int i) {
        ((GridLayoutManager) getLayoutManager()).LJIJ(i);
    }

    public C451170Hmd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C451170Hmd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new GridLayoutManager(context, 3));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
