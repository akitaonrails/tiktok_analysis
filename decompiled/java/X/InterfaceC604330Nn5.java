package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Nn5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC604330Nn5 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "requestParams", required = true)
    Map<String, Object> getRequestParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isRetry", required = true)
    boolean isRetry();
}
