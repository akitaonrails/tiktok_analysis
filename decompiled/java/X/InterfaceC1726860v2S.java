package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0v2S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1726860v2S extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "signedHeaders", required = true)
    Map<String, Object> getSignedHeaders();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "signedHeaders", required = true)
    void setSignedHeaders(Map<String, ? extends Object> map);
}
