package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.06SG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C040E
public interface C06SG extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "selectedConversationList", nestedClassType = C06SF.class, required = true)
    List<C06SF> getSelectedConversationList();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "selectedConversationList", nestedClassType = C06SF.class, required = true)
    void setSelectedConversationList(List<? extends C06SF> list);
}
