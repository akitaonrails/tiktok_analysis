package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductRecommendResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendationFeedRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WriteImpressionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WriteImpressionResponse;

/* JADX INFO: renamed from: X.0vhs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public interface InterfaceC1752540vhs {
    public static final C1752510vhp LIZ = C1752510vhp.LIZ;

    @InterfaceC1501240pAY("/api/v1/shop/recommend/impression/write")
    Object LIZ(@C040I WriteImpressionRequest writeImpressionRequest, InterfaceC1364105Vn<? super WriteImpressionResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/pdp/recommendations/get")
    Object LIZIZ(@C040I RecommendationFeedRequest recommendationFeedRequest, InterfaceC1364105Vn<? super ProductRecommendResponse> interfaceC1364105Vn);
}
