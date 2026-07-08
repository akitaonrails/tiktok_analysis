package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0ftA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040E
public interface InterfaceC1144500ftA extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bagItems", nestedClassType = InterfaceC1144490ft9.class, required = true)
    List<InterfaceC1144490ft9> getBagItems();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "bagItems", nestedClassType = InterfaceC1144490ft9.class, required = true)
    void setBagItems(List<? extends InterfaceC1144490ft9> list);
}
