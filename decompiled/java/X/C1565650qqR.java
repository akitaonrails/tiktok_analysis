package X;

import Y.ACListenerS126S0200000_24;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0qqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565650qqR {
    public final TuxIconView LIZ;

    public C1565650qqR(C1565660qqS c1565660qqS) {
        TuxIconView tuxIconView;
        int i;
        C0N0Y playerManager;
        View view = c1565660qqS.LL;
        if (view != null) {
            tuxIconView = (TuxIconView) view.findViewById(R.id.qmm);
        } else {
            tuxIconView = null;
        }
        this.LIZ = tuxIconView;
        if (tuxIconView != null) {
            IPlayerComponentAbility iPlayerComponentAbility = c1565660qqS.LLILZLL;
            if (iPlayerComponentAbility != null && (playerManager = iPlayerComponentAbility.getPlayerManager()) != null && playerManager.isPlaying()) {
                i = R.raw.icon_pause_fill;
            } else {
                i = R.raw.icon_play_fill;
            }
            tuxIconView.setIconRes(i);
            C786410Ut5.a9(tuxIconView, new ACListenerS126S0200000_24(c1565660qqS, this, 24));
        }
        C2271391DvN.LIZ(tuxIconView, (C1A5L) C2271381DvM.LJJJLZIJ.getValue());
    }

    public final void LIZ(boolean z) {
        int i;
        TuxIconView tuxIconView = this.LIZ;
        if (tuxIconView != null) {
            if (z) {
                i = R.raw.icon_pause_fill;
            } else {
                i = R.raw.icon_play_fill;
            }
            tuxIconView.setIconRes(i);
        }
    }
}
