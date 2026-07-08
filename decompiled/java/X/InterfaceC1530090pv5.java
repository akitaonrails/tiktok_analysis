package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0pv5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040D
public interface InterfaceC1530090pv5 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "global_props", required = false)
    Map<String, Object> getGlobalProps();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "need_reload", required = false)
    Boolean getNeedReload();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "query_items", required = false)
    Map<String, Object> getQueryItems();
}
