package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0yrd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1873910yrd extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "prevReactIds", primitiveClassType = String.class, required = false)
    List<String> getPrevReactIds();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "prevReactIds", primitiveClassType = String.class, required = false)
    void setPrevReactIds(List<String> list);
}
