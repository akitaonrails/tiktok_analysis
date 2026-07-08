package X;

import Y.AObjectS350S0100000_7;
import Y.AObjectS382S0100000_7;
import Y.AObjectS60S0000000_7;
import Y.AObserverS211S0100000_7;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS83S0000000_3;
import Y.ARunnableS90S0000000_11;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.feed.api.LiveRoomPageChangeEvent;
import com.bytedance.android.feed.api.NearbyReturnEvent;
import com.bytedance.android.feed.api.TopLiveSkylightVisibilityChannel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.RoomStatus;
import com.bytedance.android.live.browser.IHybridContainerManageService;
import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.room.LiveCloseWidgetLoadEvent;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.dataChannel.TopTabPageShowEvent;
import com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.feed.LiveInfeedSkylightEntranceSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveInfeedTopliveTabEntranceSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveNearbyTabSetting;
import com.bytedance.android.livesdk.livesetting.feed.TopLivePreFetchPoolSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.DefaultLandingHangoutPreloadOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutRoomFeedEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLiveIterationPhase1Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiTopLiveEnterConfigOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.android.livesdk.livesetting.other.AppLogFlushOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveInteractViewAsyncOpt;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayActivityLeaksOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveTopTabSwitch;
import com.bytedance.android.livesdk.livesetting.performance.LiveViewTreeOptSetting;
import com.bytedance.android.livesdk.livesetting.skylight.LiveTopLiveNotificationSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCadSmoothExitSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDedupOptExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNotSaveFragmentsSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveRepetitionTtlSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveRoomBackLiveCardFix;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveRoomBackLiveCardOpt;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.applog.AppLog;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.recycleelement.RecycleLayeredElementManger;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.SAFContextThemeConfig;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.app.IAwemeApplicationService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveHostOuterService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LivePlayActivity;
import com.ss.android.ugc.aweme.live.LivePlayRootFragment;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS551S0100000_7;
import webcast.api.feed.LiveTab;
import webcast.api.feed.TopliveNoticeUnreadCountData;

