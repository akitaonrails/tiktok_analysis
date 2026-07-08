package Y;

import X.AbstractC848400XPy;
import X.C013C;
import X.C098200Yq;
import X.C0ASF;
import X.C0S78;
import X.C0XQ7;
import X.C128Y;
import X.C1578310rAr;
import X.C1586480rO2;
import X.C1586620rOG;
import X.C1587220rPE;
import X.C1590820rV2;
import X.C1598860ri0;
import X.C1599640rjG;
import X.C1600080rjy;
import X.C1601380rm4;
import X.C1603030roj;
import X.C189200o6;
import X.C1C7U;
import X.C1DS1;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2517409tk;
import X.C319860CgK;
import X.EnumC1586970rOp;
import X.InterfaceC1593630rZZ;
import X.InterfaceC1891350zJl;
import X.RunnableC1602950rob;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.skylight.BaseSeriesSkyLightVM;
import com.ss.android.ugc.aweme.series.feed.tab.toptab.SeriesTopTabVM;
import com.ss.android.ugc.aweme.series.innerfeed.recommend.DramaFeedRecommendService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public class ACallableS429S0100000_24 implements Callable {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ Object call$8(ACallableS429S0100000_24 aCallableS429S0100000_24) {
        C1C7U.LIZ("InboxJankOptimization@6772.sam$java_util_concurrent_Callable$0");
        Object objInvoke = ((Function0) aCallableS429S0100000_24.l0).invoke();
        C1C7U.LIZIZ("InboxJankOptimization@6772.sam$java_util_concurrent_Callable$0");
        return objInvoke;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS429S0100000_24 aCallableS429S0100000_24) {
        C1C7U.LIZ("FriendsTabDelegateServiceImpl@af9f.initialize$observerGetter$1$1$1");
        if (C319860CgK.LIZ()) {
            C1599640rjG.LIZIZ.Fu(EnumC1586970rOp.LOGIN_SUCCESS);
        } else {
            ((C1586480rO2) aCallableS429S0100000_24.l0).runColdStartTaskV2(false, EnumC1586970rOp.LOGIN_SUCCESS);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsTabDelegateServiceImpl@af9f.initialize$observerGetter$1$1$1");
        return unit;
    }

    public static final Object call$1(ACallableS429S0100000_24 aCallableS429S0100000_24) {
        C1C7U.LIZ("BaseSeriesSkyLightVM@3e10.handleRefreshWhenSkylight$2");
        SkylightBlocks skylightBlocksLIZIZ = ((BaseSeriesSkyLightVM) aCallableS429S0100000_24.l0).wQ2().LIZIZ(false, false);
        if (skylightBlocksLIZIZ == null) {
            skylightBlocksLIZIZ = new SkylightBlocks(null);
        }
        C1C7U.LIZIZ("BaseSeriesSkyLightVM@3e10.handleRefreshWhenSkylight$2");
        return skylightBlocksLIZIZ;
    }

    public static final Object call$10(ACallableS429S0100000_24 aCallableS429S0100000_24) {
        RunnableC1602950rob runnableC1602950rob = (RunnableC1602950rob) aCallableS429S0100000_24.l0;
        runnableC1602950rob.getClass();
        C1C7U.LIZ("PreloadTrigger$LoadTask@6d1b.run$1L");
        C1603030roj c1603030roj = runnableC1602950rob.LL;
        c1603030roj.getClass();
        try {
            c1603030roj.LIZ(1);
            c1603030roj.LIZLLL.getPreloader().LIZIZ(c1603030roj.LIZIZ, c1603030roj.LIZJ);
            c1603030roj.LIZ(4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c1603030roj.LIZ(3);
        }
        C1C7U.LIZIZ("PreloadTrigger$LoadTask@6d1b.run$1L");
        return null;
    }

    public static final Object call$2(ACallableS429S0100000_24 aCallableS429S0100000_24) {
        C1C7U.LIZ("BootPushTimeReportUtils@3b55.reportPushLog$1");
        AppLogNewUtils.onEventV3("push_first_frame", (JSONObject) aCallableS429S0100000_24.l0);
        C1C7U.LIZIZ("BootPushTimeReportUtils@3b55.reportPushLog$1");
        return null;
    }

    public static final Object call$3(ACallableS429S0100000_24 aCallableS429S0100000_24) {
        boolean z;
        C1C7U.LIZ("SeriesTopTabVM@c168.handleInit$1");
        ((SeriesTopTabVM) aCallableS429S0100000_24.l0).LLILZ.getValue().getClass();
        DramaFeedRecommendService.LIZ.getClass();
        boolean zLIZIZ = C1578310rAr.LIZ().LIZIZ();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleInit, red dot canShow: ");
        sbLIZ.append(zLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (((Boolean) C0ASF.LIZ.getValue()).booleanValue() && !zLIZIZ) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("SeriesTopTabVM@c168.handleInit$1");
        return boolValueOf;
    }

    public static final Object call$4(ACallableS429S0100000_24 aCallableS429S0100000_24) {
        C1C7U.LIZ("UsPopCardListenerManager@3385.runOnMainSync$task$1");
        Object objInvoke = ((Function0) aCallableS429S0100000_24.l0).invoke();
        C1C7U.LIZIZ("UsPopCardListenerManager@3385.runOnMainSync$task$1");
        return objInvoke;
    }

    public static final Object call$5(ACallableS429S0100000_24 aCallableS429S0100000_24) {
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse;
        C1C7U.LIZ("FriendsTabRedDotDowngradeManager@4573.tryRecordNotEnterFriendsNum$1");
        C1586620rOG.LIZ = false;
        int i = C2517409tk.LIZ;
        if (i > 0 && (friendsFeedResponse = ((NewContentResponse) aCallableS429S0100000_24.l0).getFriendsFeedResponse()) != null && friendsFeedResponse.getRedDotCount() > i) {
            C1587220rPE.LIZ.getClass();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            Keva keva = C1587220rPE.LIZJ;
            keva.storeInt(curUserId, keva.getInt(curUserId, 0) + 1);
        } else {
            C1587220rPE.LIZ.getClass();
            C1587220rPE.LIZJ.storeInt(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), 0);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsTabRedDotDowngradeManager@4573.tryRecordNotEnterFriendsNum$1");
        return unit;
    }

    public static final Object call$6(ACallableS429S0100000_24 aCallableS429S0100000_24) {
        long j;
        int size;
        C1C7U.LIZ("SkylightPerfTracker@b46b.reportAsync$1");
        C013C c013c = new C013C();
        JSONObject jSONObject = new JSONObject();
        C1600080rjy c1600080rjy = (C1600080rjy) aCallableS429S0100000_24.l0;
        try {
            boolean z = c1600080rjy.LIZ;
            if (z) {
                j = c1600080rjy.LIZIZ;
            } else {
                j = c1600080rjy.LIZJ;
            }
            jSONObject.put("is_initial", z);
            long j2 = c1600080rjy.LIZJ - j;
            LIZ$0(j2, c013c);
            jSONObject.put("request_trigger_time", j2);
            long j3 = c1600080rjy.LIZLLL - c1600080rjy.LIZJ;
            LIZ$0(j3, c013c);
            jSONObject.put("skylight_network_time", j3);
            long j4 = c1600080rjy.LJ - c1600080rjy.LIZJ;
            LIZ$0(j4, c013c);
            jSONObject.put("story_network_time", j4);
            long jMax = c1600080rjy.LJFF - Math.max(c1600080rjy.LIZLLL, c1600080rjy.LJ);
            LIZ$0(jMax, c013c);
            jSONObject.put("response_handle_time", jMax);
            long j5 = c1600080rjy.LJFF - j;
            LIZ$0(j5, c013c);
            jSONObject.put("total_data_time", j5);
            List<? extends InterfaceC1891350zJl> list = c1600080rjy.LJI;
            int i = 1;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                    InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJl;
                    if (!(interfaceC1891350zJl2 instanceof C1598860ri0) || ((C1598860ri0) interfaceC1891350zJl2).LLILLJJLI) {
                        arrayList.add(interfaceC1891350zJl);
                    }
                }
                size = arrayList.size();
            } else {
                size = 0;
            }
            jSONObject.put("total_data_count", size);
            jSONObject.put("request_highlights", c1600080rjy.LJII);
            if (!c013c.element) {
                i = 0;
            }
            C189200o6.m2constructorimpl(jSONObject.put("invalid_metrics", i));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        ((C1600080rjy) aCallableS429S0100000_24.l0).LIZ = false;
        C20684815ws.LJIJ("inbox_skylight_perf", jSONObject);
        ((C1600080rjy) aCallableS429S0100000_24.l0).LJIIIIZZ.set(0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkylightPerfTracker@b46b.reportAsync$1");
        return unit;
    }

    public static final Object call$7(ACallableS429S0100000_24 aCallableS429S0100000_24) {
        FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) aCallableS429S0100000_24.l0;
        feedRecommendFragment.LLJJIII = true;
        C1590820rV2 c1590820rV2 = new C1590820rV2("enter_homepage_hot");
        c1590820rV2.LIZLLL = "open_app";
        c1590820rV2.LJIJ = "open_app";
        C128Y c128y = feedRecommendFragment.LLILZ;
        if (c128y instanceof InterfaceC1593630rZZ) {
            c1590820rV2.LJIJJLI = ((InterfaceC1593630rZZ) c128y).T();
        }
        RecommendFeedFragmentPanel recommendFeedFragmentPanel = feedRecommendFragment.LLIZLLLIL;
        if (recommendFeedFragmentPanel != null && recommendFeedFragmentPanel.LJIIIIZZ() != null) {
            c1590820rV2.LJIILLIIL(feedRecommendFragment.LLIZLLLIL.LJIIIIZZ());
        }
        c1590820rV2.LJIILJJIL();
        if (C1DS1.LIZJ) {
            C0S78.LIZJ(new AObjectS66S0000000_13(6), true);
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$9(ACallableS429S0100000_24 aCallableS429S0100000_24) throws InterruptedException {
        C1601380rm4 c1601380rm4 = (C1601380rm4) aCallableS429S0100000_24.l0;
        c1601380rm4.getClass();
        C1C7U.LIZ("FeedFetchModel@3835.fetchListFromCache$1L");
        c1601380rm4.LLJILJILJ.set(false);
        Thread.sleep(400L);
        if (c1601380rm4.LLJILJILJ.get()) {
            T t = c1601380rm4.mData;
            C1C7U.LIZIZ("FeedFetchModel@3835.fetchListFromCache$1L");
            return t;
        }
        List<Aweme> items = c1601380rm4.getItems();
        int i = c1601380rm4.LLILZIL.LIZIZ + 1;
        if (items != null && i < items.size()) {
            Aweme aweme = (Aweme) ListProtector.get(c1601380rm4.getItems(), c1601380rm4.LLILZIL.LIZIZ);
            if (aweme != null && AwemeBizExtKt.getSubAweme(aweme) != null) {
                i++;
            }
            items.subList(0, i).clear();
            c1601380rm4.LLILZIL.LIZIZ = 0;
        }
        FeedItemList feedItemListM202clone = ((FeedItemList) c1601380rm4.mData).m202clone();
        feedItemListM202clone.setItems(items);
        feedItemListM202clone.isFromLocalCache = true;
        C1C7U.LIZIZ("FeedFetchModel@3835.fetchListFromCache$1L");
        return feedItemListM202clone;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS429S0100000_24(Function0 function0, Function0<Object> function02) {
        this.$t = function02;
        if (4 - function02 != 0) {
            this.l0 = function0;
        } else {
            this.l0 = function0;
        }
    }

    public static final void LIZ$0(long j, C013C c013c) {
        if (j < 0 || j > 600000) {
            c013c.element = true;
        }
    }

    public ACallableS429S0100000_24(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
