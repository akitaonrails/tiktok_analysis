package X;

import com.ss.android.ugc.aweme.api.MultiRedDotRequest;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.model.FriendsFeedRedDotRequest;
import com.ss.android.ugc.aweme.friendstab.model.RepostFeedRedDotRequest;
import com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotRequest;
import com.ss.android.ugc.aweme.friendstab.model.WaterFallRedDotRequest;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rOJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586650rOJ {
    public static final int LIZIZ() {
        return (ComplianceServiceProvider.LJI().LJIIJ(false) && Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE)) ? 1 : 0;
    }

    public static final MultiRedDotRequest LIZ(EnumC1586970rOp enumC1586970rOp, EnumC586680Mzi enumC586680Mzi) {
        ArrayList<Integer> arrayListLJIIIZ;
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIZ;
        String strNk0;
        ArrayList arrayList;
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI;
        List<ISocialTabProtocol> listSV1;
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL;
        MultiRedDotRequest multiRedDotRequest;
        int type;
        int type2;
        int type3;
        WaterFallRedDotRequest waterFallRedDotRequest;
        Integer numValueOf;
        Integer numValueOf2 = null;
        if (C319860CgK.LIZ()) {
            List<C0VNS> listLIZIZ = C0O0S.LIZIZ(C1593830rZt.LIZIZ.LJI());
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C0VNS) it2.next()).LIZ);
            }
            if (enumC586680Mzi == EnumC586680Mzi.REPOST_IN_FRIENDS_WATERFALL) {
                type2 = EnumC1586610rOF.REPOST_FEED.getType();
            } else {
                type2 = EnumC1586610rOF.FRIENDS_WATER_FALL.getType();
            }
            ArrayList arrayListLJ = C1697810uHb.LJ(Integer.valueOf(type2));
            if (enumC1586970rOp == EnumC1586970rOp.SWITCH_ACCOUNT) {
                type3 = EnumC1586970rOp.LOGIN_SUCCESS.getType();
            } else {
                type3 = enumC1586970rOp.getType();
            }
            multiRedDotRequest = new MultiRedDotRequest(null, null, arrayList2, arrayListLJ, type3, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getFriendCount());
            if (((Boolean) C0B5Y.LIZ.getValue()).booleanValue()) {
                C443120HZe<List<String>, List<String>, List<C0VNS>> history = C1595430rcT.LIZIZ.LIZJ().readHistory(EnumC1360770lVz.RED_DOT);
                List<String> first = history.getFirst();
                List<String> second = history.getSecond();
                history.getThird();
                WaterFallRedDotRequest waterFallRedDotRequest2 = new WaterFallRedDotRequest(null, null);
                waterFallRedDotRequest2.setClientReadGids(first);
                waterFallRedDotRequest2.setClientReadGidsNotification(second);
                C1587220rPE.LIZ.getClass();
                if (!C2549609yw.LIZ) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(C1587220rPE.LIZJ.getInt(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), 0));
                }
                waterFallRedDotRequest2.setNotEnterFriendsTabNum(numValueOf);
                multiRedDotRequest.setFriendFeedRedDotRequest(waterFallRedDotRequest2);
            }
            if (C296400Bja.LIZ() && LIZIZ() != 1) {
                SocialFeedRedDotRequest socialFeedRedDotRequest = multiRedDotRequest.friendFeedRedDotRequest;
                if (!(socialFeedRedDotRequest instanceof WaterFallRedDotRequest) || (waterFallRedDotRequest = (WaterFallRedDotRequest) socialFeedRedDotRequest) == null) {
                    waterFallRedDotRequest = new WaterFallRedDotRequest(null, null);
                }
                waterFallRedDotRequest.setOrderType(2);
                multiRedDotRequest.setFriendFeedRedDotRequest(waterFallRedDotRequest);
                return multiRedDotRequest;
            }
        } else {
            C1595430rcT c1595430rcT = C1595430rcT.LIZIZ;
            C443120HZe<List<String>, List<String>, List<C0VNS>> history2 = c1595430rcT.LIZJ().readHistory(EnumC1360770lVz.RED_DOT);
            List<String> first2 = history2.getFirst();
            List<String> second2 = history2.getSecond();
            List<C0VNS> third = history2.getThird();
            C1583300rIu.LIZ.getClass();
            if (!C1583300rIu.LIZIZ()) {
                arrayListLJIIIZ = c1595430rcT.LIZIZ().redDotLogic().LJIILIIL();
            } else {
                StateOwner stateOwner = StateOwner.LL;
                C19EG c19egLIZIZ = stateOwner.LIZIZ();
                if (c19egLIZIZ != null && (iBottomTabLayoutAbilityLJIIIZ = C1583510rJF.LJIIIZ(C1558360qeg.LJI(c19egLIZIZ, null))) != null && iBottomTabLayoutAbilityLJIIIZ.hv0()) {
                    C19EG c19egLIZIZ2 = stateOwner.LIZIZ();
                    if (c19egLIZIZ2 != null && (iFriendsTabLayoutAbilityLIZLLL = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZIZ2, null))) != null) {
                        strNk0 = iFriendsTabLayoutAbilityLIZLLL.nk0();
                    } else {
                        strNk0 = null;
                    }
                    C19EG c19egLIZIZ3 = stateOwner.LIZIZ();
                    if (c19egLIZIZ3 != null && (iSocial2TabProtocolAbilityLJI = C1583510rJF.LJI(C1558360qeg.LJI(c19egLIZIZ3, null))) != null && (listSV1 = iSocial2TabProtocolAbilityLJI.sV1()) != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (ISocialTabProtocol iSocialTabProtocol : listSV1) {
                            if (!Intrinsics.LJFF(iSocialTabProtocol.getTag(), strNk0)) {
                                arrayList3.add(iSocialTabProtocol);
                            }
                        }
                        arrayList = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(((ISocialTabProtocol) it3.next()).getTag());
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayListLJIIIZ = new ArrayList<>();
                    if (arrayList != null) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            arrayListLJIIIZ.add(Integer.valueOf(C1595430rcT.LIZIZ.LIZJ().getSocial2TabFeedType((String) it4.next())));
                        }
                    }
                    C1583300rIu.LIZ.getClass();
                    if (C1583300rIu.LIZIZ() && !Intrinsics.LJFF(strNk0, "REPOST_FEED")) {
                        int social2TabFeedType = C1595430rcT.LIZIZ.LIZJ().getSocial2TabFeedType("REPOST_FEED");
                        if (!arrayListLJIIIZ.contains(Integer.valueOf(social2TabFeedType))) {
                            arrayListLJIIIZ.add(Integer.valueOf(social2TabFeedType));
                        }
                    }
                } else {
                    arrayListLJIIIZ = c1595430rcT.LIZIZ().redDotLogic().LJIIIZ();
                }
            }
            if (enumC1586970rOp == EnumC1586970rOp.SWITCH_ACCOUNT) {
                type = EnumC1586970rOp.LOGIN_SUCCESS.getType();
            } else {
                type = enumC1586970rOp.getType();
            }
            multiRedDotRequest = new MultiRedDotRequest(null, null, null, arrayListLJIIIZ, type, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getFriendCount());
            FriendsFeedRedDotRequest friendsFeedRedDotRequest = new FriendsFeedRedDotRequest(null);
            friendsFeedRedDotRequest.setClientReadGids(first2);
            friendsFeedRedDotRequest.setClientReadGidsNotification(second2);
            C1587220rPE.LIZ.getClass();
            if (C2549609yw.LIZ) {
                numValueOf2 = Integer.valueOf(C1587220rPE.LIZJ.getInt(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), 0));
            }
            friendsFeedRedDotRequest.setNotEnterFriendsTabNum(numValueOf2);
            multiRedDotRequest.setFriendFeedRedDotRequest(friendsFeedRedDotRequest);
            RepostFeedRedDotRequest repostFeedRedDotRequest = new RepostFeedRedDotRequest(false);
            repostFeedRedDotRequest.setNeedInitTabStatus(C1587150rP7.LIZIZ.LJIIIIZZ());
            multiRedDotRequest.setRepostFeedRedDotRequest(repostFeedRedDotRequest);
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(third, 10));
            Iterator<C0VNS> it5 = third.iterator();
            while (it5.hasNext()) {
                arrayList4.add(it5.next().LIZ);
            }
            multiRedDotRequest.setClientReadGidsAll(arrayList4);
        }
        return multiRedDotRequest;
    }
}
