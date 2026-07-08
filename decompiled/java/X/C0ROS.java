package X;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0ROS, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0ROS extends FrameLayout {
    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public C0ROS(Context context) {
        super(context, null, 0);
    }

    public final void LIZ(boolean z, boolean z2) {
        if (z) {
            super.setVisibility(0);
        } else if (z2) {
            super.setVisibility(4);
        } else {
            super.setVisibility(8);
        }
    }
}
