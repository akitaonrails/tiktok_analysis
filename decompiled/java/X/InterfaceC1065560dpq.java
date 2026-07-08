package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0dpq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1065560dpq extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    Map<String, Object> getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "log", required = false)
    Map<String, Object> getLog();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "log_params", required = false)
    Map<String, Object> getLog_params();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "page_data", required = false)
    Map<String, Object> getPage_data();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "reactId", required = false)
    Object getReactId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = false)
    Object getSchema();
}
