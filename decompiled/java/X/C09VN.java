package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.09VN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C040D
public interface C09VN extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "func", required = true)
    String getFunc();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = false)
    Map<String, Object> getParams();
}
