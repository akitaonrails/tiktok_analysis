package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0wia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1791420wia extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", nestedClassType = InterfaceC1791360wiU.class, required = true)
    List<InterfaceC1791360wiU> getData();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "data", nestedClassType = InterfaceC1791360wiU.class, required = true)
    void setData(List<? extends InterfaceC1791360wiU> list);
}
