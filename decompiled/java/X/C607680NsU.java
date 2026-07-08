package X;

import com.ss.android.ugc.aweme.detail.repo.FollowInnerFeedApi;
import com.ss.android.ugc.aweme.experiment.FollowingSkylightAbilityOptConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.follow.api.FollowFeedApiV2;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.service.IFollowReadService;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NsU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607680NsU {
    public static final C607680NsU LIZ = new C607680NsU();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(383));

    public static Object LIZ(List list, boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        String strLIZJ;
        IFollowReadService iFollowReadService;
        C607610NsN c607610NsN = C607610NsN.LIZ;
        EnumC607620NsO enumC607620NsO = EnumC607620NsO.PRELOAD;
        EnumC607600NsM enumC607600NsM = EnumC607600NsM.FOLLOWEE_INNER_FEED;
        c607610NsN.getClass();
        C607610NsN.LIZIZ(enumC607620NsO, enumC607600NsM);
        FollowInnerFeedApi followInnerFeedApi = (FollowInnerFeedApi) LIZIZ.getValue();
        Integer numLJ = C2286608xc.LJ(z ? 1 : 0);
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(list);
        if (((Boolean) FollowingSkylightAbilityOptConfig.LJ.getValue()).booleanValue() && (iFollowReadService = (IFollowReadService) PluggableExtentionKt.pluggableSpi$default(IFollowReadService.class, false, false, false, 14, null)) != null) {
            strLIZJ = iFollowReadService.LIZJ();
        } else {
            strLIZJ = null;
        }
        return followInnerFeedApi.batchPreloadFollowInnerFeed(numLJ, null, 1, strLJI, strLIZJ, null, interfaceC1364105Vn);
    }

    public static Object LIZIZ(C607680NsU c607680NsU, String str, int i, int i2, int i3, EnumC1588650rRX enumC1588650rRX, EnumC474340Iiu enumC474340Iiu, String str2, C607710NsX c607710NsX) {
        EnumC607620NsO enumC607620NsO;
        String strLIZJ;
        IFollowReadService iFollowReadService;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c607680NsU.getClass();
        C607610NsN c607610NsN = C607610NsN.LIZ;
        if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            enumC607620NsO = EnumC607620NsO.REFRESH;
        } else {
            enumC607620NsO = EnumC607620NsO.LOAD_MORE;
        }
        EnumC607600NsM enumC607600NsM = EnumC607600NsM.FOLLOWEE_INNER_FEED;
        c607610NsN.getClass();
        C607610NsN.LIZIZ(enumC607620NsO, enumC607600NsM);
        FollowInnerFeedApi followInnerFeedApi = (FollowInnerFeedApi) LIZIZ.getValue();
        Integer numLJ = C2286608xc.LJ(i2);
        Long lLJFF = C2286608xc.LJFF(jCurrentTimeMillis);
        Integer numLJ2 = C2286608xc.LJ(i3);
        Integer numLJ3 = C2286608xc.LJ(2);
        Integer numLJ4 = C2286608xc.LJ(0);
        Integer numLJ5 = C2286608xc.LJ(1);
        Integer numLJ6 = C2286608xc.LJ(0);
        Integer numLJ7 = C2286608xc.LJ(enumC1588650rRX.getState());
        Integer numLJ8 = C2286608xc.LJ(enumC474340Iiu.getType());
        if (((Boolean) FollowingSkylightAbilityOptConfig.LJ.getValue()).booleanValue() && (iFollowReadService = (IFollowReadService) PluggableExtentionKt.pluggableSpi$default(IFollowReadService.class, false, false, false, 14, null)) != null) {
            strLIZJ = iFollowReadService.LIZJ();
        } else {
            strLIZJ = null;
        }
        return followInnerFeedApi.getFollowInnerFeedList(str, i, 20, numLJ, lLJFF, numLJ2, numLJ3, numLJ4, null, null, numLJ5, null, numLJ6, null, null, numLJ7, null, numLJ8, str2, null, new FollowFeedApiV2.FollowFeedPostBody(strLIZJ, null, null, null), c607710NsX);
    }
}
