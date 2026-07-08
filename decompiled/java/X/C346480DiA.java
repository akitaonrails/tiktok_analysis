package X;

import Y.ARunnableS102S0100000_2;
import android.content.Context;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingResponse;
import com.ss.android.ugc.aweme.main.PerformanceOptAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0DiA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346480DiA implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            case 5:
                return then$5(this, c15o7);
            case 6:
                return then$6(this, c15o7);
            case 7:
                return then$7(this, c15o7);
            case 8:
                return then$8(this, c15o7);
            case BdTuring.TYPE_ECAF /* 9 */:
                return then$9(this, c15o7);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return then$10(this, c15o7);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return then$11(this, c15o7);
            default:
                return null;
        }
    }

    public C346480DiA(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(C346480DiA c346480DiA, C15O7 c15o7) {
        C313130CPf c313130CPf = (C313130CPf) c346480DiA.l0;
        c313130CPf.getClass();
        C1C7U.LIZ("ShareSettingManager@f74f.preloadApplyLastestSetting$1L");
        c313130CPf.LIZJ();
        C1C7U.LIZIZ("ShareSettingManager@f74f.preloadApplyLastestSetting$1L");
        return null;
    }

    public static final Object then$1(C346480DiA c346480DiA, C15O7 c15o7) {
        Runnable runnable = (Runnable) c346480DiA.l0;
        C1C7U.LIZ("I18nSettingManager@ba7.handleResponse$1L$1L");
        C303320Buk.LIZ(runnable);
        C1C7U.LIZIZ("I18nSettingManager@ba7.handleResponse$1L$1L");
        return null;
    }

    public static final Object then$10(C346480DiA c346480DiA, C15O7 c15o7) {
        C1C7U.LIZ("OpenFeedApiCommandV2@a2cf.continueWith$1");
        ((Runnable) c346480DiA.l0).run();
        C1C7U.LIZIZ("OpenFeedApiCommandV2@a2cf.continueWith$1");
        return null;
    }

    public static final Object then$11(C346480DiA c346480DiA, C15O7 c15o7) {
        if (((Collection) c346480DiA.l0).size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((Collection) c346480DiA.l0).iterator();
        while (it2.hasNext()) {
            arrayList.add(((C15O7) it2.next()).LJIIL());
        }
        return arrayList;
    }

    public static final Object then$2(C346480DiA c346480DiA, C15O7 c15o7) {
        C1C7U.LIZ("ShopMallMixViewModel@a591.loadMixChunkData$1$4");
        ((Function2) c346480DiA.l0).invoke(c15o7.LJIIL(), c15o7.LJIIJJI());
        C1C7U.LIZIZ("ShopMallMixViewModel@a591.loadMixChunkData$1$4");
        return c15o7;
    }

    public static final Object then$3(C346480DiA c346480DiA, C15O7 c15o7) {
        C1C7U.LIZ("EPDraftProvider@89e.loadData$2");
        ((Function0) c346480DiA.l0).invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EPDraftProvider@89e.loadData$2");
        return unit;
    }

    public static final Object then$4(C346480DiA c346480DiA, C15O7 c15o7) throws Exception {
        C1588840rRq c1588840rRq = (C1588840rRq) c346480DiA.l0;
        c1588840rRq.getClass();
        C1C7U.LIZ("FollowFeedModel@b274.handleMsg$2L");
        List<InterfaceC1526205yG> list = c1588840rRq.mNotifyListeners;
        if (list != null) {
            try {
                Iterator<InterfaceC1526205yG> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().onSuccess();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            }
        }
        C1C7U.LIZIZ("FollowFeedModel@b274.handleMsg$2L");
        return null;
    }

    public static final Object then$5(C346480DiA c346480DiA, C15O7 c15o7) {
        C1C7U.LIZ("PerformanceOptAssem@fe29.callLazyDoIt$origin$1$1");
        C303320Buk.LIZ(new ARunnableS102S0100000_2((PerformanceOptAssem) c346480DiA.l0, 31));
        C1C7U.LIZIZ("PerformanceOptAssem@fe29.callLazyDoIt$origin$1$1");
        return null;
    }

    public static final Object then$6(C346480DiA c346480DiA, C15O7 c15o7) {
        Function1 function1 = (Function1) c346480DiA.l0;
        C1C7U.LIZ("AVToolsHelper@51fc.fetchData$2L");
        Object objInvoke = function1.invoke(c15o7.LJIIL());
        C1C7U.LIZIZ("AVToolsHelper@51fc.fetchData$2L");
        return objInvoke;
    }

    public static final Object then$7(C346480DiA c346480DiA, C15O7 c15o7) {
        Runnable runnable = (Runnable) c346480DiA.l0;
        C1C7U.LIZ("BoltsUtils@fdc5.callInUiDelayed$1L");
        if (runnable == null) {
            C1C7U.LIZIZ("BoltsUtils@fdc5.callInUiDelayed$1L");
            return null;
        }
        runnable.run();
        C1C7U.LIZIZ("BoltsUtils@fdc5.callInUiDelayed$1L");
        return null;
    }

    public static final Object then$8(C346480DiA c346480DiA, C15O7 c15o7) {
        LiveSDKSettingResponse liveSDKSettingResponse;
        C1AKK liteService;
        Context context = (Context) c346480DiA.l0;
        C1C7U.LIZ("LiveSDKSettingManager@9dc2.syncLiveSDKSettings$2L");
        if (!c15o7.LJIILL() && (liveSDKSettingResponse = (LiveSDKSettingResponse) c15o7.LJIIL()) != null && liveSDKSettingResponse.status_code == 0 && liveSDKSettingResponse.data != null && (liteService = Live.getLiteService()) != null) {
            liteService.LJJLIIIIJ(context, liveSDKSettingResponse.data);
        }
        C1C7U.LIZIZ("LiveSDKSettingManager@9dc2.syncLiveSDKSettings$2L");
        return null;
    }

    public static final Object then$9(C346480DiA c346480DiA, C15O7 c15o7) throws Exception {
        C1C7U.LIZ("FriendsFeedModel@e8fc.handleMsg$2");
        List<InterfaceC1526205yG> list = ((C1587810rQB) c346480DiA.l0).mNotifyListeners;
        if (list != null) {
            try {
                Iterator<InterfaceC1526205yG> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().onSuccess();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FriendsFeedModel handleMsg error ");
                sbLIZ.append(e.getMessage());
                C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                throw e;
            }
        }
        C1C7U.LIZIZ("FriendsFeedModel@e8fc.handleMsg$2");
        return null;
    }
}
