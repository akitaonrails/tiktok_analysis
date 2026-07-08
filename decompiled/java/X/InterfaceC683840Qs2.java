package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0Qs2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface InterfaceC683840Qs2 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "productId", required = false)
    String getProductId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "searchEntrance", required = true)
    String getSearchEntrance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "searchPosition", required = true)
    String getSearchPosition();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "searchlogId", required = true)
    String getSearchlogId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userId", required = false)
    String getUserId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "wordContent", required = true)
    String getWordContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "wordGroupId", required = true)
    String getWordGroupId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "wordImageUrl", required = true)
    String getWordImageUrl();
}
