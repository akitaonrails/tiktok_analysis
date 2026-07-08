package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.live.liveevent.anchor.LiveEventCtaAnchorProvider;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

/* JADX INFO: renamed from: X.0rF0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580880rF0 implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final /* synthetic */ LiveEventCtaAnchorProvider LL;

    public C1580880rF0(LiveEventCtaAnchorProvider liveEventCtaAnchorProvider) {
        this.LL = liveEventCtaAnchorProvider;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        Aweme aweme;
        String uid;
        User author;
        VideoItemParams videoItemParams2 = videoItemParams;
        LiveEventCtaAnchorProvider liveEventCtaAnchorProvider = this.LL;
        if (videoItemParams2 != null) {
            aweme = videoItemParams2.getAweme();
        } else {
            aweme = null;
        }
        liveEventCtaAnchorProvider.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_register_btn_show");
        liveEventCtaAnchorProvider.LIZ(c474500IjALIZ, aweme);
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c474500IjALIZ.LJJII(uid, "author_id");
        c474500IjALIZ.LIZ();
        return new C1387205bq(null);
    }
}
