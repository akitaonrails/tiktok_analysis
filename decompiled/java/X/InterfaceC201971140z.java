package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.140z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C040E
public interface InterfaceC201971140z extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "files", nestedClassType = InterfaceC201970140y.class, required = false)
    List<InterfaceC201970140y> getFiles();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "files", nestedClassType = InterfaceC201970140y.class, required = false)
    void setFiles(List<? extends InterfaceC201970140y> list);
}
