package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.05oC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C040E
public interface InterfaceC1463805oC extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "editInfo", required = true)
    Map<String, Object> getEditInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "filePath", required = true)
    String getFilePath();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "editInfo", required = true)
    void setEditInfo(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "filePath", required = true)
    void setFilePath(String str);
}
