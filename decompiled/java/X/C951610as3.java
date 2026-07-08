package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveBattleContributeListLynxUrlSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.AFwS250S0000000_15;

/* JADX INFO: renamed from: X.0as3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C951610as3 {
    public static final SparkContext LIZ(Context context, Long l, String str, DataChannel dataChannel) {
        Room roomLJJLIIIIJ;
        long ownerUserId;
        String strValueOf;
        int iLongValue;
        C981500beG c981500beG;
        Context contextLJII = context;
        String value = LiveBattleContributeListLynxUrlSetting.INSTANCE.getValue();
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
        builderBuildUpon.appendQueryParameter("channel_id", String.valueOf(C915980Zwa.LJII().getChannelId()));
        if (dataChannel != null) {
            roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        } else {
            roomLJJLIIIIJ = null;
        }
        long j = 0;
        if (roomLJJLIIIIJ != null) {
            ownerUserId = roomLJJLIIIIJ.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        if (l == null || (strValueOf = l.toString()) == null) {
            strValueOf = String.valueOf(ownerUserId);
        }
        builderBuildUpon.appendQueryParameter("anchor_id", strValueOf);
        builderBuildUpon.appendQueryParameter("anchor_id_str", str);
        Long l2 = (Long) DataChannelGlobal.LLILZ.gg0(C951600as2.class);
        if (l2 != null) {
            iLongValue = (int) l2.longValue();
        } else {
            iLongValue = -1;
        }
        builderBuildUpon.appendQueryParameter("audience_ranking_switch", String.valueOf(iLongValue));
        builderBuildUpon.appendQueryParameter("is_anchor", String.valueOf(C500260Jjc.LJIIZILJ(dataChannel) ? 1 : 0));
        builderBuildUpon.appendQueryParameter("user_id", String.valueOf(currentUserId));
        if (l != null) {
            builderBuildUpon.appendQueryParameter("target_uid", String.valueOf(l.longValue()));
        }
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 != null) {
            j = c981480beEM91.LJIIIZ;
        }
        builderBuildUpon.appendQueryParameter("battle_id", String.valueOf(j));
        if (C915980Zwa.LJII().LLILZLL(true).size() > 2) {
            builderBuildUpon.appendQueryParameter("is_multi", "1");
        } else {
            builderBuildUpon.appendQueryParameter("is_multi", CardStruct.IStatusCode.DEFAULT);
        }
        C981480beE c981480beEM912 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM912 != null && (c981500beG = c981480beEM912.LJJIJIIJI) != null && l != null) {
            builderBuildUpon.appendQueryParameter("color_name", C982410bfj.LIZLLL((int) c981500beG.LIZJ(l.longValue())));
        }
        builderBuildUpon.appendQueryParameter("team_member_cnts", String.valueOf(C915980Zwa.LJII().LLILZLL(true).size()));
        builderBuildUpon.appendQueryParameter("battle_type", String.valueOf(EnumC962960bAM.TAKE_THE_STAGE.getType()));
        builderBuildUpon.appendQueryParameter("sub_match_type", C973690bRf.LJIILL(false));
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        builderBuildUpon.appendQueryParameter("current_connection_cnts", String.valueOf(listLLILZLL.size()));
        builderBuildUpon.appendQueryParameter("uid_list", C13LP.LJJLIIIJ(listLLILZLL, ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(152), 30));
        C760370TsB c760370TsBLIZIZ = C0KYL.LIZIZ(builderBuildUpon.toString());
        c760370TsBLIZIZ.LJIJI(8, EnumC760350Ts9.DP);
        String string = c760370TsBLIZIZ.LIZ().toString();
        IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
        if (contextLJII == null) {
            contextLJII = C497740JfY.LJII();
        }
        SparkContext sparkContextYC1 = iHybridContainerService.YC1(contextLJII, string, null);
        sparkContextYC1.LJJJJZI(new C522040Kde(dataChannel, 1));
        return sparkContextYC1;
    }
}
