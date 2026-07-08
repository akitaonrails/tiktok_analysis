package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.04Hy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C040D
public interface InterfaceC1074004Hy extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "review_count", required = true)
    Number getReviewCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "review_count_string", required = true)
    String getReviewCountString();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "review_enter_from", required = false)
    String getReviewEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "review_filter_id", required = false)
    String getReviewFilterId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "review_filter_type", required = false)
    Number getReviewFilterType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "review_id", required = false)
    String getReviewId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "review_page_source", required = false)
    Number getReviewPageSource();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "review_rating", required = true)
    String getReviewRating();
}
