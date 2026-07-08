package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0T8P, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T8P extends FrameLayout {
    public C0T8P(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: X.0T8Q
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewRemoved(View view, View view2) {
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewAdded(View view, View view2) {
                if (view2 != null) {
                    view2.requestApplyInsets();
                }
            }
        });
    }
}
