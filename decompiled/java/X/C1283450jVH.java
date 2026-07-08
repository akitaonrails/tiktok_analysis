package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* JADX INFO: renamed from: X.0jVH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1283450jVH extends SurfaceView {
    public SurfaceHolderC2263421DiW LL;

    @Override // android.view.SurfaceView
    public SurfaceHolder getHolder() {
        return this.LL;
    }

    public C1283450jVH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new SurfaceHolderC2263421DiW(super.getHolder());
    }
}
