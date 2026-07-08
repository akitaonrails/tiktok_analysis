package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.follow.api.FollowFeedApiV2;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NsT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607670NsT {
    public static final C607670NsT LIZ = new C607670NsT();
    public static final FollowFeedApiV2 LIZIZ;

    static {
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(C0CQT.LIZJ);
        LIZIZ = (FollowFeedApiV2) (interfaceC2661011fLIZ != null ? interfaceC2661011fLIZ.create(FollowFeedApiV2.class) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FollowFeedList LIZ(int i, long j, int i2, int i3, int i4, long j2, String str, String str2, String str3, int i5, int i6, String str4, String str5, int i7, String str6, String str7, String str8, String str9, boolean z, List list, EnumC1588650rRX enumC1588650rRX, int i8, List list2, List list3, String str10) {
        String str11;
        int i9;
        String json;
        try {
            String json2 = null;
            IFollowTabBubbleGuideHelper iFollowTabBubbleGuideHelper = (IFollowTabBubbleGuideHelper) PluggableExtentionKt.pluggableSpi$default(IFollowTabBubbleGuideHelper.class, false, false, false, 14, null);
            if (iFollowTabBubbleGuideHelper != null) {
                iFollowTabBubbleGuideHelper.LIZIZ();
                str11 = "";
            } else {
                str11 = null;
            }
            AdSessionPositionHelper.LIZ.getClass();
            String strLJIIIIZZ = AdSessionPositionHelper.LJIIIIZZ(null, "following", null);
            if (ComplianceServiceProvider.LJI().LJIIJ(false) && Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE)) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            C1616470sAP.LIZ.getClass();
            String strLIZLLL = C1616470sAP.LIZ("Follow").LIZLLL();
            String strLJ = JsonParseUtils.LJ(list);
            int state = enumC1588650rRX.getState();
            if (list2 != null && (!list2.isEmpty())) {
                C1227904rF.LIZ.getClass();
                json = GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), list2);
            } else {
                json = null;
            }
            if (list3 != null && (!list3.isEmpty())) {
                C1227904rF.LIZ.getClass();
                json2 = GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), list3);
            }
            FollowFeedList followFeedList = (FollowFeedList) LIZIZ(this, i, j, i2, i3, i4, j2, str, str2, str3, str11, i5, Integer.valueOf(i6), str4, str5, Integer.valueOf(i7), str6, str7, str8, str9, strLJIIIIZZ, i9, strLIZLLL, Integer.valueOf(i8), Boolean.valueOf(z), Integer.valueOf(state), strLJ, new FollowFeedApiV2.FollowFeedPostBody(json, json2, null, str10)).get();
            C607610NsN.LIZ.getClass();
            C23250099c.LIZLLL(C607610NsN.LIZ(), null, null, new C607630NsP(followFeedList, i8, j, null), 3);
            return followFeedList;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            if (i8 == 1) {
                return new FollowFeedList();
            }
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static ListenableFuture LIZIZ(C607670NsT c607670NsT, int i, long j, int i2, int i3, int i4, long j2, String str, String str2, String str3, String str4, int i5, Integer num, String str5, String str6, Integer num2, String str7, String str8, String str9, String str10, String str11, int i6, String str12, Integer num3, Boolean bool, Integer num4, String str13, FollowFeedApiV2.FollowFeedPostBody followFeedPostBody) {
        EnumC607620NsO enumC607620NsO;
        c607670NsT.getClass();
        C607610NsN c607610NsN = C607610NsN.LIZ;
        if (num3 != null && num3.intValue() == 1) {
            enumC607620NsO = EnumC607620NsO.PRELOAD;
        } else if (j == 0) {
            enumC607620NsO = EnumC607620NsO.REFRESH;
        } else {
            enumC607620NsO = EnumC607620NsO.LOAD_MORE;
        }
        EnumC607600NsM enumC607600NsM = EnumC607600NsM.HOMEPAGE_FOLLOW;
        c607610NsN.getClass();
        C607610NsN.LIZIZ(enumC607620NsO, enumC607600NsM);
        if (((Boolean) C0BZW.LIZIZ.getValue()).booleanValue()) {
            return LIZIZ.followFeedGet(i, j, i2, 20, i3, i4, j2, str, str2, str3, str4, i5, 2, null, null, null, null, null, null, num, str5, str6, num2, str7, str8, str9, str10, str11, i6, str12, num3, bool, num4, null, str13);
        }
        return LIZIZ.followFeedPost(i, j, i2, 20, i3, i4, j2, str, str2, str3, str4, i5, 2, null, null, null, null, null, null, num, str5, str6, num2, str7, str8, str9, str10, str11, i6, str12, num3, bool, num4, null, str13, followFeedPostBody, null);
    }
}
