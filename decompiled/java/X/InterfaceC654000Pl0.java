package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Pl0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface InterfaceC654000Pl0 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cur_raw_data", required = false)
    String getCurRawData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "current_item_id", required = false)
    String getCurrentItemId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "has_more", required = false)
    Number getHasMore();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "item_ids", primitiveClassType = String.class, required = false)
    List<String> getItemIds();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "log_extra", required = false)
    Map<String, Object> getLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "raw_data_list", primitiveClassType = String.class, required = false)
    List<String> getRawDataList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "start_cursor", required = false)
    Number getStartCursor();
}
