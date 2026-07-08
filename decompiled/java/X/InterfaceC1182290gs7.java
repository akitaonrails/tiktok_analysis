package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0gs7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C040E
public interface InterfaceC1182290gs7 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "idExisted", required = true)
    Boolean getIdExisted();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "info", required = true)
    Map<String, Object> getInfo();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "idExisted", required = true)
    void setIdExisted(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "info", required = true)
    void setInfo(Map<String, ? extends Object> map);
}
