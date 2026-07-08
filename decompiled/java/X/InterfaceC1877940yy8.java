package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0yy8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1877940yy8 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", primitiveClassType = String.class, required = true)
    List<String> getParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "results", primitiveClassType = String.class, required = true)
    List<String> getResults();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isAvailable", required = true)
    Boolean isAvailable();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isAvailable", required = true)
    void setAvailable(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "params", primitiveClassType = String.class, required = true)
    void setParams(List<String> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "results", primitiveClassType = String.class, required = true)
    void setResults(List<String> list);
}
