package X;

import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.ICollabEventTrackingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717760SDm extends C09AY implements Function2<VideoAuthorInfoRelationAssem, C291001Au<? extends Integer>, Unit> {
    public C717760SDm() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem, C291001Au<? extends Integer> c291001Au) {
        VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem2 = videoAuthorInfoRelationAssem;
        if (c291001Au != null && C328100Ctc.LJ(((VideoItemParams) C631370Opb.LIZ(videoAuthorInfoRelationAssem2)).getAweme())) {
            ICollabEventTrackingService iCollabEventTrackingServiceLJII = C214878197k.LIZIZ.LJII();
            String str = ((VideoItemParams) C631370Opb.LIZ(videoAuthorInfoRelationAssem2)).mEventType;
            String authorUid = AwemeExtKt.getAuthorUid(((VideoItemParams) C631370Opb.LIZ(videoAuthorInfoRelationAssem2)).getAweme());
            String aid = ((VideoItemParams) C631370Opb.LIZ(videoAuthorInfoRelationAssem2)).getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            iCollabEventTrackingServiceLJII.reportCollabAnchor(str, authorUid, aid, videoAuthorInfoRelationAssem2.Tp(), true);
        }
        return Unit.LIZ;
    }
}
