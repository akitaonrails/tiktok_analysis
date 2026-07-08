package X;

import com.ss.android.ugc.aweme.discover.model.BannerList;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicList;

/* JADX INFO: renamed from: X.10Ub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC19253510Ub {
    public static final C09UY LIZ = C09UY.LIZ;

    @InterfaceC1501200pAU("/aweme/v2/category/list/")
    AbstractC19484711Kz<TrendingTopicList> LIZ(@InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("is_complete") Integer num, @InterfaceC1501120pAM("ad_personality_mode") Integer num2, @InterfaceC1501120pAM("cmpl_enc") String str);

    @InterfaceC1501200pAU("/aweme/v1/find/")
    AbstractC19484711Kz<BannerList> LIZIZ(@InterfaceC1501120pAM("banner_tab_type") Integer num, @InterfaceC1501120pAM("ad_personality_mode") Integer num2, @InterfaceC1501120pAM("cmpl_enc") String str);
}
