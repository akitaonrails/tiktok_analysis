package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0WU3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C040D
public interface C0WU3 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientID", required = true)
    String getClientID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "lang", required = true)
    String getLang();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "redirectUrl", required = true)
    String getRedirectUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "scopes", primitiveClassType = String.class, required = true)
    List<String> getScopes();
}
