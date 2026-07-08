package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;

/* JADX INFO: renamed from: X.0DPH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C040D
public interface C0DPH extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_UID, required = false)
    String getId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "jsonrpc", required = false)
    String getJsonrpc();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "method", required = false)
    String getMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = false)
    Map<String, Object> getParams();
}
