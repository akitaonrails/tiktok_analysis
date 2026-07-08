package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0KQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C040D
public interface InterfaceC517280KQk extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "anchorId", required = true)
    String getAnchorId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "logInfo", required = true)
    Map<String, Object> getLogInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "user", required = true)
    String getUser();
}
