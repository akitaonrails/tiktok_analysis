package Y;

import X.AbstractC511160K2w;
import X.C013C;
import X.C09JN;
import X.C0K3G;
import X.C1210880hcE;
import X.C1440005kM;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C473270IhB;
import X.C473300IhE;
import X.C477750IoP;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C501520Jle;
import X.C511110K2r;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.model.FeedBanner;
import com.bytedance.android.livesdk.model.FeedBannerContainer;
import com.bytedance.android.livesdk.model.message.GuestApplyInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.hangout.component.distribute.view.MultiTopLiveDistributeAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import webcast.api.pgc_sub.PGCPostActionRequest;

/* JADX INFO: loaded from: classes8.dex */
public class AfS27S0301000_7 implements C09JN {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS27S0301000_7 afS27S0301000_7, Object obj) {
        Long lValueOf;
        C1C7U.LIZ("MultiTopLiveDistributeAssem@76ec.setJoinCountDownText$1");
        long jLongValue = ((long) afS27S0301000_7.i3) - ((Long) obj).longValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("roomId：");
        GuestApplyInfo guestApplyInfo = ((RecommendItem) afS27S0301000_7.l0).guestApplyInfo;
        if (guestApplyInfo != null) {
            lValueOf = Long.valueOf(guestApplyInfo.roomId);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", setJoinCountDownText, nowNum = ");
        sbLIZ.append(jLongValue);
        C20441214yg.LIZIZ("MultiTopLiveDistributeAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (jLongValue > 0) {
            if (((C477750IoP) afS27S0301000_7.l1).isAttachedToWindow()) {
                C477750IoP c477750IoP = (C477750IoP) afS27S0301000_7.l1;
                ((MultiTopLiveDistributeAssem) afS27S0301000_7.l2).getClass();
                c477750IoP.setJoinText(MultiTopLiveDistributeAssem.op((int) jLongValue));
            }
        } else {
            MultiTopLiveDistributeAssem multiTopLiveDistributeAssem = (MultiTopLiveDistributeAssem) afS27S0301000_7.l2;
            RecommendItem recommendItem = (RecommendItem) afS27S0301000_7.l0;
            multiTopLiveDistributeAssem.getClass();
            multiTopLiveDistributeAssem.yp(recommendItem.guestApplyInfo, 3);
            C500260Jjc.LJJJLL((C477750IoP) afS27S0301000_7.l1);
            ((MultiTopLiveDistributeAssem) afS27S0301000_7.l2).ip();
        }
        C1C7U.LIZIZ("MultiTopLiveDistributeAssem@76ec.setJoinCountDownText$1");
    }

    public static final void accept$1(AfS27S0301000_7 afS27S0301000_7, Object obj) {
        boolean z;
        C1C7U.LIZ("SubSpaceDetailVM@57b0.postActionTopic$1");
        ((SubSpaceDetailVM) afS27S0301000_7.l0).LLILZIL.remove((PGCPostActionRequest) afS27S0301000_7.l1);
        SpacePost spacePostLIZ = ((AbstractC511160K2w) afS27S0301000_7.l2).LIZ();
        if (spacePostLIZ != null) {
            if (afS27S0301000_7.i3 == 0) {
                z = true;
            } else {
                z = false;
            }
            spacePostLIZ.userLiked = z;
            if (z) {
                spacePostLIZ.likeCount++;
            } else {
                spacePostLIZ.likeCount--;
            }
            C0K3G c0k3g = ((SubSpaceDetailVM) afS27S0301000_7.l0).LLILLL;
            if (c0k3g != null) {
                c0k3g.LJ(spacePostLIZ);
            }
        }
        C1C7U.LIZIZ("SubSpaceDetailVM@57b0.postActionTopic$1");
    }

    public static final void accept$2(AfS27S0301000_7 afS27S0301000_7, Object obj) {
        boolean z;
        C1C7U.LIZ("SubSpaceFeedVM@7436.postAction$1");
        ((SubSpaceFeedVM) afS27S0301000_7.l0).LLIZLLLIL.remove((PGCPostActionRequest) afS27S0301000_7.l1);
        SpacePost spacePost = (SpacePost) afS27S0301000_7.l2;
        if (afS27S0301000_7.i3 == 0) {
            z = true;
        } else {
            z = false;
        }
        spacePost.userLiked = z;
        if (z) {
            spacePost.likeCount++;
        } else {
            spacePost.likeCount--;
        }
        C511110K2r c511110K2r = ((SubSpaceFeedVM) afS27S0301000_7.l0).LLILZIL;
        if (c511110K2r != null) {
            c511110K2r.LIZLLL(spacePost);
        }
        C1C7U.LIZIZ("SubSpaceFeedVM@7436.postAction$1");
    }

    public static final void accept$3(AfS27S0301000_7 afS27S0301000_7, Object obj) {
        FullFeedFragmentPanel fullFeedFragmentPanel = (FullFeedFragmentPanel) afS27S0301000_7.l0;
        Aweme aweme = (Aweme) afS27S0301000_7.l1;
        int i = afS27S0301000_7.i3;
        User user = (User) afS27S0301000_7.l2;
        Long l = (Long) obj;
        fullFeedFragmentPanel.getClass();
        C1C7U.LIZ("FullFeedFragmentPanel@9b2e.checkLiveStatus$1L");
        if (fullFeedFragmentPanel.LJIIIIZZ() != null && fullFeedFragmentPanel.LJIIIIZZ().equals(aweme)) {
            C1C7U.LIZIZ("FullFeedFragmentPanel@9b2e.checkLiveStatus$1L");
            return;
        }
        if (fullFeedFragmentPanel.LJLLJ() >= i) {
            C1C7U.LIZIZ("FullFeedFragmentPanel@9b2e.checkLiveStatus$1L");
            return;
        }
        if (l == null) {
            l = 0L;
        }
        if (!AwemeSaaSExtKt.isLive(aweme)) {
            user.roomId = l.longValue();
        }
        if (AwemeSaaSExtKt.isLive(aweme) && 0 == l.longValue()) {
            C1440005kM.LIZ(new C1210880hcE(fullFeedFragmentPanel.getEventType(), "FUNCTION_FROM_DEFAULT", "live_offline", aweme));
        }
        C1C7U.LIZIZ("FullFeedFragmentPanel@9b2e.checkLiveStatus$1L");
    }

    public static final void accept$4(AfS27S0301000_7 afS27S0301000_7, Object obj) {
        int errorCode;
        List<T> list;
        FeedExtra feedExtra;
        FeedBannerContainer feedBannerContainer;
        List<FeedBanner> list2;
        C1C7U.LIZ("SkylightNearbyDataManager@a178.queryNearbyData$4");
        Throwable th = (Throwable) obj;
        if (((C013C) afS27S0301000_7.l0).element) {
            C473270IhB.LIZIZ = true;
        }
        BaseListResponse baseListResponseLIZ = C473270IhB.LIZ(null);
        if (baseListResponseLIZ != null && (((list = baseListResponseLIZ.data) != 0 && (!list.isEmpty())) || ((feedExtra = (FeedExtra) baseListResponseLIZ.extra) != null && (feedBannerContainer = feedExtra.bannerContainer) != null && (list2 = feedBannerContainer.bannerList) != null && (!list2.isEmpty())))) {
            ((C473300IhE) afS27S0301000_7.l1).LJI.setValue(new Pair<>(Integer.valueOf(afS27S0301000_7.i3), baseListResponseLIZ));
        }
        C473300IhE c473300IhE = (C473300IhE) afS27S0301000_7.l1;
        c473300IhE.LIZLLL = true;
        c473300IhE.LJFF = System.currentTimeMillis();
        Function2 function2 = (Function2) afS27S0301000_7.l2;
        if (function2 != null) {
            Boolean bool = Boolean.FALSE;
            ((C473300IhE) afS27S0301000_7.l1).getClass();
            if (th instanceof C501470JlZ) {
                errorCode = ((C501520Jle) th).getErrorCode();
            } else if (th instanceof Exception) {
                errorCode = 400;
            } else {
                errorCode = -1;
            }
            function2.invoke(bool, Integer.valueOf(errorCode));
        }
        C1C7U.LIZIZ("SkylightNearbyDataManager@a178.queryNearbyData$4");
    }

    public AfS27S0301000_7(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.i3 = i;
        this.l0 = obj;
        this.l1 = obj3;
        this.l2 = obj2;
    }
}
