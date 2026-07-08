package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.FeatureResult;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserCameraInfo;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0m44, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381900m44 extends AbstractC1382150m4T<IMUser> {
    public static final /* synthetic */ int LIZIZ = 0;

    public C1381900m44(C1368260li4 c1368260li4) {
        super(c1368260li4);
    }

    public final boolean LIZ(IMUser iMUser) {
        IMUserBizInfo imUserBizInfo;
        IMUserCameraInfo cameraInfo;
        FeatureResult featureResult;
        List<String> list;
        if (iMUser == null) {
            return false;
        }
        String uid = iMUser.getUid();
        if (uid != null && (list = this.LIZ.LJIIIZ) != null && list.contains(uid)) {
            C1720006oQ.LIZLLL(new AwS565S0100000_21(iMUser, 1247), true);
            return false;
        }
        if (this.LIZ.LJIIIIZZ && iMUser.getShareStatus() == 2) {
            C1720006oQ.LIZLLL(new AwS565S0100000_21(iMUser, 1248), true);
            return false;
        }
        if (iMUser.isBlock()) {
            C1720006oQ.LIZLLL(new AwS565S0100000_21(iMUser, 1249), true);
            return false;
        }
        if (this.LIZ.LJIL && (imUserBizInfo = iMUser.getImUserBizInfo()) != null && (cameraInfo = imUserBizInfo.getCameraInfo()) != null && (featureResult = cameraInfo.featureResult) != null) {
            Integer num = featureResult.featureStatus;
            int iOrdinal = C0ZVN.IM_FEATURE_STATUS_DISALLOWED.ordinal();
            if (num != null && num.intValue() == iOrdinal) {
                C1720006oQ.LIZLLL(new AwS565S0100000_21(iMUser, 1250), true);
                return false;
            }
        }
        if (this.LIZ.LJIIZILJ && iMUser.getFollowStatus() != 2) {
            C1720006oQ.LIZLLL(new AwS565S0100000_21(iMUser, 1251), true);
            return false;
        }
        Function1<? super List<String>, ? extends Map<String, Integer>> function1 = this.LIZ.LJIILIIL;
        if (function1 == null) {
            return true;
        }
        Integer num2 = function1.invoke(Collections.singletonList(String.valueOf(iMUser.getUid()))).get(iMUser.getUid());
        if (num2 == null || num2.intValue() != 1) {
            return false;
        }
        return true;
    }
}
