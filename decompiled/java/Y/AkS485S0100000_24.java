package Y;

import X.C11NZ;
import X.C1516320pYs;
import X.C1578400rB0;
import X.C1578410rB1;
import X.C1582990rIP;
import X.C1587740rQ4;
import X.C1601460rmC;
import X.C1605000rru;
import X.C1616240sA2;
import X.C1616250sA3;
import X.C1620410sGl;
import X.C1620430sGn;
import X.C1620500sGu;
import X.C1620520sGw;
import X.C1AF0;
import X.C20684815ws;
import X.C2241008qG;
import X.C2276411E8h;
import X.C460020I2e;
import X.C5186020i;
import X.C592002So;
import X.C714102qZ;
import X.C794420VEi;
import X.C805940VjU;
import X.C810670Vr7;
import X.InterfaceC1487280oo2;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.inbox.skylight.InboxSkylightWidgetV2;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import com.ss.android.ugc.aweme.model.PaidCollectionPaymentResponse;
import com.ss.android.ugc.aweme.payment.MarketplaceCreateOrderResponse;
import com.ss.android.ugc.aweme.series.commonfeed.component.overlay.PaidContentCellOverlayComponent;
import com.ss.android.ugc.aweme.series.payment.serviceimpl.SeriesPaymentServiceImpl;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import com.ss.android.ugc.tiktok.ConvertHelper;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class AkS485S0100000_24 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return apply$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return apply$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return apply$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return apply$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return apply$13(this, obj);
            default:
                return null;
        }
    }

    public AkS485S0100000_24(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS485S0100000_24 akS485S0100000_24, Object obj) {
        Integer num = (Integer) akS485S0100000_24.l0;
        C1578400rB0 c1578400rB0 = (C1578400rB0) obj;
        SystemClock.elapsedRealtime();
        try {
            C592002So c592002So = new C592002So(c1578400rB0.status_code, null, null, c1578400rB0.has_more, c1578400rB0.awemes, null, null, null, null, null, null, null, new ArrayList(), c1578400rB0.status_msg, null, new ArrayList(), null, null, null, null, null, null, null, new ArrayList(), null, null, null, null, null, null, null, null, null, new ArrayList(), null);
            FeedItemList feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = ConvertHelper.com$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList(c592002So, null);
            if (num != null && num.intValue() == 8 && feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList != null) {
                feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.pbData = c592002So;
            }
            SystemClock.elapsedRealtime();
            return feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("errMsg", Log.getStackTraceString(th));
            C794420VEi.LIZIZ("service_monitor", "log_bean_copy_convert_error", c2241008qG.LJ());
            C1516320pYs c1516320pYs = new C1516320pYs(th);
            C2276411E8h.LIZIZ.LIZLLL("common_feed", c1516320pYs);
            C1AF0.LJ(c1516320pYs);
            C810670Vr7.LIZJ(C460020I2e.LIZ, 0, "pb_convert_flag").edit().clear().putBoolean(C1605000rru.LIZ, true).commit();
            return new FeedItemList();
        }
    }

    public static final Object apply$1(AkS485S0100000_24 akS485S0100000_24, Object obj) {
        C1582990rIP c1582990rIP = (C1582990rIP) akS485S0100000_24.l0;
        C1620410sGl c1620410sGl = (C1620410sGl) obj;
        SystemClock.elapsedRealtime();
        try {
            C592002So c592002So = new C592002So(c1620410sGl.status_code, null, null, c1620410sGl.has_more, c1620410sGl.awemes, null, null, null, null, null, null, null, new ArrayList(), c1620410sGl.status_msg, null, new ArrayList(), null, null, null, null, null, null, null, new ArrayList(), null, null, null, null, null, null, null, null, null, new ArrayList(), null);
            FeedItemList feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = ConvertHelper.com$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList(c592002So, null);
            Integer num = c1582990rIP.LIZ;
            if (num != null && num.intValue() == 8 && feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList != null) {
                feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.pbData = c592002So;
            }
            SystemClock.elapsedRealtime();
            return feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("errMsg", Log.getStackTraceString(th));
            C794420VEi.LIZIZ("service_monitor", "log_bean_copy_convert_error", c2241008qG.LJ());
            C1516320pYs c1516320pYs = new C1516320pYs(th);
            C2276411E8h.LIZIZ.LIZLLL("common_feed", c1516320pYs);
            C1AF0.LJ(c1516320pYs);
            C810670Vr7.LIZJ(C460020I2e.LIZ, 0, "pb_convert_flag").edit().clear().putBoolean(C1605000rru.LIZ, true).commit();
            return new FeedItemList();
        }
    }

    public static final Object apply$10(AkS485S0100000_24 akS485S0100000_24, Object obj) {
        return new Pair(obj, ((MarketplaceCreateOrderResponse) akS485S0100000_24.l0).orderId);
    }

    public static final Object apply$11(AkS485S0100000_24 akS485S0100000_24, Object obj) {
        return ((SeriesPaymentServiceImpl) akS485S0100000_24.l0).LJFF.LJJJJZI(new AkS485S0100000_24((MarketplaceCreateOrderResponse) obj, 10));
    }

    public static final Object apply$12(AkS485S0100000_24 akS485S0100000_24, Object obj) {
        return new Pair(obj, ((PaidCollectionPaymentResponse) akS485S0100000_24.l0).paidContentOrderId);
    }

    public static final Object apply$13(AkS485S0100000_24 akS485S0100000_24, Object obj) {
        return ((SeriesPaymentServiceImpl) akS485S0100000_24.l0).LJFF.LJJJJZI(new AkS485S0100000_24((PaidCollectionPaymentResponse) obj, 12));
    }

    public static final Object apply$2(AkS485S0100000_24 akS485S0100000_24, Object obj) {
        C1582990rIP c1582990rIP = (C1582990rIP) akS485S0100000_24.l0;
        C1620430sGn c1620430sGn = (C1620430sGn) obj;
        SystemClock.elapsedRealtime();
        try {
            C592002So c592002So = new C592002So(c1620430sGn.status_code, null, null, c1620430sGn.has_more, c1620430sGn.awemes, null, null, null, null, null, null, null, new ArrayList(), c1620430sGn.status_msg, null, new ArrayList(), null, null, null, null, null, null, null, new ArrayList(), null, null, null, null, null, null, null, null, null, new ArrayList(), null);
            FeedItemList feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = ConvertHelper.com$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList(c592002So, null);
            Integer num = c1582990rIP.LIZ;
            if (num != null && num.intValue() == 8 && feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList != null) {
                feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.pbData = c592002So;
            }
            SystemClock.elapsedRealtime();
            return feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("errMsg", Log.getStackTraceString(th));
            C794420VEi.LIZIZ("service_monitor", "log_bean_copy_convert_error", c2241008qG.LJ());
            C1516320pYs c1516320pYs = new C1516320pYs(th);
            C2276411E8h.LIZIZ.LIZLLL("common_feed", c1516320pYs);
            C1AF0.LJ(c1516320pYs);
            C810670Vr7.LIZJ(C460020I2e.LIZ, 0, "pb_convert_flag").edit().clear().putBoolean(C1605000rru.LIZ, true).commit();
            return new FeedItemList();
        }
    }

    public static final Object apply$3(AkS485S0100000_24 akS485S0100000_24, Object obj) {
        Integer num = (Integer) akS485S0100000_24.l0;
        C1578410rB1 c1578410rB1 = (C1578410rB1) obj;
        SystemClock.elapsedRealtime();
        try {
            C592002So c592002So = new C592002So(c1578410rB1.status_code, null, null, c1578410rB1.has_more, c1578410rB1.awemes, null, null, null, null, null, null, null, new ArrayList(), c1578410rB1.status_msg, null, new ArrayList(), null, null, null, null, null, null, null, new ArrayList(), null, null, null, null, null, null, null, null, null, new ArrayList(), null);
            FeedItemList feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = ConvertHelper.com$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList(c592002So, null);
            if (num != null && num.intValue() == 8 && feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList != null) {
                feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.pbData = c592002So;
            }
            SystemClock.elapsedRealtime();
            return feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("errMsg", Log.getStackTraceString(th));
            C794420VEi.LIZIZ("service_monitor", "log_bean_copy_convert_error", c2241008qG.LJ());
            C1516320pYs c1516320pYs = new C1516320pYs(th);
            C2276411E8h.LIZIZ.LIZLLL("common_feed", c1516320pYs);
            C1AF0.LJ(c1516320pYs);
            return new FeedItemList();
        }
    }

    public static final Object apply$4(AkS485S0100000_24 akS485S0100000_24, Object obj) {
        return ((PaidContentCellOverlayComponent) akS485S0100000_24.l0).LLLFFI;
    }

    public static final Object apply$5(AkS485S0100000_24 akS485S0100000_24, Object obj) {
        C592002So c592002So;
        Integer num;
        Integer num2;
        List<C5186020i> list;
        String str;
        FeedItemList feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList;
        C1620500sGu c1620500sGu;
        C1620520sGw c1620520sGw = (C1620520sGw) obj;
        SystemClock.elapsedRealtime();
        try {
            String str2 = null;
            if (c1620520sGw != null) {
                num = c1620520sGw.status_code;
            } else {
                num = null;
            }
            if (c1620520sGw == null) {
                num2 = null;
                list = null;
            } else {
                num2 = c1620520sGw.has_more;
                list = c1620520sGw.aweme_list;
            }
            if (c1620520sGw != null && (c1620500sGu = c1620520sGw.log_pb) != null) {
                str = c1620500sGu.impr_id;
            } else {
                str = null;
            }
            C714102qZ c714102qZ = new C714102qZ(str);
            ArrayList arrayList = new ArrayList();
            if (c1620520sGw != null) {
                str2 = c1620520sGw.status_msg;
            }
            c592002So = new C592002So(num, null, null, num2, list, null, null, null, null, c714102qZ, null, null, arrayList, str2, null, new ArrayList(), null, null, null, null, null, null, null, new ArrayList(), null, null, null, null, null, null, null, null, null, new ArrayList(), null);
            feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = ConvertHelper.com$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList(c592002So, null);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (((C1601460rmC) akS485S0100000_24.l0).LIZIZ == 8 && feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList != null) {
                feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.pbData = c592002So;
            }
            SystemClock.elapsedRealtime();
            return feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList;
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            C1516320pYs c1516320pYs = new C1516320pYs(th);
            C1AF0.LJFF(c1516320pYs, "feedapi");
            throw c1516320pYs;
        }
    }

    public static final Object apply$6(AkS485S0100000_24 akS485S0100000_24, Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof C805940VjU) {
            C1616250sA3 c1616250sA3 = (C1616250sA3) akS485S0100000_24.l0;
            int i = c1616250sA3.LL;
            c1616250sA3.LL = i + 1;
            if (i < ((Number) c1616250sA3.LLILLJJLI.getValue()).intValue()) {
                C20684815ws.LJIJI("friends_feed_empty_client_retry", new Pair(2, "pull_type"), new Pair(Integer.valueOf(((C1616250sA3) akS485S0100000_24.l0).LL), "retry_times"));
                return C11NZ.LJLJJLL(0L, TimeUnit.MILLISECONDS);
            }
        }
        return C11NZ.LJJIJLIJ(th);
    }

    public static final Object apply$7(AkS485S0100000_24 akS485S0100000_24, Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof C805940VjU) {
            C1616240sA2 c1616240sA2 = (C1616240sA2) akS485S0100000_24.l0;
            int i = c1616240sA2.LL;
            c1616240sA2.LL = i + 1;
            if (i < ((Number) c1616240sA2.LLILLJJLI.getValue()).intValue()) {
                C20684815ws.LJIJI("friends_feed_empty_client_retry", new Pair(1, "pull_type"), new Pair(Integer.valueOf(((C1616240sA2) akS485S0100000_24.l0).LL), "retry_times"));
                C1587740rQ4.LIZ.getClass();
                if (!C1587740rQ4.LJIJI) {
                    C1587740rQ4.LJIILJJIL = ((C1616240sA2) akS485S0100000_24.l0).LL;
                }
                return C11NZ.LJJJJZ(Integer.valueOf(((C1616240sA2) akS485S0100000_24.l0).LL));
            }
        }
        return C11NZ.LJJIJLIJ(th);
    }

    public static final Object apply$8(AkS485S0100000_24 akS485S0100000_24, Object obj) {
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod;
        StoryGetFeedByPageResponse storyGetFeedByPageResponse;
        StoryGetFeedByPageResponse storyGetFeedByPageResponse2 = (StoryGetFeedByPageResponse) obj;
        if (Intrinsics.LJFF(storyGetFeedByPageResponse2.isDemotioned(), Boolean.TRUE) && (inboxHorizontalTopListCombinePod = ((InboxSkylightWidgetV2) akS485S0100000_24.l0).LLJJJJLIIL) != null && (storyGetFeedByPageResponse = inboxHorizontalTopListCombinePod.getStoryGetFeedByPageResponse()) != null) {
            return storyGetFeedByPageResponse;
        }
        return storyGetFeedByPageResponse2;
    }

    public static final Object apply$9(AkS485S0100000_24 akS485S0100000_24, Object obj) {
        return new Pair(obj, ((MarketplaceCreateOrderResponse) akS485S0100000_24.l0).orderId);
    }
}
