package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0z0C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1879220z0C extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "keyword", required = true)
    String getKeyword();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pluginInfo", required = true)
    Map<String, Object> getPluginInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "subType", required = false)
    String getSubType();
}
