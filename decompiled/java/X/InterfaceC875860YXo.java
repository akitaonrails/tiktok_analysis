package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0YXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C040E
public interface InterfaceC875860YXo extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "msgList", nestedClassType = InterfaceC875850YXn.class, required = true)
    List<InterfaceC875850YXn> getMsgList();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "msgList", nestedClassType = InterfaceC875850YXn.class, required = true)
    void setMsgList(List<? extends InterfaceC875850YXn> list);
}
