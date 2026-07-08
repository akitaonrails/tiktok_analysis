package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0yrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1873700yrI extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "callbackUrl", required = true)
    String getCallbackUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "loginContext", required = true)
    Map<String, Object> getLoginContext();
}