/* JADX INFO: renamed from: X.0Irc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479740Irc implements InterfaceC480020Is4, InterfaceC475300IkS {
    public static final String LJJJLIIL = C479740Irc.class.getName();
    public static long LJJJLL = 0;
    public static long LJJJLZIJ = 0;
    public static volatile C170300l3 LJJJZ = null;
    public final InterfaceC479780Irg<?> LIZ;
    public InterfaceC479770Irf LIZIZ;
    public InterfaceC477120InO LIZJ;
    public final String LIZLLL;
    public Rect LJ;
    public C0IEG LJFF;
    public C0IKH LJI;
    public C472280Ifa LJII;
    public boolean LJIIIIZZ;
    public C480130IsF LJIIIZ;
    public C21546719Ub LJIIJ;
    public C479680IrW LJIIJJI;
    public C477070InJ LJIIL;
    public final C477580Io8 LJIILIIL;
    public C479760Ire LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public int LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public C485720J3a LJJI;
    public C475460Iki LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public String LJJIIJZLJL;
    public String LJJIIZ;
    public InterfaceC342470Dbh LJJIIZI;
    public boolean LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public long LJJIJIL;
    public final BPEAHandler LJJIJL;
    public final List<InterfaceC484050IyZ> LJJIJLIJ;
    public final ArrayList<InterfaceC362610EJn> LJJIL;
    public boolean LJJIZ;
    public EnterRoomConfig LJJJ;
    public int LJJJI;
    public final C479820Irk LJJJIL;
    public final C661160PwY LJJJJ;
    public final C521860KdM LJJJJI;
    public final ARunnableS90S0000000_11 LJJJJIZL;
    public final ARunnableS107S0100000_7 LJJJJJ;
    public EnterRoomConfig LJJJJJL;
    public final C479730Irb LJJJJL;
    public int LJJJJLI;
    public int LJJJJLL;
    public int LJJJJZ;
    public boolean LJJJJZI;

    @Override // X.InterfaceC475300IkS
    public final void LJIIIZ() {
        this.LJIJ = false;
    }

    public static InterfaceC487230J8v LJIL() {
        if (LJJJZ == null) {
            synchronized (C479740Irc.class) {
                try {
                    if (LJJJZ == null) {
                        LJJJZ = C170300l3.LIZJ;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJJJZ;
    }

    @Override // X.InterfaceC475300IkS
    public final void LJFF() {
        C21546719Ub c21546719Ub = this.LJIIJ;
        if (c21546719Ub != null) {
            this.LJFF.aC(c21546719Ub);
            this.LJFF.a4(this.LJJJIL);
        }
    }

    @Override // X.InterfaceC475300IkS
    public final String LJI() {
        C21546719Ub c21546719Ub = this.LJIIJ;
        return c21546719Ub != null ? this.LIZIZ.H2(c21546719Ub.getSelectedTabPosition()) : "";
    }

    @Override // X.InterfaceC475300IkS
    public final void LJIIJJI() {
        C479680IrW c479680IrW = this.LJIIJJI;
        if (c479680IrW != null) {
            c479680IrW.setCloseWidgetDelegate(null);
        }
    }

    @Override // X.InterfaceC475300IkS
    public final void LJIIL() {
        C21546719Ub c21546719Ub = this.LJIIJ;
        if (c21546719Ub != null && c21546719Ub.LJIIJ(0) != null) {
            C21546719Ub c21546719Ub2 = this.LJIIJ;
            c21546719Ub2.LJIILJJIL(c21546719Ub2.LJIIJ(0), true);
        }
        C786410Ut5.i0(this.LJIIL, 0);
    }

    @Override // X.InterfaceC475300IkS
    public final boolean LJIILIIL() {
        boolean z;
        if (this.LJJIJIL == -3) {
            z = true;
            EnterRoomConfig enterRoomConfig = C0IL2.LIZ.LIZ().mEnterRoomConfig;
            boolean z2 = TextUtils.equals(enterRoomConfig.mRoomsData.enterFromMerge, "live_merge") && TextUtils.equals(enterRoomConfig.mRoomsData.enterMethod, "live_cover");
            C19GS c19gsU6 = this.LIZ.U6();
            C475460Iki c475460Iki = new C475460Iki(c19gsU6, z2, null, new AObjectS382S0100000_7(this, 13));
            this.LJJIFFI = c475460Iki;
            if (z2) {
                c475460Iki.LJII = false;
            }
            if (c475460Iki.LJII && c19gsU6 != null) {
                C12ES.LJIILL(0, c475460Iki.LJFF);
            }
            C475460Iki c475460Iki2 = this.LJJIFFI;
            c475460Iki2.LIZ(0);
            C12ES.LJIILL(c475460Iki2.LJI ? 0 : 8, c475460Iki2.LJIIIZ);
            C475460Iki c475460Iki3 = this.LJJIFFI;
            if (c475460Iki3.LJIIIIZZ && c475460Iki3.LIZ != null) {
                C12ES.LJIILL(0, c475460Iki3.LJ);
            }
        } else {
            z = false;
            LJJIFFI();
            LJJII();
            C475460Iki c475460Iki4 = this.LJJIFFI;
            if (c475460Iki4 != null) {
                c475460Iki4.LIZIZ();
                return false;
            }
        }
        return z;
    }

    @Override // X.InterfaceC475300IkS
    public final boolean LJIILJJIL() {
        InterfaceC479770Irf interfaceC479770Irf = this.LIZIZ;
        if (interfaceC479770Irf != null) {
            return interfaceC479770Irf.M2();
        }
        return false;
    }

    public final Map<String, String> LJIJJLI() {
        C0IEG c0ieg = this.LJFF;
        if (c0ieg == null || c0ieg.getCurrentFragment() == null) {
            return null;
        }
        InterfaceC466370IQp currentFragment = this.LJFF.getCurrentFragment();
        if (currentFragment.f8() == null) {
            return null;
        }
        Room roomF8 = currentFragment.f8();
        HashMap map = new HashMap();
        map.put("room_id", Long.toString(roomF8.getId()));
        if (roomF8.getOwner() != null && roomF8.getOwner().getAvatarThumb() != null) {
            ImageModel avatarThumb = roomF8.getOwner().getAvatarThumb();
            HashMap map2 = new HashMap();
            map2.put("uri", avatarThumb.mUri);
            map2.put("url_list", C842240X2g.LIZ(avatarThumb));
            map.put("avatar_thumb", C08JS.LIZLLL(map2));
        }
        if (currentFragment.Eq() != null && currentFragment.Eq().mRoomsData.adLiveEnterRoomConfig != null) {
            map.put("adLiveJson", C08JS.LIZLLL(currentFragment.Eq().mRoomsData.adLiveEnterRoomConfig));
        }
        return map;
    }

    public final int LJJI() {
        C19GS c19gsU6 = this.LIZ.U6();
        TypedValue typedValue = new TypedValue();
        c19gsU6.getTheme().resolveAttribute(R.attr.kd, typedValue, true);
        return typedValue.data;
    }

    public final void LJJIFFI() {
        C475460Iki c475460Iki = this.LJJIFFI;
        if (c475460Iki != null) {
            c475460Iki.LJII = false;
            C12ES.LJIILL(8, c475460Iki.LJFF);
            c475460Iki.LJ();
        }
    }

    public final void LJJII() {
        C475460Iki c475460Iki = this.LJJIFFI;
        if (c475460Iki != null) {
            c475460Iki.LIZJ();
            C475460Iki c475460Iki2 = this.LJJIFFI;
            if (c475460Iki2.LJI || c475460Iki2.LJIIIIZZ || c475460Iki2.LJII) {
                return;
            }
            this.LJJIFFI = null;
        }
    }

    public final void LJJIZ() {
        FragmentManager supportFragmentManager = this.LIZ.U6().getSupportFragmentManager();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveDrawerHelper_drawer_fragment_");
        sbLIZ.append(this.LJJJI);
        Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        if (fragmentLJJJJZI != null) {
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
            c19ehLJIIJ.LJIIJ();
        }
        C472280Ifa c472280Ifa = this.LJII;
        if (c472280Ifa != null) {
            c472280Ifa.setDrawerLayout(null);
        }
        this.LJI = null;
    }

    public final void LJJJJ() {
        if (this.LJIIJ != null) {
            DataChannelGlobal.LLILZ.BQ2(this, this.LIZ.xL(), LiveRoomPageChangeEvent.class, new AObjectS350S0100000_7(this, 101));
        }
        DataChannelGlobal.LLILZ.BQ2(this, this.LIZ.xL(), TopLiveSkylightVisibilityChannel.class, new AObjectS350S0100000_7(this, 102));
        DataChannelGlobal.LLILZ.BQ2(this, this.LIZ.xL(), LiveCloseWidgetLoadEvent.class, new AObjectS350S0100000_7(this, 103));
        DataChannelGlobal.LLILZ.BQ2(this, this.LIZ.xL(), TopTabPageShowEvent.class, new AObjectS350S0100000_7(this, 104));
        DataChannelGlobal.LLILZ.BQ2(this, this.LIZ.xL(), NearbyReturnEvent.class, new AObjectS350S0100000_7(this, 105));
    }

    public final void LJJJJI() {
        this.LJIIIZ = (C480130IsF) this.LIZ.U6().findViewById(R.id.tru);
        if (HangoutRoomFeedEnableSetting.INSTANCE.isEnable() && LJIILJJIL()) {
            this.LJIIIZ.setBackgroundColor(LJJI());
        }
        this.LJIIIZ.setCloseSkyLight(new AObjectS60S0000000_7(23));
    }

    public static Pair LJJ() {
        long jMax;
        long jLongValue;
        long j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C479440Ir8 c479440Ir8 = C478750Iq1.LIZ;
        if (c479440Ir8 == null) {
            return new Pair(new C479720Ira("metrics_error", "none", "topLiveLinkTrace is null"), new C479710IrZ(0L, "metrics_error", 0L, 0L, "none", "topLiveLinkTrace is null"));
        }
        C479450Ir9 c479450Ir9 = c479440Ir8.LIZ;
        c479450Ir9.getClass();
        C479720Ira c479720Ira = new C479720Ira("success", c479450Ir9.LJII, c479450Ir9.LIZ());
        C479450Ir9 c479450Ir92 = c479440Ir8.LIZIZ;
        String str = c479450Ir92.LIZIZ;
        int iHashCode = str.hashCode();
        if (iHashCode == -1867169789 ? str.equals("success") : iHashCode == 96634189 ? str.equals("empty") : iHashCode == 96784904 && str.equals("error")) {
            Long l = c479450Ir92.LJ;
            long jLongValue2 = l != null ? l.longValue() : c479450Ir92.LIZJ;
            Long l2 = c479450Ir92.LJI;
            jMax = Math.max(jLongValue2, l2 != null ? l2.longValue() : c479450Ir92.LIZJ);
        } else {
            jMax = jCurrentTimeMillis;
        }
        long j2 = jMax - c479450Ir92.LIZJ;
        if (j2 < 0) {
            j2 = 0;
        }
        Long l3 = c479450Ir92.LIZLLL;
        if (l3 != null) {
            long jLongValue3 = l3.longValue();
            Long l4 = c479450Ir92.LJ;
            jLongValue = (l4 != null ? l4.longValue() : jCurrentTimeMillis) - jLongValue3;
        } else {
            jLongValue = 0;
        }
        Long l5 = c479450Ir92.LJFF;
        if (l5 != null) {
            long jLongValue4 = l5.longValue();
            Long l6 = c479450Ir92.LJI;
            if (l6 != null) {
                jCurrentTimeMillis = l6.longValue();
            }
            j = jCurrentTimeMillis - jLongValue4;
        } else {
            j = 0;
        }
        if (j2 < 0) {
            j2 = 0;
        }
        Long lValueOf = Long.valueOf(j2);
        if (jLongValue < 0) {
            jLongValue = 0;
        }
        C443120HZe c443120HZe = new C443120HZe(lValueOf, Long.valueOf(jLongValue), Long.valueOf(j >= 0 ? j : 0L));
        C479710IrZ c479710IrZ = new C479710IrZ(((Number) c443120HZe.getFirst()).longValue(), c479450Ir92.LIZIZ, ((Number) c443120HZe.getSecond()).longValue(), ((Number) c443120HZe.getThird()).longValue(), c479450Ir92.LJII, c479450Ir92.LIZ());
        C478750Iq1.LIZ = null;
        return new Pair(c479720Ira, c479710IrZ);
    }

    public final void LJJIII() {
        C1AKK liteService = Live.getLiteService();
        if (liteService != null) {
            C0IKH c0ikhTf = liteService.tf(this.LIZ.U6(), this.LJII, this.LJJJI, EnumC469210Iad.LIVE_CONTAINER);
            this.LJI = c0ikhTf;
            if (c0ikhTf instanceof InterfaceC469390Iav) {
                ((InterfaceC469390Iav) this.LJI).tK(this.LIZ.U6().findViewById(R.id.iiv));
            }
        }
    }

    public final void LJJIIJZLJL() {
        List<ActivityManager.AppTask> appTasks;
        Activity[] activityStack = ActivityStack.getActivityStack();
        if (activityStack != null) {
            if ((activityStack.length == 1 && activityStack[0].equals(this.LIZ.U6())) || (appTasks = ((ActivityManager) C786410Ut5.I2(this.LIZ.U6(), "activity")).getAppTasks()) == null || appTasks.size() <= 1) {
                return;
            }
            ((ActivityManager.AppTask) ListProtector.get(appTasks, appTasks.size() - 1)).moveToFront();
        }
    }

    @Override // X.InterfaceC475300IkS
    public final EnterRoomConfig LIZIZ() {
        return this.LJJJJJL;
    }

    @Override // X.InterfaceC475300IkS
    public final C477580Io8 LIZJ() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC475300IkS
    public final C477070InJ LIZLLL() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC475300IkS
    public final boolean LJIILL() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC475300IkS
    public final C0IEG LJIILLIIL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC475300IkS
    public final C475460Iki c1() {
        return this.LJJIFFI;
    }

    @Override // X.InterfaceC475300IkS
    public final long getRoomId() {
        return this.LJJIJIL;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0Irk] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0PwY] */
    public C479740Irc(InterfaceC479780Irg<?> interfaceC479780Irg) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scene_live_LivePlayActivity");
        sbLIZ.append(hashCode());
        this.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
        this.LJIIIIZZ = false;
        this.LJIILIIL = new C477580Io8();
        this.LJIILL = false;
        this.LJIILLIIL = false;
        this.LJIIZILJ = false;
        this.LJIJ = true;
        this.LJIJI = true;
        this.LJIJJ = 0;
        this.LJIJJLI = false;
        this.LJIL = false;
        this.LJJ = false;
        this.LJJII = false;
        this.LJJIII = false;
        this.LJJIIJ = false;
        this.LJJIIZI = null;
        this.LJJIJ = false;
        this.LJJIJIIJI = -1;
        this.LJJIJIIJIL = -1;
        this.LJJIJIL = 0L;
        this.LJJIJL = new BPEAHandler(Looper.myLooper());
        this.LJJIJLIJ = new ArrayList();
        this.LJJIL = new ArrayList<>();
        this.LJJIZ = false;
        this.LJJJI = R.id.n3v;
        this.LJJJIL = new C0IGQ() { // from class: X.0Irk
            @Override // X.C0IGQ
            public final boolean onBackPressed() {
                C21546719Ub c21546719Ub;
                C479740Irc c479740Irc = this.LL;
                C0IEG c0ieg = c479740Irc.LJFF;
                if (c0ieg == null || c0ieg.Ae() || !c479740Irc.LJIIZILJ || (c21546719Ub = c479740Irc.LJIIJ) == null || c479740Irc.LJIIL == null || c21546719Ub.getTabCount() <= 1) {
                    return false;
                }
                C20441214yg.LIZIZ(C479740Irc.LJJJLIIL, "onBackPressed openLiveFromTab2=true");
                C21546719Ub c21546719Ub2 = c479740Irc.LJIIJ;
                c21546719Ub2.LJIILJJIL(c21546719Ub2.LJIIJ(1), false);
                C786410Ut5.i0(c479740Irc.LJIIL, 0);
                c479740Irc.LJIIZILJ = false;
                return true;
            }
        };
        this.LJJJJ = new InterfaceC362610EJn() { // from class: X.0PwY
            @Override // X.InterfaceC362610EJn
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
                if (c2174741A9g.LJIILJJIL() && i == 24) {
                    c2174741A9g.LJIILL("other", EnumC655500PnQ.TURN_UP_VOLUME, C0SVP.STYLE_NO_BUTTON);
                    return false;
                }
                if (!c2174741A9g.LJIILJJIL() || i != 25) {
                    return false;
                }
                c2174741A9g.LJIILL("other", EnumC655500PnQ.TURN_DOWN_VOLUME, C0SVP.STYLE_NO_BUTTON);
                return false;
            }
        };
        this.LJJJJI = new C521860KdM(this, 13);
        this.LJJJJIZL = new ARunnableS90S0000000_11(1);
        this.LJJJJJ = new ARunnableS107S0100000_7(this, 139);
        this.LJJJJJL = null;
        this.LJJJJL = new C479730Irb();
        this.LJJJJLI = -1;
        this.LJJJJLL = -1;
        this.LJJJJZ = -1;
        this.LJJJJZI = false;
        this.LIZ = interfaceC479780Irg;
    }

    public static void LJJJI(EnterRoomConfig enterRoomConfig) {
        if (TextUtils.equals(enterRoomConfig.mRoomsData.enterFromMerge, "homepage_hot")) {
            C924810aAp.LJ().LJIIL = true;
        } else {
            if (!TextUtils.equals(enterRoomConfig.mRoomsData.enterFromMerge, "homepage_follow")) {
                return;
            }
            C924810aAp.LJ().LJIIL = true;
        }
    }

    @Override // X.InterfaceC475300IkS
    public final void F2(boolean z) {
        this.LIZIZ.F2(z);
    }

    @Override // X.InterfaceC475300IkS
    public final int LIZ(EnterRoomConfig enterRoomConfig) {
        int iLIZ = this.LIZIZ.LIZ(enterRoomConfig);
        if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.getValue().alignOnline && iLIZ == 1 && !this.LJJJJZI) {
            return 0;
        }
        return iLIZ;
    }

    @Override // X.InterfaceC475300IkS
    public final void LJ(C479950Irx c479950Irx) {
        C477070InJ c477070InJ = this.LJIIL;
        if (c477070InJ != null) {
            c477070InJ.setOnVisibilityChangeListener(c479950Irx);
        } else {
            this.LIZJ = c479950Irx;
        }
    }

    @Override // X.InterfaceC475300IkS
    public final void LJII(int i) {
        if (LiveNearbyTabSetting.INSTANCE.enable() || HangoutRoomFeedEnableSetting.INSTANCE.isEnable()) {
            LJJIZ();
        }
        this.LJJJI = i;
    }

    @Override // X.InterfaceC475300IkS
    public final void LJIIJ(C472280Ifa c472280Ifa) {
        this.LJII = c472280Ifa;
        if (c472280Ifa != null) {
            c472280Ifa.setGetCurTabPage(new InterfaceC2453409jQ() { // from class: X.0Irm
                @Override // X.InterfaceC2453409jQ
                public final Object get() {
                    C479740Irc c479740Irc = this.LIZ;
                    C21546719Ub c21546719Ub = c479740Irc.LJIIJ;
                    return c21546719Ub != null ? c479740Irc.LIZIZ.H2(c21546719Ub.getSelectedTabPosition()) : "";
                }
            });
        }
    }

    @Override // X.InterfaceC475300IkS
    public final Pair LJIIZILJ(EnterRoomConfig enterRoomConfig) {
        C0IEG c0iegLJIJ = LJIJ(enterRoomConfig);
        this.LJFF = c0iegLJIJ;
        c0iegLJIJ.qJ(this.LIZ);
        C0IEG c0ieg = this.LJFF;
        return new Pair(c0ieg, c0ieg.LLLIILIL());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0IrY] */
    public final C0IEG LJIJ(EnterRoomConfig enterRoomConfig) {
        C0IEG c0iegFk = Live.getService().fk(enterRoomConfig);
        c0iegFk.ZO(new InterfaceC2453409jQ() { // from class: X.0IrY
            @Override // X.InterfaceC2453409jQ
            public final Object get() {
                C21546719Ub c21546719Ub;
                C479740Irc c479740Irc = this.LIZ;
                InterfaceC479770Irf interfaceC479770Irf = c479740Irc.LIZIZ;
                return (interfaceC479770Irf == null || (c21546719Ub = c479740Irc.LJIIJ) == null) ? "" : interfaceC479770Irf.H2(c21546719Ub.getSelectedTabPosition());
            }
        });
        return c0iegFk;
    }

    public final void LJIJI(EnterRoomConfig enterRoomConfig) {
        if (LiveTopTabSwitch.isEnable() || LiveNearbyTabSetting.INSTANCE.enable()) {
            if ((LiveInfeedTopliveTabEntranceSetting.matchEntrance(enterRoomConfig) || LiveInfeedSkylightEntranceSetting.isNearbyPage(enterRoomConfig)) && MultiGuestTopLiveIterationPhase1Setting.isEnable()) {
                try {
                    C19GS c19gsU6 = this.LIZ.U6();
                    if (c19gsU6 != null) {
                        if (!c19gsU6.isFinishing() && (c19gsU6 instanceof LivePlayActivity)) {
                            c19gsU6.finish();
                        } else if (!c19gsU6.isFinishing() && (c19gsU6 instanceof InterfaceC1218550hob)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("current activity is MainActivity, enter_from_merge:");
                            sbLIZ.append(enterRoomConfig.mRoomsData.enterFromMerge);
                            sbLIZ.append(";enter_method:");
                            sbLIZ.append(enterRoomConfig.mRoomsData.enterMethod);
                            C20441214yg.LIZIZ("legolas", C2188811AlT.LIZIZ(sbLIZ));
                            return;
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJFF(LJJJLIIL, "finish LivePlayActivity error:", e);
                }
                ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).watchLive(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context(), enterRoomConfig);
            }
        }
    }

    public final void LJIJJ(Runnable runnable) {
        String stringValue;
        String stringValue2;
        String str;
        int i;
        RoomStatus roomStatus;
        C0IEG c0ieg;
        if (this.LIZ.mK().LIZLLL()) {
            stringValue = this.LIZ.mK().getStringValue("backurl");
            stringValue2 = this.LIZ.mK().getStringValue("back_router_schema");
        } else {
            stringValue = "";
            stringValue2 = "";
        }
        if (!this.LJIL && (c0ieg = this.LJFF) != null && c0ieg.getCurrentFragment() != null) {
            this.LJFF.getCurrentFragment().tF();
        }
        C1440005kM.LIZ(new C2037107yT(this.LJJIIJZLJL, this.LJJIIZ));
        if (TextUtils.isEmpty(stringValue)) {
            InterfaceC479830Irl<?> interfaceC479830IrlMK = this.LIZ.mK();
            if (interfaceC479830IrlMK.LIZLLL() && (roomStatus = (RoomStatus) interfaceC479830IrlMK.LIZ()) != null) {
                C479910Irt c479910Irt = new C479910Irt();
                c479910Irt.LIZIZ = roomStatus.anchorId;
                c479910Irt.LIZ = roomStatus.roomId;
                c479910Irt.LIZJ = roomStatus.isFinish;
                C1440005kM.LIZ(c479910Irt);
                ((ILiveHostOuterService) PluggableExtentionKt.pluggableSpi(ILiveHostOuterService.class)).LIZJ(this.LIZ.U6(), c479910Irt.LIZJ, this.LJIIIIZZ);
            }
            if (this.LJ != null && this.LIZ.mK().LIZLLL()) {
                long longValue = this.LIZ.mK().getLongValue("current_room_id");
                boolean booleanValue = this.LIZ.mK().getBooleanValue("has_page_slide");
                if (longValue > 0 && booleanValue) {
                    C1440005kM.LIZ(new C479940Irw(longValue));
                }
            }
        }
        int i2 = 0;
        boolean z = true;
        if (!TextUtils.isEmpty(stringValue2)) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LIZ.Jh(), stringValue2);
            smartRouteBuildRoute.withParam("check_activity_finish", true);
            smartRouteBuildRoute.open();
        } else if (!((IAwemeApplicationService) PluggableExtentionKt.pluggableSpi(IAwemeApplicationService.class)).isAppHot() && this.LJJIJ && this.LIZ.U6().isTaskRoot()) {
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(this.LIZ.Jh(), "//main");
            smartRouteBuildRoute2.addFlags(67108864);
            smartRouteBuildRoute2.withParam("tab", this.LJJIJIIJI);
            if (this.LJJIJIIJI != 0) {
                str = "For You";
            } else {
                str = "Following";
            }
            smartRouteBuildRoute2.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", str);
            smartRouteBuildRoute2.open();
        } else if (((ILiveOuterService) PluggableExtentionKt.pluggableSpi(ILiveOuterService.class)).v3().Na()) {
            ((IHybridContainerManageService) C1161920gLG.LIZJ(IHybridContainerManageService.class)).S82(false);
            SmartRoute smartRouteBuildRoute3 = SmartRouter.buildRoute(this.LIZ.Jh(), "//main");
            smartRouteBuildRoute3.withParam("tab", 1);
            smartRouteBuildRoute3.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            smartRouteBuildRoute3.addFlags(67108864);
            smartRouteBuildRoute3.open();
        } else if (this.LJJIJIIJIL == 1 && ((ILiveOuterService) PluggableExtentionKt.pluggableSpi(ILiveOuterService.class)).v3().re()) {
            LJJIIJZLJL();
            SmartRoute smartRouteBuildRoute4 = SmartRouter.buildRoute(this.LIZ.Jh(), "//main");
            smartRouteBuildRoute4.withParam("tab", 0);
            smartRouteBuildRoute4.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            smartRouteBuildRoute4.addFlags(67108864);
            smartRouteBuildRoute4.open();
        } else if (!TextUtils.isEmpty(stringValue)) {
            C1619690sFb.LIZ(this.LIZ.U6(), null);
        } else if (this.LIZ.U6().isTaskRoot() && this.LIZ.mK().LIZLLL()) {
            C1619690sFb.LIZ(this.LIZ.U6(), null);
            LJJIIJZLJL();
        }
        AppLogFlushOptSetting.INSTANCE.leaveRoomFlush();
        runnable.run();
        if (!LiveRoomBackLiveCardFix.INSTANCE.fixed()) {
            InterfaceC479830Irl<?> interfaceC479830IrlMK2 = this.LIZ.mK();
            if (interfaceC479830IrlMK2.LIZLLL()) {
                boolean booleanValue2 = interfaceC479830IrlMK2.getBooleanValue("intent_smooth_exit_room");
                boolean zEnable = LiveRoomBackLiveCardOpt.INSTANCE.enable();
                if (!LiveCadSmoothExitSetting.INSTANCE.enable() || !booleanValue2) {
                    z = false;
                }
                if (interfaceC479830IrlMK2.getBooleanValue("intent_exit_and_swipe_feed")) {
                    C786410Ut5.be(this.LIZ.U6(), 0, 0);
                    return;
                }
                if ((!zEnable && !z) || !this.LJJIII) {
                    return;
                }
                C1440005kM.LIZ(new C08LW(Long.valueOf(interfaceC479830IrlMK2.getLongValue("intent_cur_enter_room_id")), zEnable, z));
                if (!z) {
                    return;
                }
                C786410Ut5.be(this.LIZ.U6(), 0, 0);
                return;
            }
            return;
        }
        if (this.LJJII) {
            return;
        }
        if (((Number) C261280ALu.LIZ.getValue()).intValue() == 1) {
            if (this.LJJIIJ) {
                i2 = R.anim.f486mf;
            }
            i = R.anim.mj;
        } else {
            i2 = R.anim.l6;
            i = R.anim.le;
        }
        C786410Ut5.be(this.LIZ.U6(), i2, i);
    }

    public final void LJJIIJ(EnterRoomConfig enterRoomConfig) {
        if ((!LiveTopTabSwitch.isEnable() && !LiveNearbyTabSetting.INSTANCE.enable()) || LiveViewTreeOptSetting.enableViewTreeOpt() || !LiveInfeedSkylightEntranceSetting.matchEntrance(enterRoomConfig) || !LiveInfeedTopliveTabEntranceSetting.matchEntrance(enterRoomConfig)) {
            return;
        }
        if (!this.LJJIZ) {
            LJIJI(enterRoomConfig);
            return;
        }
        boolean zIsEnable = MultiGuestTopLiveIterationPhase1Setting.isEnable();
        String str = LJJJLIIL;
        if (zIsEnable) {
            if (this.LJIILL) {
                if (MultiGuestTopLiveIterationPhase1Setting.isEnable()) {
                    this.LJJJ = enterRoomConfig;
                }
                C20441214yg.LIZIZ(str, "landingTabByConfig");
                if (!this.LJIILLIIL) {
                    C479670IrV.LIZ.getClass();
                    C479670IrV.LJFF = true;
                }
                this.LJIILLIIL = false;
                if (!TextUtils.isEmpty(enterRoomConfig.mLogData.topLiveSource)) {
                    int iLIZ = this.LIZIZ.LIZ(enterRoomConfig);
                    C21546719Ub c21546719Ub = this.LJIIJ;
                    if (c21546719Ub != null && iLIZ >= 0 && iLIZ < c21546719Ub.getTabCount()) {
                        C21546719Ub c21546719Ub2 = this.LJIIJ;
                        c21546719Ub2.LJIILJJIL(c21546719Ub2.LJIIJ(iLIZ), true);
                        C477070InJ c477070InJ = this.LJIIL;
                        if (c477070InJ != null) {
                            C786410Ut5.i0(c477070InJ, 0);
                        }
                        this.LJIIZILJ = false;
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (this.LJIILL) {
            return;
        }
        C20441214yg.LIZIZ("MultiTopLive", "LivePlayRootManagerV2 initTopLiveTab");
        C20441214yg.LJIIIZ(str, "initTopLiveTab finish");
        this.LJIILL = true;
        if (DefaultLandingHangoutPreloadOptSetting.INSTANCE.isOpt() && this.LIZIZ.LIZ(null) == 1 && "hangout".equals(this.LIZIZ.H2(1))) {
            C20441214yg.LIZIZ(str, "preload data when default landing 2tab");
            C478590Ipl c478590Ipl = C478590Ipl.LIZ;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ.xL()), C0PEM.LIZJ, null, new C478540Ipg(System.currentTimeMillis(), null), 2);
            C478590Ipl.LJII(this.LIZ.xL());
        }
        List<LiveTab> listL2 = this.LIZIZ.L2();
        try {
            this.LJIILIIL.getClass();
            if (listL2.size() == 2 && ((LiveTab) ListProtector.get(listL2, 0)).type == 1) {
                if (((LiveTab) ListProtector.get(listL2, 1)).type != 2 && ((LiveTab) ListProtector.get(listL2, 1)).type != 3) {
                    return;
                }
                C20441214yg.LIZIZ("LiveTopTabHelper", "isValidTabData true");
                if (enterRoomConfig != null) {
                    C20441214yg.LJIIIZ(str, "initTopTab V2");
                    C786410Ut5.LJLIIL(2000L, this.LJJIJL, this.LJJJJJ);
                    String str2 = enterRoomConfig.mLogData.liveTabSource;
                    if (str2 != null) {
                        C486660J6q.LJII("homepage_hot", str2);
                    }
                    LJJJJIZL(enterRoomConfig, listL2);
                    LJJJIL(enterRoomConfig);
                    LJJJJI();
                    LJJJJ();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initTopTab exception:");
            sbLIZ.append(e);
            C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157 A[PHI: r2
      0x0157: PHI (r2v17 long) = (r2v16 long), (r2v18 long) binds: [B:67:0x014f, B:69:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(java.lang.Runnable r22) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C479740Irc.LJJIIZI(java.lang.Runnable):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(boolean r15) {
        /*
            Method dump skipped, instruction units count: 1125
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C479740Irc.LJJIJIIJI(boolean):void");
    }

    public final void LJJIJIIJIL(Runnable runnable) {
        C477580Io8 c477580Io8;
        try {
            runnable.run();
            if (this.LJIIJ != null && (c477580Io8 = this.LJIILIIL) != null) {
                c477580Io8.LJFF();
            }
            Handler handlerLIZIZ = C799570VYd.LIZIZ();
            C08MD c08md = C08MD.LIZ;
            C786410Ut5.LJJZZIII(handlerLIZIZ, new ARunnableS83S0000000_3(42));
            if (LiveInteractViewAsyncOpt.INSTANCE.enable()) {
                this.LIZ.hashCode();
                C0IHJ c0ihj = C0IHJ.LIZLLL;
                if (c0ihj != null) {
                    C0J4A c0j4a = c0ihj.LIZ;
                    if (c0j4a != null) {
                        c0j4a.LIZJ(c0ihj.LIZIZ);
                    }
                    c0ihj.LIZ = null;
                    ((LinkedHashMap) c0ihj.LIZJ).clear();
                    c0ihj.LIZIZ = null;
                }
                C0IHJ.LIZLLL = null;
            }
            C0J3Y.LIZ.getClass();
            C0J3Y.LJIJ();
            C467800IWc.LJIJ.LIZ();
            C01GW<C468070IXd> c01gw = C468070IXd.LJIIIIZZ;
            C468070IXd c468070IXdLIZ = C0IFC.LIZ();
            c468070IXdLIZ.LIZ = null;
            c468070IXdLIZ.LJII = 0;
            c468070IXdLIZ.LJ = null;
            c468070IXdLIZ.LJFF = null;
            c468070IXdLIZ.LIZJ = false;
            c468070IXdLIZ.LIZIZ = null;
            c468070IXdLIZ.LJI = null;
            c468070IXdLIZ.LIZLLL = true;
            Live.getService().Yg();
            Live.getService().LJJIJL(this.LIZ.xL());
            ((ILiveSparkService) C1161920gLG.LIZJ(ILiveSparkService.class)).Nv1(false);
            String stringValue = this.LIZ.mK().getStringValue("player_tag");
            if (stringValue != null && Live.getService() != null) {
                Live.getService().LLILLIZIL(stringValue);
            }
            if (this.LJFF == null) {
                C0IL2.LIZ.LIZ().LIZIZ(new Event("liveplay_activity_ondestory", 33817, C0IIR.SdkInterfaceCall));
            }
            if (this.LJJII) {
                C1440005kM.LIZ(new C083S(true, LiveCadSmoothExitSetting.INSTANCE.getPreviewCardDuration()));
            }
            if (LiveRepetitionTtlSetting.INSTANCE.getValue().enableLivePetitionShow > 0) {
                C0IU0.LIZ.clear();
                C0IU0.LIZIZ.clear();
                C0IU0.LJI(0);
            }
            C475460Iki c475460Iki = this.LJJIFFI;
            if (c475460Iki != null) {
                ValueAnimator valueAnimator = c475460Iki.LJIIL;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                c475460Iki.LJIIL = null;
            }
            this.LJJIJL.removeCallbacksAndMessages(null);
            CopyOnWriteArrayList<InterfaceC479850Irn> copyOnWriteArrayList = C479860Iro.LIZ;
            C479860Iro.LIZIZ(this, EnumC479890Irr.LIVE_PLAY);
            this.LIZ.U6().removeOnPictureInPictureModeChangedListener(this.LJJJJI);
            if (Live.getLiteService() != null) {
                Live.getLiteService().Zq(this.LIZ.U6().getClass().getSimpleName());
            }
            C474750IjZ.LIZ();
            C0IUA.LJJ = "";
            C0IUA.LJJI = "";
            C0IUA.LJJIIJZLJL = "";
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "vod_strategy_scene_sync_in_live", true) == 1) {
                C1478160oZK.LIZ().LJJIJLIJ(this.LIZLLL);
            }
            InterfaceC479770Irf interfaceC479770Irf = this.LIZIZ;
            if (interfaceC479770Irf != null) {
                interfaceC479770Irf.onDestroy();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C794260VDs.LIZJ(C2450709iz.LIZLLL(this.LIZ.U6()));
            String strLJFF = C2450709iz.LJFF(this.LIZ.U6());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LIVE_PLAY_ON_DESTROY:");
            sbLIZ.append(strLJFF);
            C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ));
        }
        C478590Ipl c478590Ipl = C478590Ipl.LIZ;
        C478590Ipl.LJII = 0L;
        C478590Ipl.LJI = new ArrayList();
        C478590Ipl.LJIIIZ = null;
        C1DEV c1dev = C478590Ipl.LIZJ;
        if (c1dev.LJFF(null)) {
            try {
                ((LinkedHashMap) C478590Ipl.LIZLLL).clear();
                c1dev.LIZIZ(null);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C478590Ipl.LIZJ.LIZIZ(null);
                throw th2;
            }
        }
        C1DEV c1dev2 = C478590Ipl.LJ;
        if (c1dev2.LJFF(null)) {
            try {
                C478590Ipl.LJFF = null;
                c1dev2.LIZIZ(null);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C478590Ipl.LJ.LIZIZ(null);
                throw th3;
            }
        }
        C479670IrV.LIZ.getClass();
        C479670IrV.LJFF = false;
        RecycleLayeredElementManger.INSTANCE.release();
        C011Z.LIZ.LJIJJ = false;
        C1090400eTu.LIZIZ = false;
        Live.getService().cv();
        AppLogFlushOptSetting.INSTANCE.release();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.zQ2(this);
        if (LivePlayActivityLeaksOptSetting.enableDataChannelLeakOpt()) {
            dataChannelGlobal.zQ2(this.LIZ.U6());
        }
        C474850Ijj.LIZIZ();
        C21546719Ub c21546719Ub = this.LJIIJ;
        if (c21546719Ub != null) {
            dataChannelGlobal.zQ2(c21546719Ub);
        }
        if (Build.VERSION.SDK_INT >= 24 && this.LIZ.U6().isInPictureInPictureMode() && this.LIZ.U6().isDestroyed()) {
            this.LIZ.U6().finish();
        }
        int i = C2518909tz.LIZ;
        if ((i & 4) == 4) {
            AppLogNewUtils.LIZ = true;
        }
        if ((i & 2) == 2) {
            AppLog.disableInsertCache();
        }
        if ((i & 1) == 1) {
            AppLog.setInsertByTransactionEnabled(false);
        }
        ((IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class)).Xz(null);
        ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).S5(EnumC480200IsM.LEAVE_INNER_FLOW);
        if (LiveDedupOptExp.INSTANCE.saveFeatureWhenLeaveRoom()) {
            ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).pJ0(2000L);
        }
        ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).Jx1();
        this.LJJJ = null;
        LJJIZ();
        C477500Io0.LIZ.getClass();
        ((Map) C477500Io0.LIZJ.getValue()).clear();
        ((Set) C477500Io0.LIZLLL.getValue()).clear();
        this.LJIIJJI = null;
        C479760Ire c479760Ire = this.LJIILJJIL;
        if (c479760Ire != null) {
            c479760Ire.LIZLLL.removeCallbacks(c479760Ire.LJIJ);
            c479760Ire.LIZIZ();
            this.LJIILJJIL = null;
        }
        this.LJIIIZ = null;
        this.LJIIL = null;
        ((ArrayList) C477450Inv.LIZIZ).clear();
        if (C479960Iry.LIZ == null) {
            C479960Iry.LIZ = new WeakReference<>(this.LJJJJJL);
        }
        ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).H12();
        if (C467340IUi.LIZJ().getEnabled() && ((Boolean) C467340IUi.LJIILJJIL.getValue()).booleanValue() && !C467340IUi.LJFF) {
            if ((!TopLivePreFetchPoolSetting.INSTANCE.getValue().getRefreshOnCacheInvalid() || C467340IUi.LIZIZ != null) && SystemClock.uptimeMillis() - C467340IUi.LIZJ < C467340IUi.LIZJ().getCacheTime()) {
                C467340IUi.LJ = 4;
                C467340IUi.LJIIIIZZ = 2;
                C786410Ut5.LJLIIL(C467340IUi.LIZJ().getCacheTime() - (SystemClock.uptimeMillis() - C467340IUi.LIZJ), C467340IUi.LIZIZ(), new Runnable() { // from class: X.0IUs
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("TopLiveEntrancePreDataManagerV2@84a2.resumePreFetchTopLiveWebcastDataTask$2");
                        try {
                            C467340IUi.LJI();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("TopLiveEntrancePreDataManagerV2@84a2.resumePreFetchTopLiveWebcastDataTask$2");
                    }
                });
            } else {
                C467340IUi.LJ = 4;
                C467340IUi.LJIIIIZZ = 1;
                C786410Ut5.LJLIIL(C467340IUi.LIZJ().getRefreshDelayTime(), C467340IUi.LIZIZ(), new Runnable() { // from class: X.0IUr
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("TopLiveEntrancePreDataManagerV2@84a2.resumePreFetchTopLiveWebcastDataTask$1");
                        try {
                            C467340IUi.LJI();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("TopLiveEntrancePreDataManagerV2@84a2.resumePreFetchTopLiveWebcastDataTask$1");
                    }
                });
            }
        }
    }

    public final void LJJIJL(Runnable runnable) {
        runnable.run();
        this.LJJIL.remove(this.LJJJJ);
        CopyOnWriteArrayList<InterfaceC479850Irn> copyOnWriteArrayList = C479860Iro.LIZ;
        try {
            new WeakReference(this);
            Iterator<InterfaceC479850Irn> it2 = C479860Iro.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJJ(EnterRoomConfig enterRoomConfig) {
        Map<String, Object> map = new HashMap<>();
        InterfaceC479780Irg<?> interfaceC479780Irg = this.LIZ;
        if ((interfaceC479780Irg instanceof Activity) || (interfaceC479780Irg instanceof Fragment)) {
            map = BtmSDK.INSTANCE.createReportParams("c0.d0", PageFinder.via(interfaceC479780Irg));
        }
        try {
            if (enterRoomConfig.mLogData.logMap != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (entry.getValue() != null) {
                        enterRoomConfig.mLogData.logMap.put(entry.getKey(), entry.getValue().toString());
                    }
                }
                return;
            }
            HashMap map2 = new HashMap();
            for (Map.Entry<String, Object> entry2 : map.entrySet()) {
                if (entry2.getValue() != null) {
                    map2.put(entry2.getKey(), entry2.getValue().toString());
                }
            }
            enterRoomConfig.mLogData.logMap = map2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJJIL(EnterRoomConfig enterRoomConfig) {
        C479680IrW c479680IrW = (C479680IrW) this.LIZ.U6().findViewById(R.id.n8v);
        this.LJIIJJI = c479680IrW;
        c479680IrW.LLJJJ = this.LJIIJ;
        c479680IrW.LLJJJIL = this.LJIILIIL;
        c479680IrW.LLJJJJ = enterRoomConfig;
        c479680IrW.LLJJJJJIL = this.LIZIZ;
        c479680IrW.LLJJIJIL = new AObjectS382S0100000_7(this, 14);
        c479680IrW.LLJJJJLIIL = new AObjectS382S0100000_7(this, 15);
    }

    @Override // X.InterfaceC480020Is4
    public void onEvent(C484240Iys c484240Iys) {
        if (Live.getService() != null) {
            Live.getService().LJJIL();
        }
    }

    public static void LJJIIZ(EnterRoomConfig enterRoomConfig, String str) {
        if (enterRoomConfig.mLogData.openFromSchema != null) {
            if ("push".equals(enterRoomConfig.mRoomsData.enterFromMerge)) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_schema_enter_room");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("push_");
                sbLIZ.append(str);
                c474500IjALIZ.LJJII(C2188811AlT.LIZIZ(sbLIZ), "push_process_status");
                c474500IjALIZ.LIZ();
            }
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_schema_enter_room");
            c474500IjALIZ2.LJJII(str, "process_status");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(enterRoomConfig.mRoomsData.enterFromMerge);
            sbLIZ2.append("-");
            sbLIZ2.append(enterRoomConfig.mRoomsData.enterMethod);
            c474500IjALIZ2.LJJII(C2188811AlT.LIZIZ(sbLIZ2), "enterance");
            c474500IjALIZ2.LIZ();
        }
    }

    public static void LJJJJJ(Context context, InterfaceC475370IkZ interfaceC475370IkZ) {
        InterfaceC214902198i livePlayRootFragment;
        int i;
        NavigationScene navigationSceneLIZ;
        C1440005kM.LIZ(new IEvent() { // from class: X.0Iru
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
        if (C479990Is1.LIZ) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ == null) {
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ instanceof C1397950mTx) {
                    c19egLIZIZ = (C19EG) ((C1397950mTx) abstractC1387200mCcLJ).LIZLLL;
                } else if (abstractC1387200mCcLJ instanceof C1844400y62) {
                    c19egLIZIZ = abstractC1387200mCcLJ.LIZLLL().getActivity();
                }
            }
            InterfaceC214902198i interfaceC214902198iLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19egLIZIZ);
            if (interfaceC214902198iLJIILLIIL instanceof LivePlayRootFragment) {
                livePlayRootFragment = interfaceC214902198iLJIILLIIL;
            } else {
                livePlayRootFragment = new LivePlayRootFragment();
            }
            if (interfaceC214902198iLJIILLIIL != null) {
                if (interfaceC475370IkZ.LIZLLL()) {
                    i = R.style.ae5;
                } else {
                    i = R.style.ae4;
                }
                Bundle bundle = ((C469980Ibs) interfaceC475370IkZ).LIZ;
                IHostCreativeTool iHostCreativeTool = C520010KaN.LIZ;
                C199B c199b = new C199B(C199E.SINGLE_TASK, null, null, false, false, null, null, 126);
                SAFFragmentRootScene sAFFragmentRootSceneIb = interfaceC214902198iLJIILLIIL.ib();
                if (sAFFragmentRootSceneIb != null && (navigationSceneLIZ = C1447800nmM.LIZ(sAFFragmentRootSceneIb)) != null) {
                    AnonymousClass1999.LIZJ(navigationSceneLIZ, sAFFragmentRootSceneIb, livePlayRootFragment.getClass(), new AwS551S0100000_7(livePlayRootFragment, 105), -1, bundle, c199b, null, new SAFContextThemeConfig(true, i), null, 320);
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            return;
        }
        try {
            Intent intent = ((C480060Is8) interfaceC475370IkZ).LIZ;
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqAzj1wXeicWa5RagU5u3LQYqrb5x99zgaG0v8=", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJFF(LJJJLIIL, "startLivePlayActivity failed", th);
            C1AF0.LJ(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r12 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        r11 = X.C13LP.LLIIII(((java.util.ArrayList) r13.LJFF).subList(0, r12));
        r10 = (java.util.ArrayList) r13.LJFF;
        r7.mLogData.moreConfig = new java.util.ArrayList<>(X.C13LP.LLIIII(r10.subList(r12 + 1, r10.size())));
        r7.mLogData.frontRoomConfig = new java.util.ArrayList<>(r11);
        r10 = r7.mRoomsData.timeStamps;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r10 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        r10.enterRoomStarTimeReal = 0;
        r10.enterRoomStarTime = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028d A[PHI: r7 r11
      0x028d: PHI (r7v7 com.bytedance.android.livesdkapi.session.EnterRoomConfig) = 
      (r7v5 com.bytedance.android.livesdkapi.session.EnterRoomConfig)
      (r7v8 com.bytedance.android.livesdkapi.session.EnterRoomConfig)
     binds: [B:165:0x0382, B:127:0x028c] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r11v8 boolean) = (r11v5 boolean), (r11v9 boolean) binds: [B:165:0x0382, B:127:0x028c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC475300IkS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0IEG LJIIIIZZ(int r18, X.C19EH r19) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C479740Irc.LJIIIIZZ(int, X.19EH):X.0IEG");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJ(android.os.Bundle r10, java.lang.Runnable r11) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C479740Irc.LJJIJ(android.os.Bundle, java.lang.Runnable):void");
    }

    public final void LJJIJLIJ(Runnable runnable, boolean z) {
        ILiveOuterService iLiveOuterServiceQ4;
        InterfaceC1601140rlg interfaceC1601140rlgP5;
        C465050ILn.LIZ(this.LJJIJIL, "live_activity_resume");
        runnable.run();
        CopyOnWriteArrayList<InterfaceC479850Irn> copyOnWriteArrayList = C479860Iro.LIZ;
        try {
            new WeakReference(this);
            Iterator<InterfaceC479850Irn> it2 = C479860Iro.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LJJIL.add(this.LJJJJ);
        C465050ILn.LIZ(this.LJJIJIL, "live_activity_resume_end");
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (iLiveOuterServiceQ4 = iLiveOuterService.q4()) != null && (interfaceC1601140rlgP5 = iLiveOuterServiceQ4.p5()) != null && interfaceC1601140rlgP5.LJ() != null) {
            C1602240rnS.LIZ(0);
        }
        if (z && C479990Is1.LIZIZ) {
            if (C463690IGh.LIZ) {
                for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
                    if (((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isLivePlayActivity(abstractC1387200mCc)) {
                        ((C1397950mTx) abstractC1387200mCc).LIZLLL.finish();
                        C463690IGh.LIZ = false;
                    }
                }
            }
            if (this.LJFF.getCurrentFragment() != null) {
                EnterRoomConfig enterRoomConfigEq = this.LJFF.getCurrentFragment().Eq();
                EnterRoomLinkSession.LJ(enterRoomConfigEq);
                C0IEG c0iegLJIJ = LJIJ(enterRoomConfigEq);
                this.LJFF = c0iegLJIJ;
                c0iegLJIJ.qJ(this.LIZ);
                C19EH c19ehLJIIJ = this.LIZ.GJ().LJIIJ();
                if (LiveViewTreeOptSetting.enableViewTreeOpt()) {
                    c19ehLJIIJ.LJIJ(R.id.trt, this.LJFF.LLLIILIL(), null);
                } else {
                    c19ehLJIIJ.LJIJ(R.id.iiv, this.LJFF.LLLIILIL(), null);
                }
                c19ehLJIIJ.LJIIIZ();
            }
            C479990Is1.LIZIZ = false;
        }
    }

    public final void LJJIL(Bundle bundle, C092O<Bundle> c092o) {
        EnterRoomLinkSession enterRoomLinkSession;
        Bundle bundle2;
        c092o.accept(bundle);
        if (LiveNotSaveFragmentsSetting.INSTANCE.getValue() && bundle != null && (bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key")) != null) {
            C786410Ut5.LJJIIZI(bundle2, new Bundle(), "android:support:fragments");
        }
        C0INV c0inv = C0IL2.LIZ;
        EnterRoomConfig enterRoomConfig = c0inv.LIZ().mEnterRoomConfig;
        if (LiveInfeedSkylightEntranceSetting.isNearbyPage(enterRoomConfig) && (enterRoomLinkSession = this.LJJJJL.LIZLLL) != null) {
            EnterRoomConfig enterRoomConfig2 = enterRoomLinkSession.mEnterRoomConfig;
            if (bundle != null && enterRoomConfig2 != null) {
                bundle.putLong("room_id", enterRoomConfig2.mRoomsData.roomId);
            }
            C479730Irb c479730Irb = this.LJJJJL;
            c479730Irb.getClass();
            EnterRoomLinkSession enterRoomLinkSession2 = c479730Irb.LIZLLL;
            String strLIZLLL = c479730Irb.LIZ;
            if (strLIZLLL == null) {
                if (enterRoomLinkSession2 != null) {
                    strLIZLLL = enterRoomLinkSession2.LIZLLL();
                } else {
                    strLIZLLL = null;
                }
            }
            String str = c479730Irb.LIZJ;
            String str2 = c479730Irb.LIZIZ;
            if (bundle != null) {
                C786410Ut5.LJJJI("enter_room_session_id", strLIZLLL, bundle);
                C786410Ut5.LJJIJL(bundle, "enter_room_session", enterRoomLinkSession2);
                C786410Ut5.LJJJI("first_enter_room_session_id", str, bundle);
                C786410Ut5.LJJJI("live_session_id", str2, bundle);
                return;
            }
            return;
        }
        if (bundle != null) {
            if (enterRoomConfig != null) {
                bundle.putLong("room_id", enterRoomConfig.mRoomsData.roomId);
            }
            C786410Ut5.LJJJI("enter_room_session_id", c0inv.LIZIZ, bundle);
            C786410Ut5.LJJIJL(bundle, "enter_room_session", c0inv.LIZ());
            C786410Ut5.LJJJI("first_enter_room_session_id", c0inv.LIZLLL, bundle);
            C786410Ut5.LJJJI("live_session_id", c0inv.LJ, bundle);
        }
    }

    public final void LJJJJIZL(final EnterRoomConfig enterRoomConfig, List<LiveTab> list) {
        C21546719Ub c21546719Ub;
        boolean z;
        boolean z2;
        boolean z3;
        ViewGroup viewGroup;
        C477070InJ c477070InJ = (C477070InJ) this.LIZ.U6().findViewById(R.id.n8w);
        this.LJIIL = c477070InJ;
        c477070InJ.setOnVisibilityChangeListener(this.LIZJ);
        this.LJIIJ = (C21546719Ub) this.LIZ.U6().findViewById(R.id.n85);
        InterfaceC477230InZ interfaceC477230InZ = new InterfaceC477230InZ() { // from class: X.0InI
            @Override // X.InterfaceC477230InZ
            public final void LIZ(TopliveNoticeUnreadCountData topliveNoticeUnreadCountData) {
                boolean z4;
                if (topliveNoticeUnreadCountData.unreadCount > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                C477400Inq liveNotificationBell = this.LIZ.LJIIL.getLiveNotificationBell();
                if (liveNotificationBell != null) {
                    if (z4) {
                        C339190DRl.LIZLLL(liveNotificationBell.getAlertDot());
                    } else {
                        C339190DRl.LIZIZ(liveNotificationBell.getAlertDot());
                    }
                }
            }
        };
        if (LiveTopLiveNotificationSetting.INSTANCE.getEnable()) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C477210InX(interfaceC477230InZ, null), 2);
        }
        if (HangoutRoomFeedEnableSetting.INSTANCE.isEnable() && LJIILJJIL()) {
            int iLJJI = LJJI();
            this.LJIIL.setBackgroundColor(iLJJI);
            this.LJIIJ.setBackgroundColor(iLJJI);
        }
        if (this.LJIILJJIL == null && (viewGroup = (ViewGroup) this.LIZ.U6().findViewById(R.id.tru)) != null) {
            this.LJIILJJIL = new C479760Ire(this.LJIIL, this.LJIIJ, viewGroup);
        }
        this.LIZIZ.I2(this.LJIIJ);
        this.LJIIJ.setShouldOptimizeFluency(true);
        this.LJIIJ.setSelectedTabIndicatorWidth((int) C497740JfY.LIZIZ(24.0f));
        this.LJIIJ.setSmoothScrollingEnabled(false);
        this.LJIIJ.LIZ(new InterfaceC482230Ivd() { // from class: X.0Ird
            @Override // X.InterfaceC20485215Du
            public final void LIZ() {
            }

            @Override // X.InterfaceC20485215Du
            public final void LIZLLL(C763970Txz c763970Txz) {
            }

            @Override // X.InterfaceC20485215Du
            public final void LIZIZ(C763970Txz c763970Txz) {
                LIZJ(c763970Txz, false);
            }

            @Override // X.InterfaceC482230Ivd
            public final void LIZJ(C763970Txz c763970Txz, boolean z4) {
                C20632315oP c20632315oP;
                String str;
                EnterRoomConfig enterRoomConfig2;
                C21546819Uc c21546819Uc;
                int i;
                int i2 = c763970Txz.LJFF;
                C479670IrV.LIZIZ = this.LIZIZ.LIZIZ.H2(i2);
                C479740Irc c479740Irc = this.LIZIZ;
                if (!c479740Irc.LJIIZILJ) {
                    C477580Io8 c477580Io8 = c479740Irc.LJIILIIL;
                    C21546719Ub c21546719Ub2 = c479740Irc.LJIIJ;
                    c477580Io8.getClass();
                    if (c21546719Ub2 != null) {
                        int tabCount = c21546719Ub2.getTabCount();
                        for (int i3 = 0; i3 < tabCount; i3++) {
                            C763970Txz c763970TxzLJIIJ = c21546719Ub2.LJIIJ(i3);
                            if (c763970TxzLJIIJ != null && (c21546819Uc = c763970TxzLJIIJ.LJIIIIZZ) != null) {
                                C21546719Ub c21546719Ub3 = c763970TxzLJIIJ.LJII;
                                if (c21546719Ub3 != null) {
                                    if (c21546719Ub3.getSelectedTabPosition() == c763970TxzLJIIJ.LJFF) {
                                        i = R.style.r2;
                                    } else {
                                        i = R.style.r3;
                                    }
                                    c21546819Uc.LLILLJJLI.setTextAppearance(i);
                                    ColorStateList colorStateList = c21546819Uc.LLJ.LLJILJIL;
                                    if (colorStateList != null) {
                                        c21546819Uc.LLILLJJLI.setTextColor(colorStateList);
                                    }
                                } else {
                                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                                }
                            }
                        }
                    }
                    C479670IrV.LIZ.getClass();
                    String str2 = new String(C479670IrV.LIZJ);
                    boolean z5 = this.LIZIZ.LJIJI;
                    if (z5) {
                        str = "enter_toplive";
                    } else if (z4) {
                        str = "click";
                    } else {
                        str = "slide";
                    }
                    C479670IrV.LIZJ = str;
                    if (!z5) {
                        Pair pairLJJ = C479740Irc.LJJ();
                        EnterRoomConfig enterRoomConfig3 = enterRoomConfig;
                        String strH2 = this.LIZIZ.LIZIZ.H2(i2);
                        C479740Irc c479740Irc2 = this.LIZIZ;
                        C479670IrV.LIZIZ(enterRoomConfig3, strH2, c479740Irc2.LIZIZ.H2(c479740Irc2.LJJJJLI), z4, false, this.LIZIZ.LJIILIIL.LIZLLL(), (C479720Ira) pairLJJ.getFirst(), (C479710IrZ) pairLJJ.getSecond(), "tab_switch", str2, this.LIZIZ.LIZIZ.Z());
                    }
                    if (i2 == 0) {
                        EnterRoomConfig enterRoomConfig4 = enterRoomConfig;
                        String strH22 = this.LIZIZ.LIZIZ.H2(i2);
                        C479740Irc c479740Irc3 = this.LIZIZ;
                        C479670IrV.LIZLLL(enterRoomConfig4, strH22, c479740Irc3.LIZIZ.H2(c479740Irc3.LJJJJLI));
                    } else if (i2 == 1) {
                        if (MultiTopLiveEnterConfigOptSetting.isEnable() && MultiGuestTopLiveIterationPhase1Setting.isEnable() && (enterRoomConfig2 = this.LIZIZ.LJJJ) != null && !TextUtils.isEmpty(enterRoomConfig2.mLogData.liveTabSource)) {
                            C479740Irc c479740Irc4 = this.LIZIZ;
                            EnterRoomConfig enterRoomConfig5 = c479740Irc4.LJJJ;
                            String strH23 = c479740Irc4.LIZIZ.H2(i2);
                            C479740Irc c479740Irc5 = this.LIZIZ;
                            C479670IrV.LIZLLL(enterRoomConfig5, strH23, c479740Irc5.LIZIZ.H2(c479740Irc5.LJJJJLI));
                            this.LIZIZ.LJJJ = null;
                        } else {
                            EnterRoomConfig enterRoomConfig6 = enterRoomConfig;
                            String strH24 = this.LIZIZ.LIZIZ.H2(i2);
                            C479740Irc c479740Irc6 = this.LIZIZ;
                            C479670IrV.LIZLLL(enterRoomConfig6, strH24, c479740Irc6.LIZIZ.H2(c479740Irc6.LJJJJLI));
                        }
                        C478750Iq1.LIZ = new C479440Ir8(System.currentTimeMillis());
                    }
                    C479740Irc c479740Irc7 = this.LIZIZ;
                    c479740Irc7.LJIJI = false;
                    C477580Io8 c477580Io82 = c479740Irc7.LJIILIIL;
                    c477580Io82.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("switchTabStatStayDuration: ");
                    sbLIZ.append(i2);
                    C20441214yg.LJIIIZ("LiveTopTabHelper", C2188811AlT.LIZIZ(sbLIZ));
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i4 = c477580Io82.LIZLLL;
                    if (i4 != -1) {
                        long j = jCurrentTimeMillis - c477580Io82.LJ;
                        if (i4 == 0) {
                            c477580Io82.LIZIZ += j;
                        } else if (i4 == 1) {
                            c477580Io82.LIZJ += j;
                        }
                    }
                    c477580Io82.LIZLLL = i2;
                    c477580Io82.LJ = jCurrentTimeMillis;
                    C479740Irc c479740Irc8 = this.LIZIZ;
                    c479740Irc8.LJJJJLL = c479740Irc8.LJJJJLI;
                    c479740Irc8.LJJJJLI = i2;
                }
                this.LIZIZ.LIZIZ.J2(i2);
                C479740Irc c479740Irc9 = this.LIZIZ;
                C479760Ire c479760Ire = c479740Irc9.LJIILJJIL;
                if (c479760Ire != null) {
                    boolean zEquals = "hangout".equals(c479740Irc9.LIZIZ.H2(i2));
                    if (!c479760Ire.LJI) {
                        if (!c479760Ire.LJFF) {
                            if (zEquals) {
                                boolean z6 = C479760Ire.LJIJI;
                                if (C479140Iqe.LIZIZ()) {
                                    c479760Ire.LJFF = true;
                                    C20441214yg.LJIIIZ("HangoutNewUserGuideBg", "kickoff new-user guide bg, will dismiss after 5000ms");
                                    try {
                                        ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).ud2("tiktok_live_interaction_normal_3");
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C20441214yg.LJFF("HangoutNewUserGuideBg", "updateGeckoLocalFile failed", th);
                                    }
                                    c479760Ire.LIZ();
                                    C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, c479760Ire.LIZLLL, c479760Ire.LJIJ);
                                }
                            }
                        } else if (zEquals) {
                            c479760Ire.LIZ();
                        } else if (c479760Ire.LJIIIZ) {
                            c479760Ire.LJIIIZ = false;
                            C1324720kZq c1324720kZq = (C1324720kZq) c479760Ire.LIZ.findViewById(R.id.ljc);
                            if (c1324720kZq != null) {
                                ViewPropertyAnimator viewPropertyAnimatorAnimate = c1324720kZq.animate();
                                if (viewPropertyAnimatorAnimate != null) {
                                    viewPropertyAnimatorAnimate.cancel();
                                }
                                C786410Ut5.LLJJIII(c1324720kZq, 8);
                                C786410Ut5.h5(c1324720kZq, 1.0f);
                            }
                        }
                    }
                    C479740Irc c479740Irc10 = this.LIZIZ;
                    if (c479740Irc10.LJIILJJIL == null || c479740Irc10.LIZIZ == null || (c20632315oP = (C20632315oP) c479740Irc10.LIZ.U6().findViewById(R.id.view_pager)) == null) {
                        return;
                    }
                    for (int i5 = 0; i5 < c479740Irc10.LJIIJ.getTabCount(); i5++) {
                        if ("hangout".equals(c479740Irc10.LIZIZ.H2(i5))) {
                            if (i5 < 0) {
                                return;
                            }
                            C479760Ire c479760Ire2 = c479740Irc10.LJIILJJIL;
                            if (c479760Ire2.LJI) {
                                return;
                            }
                            WeakReference<C20632315oP> weakReference = c479760Ire2.LJIILL;
                            if (weakReference != null) {
                                C20632315oP c20632315oP2 = weakReference.get();
                                if (c20632315oP2 == c20632315oP) {
                                    if (c479760Ire2.LJIILLIIL == i5) {
                                        return;
                                    }
                                } else if (c20632315oP2 != null) {
                                }
                                c20632315oP2.LJI(c479760Ire2.LJIIZILJ);
                            }
                            c479760Ire2.LJIILL = new WeakReference<>(c20632315oP);
                            c479760Ire2.LJIILLIIL = i5;
                            c20632315oP.LIZIZ(c479760Ire2.LJIIZILJ);
                            c479760Ire2.LIZJ(0.0f, c20632315oP.getCurrentItem());
                            return;
                        }
                    }
                }
            }
        });
        int iLIZ = this.LIZIZ.LIZ(enterRoomConfig);
        this.LJIJJ = iLIZ;
        String str = enterRoomConfig.mRoomsData.warmUpPlayerTag;
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str);
        if (iLIZ != 0 && interfaceC480510IsrLIZIZ != null) {
            interfaceC480510IsrLIZIZ.t0(str, "landing_to_hangout_tab", true);
        }
        if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.getValue().alignOnline) {
            iLIZ = 0;
        }
        for (LiveTab liveTab : list) {
            C763970Txz c763970TxzLJIIJJI = this.LJIIJ.LJIIJJI();
            c763970TxzLJIIJJI.LIZLLL(liveTab.name);
            c763970TxzLJIIJJI.LJIIIZ = 1;
            int i = liveTab.type;
            String str2 = LJJJLIIL;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("addTab 1, landTabPosition=");
                        sbLIZ.append(iLIZ);
                        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
                        C21546719Ub c21546719Ub2 = this.LJIIJ;
                        if (1 == iLIZ) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c21546719Ub2.LIZIZ(1, c763970TxzLJIIJJI, z);
                        LifecycleOwner lifecycleOwnerXL = this.LIZ.xL();
                        ILiveFeedApiService iLiveFeedApiService = (ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class);
                        if (iLiveFeedApiService != null) {
                            iLiveFeedApiService.zX1();
                            CommonSkylightDataManager.LIZ.LJJI(lifecycleOwnerXL, new AObserverS211S0100000_7(c763970TxzLJIIJJI, 82));
                        }
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("addTab 1, landTabPosition=");
                    sbLIZ2.append(iLIZ);
                    C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
                    C21546719Ub c21546719Ub3 = this.LJIIJ;
                    if (1 == iLIZ) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c21546719Ub3.LIZIZ(1, c763970TxzLJIIJJI, z2);
                }
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("addTab 0, landTabPosition=");
                sbLIZ3.append(iLIZ);
                C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ3));
                C21546719Ub c21546719Ub4 = this.LJIIJ;
                if (iLIZ == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c21546719Ub4.LIZIZ(0, c763970TxzLJIIJJI, z3);
            }
        }
        C786410Ut5.i0(this.LJIIL, 0);
        if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.getValue().alignOnline && this.LIZIZ.LIZ(enterRoomConfig) == 1 && !this.LJJJJZI && (c21546719Ub = this.LJIIJ) != null && c21546719Ub.LJIIJ(1) != null) {
            C21546719Ub c21546719Ub5 = this.LJIIJ;
            c21546719Ub5.LJIILJJIL(c21546719Ub5.LJIIJ(1), true);
            this.LJJJJZI = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x014d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> void LJJIJIL(X.InterfaceC479830Irl<T> r18, T r19, X.C092O<T> r20) {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C479740Irc.LJJIJIL(X.0Irl, java.lang.Object, X.092O):void");
    }
}
