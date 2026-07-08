package X;

import com.ss.android.ugc.aweme.topic.search.api.RecommendTopicResponse;
import com.ss.android.ugc.aweme.topic.search.api.SearchTopicResponse;
import com.ss.android.ugc.aweme.topic.search.api.SuggestTopicResponse;

/* JADX INFO: renamed from: X.0OAW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public interface C0OAW {
    public static final C0OAX LIZ = C0OAX.LIZ;

    @InterfaceC1501200pAU("/tiktok/topic/book/list/v1/")
    Object LIZ(@InterfaceC1501120pAM("cursor") Long l, @InterfaceC1501120pAM("count") int i, InterfaceC1364105Vn<? super SuggestTopicResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/tiktok/topic/movie/list/v1/")
    Object LIZIZ(@InterfaceC1501120pAM("cursor") Long l, @InterfaceC1501120pAM("count") int i, InterfaceC1364105Vn<? super SuggestTopicResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/tiktok/topic/search/v1/")
    Object LIZJ(@InterfaceC1501120pAM("keyword") String str, @InterfaceC1501120pAM("source") String str2, @InterfaceC1501120pAM("from_business") String str3, InterfaceC1364105Vn<? super SearchTopicResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/tiktok/topic/recommend/list/v1/")
    Object LIZLLL(@InterfaceC1501120pAM("topic_id") String str, @InterfaceC1501120pAM("topic_type") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("page_extra") String str2, InterfaceC1364105Vn<? super RecommendTopicResponse> interfaceC1364105Vn);
}
