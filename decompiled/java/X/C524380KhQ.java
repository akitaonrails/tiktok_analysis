package X;

import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KhQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524380KhQ {
    public static final String LIZ(ShortVideoContext shortVideoContext) {
        if (Intrinsics.LJFF(shortVideoContext.shootWay, "sub_only_video_page")) {
            return "sub_only_video_page";
        }
        if (Intrinsics.LJFF(shortVideoContext.shootWay, "story")) {
            CommonMobParamModel commonMobParamModel = shortVideoContext.creativeModel.commonMobModel;
            if (commonMobParamModel.isUploadDirectEnter) {
                return commonMobParamModel.shootEnterFrom;
            }
        }
        if (shortVideoContext.creativeFlowData.getShootExtraData() != null) {
            ShootExtraData shootExtraData = shortVideoContext.creativeFlowData.getShootExtraData();
            if (shootExtraData != null) {
                return shootExtraData.getShootEnterFrom();
            }
            return null;
        }
        return shortVideoContext.enterFrom;
    }

    public static final void LIZIZ(ShortVideoContext shortVideoContext) {
        CommonMobParamModel commonMobParamModel = shortVideoContext.creativeModel.commonMobModel;
        if (commonMobParamModel.shootEnterFrom != null) {
            return;
        }
        commonMobParamModel.shootEnterFrom = LIZ(shortVideoContext);
    }
}
