package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.FeatureResult;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserCameraInfo;
import com.ss.android.ugc.aweme.im.service.IAuthorSupporterHelper;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0m4F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382010m4F {
    public static final C1382010m4F LIZ = new C1382010m4F();

    public static boolean LIZ(C0Y8T c0y8t, C1368260li4 c1368260li4, C1366860lfo c1366860lfo, String str) {
        Boolean boolValueOf;
        if (c0y8t == null) {
            return false;
        }
        if (C1336205Ku.LIZ(false).getBulletinBoardService().f0(c0y8t.getConversationId())) {
            C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t, 1358), false);
            if (c1366860lfo != null) {
                c1366860lfo.LIZ(str);
            }
            return false;
        }
        if (c0y8t.isGroupChat()) {
            C0ZFW c0zfw = C0ZFW.LIZ;
            if (!c1368260li4.LJIIL && c0zfw != null && c0zfw.LJIIIZ(c0y8t)) {
                if (c1368260li4.LJJ && !C0ZNY.LIZ.LIZLLL(c0y8t.getConversationId(), true)) {
                    C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t, 1360), false);
                    if (c1366860lfo != null) {
                        c1366860lfo.LIZ(str);
                    }
                    return false;
                }
            } else {
                C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t, 1359), false);
                if (c1366860lfo != null) {
                    c1366860lfo.LIZ(str);
                }
                return false;
            }
        }
        IAuthorSupporterHelper iAuthorSupporterHelper = (IAuthorSupporterHelper) PluggableExtentionKt.pluggableSpi$default(IAuthorSupporterHelper.class, false, false, false, 14, null);
        if (iAuthorSupporterHelper != null) {
            boolValueOf = Boolean.valueOf(iAuthorSupporterHelper.LJ(c0y8t));
        } else {
            boolValueOf = null;
        }
        if (C1575980r76.LIZLLL(boolValueOf)) {
            C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t, 1361), false);
            if (c1366860lfo != null) {
                c1366860lfo.LIZ(str);
            }
            return false;
        }
        if (c0y8t.getLastShowMessage() == null) {
            C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t, 1362), false);
            if (c1366860lfo != null) {
                c1366860lfo.LIZ(str);
            }
            return false;
        }
        if (c0y8t.getMemberCount() == 0) {
            C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t, 1363), false);
            if (c1366860lfo != null) {
                c1366860lfo.LIZ(str);
            }
            return false;
        }
        if (c0y8t.getInboxType() == 5 && c0y8t.getConversationTags().contains("_remix_")) {
            C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t, 1364), false);
            if (c1366860lfo != null) {
                c1366860lfo.LIZ(str);
            }
            return false;
        }
        Function1<? super List<String>, ? extends Map<String, Integer>> function1 = c1368260li4.LJIILJJIL;
        if (function1 == null) {
            return true;
        }
        String conversationId = c0y8t.getConversationId();
        if (conversationId == null) {
            return false;
        }
        Integer num = function1.invoke(Collections.singletonList(conversationId)).get(conversationId);
        if (num != null && num.intValue() == 1) {
            return true;
        }
        if (c1366860lfo == null) {
            return false;
        }
        c1366860lfo.LIZ(str);
        return false;
    }

    public static boolean LIZIZ(IMUser iMUser, C1368260li4 c1368260li4, C1366860lfo c1366860lfo, String str) {
        IMUserBizInfo imUserBizInfo;
        IMUserCameraInfo cameraInfo;
        FeatureResult featureResult;
        List<String> list;
        String uid = iMUser.getUid();
        if (uid != null && (list = c1368260li4.LJIIIZ) != null && list.contains(uid)) {
            C1720006oQ.LIZLLL(new AwS565S0100000_21(iMUser, 1365), true);
            if (c1366860lfo != null) {
                c1366860lfo.LJI++;
                c1366860lfo.LIZIZ(str);
            }
            return false;
        }
        if (c1368260li4.LJIIIIZZ && iMUser.getShareStatus() == 2) {
            C1720006oQ.LIZLLL(new AwS565S0100000_21(iMUser, 1366), true);
            if (c1366860lfo != null) {
                c1366860lfo.LIZLLL++;
                c1366860lfo.LIZIZ(str);
            }
            return false;
        }
        if (iMUser.isBlock()) {
            C1720006oQ.LIZLLL(new AwS565S0100000_21(iMUser, 1367), true);
            if (c1366860lfo != null) {
                c1366860lfo.LIZJ++;
                c1366860lfo.LIZIZ(str);
            }
            return false;
        }
        if (c1368260li4.LJIL && (imUserBizInfo = iMUser.getImUserBizInfo()) != null && (cameraInfo = imUserBizInfo.getCameraInfo()) != null && (featureResult = cameraInfo.featureResult) != null) {
            Integer num = featureResult.featureStatus;
            int iOrdinal = C0ZVN.IM_FEATURE_STATUS_DISALLOWED.ordinal();
            if (num != null && num.intValue() == iOrdinal) {
                C1720006oQ.LIZLLL(new AwS565S0100000_21(iMUser, 1368), true);
                if (c1366860lfo != null) {
                    c1366860lfo.LJI++;
                    c1366860lfo.LIZIZ(str);
                }
                return false;
            }
        }
        if (c1368260li4.LJIIZILJ && iMUser.getFollowStatus() != 2) {
            C1720006oQ.LIZLLL(new AwS565S0100000_21(iMUser, 1369), true);
            if (c1366860lfo != null) {
                c1366860lfo.LJI++;
                c1366860lfo.LIZIZ(str);
            }
            return false;
        }
        Function1<? super List<String>, ? extends Map<String, Integer>> function1 = c1368260li4.LJIILIIL;
        if (function1 == null) {
            return true;
        }
        Integer num2 = function1.invoke(Collections.singletonList(String.valueOf(iMUser.getUid()))).get(iMUser.getUid());
        if (num2 != null && num2.intValue() == 1) {
            return true;
        }
        if (c1366860lfo == null) {
            return false;
        }
        c1366860lfo.LJI++;
        c1366860lfo.LIZIZ(str);
        return false;
    }
}
