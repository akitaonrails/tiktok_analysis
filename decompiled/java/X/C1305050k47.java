package X;

import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;

/* JADX INFO: renamed from: X.0k47, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305050k47 extends FrameLayout {
    public PlayerController LL;

    public final void LIZ() {
        PlayerController playerController = this.LL;
        if (playerController != null) {
            playerController.detachAlphaView(this);
        }
        PlayerController playerController2 = this.LL;
        if (playerController2 != null) {
            playerController2.release();
        }
        this.LL = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZ();
    }

    public C1305050k47(ComponentActivity componentActivity) {
        super(componentActivity, null, 0);
    }
}
