package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.choosemusic.sug.model.MusicSearchSugResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import java.util.Map;

/* JADX INFO: renamed from: X.0QPW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public interface C0QPW {
    public static final C0QPX LIZ = C0QPX.LIZ;

    @InterfaceC1501240pAY("/aweme/v1/suggest/guide/")
    @InterfaceC1485505rh
    C15O7<SuggestWordResponse> LIZ(@InterfaceC1501100pAK("data_type") Integer num, @InterfaceC1501100pAK("req_source") String str, @InterfaceC1501100pAK("history_list_v2") String str2, @InterfaceC1501100pAK("business_id") String str3, @InterfaceC1501100pAK("is_non_personalized_search") Integer num2);

    @InterfaceC1501240pAY("/aweme/v1/music/search/")
    @InterfaceC1485505rh
    AbstractC19484711Kz<n> LIZIZ(@InterfaceC1501100pAK("cursor") Integer num, @InterfaceC1501100pAK("count") Integer num2, @InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("search_source") String str2, @InterfaceC1501100pAK("search_channel") String str3, @InterfaceC1501100pAK("enter_from") String str4, @InterfaceC1501100pAK("query_correct_type") Integer num3, @InterfaceC1501100pAK("filter_by") Integer num4, @InterfaceC1501100pAK("sort_type") Integer num5, @InterfaceC1501100pAK("is_filter_search") Integer num6, @InterfaceC1501100pAK("user_video_length") Long l, @InterfaceC1501100pAK("user_video_created") Integer num7, @InterfaceC1501100pAK("search_context") String str5, @InterfaceC1501100pAK("search_id") String str6, @InterfaceC1501100pAK("is_non_personalized_search") Integer num8, @InterfaceC1501100pAK("search_session_id") Long l2, @InterfaceC1501190pAT Map<String, String> map);

    @InterfaceC1501240pAY("/aweme/v1/suggest/guide/")
    @InterfaceC1485505rh
    Object LIZJ(@InterfaceC1501100pAK("data_type") Integer num, @InterfaceC1501100pAK("req_source") String str, @InterfaceC1501100pAK("history_list_v2") String str2, @InterfaceC1501100pAK("business_id") String str3, @InterfaceC1501100pAK("is_non_personalized_search") Integer num2, @InterfaceC1501100pAK("showed_suggest_words") String str4, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/aweme/v1/search/sug/")
    @InterfaceC1485505rh
    C15O7<MusicSearchSugResponse> LIZLLL(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("source") String str2, @InterfaceC1501100pAK("history_list") String str3, @InterfaceC1501100pAK("is_non_personalized_search") Integer num);
}
