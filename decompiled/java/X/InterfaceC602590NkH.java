package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0NkH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC602590NkH extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "actionName", required = true)
    String getActionName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "lynxData", required = false)
    Map<String, Object> getLynxData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = false)
    String getSchema();
}
