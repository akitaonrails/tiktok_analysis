package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0sBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C040D
public interface InterfaceC1617300sBk extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bizLine", required = true)
    Number getBizLine();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "products", nestedClassType = InterfaceC1617280sBi.class, required = true)
    List<InterfaceC1617280sBi> getProducts();
}
