package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.1571, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C040E
public interface AnonymousClass1571 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "colors", primitiveClassType = String.class, required = true)
    List<String> getColors();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "colors", primitiveClassType = String.class, required = true)
    void setColors(List<String> list);
}
