package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Q0T, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface C0Q0T extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "anchor_ids", primitiveClassType = String.class, required = false)
    List<String> getAnchorIds();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "current_item_id", required = false)
    String getCurrentItemId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_from", required = false)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_method", required = false)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    Map<String, Object> getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "item_ids", primitiveClassType = String.class, required = false)
    List<String> getItemIds();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "log_extra", required = false)
    Map<String, Object> getLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "page_data", required = false)
    Map<String, Object> getPageData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "react_id", required = false)
    String getReactId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = false)
    String getSchema();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "search_extra", required = false)
    Map<String, Object> getSearchExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "session_id", required = false)
    Number getSessionId();
}
