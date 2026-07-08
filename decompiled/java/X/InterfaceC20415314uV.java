package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.14uV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C040E
public interface InterfaceC20415314uV extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "tagAggregations", nestedClassType = InterfaceC20415514uX.class, required = true)
    List<InterfaceC20415514uX> getTagAggregations();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tagAggregations", nestedClassType = InterfaceC20415514uX.class, required = true)
    void setTagAggregations(List<? extends InterfaceC20415514uX> list);
}
