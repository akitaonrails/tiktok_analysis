package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.deeplink.DeepLinkData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IVR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IVR {
    public static final Map<String, String> LJI(EnterRoomConfig enterRoomConfig) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EnterRoomConfig.ECWrapData eCWrapData = enterRoomConfig.mECData;
        if (eCWrapData != null && (str = eCWrapData.ecRecommendInfo) != null && str.length() > 0) {
            linkedHashMap.put("ecom_live_rcmd_info", String.valueOf(enterRoomConfig.mECData.ecRecommendInfo));
        }
        return linkedHashMap;
    }

    public static final String LJIIIIZZ(EnterRoomConfig enterRoomConfig) {
        if (Intrinsics.LJFF(enterRoomConfig.mRoomsData.hasCommerceGoods, Boolean.TRUE)) {
            return "1";
        }
        CommerceStruct commerceStruct = enterRoomConfig.mRoomsData.commerceStruct;
        if (commerceStruct != null && commerceStruct.commercePermission == 1) {
            return "2";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static final boolean LJIIIZ(EnterRoomConfig enterRoomConfig) {
        if (Intrinsics.LJFF(enterRoomConfig.mRoomsData.hasCommerceGoods, Boolean.TRUE)) {
            return true;
        }
        CommerceStruct commerceStruct = enterRoomConfig.mRoomsData.commerceStruct;
        if (commerceStruct != null && commerceStruct.commercePermission == 1) {
            return true;
        }
        return false;
    }

    public static final void LIZ(SlimRoom slimRoom, EnterRoomConfig enterRoomConfig) {
        StreamUrlExtra.SrConfig srConfig;
        Long lValueOf;
        Long lValueOf2;
        Integer numValueOf;
        if (slimRoom != null) {
            EnterRoomConfig.StreamData streamData = enterRoomConfig.mStreamData;
            streamData.isWithPush = true;
            streamData.streamRoomId = slimRoom.getId();
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            logData.logId = slimRoom.logId;
            logData.forcedLowLatency = slimRoom.forcedLowLatency();
            String strBuildPullUrl = slimRoom.buildPullUrl();
            String sdkParams = slimRoom.getSdkParams();
            String multiStreamData = slimRoom.getMultiStreamData();
            String multiStreamDefaultQualitySdkKey = slimRoom.getMultiStreamDefaultQualitySdkKey();
            int iOrdinal = slimRoom.getStreamType().ordinal();
            StreamUrlExtra streamUrlExtraSafely = slimRoom.getStreamUrlExtraSafely();
            String str = null;
            if (streamUrlExtraSafely != null) {
                srConfig = streamUrlExtraSafely.srConfig;
            } else {
                srConfig = null;
            }
            StreamUrl streamUrl = slimRoom.getStreamUrl();
            if (streamUrl != null) {
                lValueOf = Long.valueOf(streamUrl.streamDelayMs);
            } else {
                lValueOf = null;
            }
            String options = slimRoom.getOptions();
            StreamUrl streamUrl2 = slimRoom.getStreamUrl();
            if (streamUrl2 != null) {
                lValueOf2 = Long.valueOf(streamUrl2.aliveTimestamp);
            } else {
                lValueOf2 = null;
            }
            StreamUrl streamUrl3 = slimRoom.getStreamUrl();
            if (streamUrl3 != null) {
                numValueOf = Integer.valueOf(streamUrl3.drmType);
            } else {
                numValueOf = null;
            }
            StreamUrl streamUrl4 = slimRoom.getStreamUrl();
            if (streamUrl4 != null) {
                str = streamUrl4.streamLanguage;
            }
            LIZJ(enterRoomConfig, strBuildPullUrl, sdkParams, multiStreamData, multiStreamDefaultQualitySdkKey, iOrdinal, srConfig, lValueOf, options, lValueOf2, numValueOf, str);
            enterRoomConfig.mRoomsData.enlargeView = slimRoom.enlargeViewInfo;
        }
    }

    public static final void LIZIZ(SlimRoom slimRoom, EnterRoomConfig enterRoomConfig) {
        Long lValueOf;
        EnterRoomConfig.StreamData streamData = enterRoomConfig.mSubStreamData;
        streamData.isWithPush = true;
        streamData.streamRoomId = slimRoom.getId();
        String strBuildExtraSreamPullUrl = slimRoom.buildExtraSreamPullUrl();
        String extraSdkParams = slimRoom.getExtraSdkParams();
        String extraStreamData = slimRoom.getExtraStreamData();
        String extraStreamDefaultQualitySdkKey = slimRoom.getExtraStreamDefaultQualitySdkKey();
        int iOrdinal = slimRoom.getStreamType().ordinal();
        StreamUrlExtra.SrConfig srConfig = slimRoom.getExtraStreamUrlExtra().srConfig;
        StreamUrl streamUrl = slimRoom.multiStreamUrl;
        if (streamUrl != null) {
            lValueOf = Long.valueOf(streamUrl.streamDelayMs);
        } else {
            lValueOf = null;
        }
        LJFF(enterRoomConfig, strBuildExtraSreamPullUrl, extraSdkParams, extraStreamData, extraStreamDefaultQualitySdkKey, iOrdinal, srConfig, lValueOf, slimRoom.getOptions(), Boolean.valueOf(slimRoom.isMainStreamHorizontal()));
        enterRoomConfig.mRoomsData.enlargeView = slimRoom.enlargeViewInfo;
    }

    public static final void LIZLLL(Room room, EnterRoomConfig enterRoomConfig) {
        Long lValueOf;
        Long lValueOf2;
        Integer numValueOf;
        String strBuildPullUrl = room.buildPullUrl();
        String sdkParams = room.getSdkParams();
        String multiStreamData = room.getMultiStreamData();
        String multiStreamDefaultQualitySdkKey = room.getMultiStreamDefaultQualitySdkKey();
        int iOrdinal = room.getStreamType().ordinal();
        StreamUrlExtra.SrConfig streamSrConfig = room.getStreamSrConfig();
        StreamUrl streamUrl = room.getStreamUrl();
        String str = null;
        if (streamUrl != null) {
            lValueOf = Long.valueOf(streamUrl.streamDelayMs);
        } else {
            lValueOf = null;
        }
        String json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, room.getOptions());
        StreamUrl streamUrl2 = room.getStreamUrl();
        if (streamUrl2 != null) {
            lValueOf2 = Long.valueOf(streamUrl2.aliveTimestamp);
        } else {
            lValueOf2 = null;
        }
        StreamUrl streamUrl3 = room.getStreamUrl();
        if (streamUrl3 != null) {
            numValueOf = Integer.valueOf(streamUrl3.drmType);
        } else {
            numValueOf = null;
        }
        StreamUrl streamUrl4 = room.getStreamUrl();
        if (streamUrl4 != null) {
            str = streamUrl4.streamLanguage;
        }
        LIZJ(enterRoomConfig, strBuildPullUrl, sdkParams, multiStreamData, multiStreamDefaultQualitySdkKey, iOrdinal, streamSrConfig, lValueOf, json, lValueOf2, numValueOf, str);
        enterRoomConfig.mRoomsData.enlargeView = room.enlargeViewInfo;
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        logData.logId = room.logId;
        logData.forcedLowLatency = room.isForcedLowLatency();
    }

    public static final void LJ(Room room, EnterRoomConfig enterRoomConfig) {
        Long lValueOf;
        String strBuildExtraSreamPullUrl = room.buildExtraSreamPullUrl();
        String extraSdkParams = room.getExtraSdkParams();
        String extraStreamData = room.getExtraStreamData();
        String extraStreamDefaultQualitySdkKey = room.getExtraStreamDefaultQualitySdkKey();
        int iOrdinal = room.getStreamType().ordinal();
        StreamUrlExtra.SrConfig srConfig = room.getExtraStreamUrlExtra().srConfig;
        StreamUrl streamUrl = room.multiStreamUrl;
        if (streamUrl != null) {
            lValueOf = Long.valueOf(streamUrl.streamDelayMs);
        } else {
            lValueOf = null;
        }
        LJFF(enterRoomConfig, strBuildExtraSreamPullUrl, extraSdkParams, extraStreamData, extraStreamDefaultQualitySdkKey, iOrdinal, srConfig, lValueOf, GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, room.getOptions()), Boolean.valueOf(room.isMainStreamHorizontal()));
    }

    public static final void LJIIJ(EnterRoomConfig enterRoomConfig, Map<String, String> map) {
        HashMap map2 = (HashMap) map;
        map2.put("enter_from_merge", enterRoomConfig.mRoomsData.enterFromMerge);
        map2.put("enter_method", enterRoomConfig.mRoomsData.enterMethod);
        map2.put("gift_id", String.valueOf(enterRoomConfig.mRoomsData.anchorGiftId));
        map2.put("gift_panel", String.valueOf(enterRoomConfig.mRoomsData.openGiftPanel));
        map2.put("enter_url_source", enterRoomConfig.mLogData.enterGiftPanelSource);
        map2.put("enter_square_source", enterRoomConfig.mLogData.enterLiveSquareSource);
        map2.put("open_url_link", enterRoomConfig.mRoomsData.openUrlLink);
        String str = enterRoomConfig.mLogData.landingTab;
        if (str != null) {
            map2.put("landing_tab", str);
        }
        String str2 = enterRoomConfig.mLogData.liveTabSource;
        if (str2 != null) {
            map2.put("live_tab_source", str2);
        }
        String str3 = enterRoomConfig.mLogData.topLiveSource;
        if (str3 != null) {
            map2.put("top_live_source", str3);
        }
        Integer num = enterRoomConfig.mLogData.isFirstRecharge;
        if (num != null) {
            map2.put("is_first_recharge", String.valueOf(num.intValue()));
        }
        Integer num2 = enterRoomConfig.mLogData.rechargePackage;
        if (num2 != null) {
            map2.put("recharge_package", String.valueOf(num2.intValue()));
        }
        String str4 = enterRoomConfig.mLogData.rechargeType;
        if (str4 != null) {
            map2.put("recharge_type", str4);
        }
        Integer num3 = enterRoomConfig.mLogData.balanceLiveLine;
        if (num3 != null) {
            map2.put("balance_live_line", String.valueOf(num3.intValue()));
        }
        Integer num4 = enterRoomConfig.mLogData.balanceLivePosition;
        if (num4 != null) {
            map2.put("balance_live_position", String.valueOf(num4.intValue()));
        }
        Integer num5 = enterRoomConfig.mLogData.isConsumeNewUser;
        if (num5 != null) {
            map2.put("is_consume_new_user", String.valueOf(num5.intValue()));
        }
        Integer num6 = enterRoomConfig.mLogData.webappLiveLine;
        if (num6 != null) {
            map2.put("webapp_live_line", String.valueOf(num6.intValue()));
        }
        Integer num7 = enterRoomConfig.mLogData.webappLivePosition;
        if (num7 != null) {
            map2.put("webapp_live_position", String.valueOf(num7.intValue()));
        }
        String str5 = enterRoomConfig.mLogData.sharePlatform;
        if (str5 != null) {
            map2.put("utm_source", str5);
        }
        String str6 = enterRoomConfig.mLogData.webId;
        if (str6 != null) {
            map2.put("wid", str6);
        }
        String str7 = enterRoomConfig.mLogData.isDirectOpenApp;
        if (str7 != null) {
            map2.put("is_direct_open_app", str7);
        }
        String str8 = enterRoomConfig.mLogData.shareFromUserId;
        if (str8 != null) {
            map2.put("share_from_user_id", str8);
        }
        String str9 = enterRoomConfig.mLogData.openFromSchema;
        if (str9 != null) {
            map2.put("open_from_schema", str9);
        }
        String str10 = enterRoomConfig.mLogData.originalUri;
        if (str10 != null) {
            map2.put("original_uri", str10);
        }
    }

    public static final void LJIIJJI(Uri uri, EnterRoomConfig enterRoomConfig) {
        Long lLJIILIIL;
        Integer numLJIIJJI;
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_merge");
        String str = "webview";
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "webview";
        }
        roomsData.enterFromMerge = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_method");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
            str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        }
        roomsData2.enterMethod = str;
        enterRoomConfig.mLogData.enterLiveSquareSource = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_square_source");
        enterRoomConfig.mLogData.originalUri = uri.toString();
        enterRoomConfig.mLogData.landingTab = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "landing_tab");
        enterRoomConfig.mLogData.liveTabSource = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "live_tab_source");
        enterRoomConfig.mLogData.topLiveSource = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "top_live_source");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gift_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_selected");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null || (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4)) == null || numLJIIJJI.intValue() == 0) {
                enterRoomConfig.mRoomsData.anchorGiftId = jLongValue;
            }
            enterRoomConfig.mRoomsData.openGiftPanel = true;
            enterRoomConfig.mLogData.enterGiftPanelSource = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_url_source");
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "open_url_link");
        if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5)) {
            enterRoomConfig.mRoomsData.openUrlLink = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
        }
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_direct_open_app");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = CardStruct.IStatusCode.DEFAULT;
        }
        logData.isDirectOpenApp = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6;
        enterRoomConfig.mLogData.webId = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "wid");
        LJIIL(uri, enterRoomConfig);
        if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "business_extra") != null) {
            JSONObject jSONObject = new JSONObject(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "business_extra"));
            Integer numValueOf = Integer.valueOf(jSONObject.optInt("is_first_recharge", -1));
            if (numValueOf.intValue() > -1) {
                enterRoomConfig.mLogData.isFirstRecharge = Integer.valueOf(numValueOf.intValue());
            }
            Integer numValueOf2 = Integer.valueOf(jSONObject.optInt("recharge_package", -1));
            if (numValueOf2.intValue() > -1) {
                enterRoomConfig.mLogData.rechargePackage = Integer.valueOf(numValueOf2.intValue());
            }
            String strOptString = jSONObject.optString("recharge_type");
            if ((!TextUtils.isEmpty(strOptString)) && strOptString != null) {
                enterRoomConfig.mLogData.rechargeType = strOptString;
            }
            Integer numValueOf3 = Integer.valueOf(jSONObject.optInt("balance_live_line", -1));
            if (numValueOf3.intValue() > -1) {
                enterRoomConfig.mLogData.balanceLiveLine = Integer.valueOf(numValueOf3.intValue());
            }
            Integer numValueOf4 = Integer.valueOf(jSONObject.optInt("balance_live_position", -1));
            if (numValueOf4.intValue() > -1) {
                enterRoomConfig.mLogData.balanceLivePosition = Integer.valueOf(numValueOf4.intValue());
            }
            Integer numValueOf5 = Integer.valueOf(jSONObject.optInt("is_consume_new_user", -1));
            if (numValueOf5.intValue() > -1) {
                enterRoomConfig.mLogData.isConsumeNewUser = Integer.valueOf(numValueOf5.intValue());
            }
        }
    }

    public static final void LJIIL(Uri uri, EnterRoomConfig enterRoomConfig) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "params_url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
            uri = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        enterRoomConfig.mLogData.sharePlatform = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_source");
        enterRoomConfig.mLogData.shareFromUserId = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "share_from_user_id");
        if (u.LJIJI(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_campaign"), "client_share", false)) {
            enterRoomConfig.mRoomsData.fromShareDeepLink = true;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_merge");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
            enterRoomConfig.mRoomsData.enterFromMerge = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_method");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
            enterRoomConfig.mRoomsData.enterMethod = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        }
    }

    public static final void LJII(EnterRoomConfig enterRoomConfig, Uri uri, boolean z) {
        long jLongValue;
        Object objLJII;
        int iIntValue;
        int iIntValue2;
        long jLongValue2;
        boolean z2;
        Object c098200Yq;
        boolean z3;
        int iIntValue3;
        Integer numLJIIJJI;
        Long lLJIILIIL;
        Integer numLJIIJJI2;
        Pair pair;
        Long lLJIILIIL2;
        Integer numLJIIJJI3;
        Long lLJIILIIL3;
        Integer numLJIIJJI4;
        Integer numLJIIJJI5;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Long lLJIILIIL4;
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "room_id");
        long jLongValue3 = -1;
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && (lLJIILIIL4 = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) != null) {
            jLongValue = lLJIILIIL4.longValue();
        } else {
            jLongValue = -1;
        }
        roomsData.roomId = jLongValue;
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        if (roomsData2.roomId > 0) {
            roomsData2.orientation = -1;
        }
        if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "room_id_list")) != null) {
            try {
                objLJII = C19748512Ol.LIZIZ.LJII(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, long[].class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                objLJII = null;
            }
        } else {
            objLJII = null;
        }
        roomsData2.roomIds = (long[]) objLJII;
        enterRoomConfig.mRoomsData.feedUrl = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "feed_url");
        enterRoomConfig.mLogData.innerPushType = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "inner_push_type");
        enterRoomConfig.mLogData.gdLabel = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label");
        enterRoomConfig.mLogData.enterLiveModule = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_module");
        enterRoomConfig.mLogData.requestId = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "request_id");
        enterRoomConfig.mLogData.logId = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "log_id");
        enterRoomConfig.mLogData.logPb = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "log_pb");
        enterRoomConfig.mLogData.logTopMessageType = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "top_message_type");
        enterRoomConfig.mLogData.popType = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "pop_type");
        enterRoomConfig.mLogData.videoId = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "video_id");
        enterRoomConfig.mLogData.requestPage = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "request_page");
        enterRoomConfig.mLogData.anchorType = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "anchor_type");
        enterRoomConfig.mLogData.magic3_source = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "magic3_source");
        enterRoomConfig.mLogData.magic3_activity_id = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "magic3_activityId");
        enterRoomConfig.mLogData.magic3_comptype = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "magic3_comptype");
        enterRoomConfig.mLogData.search_id = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "search_id");
        enterRoomConfig.mLogData.search_result_id = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "search_result_id");
        enterRoomConfig.mLogData.search_keyword = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "search_keyword");
        enterRoomConfig.mLogData.search_type = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "search_type");
        enterRoomConfig.mLogData.list_item_id = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "list_item_id");
        enterRoomConfig.mRoomsData.inflowKey = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "inflow_key");
        enterRoomConfig.mLogData.enterFrom = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
        enterRoomConfig.mLogData.liveRoomMode = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "live_room_mode");
        enterRoomConfig.mLogData.chatGroupId = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "chat_group_id");
        enterRoomConfig.mLogData.chatGroupOwnerUid = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "chat_group_owner_uid");
        enterRoomConfig.mLogData.chatGroupUserNum = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "chat_group_user_num");
        enterRoomConfig.mLogData.sourceBtmToken = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "source_btm_token");
        enterRoomConfig.mRoomsData.followStatus = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "follow_status");
        enterRoomConfig.mRoomsData.userId = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_id");
        enterRoomConfig.mRoomsData.enterLiveSource = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_live_source");
        if (z) {
            enterRoomConfig.mRoomsData.enterFromMerge = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_merge");
            enterRoomConfig.mRoomsData.enterMethod = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_method");
        } else {
            EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_merge");
            String str = "webview";
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "webview";
            }
            roomsData3.enterFromMerge = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
            EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_method");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null) {
                str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
            }
            roomsData4.enterMethod = str;
        }
        EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig.mRoomsData;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "drops_page_entrance");
        String str2 = "";
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = "";
        }
        roomsData5.dropsPageEntrance = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
        enterRoomConfig.mRoomsData.messageI18n = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tip_i18n");
        enterRoomConfig.mRoomsData.message = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tip");
        enterRoomConfig.mRoomsData.xtBackRoom = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "back_room");
        EnterRoomConfig.RoomsData roomsData6 = enterRoomConfig.mRoomsData;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tab_index");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 != null && (numLJIIJJI5 = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6)) != null) {
            iIntValue = numLJIIJJI5.intValue();
        } else {
            iIntValue = -1;
        }
        roomsData6.backTabIndex = iIntValue;
        EnterRoomConfig.RoomsData roomsData7 = enterRoomConfig.mRoomsData;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "landing_page");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 != null && (numLJIIJJI4 = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7)) != null) {
            iIntValue2 = numLJIIJJI4.intValue();
        } else {
            iIntValue2 = -1;
        }
        roomsData7.landingPage = iIntValue2;
        enterRoomConfig.mRoomsData.setBackUrl(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "backurl"));
        EnterRoomConfig.RoomsData roomsData8 = enterRoomConfig.mRoomsData;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "open_url");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "biz_type");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 != null && (lLJIILIIL3 = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9)) != null) {
            jLongValue2 = lLJIILIIL3.longValue();
        } else {
            jLongValue2 = -1;
        }
        roomsData8.deepLinkData = new DeepLinkData(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8, jLongValue2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "display_id"));
        EnterRoomConfig.RoomsData roomsData9 = enterRoomConfig.mRoomsData;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enable_subscription_capsule");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10)) != null && numLJIIJJI3.intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        roomsData9.sendSubscriptionCapsule = z2;
        EnterRoomConfig.RoomsData roomsData10 = enterRoomConfig.mRoomsData;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "extra_dict");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 = "";
        }
        roomsData10.extraDict = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11;
        EnterRoomConfig.RoomsData roomsData11 = enterRoomConfig.mRoomsData;
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "extra_params");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 = "{}";
            }
            c098200Yq = JSONObjectProtectorUtils.getString(new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12), "auto_route_schema");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        roomsData11.extraSchema = (String) c098200Yq;
        String str3 = enterRoomConfig.mRoomsData.userId;
        if (str3 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str3)) != null) {
            jLongValue3 = lLJIILIIL2.longValue();
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_source");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13 = "";
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13.length() > 0) {
            enterRoomConfig.mRoomsData.shareFromUserId = String.valueOf(jLongValue3);
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "share_live_intent");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "params_url");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15 = "";
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15.length() == 0) {
                pair = new Pair("", "");
            } else {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15), "share_live_intent");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16 = "";
                }
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16.length() > 0) {
                    str2 = "deeplink_share_source";
                }
                pair = new Pair(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16);
            }
            String str4 = (String) pair.getFirst();
            String str5 = (String) pair.getSecond();
            EnterRoomConfig.RoomsData roomsData12 = enterRoomConfig.mRoomsData;
            roomsData12.shareSource = str4;
            roomsData12.shareIntent = str5;
        } else {
            EnterRoomConfig.RoomsData roomsData13 = enterRoomConfig.mRoomsData;
            roomsData13.shareSource = "deeplink_share_source";
            roomsData13.shareIntent = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14;
        }
        enterRoomConfig.mRoomsData.randomMatchLinkPageEntrance = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "random_match_link_page_entrance");
        enterRoomConfig.mLogData.guestRequestId = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "guest_request_id");
        enterRoomConfig.mRoomsData.shareLiveTraceId = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "share_live_trace_id");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter17 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "mg_enter_type");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter17 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter17)) != null) {
            enterRoomConfig.mRoomsData.mgEnterType = numLJIIJJI2.intValue();
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter18 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "mg_from_source_user_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter18 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter18)) != null) {
            enterRoomConfig.mRoomsData.mgFromSourceUserId = lLJIILIIL.longValue();
        }
        EnterRoomConfig.RoomsData roomsData14 = enterRoomConfig.mRoomsData;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter19 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "multi_guest_match_type");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter19 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter19)) != null) {
            iIntValue3 = numLJIIJJI.intValue();
        } else {
            iIntValue3 = 0;
        }
        roomsData14.multiGuestMatchType = iIntValue3;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter20 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "has_commerce_goods");
        if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter20, "true") || Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter20, "1")) {
            enterRoomConfig.mRoomsData.hasCommerceGoods = Boolean.TRUE;
        }
        if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "business_extra") != null) {
            JSONObject jSONObject = new JSONObject(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "business_extra"));
            Integer numValueOf = Integer.valueOf(jSONObject.optInt("is_first_recharge", -1));
            if (numValueOf.intValue() > -1) {
                enterRoomConfig.mLogData.isFirstRecharge = Integer.valueOf(numValueOf.intValue());
            }
            Integer numValueOf2 = Integer.valueOf(jSONObject.optInt("recharge_package", -1));
            if (numValueOf2.intValue() > -1) {
                enterRoomConfig.mLogData.rechargePackage = Integer.valueOf(numValueOf2.intValue());
            }
            String strOptString = jSONObject.optString("recharge_type");
            if ((!TextUtils.isEmpty(strOptString)) && strOptString != null) {
                enterRoomConfig.mLogData.rechargeType = strOptString;
            }
            Integer numValueOf3 = Integer.valueOf(jSONObject.optInt("balance_live_line", -1));
            if (numValueOf3.intValue() > -1) {
                enterRoomConfig.mLogData.balanceLiveLine = Integer.valueOf(numValueOf3.intValue());
            }
            Integer numValueOf4 = Integer.valueOf(jSONObject.optInt("balance_live_position", -1));
            if (numValueOf4.intValue() > -1) {
                enterRoomConfig.mLogData.balanceLivePosition = Integer.valueOf(numValueOf4.intValue());
            }
            Integer numValueOf5 = Integer.valueOf(jSONObject.optInt("is_consume_new_user", -1));
            if (numValueOf5.intValue() > -1) {
                enterRoomConfig.mLogData.isConsumeNewUser = Integer.valueOf(numValueOf5.intValue());
            }
            Integer numValueOf6 = Integer.valueOf(jSONObject.optInt("webapp_live_line", -1));
            if (numValueOf6.intValue() > -1) {
                enterRoomConfig.mLogData.webappLiveLine = Integer.valueOf(numValueOf6.intValue());
            }
            Integer numValueOf7 = Integer.valueOf(jSONObject.optInt("webapp_live_position", -1));
            if (numValueOf7.intValue() > -1) {
                enterRoomConfig.mLogData.webappLivePosition = Integer.valueOf(numValueOf7.intValue());
            }
        }
        enterRoomConfig.mRoomsData.multiAccountPushUid = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "multi_account_push_uid");
        enterRoomConfig.mRoomsData.enterForJoinDirect = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "join_direct");
        EnterRoomConfig.RoomsData roomsData15 = enterRoomConfig.mRoomsData;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter21 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_recharge_reminder");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter22 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_bubble_clickable");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter23 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "coin_balance_log");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter24 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "reminder_bubble_coin_balance_threshold");
        HashMap map = new HashMap();
        map.put("is_recharge_reminder", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter21);
        map.put("is_bubble_clickable", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter22);
        map.put("coin_balance_log", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter23);
        map.put("reminder_bubble_coin_balance_threshold", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter24);
        roomsData15.rechargeReminderPushList = map;
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter25 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_direct_open_app");
        String str6 = CardStruct.IStatusCode.DEFAULT;
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter25 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter25 = CardStruct.IStatusCode.DEFAULT;
        }
        logData.isDirectOpenApp = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter25;
        enterRoomConfig.mLogData.webId = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "wid");
        EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter26 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "template_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter26 != null) {
            str6 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter26;
        }
        logData2.templateID = str6;
        enterRoomConfig.mRoomsData.mentionMsgId = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "mention_msg_id");
        LJIIL(uri, enterRoomConfig);
        enterRoomConfig.mLogData.enterMgReason = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_mg_reason");
        enterRoomConfig.mRoomsData.liveReferralSchema = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "live_referral_key");
    }

    public static final void LJFF(EnterRoomConfig enterRoomConfig, String str, String str2, String str3, String str4, int i, StreamUrlExtra.SrConfig srConfig, Long l, String str5, Boolean bool) {
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        EnterRoomConfig.StreamData streamData = enterRoomConfig.mSubStreamData;
        streamData.pullStreamUrl = str;
        streamData.pullSDKParam = str2;
        streamData.pullStreamData = str3;
        streamData.pullDefaultResolution = str4;
        streamData.streamType = i;
        streamData.options = str5;
        if (srConfig != null) {
            streamData.extraStreamSREnable = srConfig.enabled;
            streamData.extraStreamSRAntiAlias = srConfig.antiAlias;
            streamData.extraStreamSRStrength = srConfig.strength;
        }
        if (l != null) {
            streamData.captionStreamDelayMs = l.longValue();
        }
        streamData.isMultiStreamMode = true;
        streamData.isHorizontalStream = !zBooleanValue;
        EnterRoomConfig.StreamData streamData2 = enterRoomConfig.mStreamData;
        streamData2.isMultiStreamMode = true;
        streamData2.isHorizontalStream = zBooleanValue;
    }

    public static final void LIZJ(EnterRoomConfig enterRoomConfig, String str, String str2, String str3, String str4, int i, StreamUrlExtra.SrConfig srConfig, Long l, String str5, Long l2, Integer num, String str6) {
        EnterRoomConfig.StreamData streamData = enterRoomConfig.mStreamData;
        streamData.pullStreamUrl = str;
        streamData.pullSDKParam = str2;
        streamData.pullStreamData = str3;
        streamData.pullDefaultResolution = str4;
        streamData.streamType = i;
        streamData.options = str5;
        if (srConfig != null) {
            streamData.extraStreamSREnable = srConfig.enabled;
            streamData.extraStreamSRAntiAlias = srConfig.antiAlias;
            streamData.extraStreamSRStrength = srConfig.strength;
        }
        if (l != null) {
            streamData.captionStreamDelayMs = l.longValue();
        }
        if (l2 != null) {
            l2.longValue();
            streamData.aliveTimestamp = l2;
        }
        if (num != null) {
            num.intValue();
            streamData.drmType = num;
        }
        if (str6 != null) {
            streamData.streamLanguage = str6;
        }
    }
}
