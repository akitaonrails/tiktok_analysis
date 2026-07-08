package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0wiQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1791320wiQ extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", nestedClassType = InterfaceC1791310wiP.class, required = true)
    List<InterfaceC1791310wiP> getData();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "data", nestedClassType = InterfaceC1791310wiP.class, required = true)
    void setData(List<? extends InterfaceC1791310wiP> list);
}
