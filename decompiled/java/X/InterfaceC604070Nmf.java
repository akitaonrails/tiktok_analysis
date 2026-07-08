package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Nmf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC604070Nmf extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    Map<String, Object> getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "startUrl", required = true)
    String getStartUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "state", required = true)
    String getState();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "targetUrl", required = true)
    String getTargetUrl();
}
