package X;

import android.content.Context;
import android.os.Process;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.fragment.IFriendsFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rLP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class ViewOnClickListenerC1584850rLP implements View.OnClickListener {
    public final Context LL;
    public boolean LLILLJJLI = true;

    public final FeedFragment LIZ() {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL);
        if (c19egLIZIZ == null) {
            return null;
        }
        Fragment fragmentKi = Hox.LLJILJIL.LIZ(c19egLIZIZ).Ki("FRIENDS_FEED");
        if (fragmentKi instanceof FeedFragment) {
            return (FeedFragment) fragmentKi;
        }
        return null;
    }

    public ViewOnClickListenerC1584850rLP(Context context) {
        this.LL = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean zIsLoading;
        FriendsFeedResponse friendsFeedResponse;
        List<FriendsFeed> list;
        FriendsFeed friendsFeed;
        InterfaceC1587410rPX interfaceC1587410rPX;
        IFeedFetchDataAbility iFeedFetchDataAbility;
        FeedFragment feedFragmentLIZ = LIZ();
        Aweme aweme = null;
        if (feedFragmentLIZ != null && (iFeedFetchDataAbility = (IFeedFetchDataAbility) C1558520qew.LIZ(C1558360qeg.LJFF(feedFragmentLIZ, null), IFeedFetchDataAbility.class, null)) != null) {
            zIsLoading = iFeedFetchDataAbility.isLoading();
        } else {
            zIsLoading = false;
        }
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        if (c1589640rT8.l2()) {
            C1400330mXn.LIZ.getClass();
            C1400330mXn.LJII("click");
            C0O0R.LIZ.getClass();
            C0O0R.LJI = true;
            if (zIsLoading) {
                return;
            }
        }
        if (!c1589640rT8.l2()) {
            InterfaceC1584860rLQ interfaceC1584860rLQRedDotInterface = C1595430rcT.LIZIZ.LIZIZ().redDotInterface();
            if (interfaceC1584860rLQRedDotInterface != null && interfaceC1584860rLQRedDotInterface.getDotCount() > 0) {
                FeedFragment feedFragmentLIZ2 = LIZ();
                if (feedFragmentLIZ2 != 0) {
                    if ((feedFragmentLIZ2 instanceof InterfaceC1587410rPX) && (interfaceC1587410rPX = (InterfaceC1587410rPX) feedFragmentLIZ2) != null) {
                        interfaceC1587410rPX.xO();
                    }
                    feedFragmentLIZ2.Oi(false);
                }
            } else {
                FeedFragment feedFragmentLIZ3 = LIZ();
                if (feedFragmentLIZ3 != null) {
                    InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(feedFragmentLIZ3, null), IFeedFragmentAbility.class, null);
                    if (!(interfaceC494301wDLIZ instanceof IFriendsFeedFragmentAbility)) {
                        interfaceC494301wDLIZ = null;
                    }
                    IFriendsFeedFragmentAbility iFriendsFeedFragmentAbility = (IFriendsFeedFragmentAbility) interfaceC494301wDLIZ;
                    if (iFriendsFeedFragmentAbility != null) {
                        iFriendsFeedFragmentAbility.Kb();
                    }
                }
            }
        }
        if (this.LLILLJJLI) {
            C1587740rQ4.LIZ.getClass();
            if (!C1587740rQ4.LJIJI) {
                c1589640rT8.e2();
                int i = C2187451AjH.LIZ;
                JatoXL.setPriority(Process.myTid(), -20);
                C20639086r.LIZLLL(new Runnable() { // from class: X.0CNh
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("TopFriendsObserver@1f5f.onClick$1");
                        try {
                            int i2 = C2187451AjH.LIZ;
                            JatoXL.resetPriority(Process.myTid());
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("TopFriendsObserver@1f5f.onClick$1");
                    }
                });
                C2187451AjH.LJ(2000L);
                C2187451AjH.LJJIJ(2000L);
                C1483410ohn.LJLJJI().LJJJJJ();
                if (((Boolean) C2279011EIh.LJ.getValue()).booleanValue()) {
                    C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
                    C1587540rPk.LL.getClass();
                    if (Intrinsics.LJFF("top", EnumC1587000rOs.FYP_GUIDE_CARD.getScene()) && !C1587540rPk.LLIZLLLIL) {
                        friendsFeedResponse = C1587540rPk.LLIZ;
                    } else {
                        friendsFeedResponse = C1587540rPk.LLILZLL;
                    }
                    if (friendsFeedResponse != null && (list = friendsFeedResponse.friendFeedData) != null && (friendsFeed = (FriendsFeed) C13LP.LJJJLL(list)) != null) {
                        aweme = friendsFeed.getAweme();
                    }
                    c0n0yLJLJJI.LJJLJ(aweme);
                }
            }
        }
        this.LLILLJJLI = false;
    }
}
