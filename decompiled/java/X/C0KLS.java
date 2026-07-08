package X;

import com.bytedance.android.pgc.wallet.base.subscribe.PGCCreateContractResult;
import com.bytedance.scene.Scene;
import com.google.gson.n;
import com.ss.android.ugc.aweme.subscription.pgc.api.model.PgcSubscribeUserInfoResponse;
import com.ss.android.ugc.aweme.subscription.pgc.data.model.PgcCheckSubOrderResultStruct;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import java.util.Map;
import kotlin.Unit;
import webcast.api.pgc_sub.PGCRecoverContractInAppResponse;
import webcast.api.pgc_sub.PGCTemplateListData;

/* JADX INFO: renamed from: X.0KLS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public interface C0KLS {
    @InterfaceC1501240pAY("/tiktok/sub/contract/create/")
    @InterfaceC1485505rh
    C11NZ<DataResponse<PGCCreateContractResult>> LIZ(@InterfaceC1501100pAK("to_uid") String str, @InterfaceC1501100pAK("tpl_id") String str2, @InterfaceC1501100pAK("sku_name") String str3, @InterfaceC1501100pAK("device_tz") String str4, @InterfaceC1501100pAK("offer_id") String str5, @InterfaceC1501100pAK("offer_token") String str6, @InterfaceC1501100pAK("comm_migrate") Boolean bool, @InterfaceC1501100pAK("sub_circle") int i, @InterfaceC1501100pAK("create_contract_intent") int i2, @InterfaceC1501100pAK("channel_order_ids_str") String str7, @InterfaceC1501100pAK("prefetch_senario") int i3, @InterfaceC1501100pAK("use_prefetched_data") int i4, @InterfaceC1501100pAK("client_param") String str8, @InterfaceC1501100pAK("app_store_region") String str9, @InterfaceC1501190pAT Map<String, String> map);

    @InterfaceC1501200pAU("/tiktok/sub/contract/tpl_list/")
    C11NZ<DataResponse<PGCTemplateListData>> LIZIZ(@InterfaceC1501120pAM("to_uid") String str, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, @InterfaceC1501120pAM("channel_order_ids_str") String str2, @InterfaceC1501120pAM("currency_code") String str3, @InterfaceC1501120pAM("live_sub_only_tier") long j, @InterfaceC1501120pAM("live_sub_only_month") long j2, @InterfaceC1501120pAM("fetch_privilege") boolean z, @InterfaceC1501120pAM("price_region") String str4, @InterfaceC1501120pAM("with_web_templates") boolean z2);

    @InterfaceC1501200pAU("/tiktok/sub/contract/status/")
    C11NZ<DataResponse<PgcCheckSubOrderResultStruct>> checkSubOrder(@InterfaceC1501120pAM("to_uid") String str, @InterfaceC1501120pAM("contract_id") String str2);

    @InterfaceC1501200pAU("/tiktok/sub/privilege/get_sub_privilege_detail/")
    C11NZ<DataResponse<n>> getSubPrivilegeDetail(@InterfaceC1501120pAM("room_id") String str, @InterfaceC1501120pAM("sec_anchor_id") String str2, @InterfaceC1501120pAM("benefit_scene") int i, @InterfaceC1501120pAM("is_new_page") boolean z, @InterfaceC1501120pAM("live_sub_only_tier") long j, @InterfaceC1501120pAM("price_region") String str3);

    @InterfaceC1501200pAU("/tiktok/sub/privilege/get_sub_info/")
    C11NZ<DataResponse<n>> getSubscribeInfo(@InterfaceC1501120pAM("need_current_state") boolean z, @InterfaceC1501120pAM("sec_anchor_id") String str, @InterfaceC1501120pAM("need_entrance_data") boolean z2, @InterfaceC1501120pAM("source") String str2, @InterfaceC1501120pAM("from_onboarding_completed") int i);

    @InterfaceC1501200pAU("/tiktok/sub/user/info/")
    C11NZ<DataResponse<PgcSubscribeUserInfoResponse>> getUserInfo(@InterfaceC1501120pAM("anchor_id") String str, @InterfaceC1501120pAM("live_sub_only_month") long j, @InterfaceC1501120pAM("live_sub_only_tier") long j2, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i);

    @InterfaceC1501240pAY("/tiktok/sub/contract/recover_in_app/")
    @InterfaceC1485505rh
    C11NZ<DataResponse<PGCRecoverContractInAppResponse.RecoverContractInAppResult>> resubscribeOrder(@InterfaceC1501100pAK("to_uid") String str, @InterfaceC1501100pAK("room_id") String str2, @InterfaceC1501100pAK("client_param") String str3);

    @InterfaceC1501240pAY("/tiktok/sub/contract/renew_reminder/")
    @InterfaceC1485505rh
    C11NZ<DataResponse<Unit>> setRenewReminder(@InterfaceC1501100pAK("sec_anchor_id") String str);
}
