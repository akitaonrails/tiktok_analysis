package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0QmF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040E
public interface InterfaceC680250QmF extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "historyList", nestedClassType = InterfaceC680260QmG.class, required = false)
    List<InterfaceC680260QmG> getHistoryList();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "historyList", nestedClassType = InterfaceC680260QmG.class, required = false)
    void setHistoryList(List<? extends InterfaceC680260QmG> list);
}
