package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0wtj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1798330wtj extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "keys", primitiveClassType = String.class, required = true)
    List<String> getKeys();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "keys", primitiveClassType = String.class, required = true)
    void setKeys(List<String> list);
}
