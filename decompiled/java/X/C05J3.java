package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.service.ISeriesPlayNextService;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.05J3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05J3 implements C0SHS {
    public final VideoItemParams LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1154));
    public AnonymousClass0956 LIZLLL;
    public int LJ;

    @Override // X.C0SHS
    public final void LIZ() {
        Aweme aweme;
        this.LJ = 0;
        VideoItemParams videoItemParams = this.LIZ;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null) {
            return;
        }
        ISeriesPlayNextService iSeriesPlayNextService = (ISeriesPlayNextService) this.LIZJ.getValue();
        if (iSeriesPlayNextService != null) {
            iSeriesPlayNextService.checkAndRemoveCache(aweme);
        }
        LIZIZ();
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

    public final Long LIZLLL() {
        Aweme aweme;
        PaidContentInfo paidContentInfo;
        VideoItemParams videoItemParams = this.LIZ;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (paidContentInfo = aweme.mPaidContentInfo) == null) {
            return null;
        }
        return Long.valueOf(paidContentInfo.getPaidCollectionId());
    }

    @Override // X.C0SHS
    public final Aweme LLLJ() {
        Aweme aweme;
        Long lLIZLLL;
        ISeriesPlayNextService iSeriesPlayNextService;
        PaidVideoItem paidVideoItemNextVideo;
        VideoItemParams videoItemParams = this.LIZ;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (lLIZLLL = LIZLLL()) == null) {
            return null;
        }
        long jLongValue = lLIZLLL.longValue();
        String aid = aweme.getAid();
        if (aid == null || (iSeriesPlayNextService = (ISeriesPlayNextService) this.LIZJ.getValue()) == null || (paidVideoItemNextVideo = iSeriesPlayNextService.nextVideo(aid, jLongValue)) == null) {
            return null;
        }
        return paidVideoItemNextVideo.aweme;
    }

    @Override // X.C0SHS
    public final void clearCache() {
        Long lLIZLLL = LIZLLL();
        if (lLIZLLL != null) {
            long jLongValue = lLIZLLL.longValue();
            ISeriesPlayNextService iSeriesPlayNextService = (ISeriesPlayNextService) this.LIZJ.getValue();
            if (iSeriesPlayNextService != null) {
                iSeriesPlayNextService.clearVideoListCache(jLongValue);
            }
        }
    }

    @Override // X.C0SHS
    public final void LIZJ(AwS555S0100000_11 awS555S0100000_11) {
        Aweme aweme;
        boolean z;
        int i;
        Long lLIZLLL = LIZLLL();
        if (lLIZLLL != null) {
            long jLongValue = lLIZLLL.longValue();
            VideoItemParams videoItemParams = this.LIZ;
            if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && aweme.getAid() != null) {
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
                    this.LIZLLL = C23250099c.LIZLLL(this.LIZIZ, C0PEM.LIZJ, null, new C05J2(this, jLongValue, awS555S0100000_11, null), 2);
                }
            }
        }
    }

    public C05J3(VideoItemParams videoItemParams, InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = videoItemParams;
        this.LIZIZ = interfaceC497601wk;
    }
}
