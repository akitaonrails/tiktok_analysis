package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0wuc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1798880wuc extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "tokenDictionary", required = true)
    Map<String, Object> getTokenDictionary();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tokenDictionary", required = true)
    void setTokenDictionary(Map<String, ? extends Object> map);
}
