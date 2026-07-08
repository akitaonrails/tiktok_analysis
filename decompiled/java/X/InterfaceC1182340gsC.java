package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0gsC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C040D
public interface InterfaceC1182340gsC extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "sessionID", required = true)
    String getSessionID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sessionInfo", required = true)
    Map<String, Object> getSessionInfo();
}
