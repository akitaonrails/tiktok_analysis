package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806570VkV {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(288));
    public final CopyOnWriteArrayList<Aweme> LIZIZ = new CopyOnWriteArrayList<>();

    public final List<Aweme> LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPublishCache start, publishCache=[");
        sbLIZ.append(C13LP.LJJLIIIJ(this.LIZIZ, null, null, null, 0, null, AFwS247S0000000_13.get$arr$(51), 31));
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        CopyOnWriteArrayList<Aweme> copyOnWriteArrayList = this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : copyOnWriteArrayList) {
            Aweme aweme2 = aweme;
            aweme2.getCreateTime();
            if ((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - aweme2.getCreateTime() < ((Number) C278470Avl.LIZ.getValue()).intValue()) {
                arrayList.add(aweme);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getPublishCache start, validPublishCache=[");
        sbLIZ2.append(C13LP.LJJLIIIJ(this.LIZIZ, null, null, null, 0, null, AFwS247S0000000_13.get$arr$(52), 31));
        sbLIZ2.append(']');
        C2188811AlT.LIZIZ(sbLIZ2);
        return arrayList;
    }

    public final void LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C0W17.LIZJ("cache", "clearCache, invalid uid");
        } else {
            C0W17.LIZJ("cache", "clearCache");
            ((C08I7) this.LIZ.getValue()).LJ(str);
        }
    }

    public final void LIZJ(String str) {
        for (Aweme aweme : this.LIZIZ) {
            if (Intrinsics.LJFF(aweme.getAid(), str)) {
                if (aweme != null) {
                    this.LIZIZ.remove(aweme);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("remove publish item, id = ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return;
                }
                return;
            }
        }
    }

    public final void LIZLLL(String str, FriendsV3FeedResponse friendsV3FeedResponse, EnumC599100Nee enumC599100Nee, int i) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C0W17.LIZJ("cache", "updateCache, invalid uid");
            return;
        }
        if (friendsV3FeedResponse.status_code == 0 && friendsV3FeedResponse.friendsV3Feeds != null) {
            C0W17.LIZJ("cache", "updateCache, updateCache");
            if (enumC599100Nee == EnumC599100Nee.DB) {
                C01GW c01gw = C806480VkM.LIZ;
                Object obj = null;
                if (C1206704np.LIZ()) {
                    Object obj2 = C806480VkM.LIZ().get(C13LE.LIZ(C806600VkY.class));
                    if (obj2 instanceof C806600VkY) {
                        obj = obj2;
                    }
                    C806600VkY c806600VkY = (C806600VkY) obj;
                    if (c806600VkY != null) {
                        c806600VkY.LIZLLL(1);
                    }
                }
            }
            ((C08I7) this.LIZ.getValue()).LIZLLL(str, new C1582260rHE(friendsV3FeedResponse, enumC599100Nee, System.currentTimeMillis(), i));
            return;
        }
        C0W17.LIZJ("cache", "updateCache, illegal response");
    }
}
