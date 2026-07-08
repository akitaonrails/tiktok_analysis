package X;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelPulldownSetting;

/* JADX INFO: renamed from: X.0fvy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146240fvy extends C688970R0t {
    public final boolean LIZ;

    public C1146240fvy() {
        this.LIZ = LiveGiftPanelPulldownSetting.INSTANCE.isEnabled() && C497740JfY.LJIL();
    }

    @Override // X.C688970R0t
    public final EdgeEffect LIZ(RecyclerView recyclerView, int i) {
        if (this.LIZ && i == 1) {
            final Context context = recyclerView.getContext();
            return new EdgeEffect(context) { // from class: X.0fvz
                @Override // android.widget.EdgeEffect
                public final void finish() {
                }

                @Override // android.widget.EdgeEffect
                public final boolean isFinished() {
                    return true;
                }

                @Override // android.widget.EdgeEffect
                public final void onAbsorb(int i2) {
                }

                @Override // android.widget.EdgeEffect
                public final void onPull(float f) {
                }

                @Override // android.widget.EdgeEffect
                public final void onPull(float f, float f2) {
                }

                @Override // android.widget.EdgeEffect
                public final void onRelease() {
                }
            };
        }
        return super.LIZ(recyclerView, i);
    }
}
