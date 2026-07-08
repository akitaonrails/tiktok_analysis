package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.pages.result.aggregationproscons.api.LandingPageDataResponse;

/* JADX INFO: renamed from: X.05rb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1484905rb {
    @InterfaceC1501240pAY("/aweme/v1/search/loadmore/")
    @InterfaceC1485505rh
    Object LIZ(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("type") int i, @InterfaceC1501100pAK(FollowStatusChangeMethod.PARAM_UID) String str2, @InterfaceC1501100pAK("cursor") int i2, @InterfaceC1501100pAK("count") int i3, @InterfaceC1501100pAK("aggregation_type") int i4, @InterfaceC1501100pAK("review_aggregation_unique_id") String str3, InterfaceC1364105Vn<? super LandingPageDataResponse> interfaceC1364105Vn);
}
