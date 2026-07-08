package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Q9z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040E
public interface InterfaceC665890Q9z extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cursor", required = false)
    Number getCursor();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "hasMore", required = false)
    Number getHasMore();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "items", required = false)
    List<Object> getItems();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "reviewAggregation", required = false)
    Map<String, Object> getReviewAggregation();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusCode", required = true)
    Number getStatusCode();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "cursor", required = false)
    void setCursor(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "hasMore", required = false)
    void setHasMore(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "items", required = false)
    void setItems(List<? extends Object> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "reviewAggregation", required = false)
    void setReviewAggregation(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "statusCode", required = true)
    void setStatusCode(Number number);
}
