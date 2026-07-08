package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0ytG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1874920ytG extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "ImageIDs", primitiveClassType = String.class, required = true)
    List<String> getImageIDs();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "ImageIDs", primitiveClassType = String.class, required = true)
    void setImageIDs(List<String> list);
}
