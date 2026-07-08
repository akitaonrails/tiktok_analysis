package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0QFB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C040E
public interface C0QFB extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "history_list", nestedClassType = C0QFD.class, required = true)
    List<C0QFD> getHistoryList();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "history_list", nestedClassType = C0QFD.class, required = true)
    void setHistoryList(List<? extends C0QFD> list);
}
