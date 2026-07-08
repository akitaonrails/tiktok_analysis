package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.05q3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C040E
public interface InterfaceC1475305q3 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "resultMap", required = true)
    Map<String, Object> getResultMap();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "resultMap", required = true)
    void setResultMap(Map<String, ? extends Object> map);
}
