package Y;

import X.C098200Yq;
import X.C1204000hR8;
import X.C1324840ka2;
import X.C13BV;
import X.C15438062q;
import X.C1565080qpW;
import X.C1576580r84;
import X.C1589240rSU;
import X.C1596560reI;
import X.C189200o6;
import X.C1C7U;
import X.C20553215be;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2179971ATj;
import X.C2238821Cjw;
import X.C2421209eE;
import X.C309390CAv;
import X.C691710RBh;
import X.C844470XAv;
import X.EnumC1593230rYv;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.business.live.cell.FollowingLiveEventSkylightCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.module.FollowingEcLiveEvent;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.cell.SeriesPanelSquareRecommendItemCell;
import com.ss.android.ugc.aweme.minidrama.common.component.limitedfree.LimitedFreeFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import com.ss.android.ugc.feed.platform.panel.player.PlayerEventPanelComponent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import tiktok.preload.ActivityStartedScene;
import tiktok.preload.DefaultActivityStartedScene;

/* JADX INFO: loaded from: classes25.dex */
public class ARunnableS29S1100000_24 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

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
            case 8:
                run$8(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.1Cjw] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ$0() {
        ?? arrayList;
        List<C1576580r84<?>> listLIZ = C1565080qpW.LIZ(this.s0);
        if (listLIZ != null) {
            arrayList = new ArrayList();
            for (C1576580r84<?> c1576580r84 : listLIZ) {
                if (c1576580r84 instanceof ActivityStartedScene) {
                    arrayList.add(c1576580r84);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (arrayList.isEmpty()) {
            DefaultActivityStartedScene defaultActivityStartedScene = new DefaultActivityStartedScene();
            new WeakReference((Activity) this.l1);
            defaultActivityStartedScene.LIZIZ = null;
            C2238821Cjw c2238821Cjw = C2238821Cjw.LIZ;
            c2238821Cjw.LIZ(Collections.singletonList(defaultActivityStartedScene));
            c2238821Cjw.LIZJ(C2097608Jq.LJ());
            return;
        }
        Activity activity = (Activity) this.l1;
        for (ActivityStartedScene activityStartedScene : arrayList) {
            activityStartedScene.getClass();
            new WeakReference(activity);
            activityStartedScene.getClass();
            activityStartedScene.LIZLLL();
            activityStartedScene.LIZIZ = null;
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : arrayList) {
            Collection collectionLIZIZ = C1565080qpW.LIZIZ(((C1576580r84) obj).LIZJ());
            if (collectionLIZIZ == null) {
                collectionLIZIZ = C13BV.INSTANCE;
            }
            linkedHashMap.put(obj, collectionLIZIZ);
        }
        ?? r0 = C2238821Cjw.LIZ;
        r0.LIZ(arrayList);
        r0.LIZJ(linkedHashMap);
    }

    public final void LIZ$1() {
        String uid;
        FollowingEcLiveEvent ecLiveEvent;
        String daInfo;
        Unit unit;
        User user;
        String str = this.s0;
        HashMap map = new HashMap();
        FollowingLiveEventSkylightCell followingLiveEventSkylightCell = (FollowingLiveEventSkylightCell) this.l1;
        FollowingInterestUser followingInterestUser = followingLiveEventSkylightCell.LLJJJJ;
        if (followingInterestUser == null || (user = followingInterestUser.getUser()) == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        map.put("anchor_id", uid);
        map.put("event_page", C1596560reI.LIZIZ(followingLiveEventSkylightCell.uH2()));
        FollowingInterestUser followingInterestUser2 = followingLiveEventSkylightCell.LLJJJJ;
        if (followingInterestUser2 != null && (ecLiveEvent = followingInterestUser2.getEcLiveEvent()) != null && (daInfo = ecLiveEvent.getDaInfo()) != null) {
            try {
                HashMap map2 = (HashMap) C309390CAv.LIZ(daInfo, HashMap.class);
                if (map2 != null) {
                    map.putAll(map2);
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C20684815ws.LJIILLIIL(str, map);
    }

    public static final void run$0(ARunnableS29S1100000_24 aRunnableS29S1100000_24) {
        boolean zLIZ;
        int width;
        C1C7U.LIZ("SeriesPanelSquareRecommendItemCell@8037.bindItemViewInner$1$1");
        try {
            RemoteImageView remoteImageView = ((SeriesPanelSquareRecommendItemCell) aRunnableS29S1100000_24.l1).LL;
            String str = aRunnableS29S1100000_24.s0;
            int height = -1;
            if (remoteImageView != null) {
                width = remoteImageView.getWidth();
            } else {
                width = -1;
            }
            RemoteImageView remoteImageView2 = ((SeriesPanelSquareRecommendItemCell) aRunnableS29S1100000_24.l1).LL;
            if (remoteImageView2 != null) {
                height = remoteImageView2.getHeight();
            }
            C1324840ka2.LJIIJ(remoteImageView, str, width, height);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeriesPanelSquareRecommendItemCell@8037.bindItemViewInner$1$1");
    }

    public static final void run$1(ARunnableS29S1100000_24 aRunnableS29S1100000_24) {
        boolean zLIZ;
        C1C7U.LIZ("LimitedFreeFragment@7fb2.countDownTimer$1$onTick$1");
        try {
            TuxTextView tuxTextView = ((LimitedFreeFragment) aRunnableS29S1100000_24.l1).LLIZ;
            if (tuxTextView != null) {
                tuxTextView.setText(aRunnableS29S1100000_24.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LimitedFreeFragment@7fb2.countDownTimer$1$onTick$1");
    }

    public static final void run$2(ARunnableS29S1100000_24 aRunnableS29S1100000_24) {
        boolean zLIZ;
        C1C7U.LIZ("PlayerEventPanelComponent@77f8.onRenderFirstFrame$1");
        try {
            C691710RBh.LIZ((PlayerEventPanelComponent) aRunnableS29S1100000_24.l1, "event_on_render_first_frame", aRunnableS29S1100000_24.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayerEventPanelComponent@77f8.onRenderFirstFrame$1");
    }

    public static final void run$3(ARunnableS29S1100000_24 aRunnableS29S1100000_24) {
        try {
            aRunnableS29S1100000_24.LIZ$0();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$4(ARunnableS29S1100000_24 aRunnableS29S1100000_24) {
        boolean zLIZ;
        C1C7U.LIZ("FollowingLiveEventSkylightCell@acbe.logLiveEventSkyLightTrack$1");
        try {
            aRunnableS29S1100000_24.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FollowingLiveEventSkylightCell@acbe.logLiveEventSkyLightTrack$1");
    }

    public static final void run$5(ARunnableS29S1100000_24 aRunnableS29S1100000_24) {
        boolean zLIZ;
        C1C7U.LIZ("SparkLoader@2f3.doEnhancedPreload$1$1$1");
        try {
            C20553215be c20553215be = C20553215be.LIZ;
            Context contextLIZ = C2421209eE.LIZ();
            if (contextLIZ == null) {
                C844470XAv.LIZ.getClass();
                contextLIZ = C844470XAv.LIZ();
            }
            Aweme aweme = (Aweme) aRunnableS29S1100000_24.l1;
            String str = aRunnableS29S1100000_24.s0;
            c20553215be.getClass();
            C20553215be.LIZ(contextLIZ, "homepage_hot", aweme, str, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SparkLoader@2f3.doEnhancedPreload$1$1$1");
    }

    public static final void run$6(ARunnableS29S1100000_24 aRunnableS29S1100000_24) {
        boolean zLIZ;
        C1C7U.LIZ("TabPerfMonitor@66ce.initBottomTabFragmentTrack$1$onFragmentViewCreated$$inlined$doOnPreDraw$1");
        try {
            TabSwitchMetricService.LIZ.getClass();
            TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
            if (tabSwitchMetricServiceLIZ != null) {
                tabSwitchMetricServiceLIZ.LJIIIIZZ(aRunnableS29S1100000_24.s0, EnumC1593230rYv.FIRST_FRAME);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TabPerfMonitor@66ce.initBottomTabFragmentTrack$1$onFragmentViewCreated$$inlined$doOnPreDraw$1");
    }

    public static final void run$7(ARunnableS29S1100000_24 aRunnableS29S1100000_24) {
        boolean zLIZ;
        C1C7U.LIZ("TabPerfMonitor@66ce.initTopTabFragmentTracker$1$onFragmentViewCreated$$inlined$doOnPreDraw$1");
        try {
            TabSwitchMetricService.LIZ.getClass();
            TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
            if (tabSwitchMetricServiceLIZ != null) {
                tabSwitchMetricServiceLIZ.LJIIIIZZ(aRunnableS29S1100000_24.s0, EnumC1593230rYv.FIRST_FRAME);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TabPerfMonitor@66ce.initTopTabFragmentTracker$1$onFragmentViewCreated$$inlined$doOnPreDraw$1");
    }

    public static final void run$8(ARunnableS29S1100000_24 aRunnableS29S1100000_24) {
        C1589240rSU c1589240rSU = (C1589240rSU) aRunnableS29S1100000_24.l1;
        String str = aRunnableS29S1100000_24.s0;
        c1589240rSU.getClass();
        if (!TextUtils.isEmpty(str)) {
            FeedRecommendFragment feedRecommendFragment = c1589240rSU.LL;
            if (!feedRecommendFragment.LLJJJJJIL) {
                feedRecommendFragment.oS(Boolean.FALSE);
                c1589240rSU.LL.LLJJJJJIL = true;
            }
        }
    }

    public ARunnableS29S1100000_24(Object obj, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
