package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: renamed from: X.0bom, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C988020bom implements InterfaceC988050bop {
    public static final C988020bom LL = new C988020bom();

    @Override // X.InterfaceC988050bop
    public final long getCurrentPosition() {
        return C1483410ohn.LJLJJI().getCurrentPosition();
    }

    public static long LIZ(Aweme aweme) {
        Video video;
        long duration = C1483410ohn.LJLJJI().getDuration();
        if (duration <= 0) {
            if (aweme != null && (video = aweme.getVideo()) != null && Integer.valueOf(video.getDuration()) != null && aweme.getVideo().getDuration() > 0) {
                return aweme.getVideo().getDuration();
            }
            return 1L;
        }
        return duration;
    }
}
