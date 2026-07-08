package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.assem.compliance.StopAutoPlayOverlayAssem;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.contentclassification.TUCContentClassificationMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.general.TUCGeneralMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.photosensitive.TUCPhotosensitiveMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.report.TUCReportMaskAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RDp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692310RDp extends C09AY implements Function2<FeedVideoAssem, C291001Au<? extends Unit>, Unit> {
    public C692310RDp() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(FeedVideoAssem feedVideoAssem, C291001Au<? extends Unit> c291001Au) {
        boolean zLJFF;
        Object obj;
        Object obj2;
        FeedVideoAssem feedVideoAssem2 = feedVideoAssem;
        if (c291001Au != null) {
            VideoMaskInfo contentClassificationMaskInfo = ((VideoItemParams) C631370Opb.LIZ(feedVideoAssem2)).getAweme().getContentClassificationMaskInfo();
            if (contentClassificationMaskInfo != null) {
                zLJFF = Intrinsics.LJFF(contentClassificationMaskInfo.showMask, Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            Object obj3 = null;
            if (zLJFF) {
                C723830SaL.LJ(feedVideoAssem2, C13LE.LIZ(TUCContentClassificationMaskAssem.class), true, null);
            }
            C10IT c10it = C10IT.LIZ;
            C724270Sb3 c724270Sb3 = feedVideoAssem2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            c10it.getClass();
            if (C10IT.LJIIL(aweme)) {
                C723830SaL.LJ(feedVideoAssem2, C13LE.LIZ(TUCGeneralMaskAssem.class), true, null);
            }
            C724270Sb3 c724270Sb32 = feedVideoAssem2.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            if (C10IT.LJIILJJIL(((VideoItemParams) obj2).getAweme())) {
                C723830SaL.LJ(feedVideoAssem2, C13LE.LIZ(TUCReportMaskAssem.class), true, null);
            }
            C724270Sb3 c724270Sb33 = feedVideoAssem2.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            }
            if (C10IT.LJIILIIL(((VideoItemParams) obj3).getAweme())) {
                C723830SaL.LJ(feedVideoAssem2, C13LE.LIZ(TUCPhotosensitiveMaskAssem.class), true, null);
            }
            if (ComplianceServiceProvider.LJI().LJI() > 0) {
                C723830SaL.LJ(feedVideoAssem2, C13LE.LIZ(StopAutoPlayOverlayAssem.class), true, null);
            }
            feedVideoAssem2.ip();
        }
        return Unit.LIZ;
    }
}
