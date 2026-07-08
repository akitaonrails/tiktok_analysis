package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;

/* JADX INFO: renamed from: X.0RYN, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RYN implements InterfaceC700020Rd2<VideoItemParams> {
    public final /* synthetic */ BaseCellContentComponent<?> LIZ;

    @Override // X.InterfaceC700020Rd2
    public final VideoItemParams LIZ() {
        return (VideoItemParams) C631370Opb.LIZ(this.LIZ);
    }

    @Override // X.InterfaceC700020Rd2
    public final String LJLI() {
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ(this.LIZ);
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null) {
            return null;
        }
        return aweme.getAid();
    }

    @Override // X.InterfaceC700020Rd2
    public final String getLogId() {
        Aweme aweme;
        String requestId;
        VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ(this.LIZ);
        return (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (requestId = aweme.getRequestId()) == null) ? "" : requestId;
    }

    @Override // X.InterfaceC700020Rd2
    public final String getScene() {
        String strLJ = C698800Rb4.LJ(this.LIZ.jm());
        return strLJ == null ? "" : strLJ;
    }

    public C0RYN(BaseCellContentComponent<?> baseCellContentComponent) {
        this.LIZ = baseCellContentComponent;
    }
}
