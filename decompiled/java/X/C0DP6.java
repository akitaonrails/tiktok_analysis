package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0DP6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C040D
public interface C0DP6 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "awemePath", required = true)
    String getAwemePath();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "needResEvent", required = false)
    Boolean getNeedResEvent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = true)
    Map<String, Object> getParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = true)
    String getUrl();
}
