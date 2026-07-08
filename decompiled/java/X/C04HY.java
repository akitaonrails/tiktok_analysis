package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.04HY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04HY extends RecyclerView {
    public static final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public C04HW LL;

    public final void setAdapter(C04HW c04hw) {
        this.LL = c04hw;
        setAdapter((AbstractC21673619ry) c04hw);
    }

    public C04HY(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setItemAnimator(null);
        setNestedScrollingEnabled(false);
        setClipChildren(false);
        setClipToPadding(false);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
