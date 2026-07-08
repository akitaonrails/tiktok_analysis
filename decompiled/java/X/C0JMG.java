package X;

import android.net.Uri;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbServiceBioDesignOptSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsNewFormEnableSettingV2;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0JMG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JMG extends C09AY implements Function0<Map<String, ? extends String>> {
    public final /* synthetic */ C0JKE LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JMG(C0JKE c0jke, String str) {
        super(0);
        this.LL = c0jke;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends String> invoke() {
        String strRj;
        Object objLJJJLL;
        InterfaceC2262081DgM currentUser;
        User owner;
        User owner2;
        ImageModel avatarThumb;
        List urls;
        C0JKE c0jke = this.LL;
        String str = this.LLILLJJLI;
        c0jke.getClass();
        Uri uri = UriProtector.parse(str);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "title_key");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        IHostSubscription iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
        Long lValueOf = null;
        if (iHostSubscription == null || (strRj = iHostSubscription.Rj(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) == null) {
            strRj = "";
        }
        if (room == null || (owner2 = room.getOwner()) == null || (avatarThumb = owner2.getAvatarThumb()) == null || (urls = avatarThumb.getUrls()) == null || (objLJJJLL = C13LP.LJJJLL(urls)) == null) {
            objLJJJLL = "";
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
        }
        Long lValueOf2 = (room == null || (owner = room.getOwner()) == null) ? null : Long.valueOf(owner.getId());
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            lValueOf = Long.valueOf(currentUser.getId());
        }
        boolean zLJFF = Intrinsics.LJFF(lValueOf2, lValueOf);
        Object obj = (!zLJFF || room == null || room.getId() <= 0) ? "1" : CardStruct.IStatusCode.DEFAULT;
        boolean z = !LivePcsNewFormEnableSettingV2.INSTANCE.getValue() && Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "live_detail_service_plus");
        Gson gson = new Gson();
        w.LIZ.getClass();
        Map<String, ? extends String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("title", strRj), new Pair("avatar", objLJJJLL), new Pair("no_header", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z ^ true)) ? 1 : 0)), new Pair("follow_app_theme", obj), new Pair("pcs_params", GsonProtectorUtils.toJson(gson, C2097608Jq.LJIIIIZZ(new Pair("is_single_sku", CardStruct.IStatusCode.DEFAULT), new Pair("is_cache", CardStruct.IStatusCode.DEFAULT), new Pair("is_anchor", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(zLJFF)) ? 1 : 0)), new Pair("is_service_plus_revamp", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(LiveSmbServiceBioDesignOptSetting.INSTANCE.useNewBioPage())) ? 1 : 0)), new Pair("is_service_plus", "1"), new Pair("request_id", w.LJIJI()), new Pair("traffic_type", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2), new Pair("show_entrance", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2), new Pair("anchor_id", String.valueOf(w.LJ())), new Pair("room_id", String.valueOf(w.LJIJJ())), new Pair("traffic_action_type", w.LIZLLL()), new Pair("enter_from", ""), new Pair("enter_from_merge", w.LJIIIZ()), new Pair("enter_method", w.LJIIL())))), new Pair("iab_click_time", String.valueOf(System.currentTimeMillis())));
        DataChannel dataChannel = (DataChannel) dataChannelGlobal.gg0(C1148300fzI.class);
        if (dataChannel != null) {
            C0JMI.LIZ(dataChannel, mapLJIIJ);
        }
        return mapLJIIJ;
    }
}
