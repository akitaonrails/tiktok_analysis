package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WL3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WL3 extends TextureView {
    @Override // android.view.View
    public final void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("CompatTextureView.onDetachedFromWindow", e);
        }
    }

    public C0WL3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
