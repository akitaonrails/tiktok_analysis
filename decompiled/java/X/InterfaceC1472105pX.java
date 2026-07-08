package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.05pX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C040E
public interface InterfaceC1472105pX extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "peerUsers", nestedClassType = InterfaceC1472205pY.class, required = true)
    List<InterfaceC1472205pY> getPeerUsers();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "peerUsers", nestedClassType = InterfaceC1472205pY.class, required = true)
    void setPeerUsers(List<? extends InterfaceC1472205pY> list);
}
