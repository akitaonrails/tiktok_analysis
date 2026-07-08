package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0V0Y, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V0Y extends TextureView {
    @Override // android.view.View
    public final void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Npth.reportBizException("tako", e, "video detail textureView detachedFromWindow exception", C2097608Jq.LJ());
        }
    }

    public C0V0Y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
