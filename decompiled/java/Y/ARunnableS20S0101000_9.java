package Y;

import X.C098200Yq;
import X.C0NM5;
import X.C0NM7;
import X.C0NMA;
import X.C0NMC;
import X.C0SRA;
import X.C1017070cZd;
import X.C189200o6;
import X.C1C7U;
import X.C2188811AlT;
import X.C23250099c;
import X.C591500NHw;
import X.C619350OQz;
import X.C630490OoB;
import X.C710360Rti;
import X.C793770VBv;
import X.InterfaceC497601wk;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitHorizontalCardAssem;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.topic.ui.TopicFloatingActionAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS20S0101000_9 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        boolean z = C0SRA.LIZ;
        Aweme aweme = (Aweme) this.l0;
        try {
            C793770VBv.LJII("ttk_cd_monitor_normal_event", C591500NHw.LIZ(new Pair("event", "aweme_container_monitor"), new Pair("content", Integer.valueOf(aweme.getAwemeType())), new Pair("content2", AwemeBizExtKt.getContentDiffType(aweme)), new Pair("is_live", Boolean.valueOf(AwemeSaaSExtKt.isLive(aweme))), new Pair("is_ecom", Boolean.valueOf(C1017070cZd.LJLL(aweme))), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(this.i1))), null, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZ$1() {
        ArrayList arrayList;
        C0NMA c0nma = C0NMA.LIZ;
        FriendsFeedResponse friendsFeedResponse = (FriendsFeedResponse) this.l0;
        int i = this.i1;
        c0nma.getClass();
        FriendsFeedResponse friendsFeedResponseLJI = FriendsFeedResponse.LJI(friendsFeedResponse, null, 1023);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert friends feed to database, origin feedList size = ");
        List<FriendsFeed> list = friendsFeedResponseLJI.friendFeedData;
        sbLIZ.append(list != null ? Integer.valueOf(list.size()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        if (((Boolean) C0NMA.LJ.getValue()).booleanValue()) {
            List<FriendsFeed> list2 = friendsFeedResponseLJI.friendFeedData;
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (FriendsFeed friendsFeed : list2) {
                    Aweme aweme = friendsFeed.getAweme();
                    if (aweme != null && !C1017070cZd.LJJLIIJ(aweme)) {
                        arrayList2.add(friendsFeed);
                    }
                }
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = null;
            }
            friendsFeedResponseLJI.friendFeedData = arrayList;
        }
        List<FriendsFeed> list3 = friendsFeedResponseLJI.friendFeedData;
        int size = list3 != null ? list3.size() : 0;
        if (size != 0) {
            C23250099c.LIZLLL((InterfaceC497601wk) C0NMA.LIZJ.getValue(), null, null, new C0NM7(size, i, friendsFeedResponseLJI, null), 3);
        } else if (i == C0NMC.REFRESH.getType()) {
            C23250099c.LIZLLL((InterfaceC497601wk) C0NMA.LIZJ.getValue(), null, null, new C0NM5(null), 3);
        }
    }

    public final void LIZ$2() {
        View view;
        Object parent = ((View) this.l0).getParent();
        if ((parent instanceof View) && (view = (View) parent) != null && ((View) this.l0).isAttachedToWindow()) {
            Rect rect = new Rect();
            ((View) this.l0).getHitRect(rect);
            int i = -this.i1;
            rect.inset(i, i);
            TouchDelegate touchDelegate = new TouchDelegate(rect, (View) this.l0);
            TouchDelegate touchDelegate2 = view.getTouchDelegate();
            if (touchDelegate2 instanceof C630490OoB) {
                ((C630490OoB) touchDelegate2).LIZ.add(touchDelegate);
                return;
            }
            C630490OoB c630490OoB = new C630490OoB(view);
            c630490OoB.LIZ.add(touchDelegate);
            view.setTouchDelegate(c630490OoB);
        }
    }

    public static final void run$0(ARunnableS20S0101000_9 aRunnableS20S0101000_9) {
        boolean zLIZ;
        C1C7U.LIZ("DataChangeReporter@8144.reportAbortAddItem$1");
        try {
            aRunnableS20S0101000_9.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DataChangeReporter@8144.reportAbortAddItem$1");
    }

    public static final void run$1(ARunnableS20S0101000_9 aRunnableS20S0101000_9) {
        DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) aRunnableS20S0101000_9.l0;
        int i = aRunnableS20S0101000_9.i1;
        detailFragmentPanel.getClass();
        C1C7U.LIZ("DetailFragmentPanel@5b0b.onLoadLatestResult$1L");
        VerticalViewPager verticalViewPager = detailFragmentPanel.LLJJIJI;
        if (verticalViewPager != null) {
            detailFragmentPanel.LLJLILLLLZIIL = i;
            verticalViewPager.LJJIJLIJ(i, false);
        }
        C1C7U.LIZIZ("DetailFragmentPanel@5b0b.onLoadLatestResult$1L");
    }

    public static final void run$2(ARunnableS20S0101000_9 aRunnableS20S0101000_9) {
        Context context = (Context) aRunnableS20S0101000_9.l0;
        int i = aRunnableS20S0101000_9.i1;
        C1C7U.LIZ("PlayerController@7763.preloadFeedLayout$1L");
        C710360Rti.LIZIZ(i, context);
        C1C7U.LIZIZ("PlayerController@7763.preloadFeedLayout$1L");
    }

    public static final void run$3(ARunnableS20S0101000_9 aRunnableS20S0101000_9) {
        boolean zLIZ;
        C1C7U.LIZ("FriendsFeedListApi$Companion@1650.getFriendsFeedList$2");
        try {
            aRunnableS20S0101000_9.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendsFeedListApi$Companion@1650.getFriendsFeedList$2");
    }

    public static final void run$4(ARunnableS20S0101000_9 aRunnableS20S0101000_9) {
        boolean zLIZ;
        C1C7U.LIZ("TopicFloatingActionAssem@bcb7.onPageSelected$1");
        try {
            TopicFloatingActionAssem topicFloatingActionAssem = (TopicFloatingActionAssem) aRunnableS20S0101000_9.l0;
            topicFloatingActionAssem.LLJJJJJIL = aRunnableS20S0101000_9.i1;
            topicFloatingActionAssem.tp();
            ((TopicFloatingActionAssem) aRunnableS20S0101000_9.l0).lp().animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TopicFloatingActionAssem@bcb7.onPageSelected$1");
    }

    public static final void run$5(ARunnableS20S0101000_9 aRunnableS20S0101000_9) {
        boolean zLIZ;
        C1C7U.LIZ("PoiRevisitHorizontalCardAssem@80a6.initObserver$4$1$1");
        try {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((PoiRevisitHorizontalCardAssem) aRunnableS20S0101000_9.l0).LLJJIJI;
            if (viewOnAttachStateChangeListenerC20631115oD != null) {
                viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(aRunnableS20S0101000_9.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiRevisitHorizontalCardAssem@80a6.initObserver$4$1$1");
    }

    public static final void run$6(ARunnableS20S0101000_9 aRunnableS20S0101000_9) {
        boolean zLIZ;
        C1C7U.LIZ("BulletinPollContentWidget@7aae.performOptionVotedAnimation$2");
        try {
            int i = aRunnableS20S0101000_9.i1;
            if (i >= 0) {
                C619350OQz c619350OQz = (C619350OQz) aRunnableS20S0101000_9.l0;
                LinearLayout linearLayout = (LinearLayout) c619350OQz.LJIILL.findViewById(R.id.d2x);
                int childCount = linearLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (i2 != i) {
                        c619350OQz.LJI(-1, linearLayout.getChildAt(i2));
                    }
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BulletinPollContentWidget@7aae.performOptionVotedAnimation$2");
    }

    public static final void run$7(ARunnableS20S0101000_9 aRunnableS20S0101000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SwitchAccountTouchAreaExtKt@a2a3.expandTouchAreaDp$1");
        try {
            aRunnableS20S0101000_9.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SwitchAccountTouchAreaExtKt@a2a3.expandTouchAreaDp$1");
    }

    public ARunnableS20S0101000_9(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
