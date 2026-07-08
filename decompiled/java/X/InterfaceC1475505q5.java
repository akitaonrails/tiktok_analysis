package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.05q5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C040E
public interface InterfaceC1475505q5 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = true)
    Map<String, Object> getData();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "data", required = true)
    void setData(Map<String, ? extends Object> map);
}
