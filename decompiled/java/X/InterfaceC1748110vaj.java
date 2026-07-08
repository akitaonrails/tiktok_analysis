package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0vaj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1748110vaj extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "selectedAddressID", required = false)
    String getSelectedAddressID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "selectedArea", nestedClassType = InterfaceC1748120vak.class, required = false)
    List<InterfaceC1748120vak> getSelectedArea();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "selectedAddressID", required = false)
    void setSelectedAddressID(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "selectedArea", nestedClassType = InterfaceC1748120vak.class, required = false)
    void setSelectedArea(List<? extends InterfaceC1748120vak> list);
}
