package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0xrN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1835310xrN extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "downloadInfo", nestedClassType = InterfaceC1835320xrO.class, required = false)
    List<InterfaceC1835320xrO> getDownloadInfo();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "downloadInfo", nestedClassType = InterfaceC1835320xrO.class, required = false)
    void setDownloadInfo(List<? extends InterfaceC1835320xrO> list);
}
