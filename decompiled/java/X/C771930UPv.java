package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.broadcast.PermissionApplyInfoChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePermissionApplyLynx;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UPv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771930UPv {
    public static SparkContext LIZ;

    public static void LIZ(DataChannel dataChannel, String str) {
        int i;
        String strLIZ;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo2;
        Map map = (Map) dataChannel.gg0(PermissionApplyInfoChannel.class);
        if (map != null && (permissionApplyInfo2 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null && permissionApplyInfo2.mAnchorFansNum >= permissionApplyInfo2.mApplyNeedFansNum) {
            i = 1;
        } else {
            i = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_live_access_apply_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Integer.valueOf(i), "apply_threshold");
        LiveMode liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        Integer numValueOf = null;
        if (liveMode != null) {
            strLIZ = C354201Zc.LIZ(liveMode);
        } else {
            strLIZ = null;
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        Map map2 = (Map) dataChannel.gg0(PermissionApplyInfoChannel.class);
        if (map2 != null && (permissionApplyInfo = (LivePermissionApplyResponse.PermissionApplyInfo) map2.get(str)) != null) {
            numValueOf = Integer.valueOf(permissionApplyInfo.mAnchorFansNum);
        }
        c474500IjALIZ.LJJII(String.valueOf(numValueOf), "fans_cnt ");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(DataChannel dataChannel, Context context, String str) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Integer numValueOf5;
        Integer numValueOf6;
        Integer numValueOf7;
        Integer numValueOf8;
        Boolean boolValueOf;
        Long lValueOf;
        int i;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo2;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo3;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo4;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo5;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo6;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo7;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo8;
        String value = LivePermissionApplyLynx.INSTANCE.getValue();
        Map map = (Map) dataChannel.gg0(PermissionApplyInfoChannel.class);
        BroadcastSettingResponse broadcastSettingResponse = (BroadcastSettingResponse) dataChannel.gg0(BroadcastSettingResponseChannel.class);
        Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("permission_type", str);
        SparkContext sparkContextYC1 = null;
        if (map != null && (permissionApplyInfo8 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null) {
            numValueOf = Integer.valueOf(permissionApplyInfo8.mAnchorFansNum);
        } else {
            numValueOf = null;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("anchor_fans_num", String.valueOf(numValueOf));
        if (map != null && (permissionApplyInfo7 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null) {
            numValueOf2 = Integer.valueOf(permissionApplyInfo7.mForbiddenApplyCountdown);
        } else {
            numValueOf2 = null;
        }
        Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("forbidden_apply_countdown", String.valueOf(numValueOf2));
        if (map != null && (permissionApplyInfo6 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null) {
            numValueOf3 = Integer.valueOf(permissionApplyInfo6.mApplyNeedFansNum);
        } else {
            numValueOf3 = null;
        }
        Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("apply_need_fans_num", String.valueOf(numValueOf3));
        if (map != null && (permissionApplyInfo5 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null) {
            numValueOf4 = Integer.valueOf(permissionApplyInfo5.mTargetLiveTime);
        } else {
            numValueOf4 = null;
        }
        Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("target_live_time", String.valueOf(numValueOf4));
        if (map != null && (permissionApplyInfo4 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null) {
            numValueOf5 = Integer.valueOf(permissionApplyInfo4.mForbiddenApplyDays);
        } else {
            numValueOf5 = null;
        }
        Uri.Builder builderAppendQueryParameter6 = builderAppendQueryParameter5.appendQueryParameter("forbidden_apply_days", String.valueOf(numValueOf5));
        if (map != null && (permissionApplyInfo3 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null) {
            numValueOf6 = Integer.valueOf(permissionApplyInfo3.mApplyInvalidTime);
        } else {
            numValueOf6 = null;
        }
        Uri.Builder builderAppendQueryParameter7 = builderAppendQueryParameter6.appendQueryParameter("apply_invalid_time", String.valueOf(numValueOf6));
        if (map != null && (permissionApplyInfo2 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null) {
            numValueOf7 = Integer.valueOf(permissionApplyInfo2.mNeedLiveTime);
        } else {
            numValueOf7 = null;
        }
        Uri.Builder builderAppendQueryParameter8 = builderAppendQueryParameter7.appendQueryParameter("need_live_time", String.valueOf(numValueOf7));
        if (map != null && (permissionApplyInfo = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null) {
            numValueOf8 = Integer.valueOf(permissionApplyInfo.mApplyStatus);
        } else {
            numValueOf8 = null;
        }
        Uri.Builder builderAppendQueryParameter9 = builderAppendQueryParameter8.appendQueryParameter("apply_status", String.valueOf(numValueOf8));
        if (broadcastSettingResponse != null) {
            boolValueOf = Boolean.valueOf(broadcastSettingResponse.LIZLLL());
        } else {
            boolValueOf = null;
        }
        Uri.Builder builderAppendQueryParameter10 = builderAppendQueryParameter9.appendQueryParameter("can_receive_gift", String.valueOf(boolValueOf));
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
        } else {
            lValueOf = null;
        }
        builderAppendQueryParameter10.appendQueryParameter("user_id", String.valueOf(lValueOf));
        C760370TsB c760370TsBLIZIZ = C0KYL.LIZIZ(builderBuildUpon.toString());
        if (Intrinsics.LJFF(str, "live")) {
            i = 438;
        } else {
            i = 482;
        }
        EnumC760350Ts9 enumC760350Ts9 = EnumC760350Ts9.DP;
        c760370TsBLIZIZ.LJIIIZ(i, enumC760350Ts9);
        c760370TsBLIZIZ.LJIJI(8, enumC760350Ts9);
        c760370TsBLIZIZ.LJIIIIZZ("bottom");
        String string = c760370TsBLIZIZ.LIZ().toString();
        IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
        if (iHybridContainerService != null) {
            sparkContextYC1 = iHybridContainerService.YC1(context, string, null);
        }
        LIZ = sparkContextYC1;
    }
}
