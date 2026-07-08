package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.IPlaylistPlayNextService;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0591, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0591 implements C0SHS {
    public final VideoItemParams LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1250));
    public AnonymousClass0956 LIZLLL;
    public int LJ;

    @Override // X.C0SHS
    public final void LIZ() {
        this.LJ = 0;
        String strLIZLLL = LIZLLL();
        if (strLIZLLL != null) {
            IPlaylistPlayNextService iPlaylistPlayNextService = (IPlaylistPlayNextService) this.LIZJ.getValue();
            if (iPlaylistPlayNextService != null) {
                VideoItemParams videoItemParams = this.LIZ;
                iPlaylistPlayNextService.LIZLLL(videoItemParams != null ? videoItemParams.getAweme() : null, strLIZLLL);
            }
            LIZIZ();
        }
    }

    @Override // X.C0SHS
    public final void LIZIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZLLL = null;
        this.LJ = 0;
    }

    public final String LIZLLL() {
        Aweme aweme;
        PlayListInfo playListInfo;
        VideoItemParams videoItemParams = this.LIZ;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (playListInfo = aweme.playlist_info) == null) {
            return null;
        }
        return playListInfo.getMixId();
    }

    @Override // X.C0SHS
    public final Aweme LLLJ() {
        Aweme aweme;
        String strLIZLLL;
        String aid;
        IPlaylistPlayNextService iPlaylistPlayNextService;
        VideoItemParams videoItemParams = this.LIZ;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (strLIZLLL = LIZLLL()) == null || (aid = aweme.getAid()) == null || (iPlaylistPlayNextService = (IPlaylistPlayNextService) this.LIZJ.getValue()) == null) {
            return null;
        }
        return iPlaylistPlayNextService.LIZJ(aid, strLIZLLL);
    }

    @Override // X.C0SHS
    public final void clearCache() {
        IPlaylistPlayNextService iPlaylistPlayNextService;
        String strLIZLLL = LIZLLL();
        if (strLIZLLL == null || (iPlaylistPlayNextService = (IPlaylistPlayNextService) this.LIZJ.getValue()) == null) {
            return;
        }
        iPlaylistPlayNextService.LIZ(strLIZLLL);
    }

    @Override // X.C0SHS
    public final void LIZJ(AwS555S0100000_11 awS555S0100000_11) {
        Aweme aweme;
        boolean z;
        int i;
        VideoItemParams videoItemParams = this.LIZ;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
            if (anonymousClass0956 != null && anonymousClass0956.isCompleted()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.LIZLLL = null;
            }
            if (this.LIZLLL == null && LLLJ() == null && (i = this.LJ) < 5) {
                this.LJ = i + 1;
                this.LIZLLL = C23250099c.LIZLLL(this.LIZIZ, C0PEM.LIZJ, null, new AnonymousClass0590(this, aweme, awS555S0100000_11, null), 2);
            }
        }
    }

    public AnonymousClass0591(VideoItemParams videoItemParams, InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = videoItemParams;
        this.LIZIZ = interfaceC497601wk;
    }
}
