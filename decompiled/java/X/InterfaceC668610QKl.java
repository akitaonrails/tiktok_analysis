package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;

/* JADX INFO: renamed from: X.0QKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC668610QKl {
    @InterfaceC1501240pAY("/aweme/v1/search/ttec/sug/")
    @InterfaceC1485505rh
    ListenableFuture<EcSearchSugResponse> LIZ(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("source") String str2, @InterfaceC1501100pAK("history_list") String str3, @InterfaceC1501100pAK("from_group_id") String str4, @InterfaceC1501100pAK("count") Integer num, @InterfaceC1501100pAK("sug_signal") String str5, @InterfaceC1501100pAK("rich_sug_count") Integer num2, @InterfaceC1501100pAK("request_order") Long l, @InterfaceC1501100pAK("enter_from") String str6, @InterfaceC1501100pAK("sug_cost_degradation") int i, @InterfaceC1501100pAK("new_sug_session_id") String str7, @InterfaceC1501100pAK("src_material_id") String str8, @InterfaceC1501100pAK("src_anchor_product_id") String str9, @InterfaceC1501100pAK("search_position") String str10, @InterfaceC1501100pAK("ecom_user_actions") String str11, @InterfaceC1501100pAK("is_search_after_search") int i2, @InterfaceC1501100pAK("is_non_personalized_search") Integer num3, @InterfaceC1501100pAK("dma_consent_status") Integer num4, @InterfaceC1501100pAK("passThroughParams") String str12, @InterfaceC1501100pAK("traffic_diversion_info") String str13, @InterfaceC1501100pAK("is_beginning_of_session") Integer num5);

    @InterfaceC1501240pAY("/aweme/v1/search/sug/prefetch/ecom/")
    @InterfaceC1485505rh
    C15O7<String> LIZIZ(@InterfaceC1501100pAK("word_count") int i);
}
