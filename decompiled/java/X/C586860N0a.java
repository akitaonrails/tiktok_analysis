package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;

/* JADX INFO: renamed from: X.0N0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586860N0a {
    public Aweme LIZ;
    public Aweme LIZIZ;
    public final C1482640ogY LIZJ;
    public final OnUIPlayListener LIZLLL;
    public final InterfaceC586890N0d LJ;
    public C0N0Y LJFF;

    public final VideoUrlModel LIZ() {
        Video video;
        VideoUrlModel properPlayAddr;
        InterfaceC586890N0d interfaceC586890N0d = this.LJ;
        Aweme aweme = this.LIZ;
        interfaceC586890N0d.getClass();
        if (aweme == null || (video = aweme.getVideo()) == null || (properPlayAddr = video.getProperPlayAddr()) == null) {
            return null;
        }
        Aweme aweme2 = this.LIZ;
        if (aweme2 != null) {
            Aweme aweme3 = this.LIZIZ;
            video.setRationAndSourceId(aweme3 == null ? aweme2.getAid() : aweme3.getAid());
        }
        return properPlayAddr;
    }

    public final boolean LIZIZ() {
        Aweme aweme;
        C1482640ogY c1482640ogY = this.LIZJ;
        return c1482640ogY != null && c1482640ogY.Da() && ((aweme = this.LIZ) == null || AwemeExtKt.getStatusSafety(aweme) == null || !AwemeExtKt.getStatusSafety(this.LIZ).isDelete());
    }

    public C586860N0a(VideoViewComponent videoViewComponent, OnUIPlayListener onUIPlayListener) {
        C586900N0e c586900N0e = InterfaceC586890N0d.LIZ;
        this.LIZJ = videoViewComponent.LLILLL;
        this.LIZLLL = onUIPlayListener;
        this.LJ = c586900N0e;
    }
}
