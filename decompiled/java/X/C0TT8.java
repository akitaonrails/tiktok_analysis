package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0TT8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C040D
public interface C0TT8 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "action", required = true)
    String getAction();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = false)
    Map<String, Object> getParams();
}
