package X;

import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: renamed from: X.0MrG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C581440MrG implements InterfaceC582440Mss {
    public final /* synthetic */ PlayerController LIZ;

    public C581440MrG(PlayerController playerController) {
        this.LIZ = playerController;
    }

    public final void LIZ(Video video) {
        C0SZ8 c0sz8LLJLILLLLZIIL = this.LIZ.LLJLILLLLZIIL();
        if (c0sz8LLJLILLLLZIIL != null && c0sz8LLJLILLLLZIIL.x3() != null) {
            this.LIZ.getPlayerManager().setSurface(c0sz8LLJLILLLLZIIL.x3().getSurface());
            this.LIZ.getPlayerManager().LJJJJI(video, null, false, true);
        }
    }
}
