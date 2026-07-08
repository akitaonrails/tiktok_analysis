package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.liveevent.LiveEventPreviewInfoSimplifyEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePaidEventDRMSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RemoveNotRecommendPreLiveSetting;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.FYPCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.live.FYPartnershipInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveEventInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.PaidEventPreview;
import com.ss.android.ugc.aweme.feed.model.live.ParallelPullStreamInfo;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1ABT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ABT {
    public static final void LIZ(C1ACA c1aca) {
        LiveRoomStruct liveRoomStruct;
        String str;
        LiveRoomStruct liveRoomStruct2;
        ParallelPullStreamInfo parallelPullStreamInfo;
        if (c1aca != null && c1aca.LJJLIIIJILLIZJL == null && c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null && liveRoomStruct.parallelPullStreamInfo != null) {
            if (c1aca == null || (liveRoomStruct2 = c1aca.LIZJ) == null || (parallelPullStreamInfo = liveRoomStruct2.parallelPullStreamInfo) == null || (str = parallelPullStreamInfo.featureDetail) == null) {
                str = "";
                if (c1aca == null) {
                    return;
                }
            }
            c1aca.LJJLIIIJILLIZJL = new JSONObject(str);
        }
    }

    public static final boolean LIZIZ(C1ACA c1aca) {
        return TextUtils.equals(c1aca.LIZLLL, "homepage_live");
    }

    public static final void LIZJ(C1ACA c1aca) {
        c1aca.LJIJJ.clear();
        LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
        if (liveRoomStruct != null && !liveRoomStruct.isShow && C2093608Ic.LIZJ(c1aca.LJ, "homepage_hot")) {
            if (RemoveNotRecommendPreLiveSetting.INSTANCE.enable()) {
                c1aca.LJIJJ.add("nr");
            }
            c1aca.LJIJJ.add("pause");
        }
        c1aca.LJIJJ.add("nostream");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZLLL(X.C1ACA r2) {
        /*
            java.lang.String r2 = r2.LJ
            int r0 = r2.hashCode()
            switch(r0) {
                case -667094460: goto Lc;
                case -292561530: goto L15;
                case 910581405: goto L1e;
                case 1691937916: goto L27;
                default: goto L9;
            }
        L9:
            java.lang.String r1 = "homepage_follow"
        Lb:
            return r1
        Lc:
            java.lang.String r1 = "homepage_friends"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto Lb
            goto L9
        L15:
            java.lang.String r1 = "mall_racun_channel"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto Lb
            goto L9
        L1e:
            java.lang.String r1 = "homepage_live"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto Lb
            goto L9
        L27:
            java.lang.String r1 = "homepage_hot"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto Lb
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ABT.LIZLLL(X.1ACA):java.lang.String");
    }

    public static final String LJ(C1ACA c1aca) {
        FYPartnershipInfo fYPartnershipInfo;
        String str;
        LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
        boolean z = true;
        if (liveRoomStruct == null || (!liveRoomStruct.isScreenshot && liveRoomStruct.liveRoomMode != 6)) {
            z = false;
        }
        if (!z || liveRoomStruct == null || (fYPartnershipInfo = liveRoomStruct.partnershipInfo) == null || (str = fYPartnershipInfo.promotingDropsId) == null) {
            return "";
        }
        return str;
    }

    public static final SlimRoom.LinkMic LJFF(C1ACA c1aca) {
        LiveRoomStruct liveRoomStruct;
        String str;
        if (c1aca.LJJIII == null && (liveRoomStruct = c1aca.LIZJ) != null && (str = liveRoomStruct.linkMic) != null) {
            c1aca.LJJIII = (SlimRoom.LinkMic) C2183471Acr.LIZ(str, new C2261501DfQ());
        }
        return c1aca.LJJIII;
    }

    public static final boolean LJII(LiveRoomStruct liveRoomStruct) {
        long jLongValue;
        Long productNum;
        IHostCommerce iHostCommerce = (IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preview(");
        sbLIZ.append(liveRoomStruct.id);
        sbLIZ.append(')');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean z = liveRoomStruct.hasCommerceGoods;
        boolean z2 = liveRoomStruct.existedCommerceGoods;
        FYPCommerceStruct fYPCommerceStruct = liveRoomStruct.fypCommerceStruct;
        if (fYPCommerceStruct != null && (productNum = fYPCommerceStruct.getProductNum()) != null) {
            jLongValue = productNum.longValue();
        } else {
            jLongValue = -1;
        }
        return iHostCommerce.Pf((int) jLongValue, strLIZIZ, z, z2);
    }

    public static final boolean LJIIIIZZ(C1ACA c1aca) {
        LiveRoomStruct liveRoomStruct;
        FYPartnershipInfo fYPartnershipInfo;
        String str;
        if (c1aca == null || (liveRoomStruct = c1aca.LIZJ) == null || (fYPartnershipInfo = liveRoomStruct.partnershipInfo) == null || (str = fYPartnershipInfo.promotingDropsId) == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIZ(C1ACA c1aca) {
        JSONObject jSONObject;
        try {
            LIZ(c1aca);
            if (c1aca != null && (jSONObject = c1aca.LJJLIIIJILLIZJL) != null) {
                if (jSONObject.optInt("treco_room_anchor_all_fan_ticket_100x_pass", -1) == 1) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
            return false;
        }
    }

    public static final boolean LJIIJ(C1ACA c1aca) {
        LiveEventInfo liveEventInfo;
        LiveEventInfo liveEventInfo2;
        LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
        if (liveRoomStruct != null) {
            liveEventInfo = liveRoomStruct.liveEventInfo;
        } else {
            liveEventInfo = null;
        }
        if (liveEventInfo == null || liveRoomStruct == null || (liveEventInfo2 = liveRoomStruct.liveEventInfo) == null || !Intrinsics.LJFF(liveEventInfo2.isPaidEvent(), Boolean.FALSE)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJJI(C1ACA c1aca) {
        JSONObject jSONObject;
        try {
            LIZ(c1aca);
            if (c1aca != null && (jSONObject = c1aca.LJJLIIIJILLIZJL) != null) {
                if (jSONObject.optInt("treco_user_consume_amt_30_day_layer_pass", -1) == 1) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
            return false;
        }
    }

    public static final boolean LJIIL(LiveRoomStruct liveRoomStruct) {
        LiveEventInfo liveEventInfo = liveRoomStruct.liveEventInfo;
        if (liveEventInfo != null && Intrinsics.LJFF(liveEventInfo.isPaidEvent(), Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILIIL(C1ACA c1aca) {
        LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
        if (liveRoomStruct != null && liveRoomStruct.topFrameSummary != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILJJIL(LiveRoomStruct liveRoomStruct) {
        long j;
        long jLongValue;
        PaidEventPreview paidEventPreview;
        Long l;
        StreamUrlStruct streamUrlStruct = liveRoomStruct.stream_url;
        if (streamUrlStruct != null) {
            j = streamUrlStruct.aliveTimestamp;
        } else {
            j = 0;
        }
        LiveEventInfo liveEventInfo = liveRoomStruct.liveEventInfo;
        if (liveEventInfo != null && (paidEventPreview = liveEventInfo.paidEventPreview) != null && (l = paidEventPreview.allowPreviewTime) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (j <= 0 || (j - C963140bAe.LIZJ()) - 10000 >= jLongValue) {
            return false;
        }
        return true;
    }

    public static final void LJIILL(C1ACA c1aca) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        long j;
        Context context;
        boolean z;
        C1ABU c1abu = c1aca.LJJIIZI;
        if (c1abu == null || C500260Jjc.LJJJI(Boolean.valueOf(c1abu.LIZ))) {
            return;
        }
        C1ABU c1abu2 = c1aca.LJJIIZI;
        if (c1abu2 != null) {
            c1abu2.LIZ = true;
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        IMessageManager iMessageManagerLJJLIIIJILLIZJL = null;
        EnumC19379710rr enumC19379710rr = null;
        iMessageManagerLJJLIIIJILLIZJL = null;
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
            C1ABU c1abu3 = c1aca.LJJIIZI;
            if (c1abu3 != null) {
                j = c1abu3.LIZIZ;
            } else {
                j = 0;
            }
            if (c1abu3 != null) {
                context = c1abu3.LIZJ;
            } else {
                context = null;
            }
            if (c1abu3 != null) {
                z = c1abu3.LIZLLL;
                enumC19379710rr = c1abu3.LJ;
            } else {
                z = false;
            }
            iMessageManagerLJJLIIIJILLIZJL = interfaceC20673515v3K4.LJJLIIIJILLIZJL(j, false, context, true, z, enumC19379710rr);
        }
        c1aca.LJJIIZ = iMessageManagerLJJLIIIJILLIZJL;
    }

    public static final EnumC2175001AAg LJIILLIIL(LiveRoomStruct liveRoomStruct) {
        Long l;
        Long l2;
        if (liveRoomStruct.liveEventInfo != null) {
            if (LivePaidEventDRMSetting.INSTANCE.getValue().enableStandardDRM && Intrinsics.LJFF(liveRoomStruct.liveEventInfo.isPaidEvent(), Boolean.TRUE) && liveRoomStruct.liveEventInfo.subscribed) {
                return EnumC2175001AAg.PAID_MASK;
            }
            LiveEventInfo liveEventInfo = liveRoomStruct.liveEventInfo;
            if (!liveEventInfo.subscribed && Intrinsics.LJFF(liveEventInfo.isPaidEvent(), Boolean.TRUE)) {
                PaidEventPreview paidEventPreview = liveRoomStruct.liveEventInfo.paidEventPreview;
                if (paidEventPreview != null && (l = paidEventPreview.allowPreview) != null && l.longValue() == 1 && (l2 = paidEventPreview.allowPreviewTime) != null && l2.longValue() > 0) {
                    return EnumC2175001AAg.PREVIEW;
                }
                return EnumC2175001AAg.MASK;
            }
            return EnumC2175001AAg.NORMAL;
        }
        return EnumC2175001AAg.NORMAL;
    }

    public static final long LJIIZILJ(C1ACA c1aca) {
        LiveRoomStruct liveRoomStruct;
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null) {
            return liveRoomStruct.id;
        }
        return 0L;
    }

    public static final String LJIJ(C1ACA c1aca) {
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
        String requestId = null;
        if (liveRoomStruct != null) {
            lValueOf = Long.valueOf(liveRoomStruct.id);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append('-');
        Aweme aweme = c1aca.LIZIZ;
        if (aweme != null) {
            requestId = aweme.getRequestId();
        }
        sbLIZ.append(requestId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final int LJIJI(C1ACA c1aca) {
        try {
            LIZ(c1aca);
            if (LJIIJJI(c1aca) && LJIIIZ(c1aca)) {
                return 3;
            }
            if (LJIIJJI(c1aca)) {
                return 1;
            }
            if (LJIIIZ(c1aca)) {
                return 2;
            }
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
            return 0;
        }
    }

    public static final String LJI(Context context, boolean z) {
        if (z) {
            LiveEventPreviewInfoSimplifyEnableSetting.INSTANCE.enable();
            C512350K7l.LIZ.getClass();
            return C512350K7l.LIZIZ(2131841722, context);
        }
        LiveEventPreviewInfoSimplifyEnableSetting.INSTANCE.enable();
        C512350K7l.LIZ.getClass();
        return C512350K7l.LIZIZ(2131841726, context);
    }
}
