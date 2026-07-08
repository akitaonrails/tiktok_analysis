package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Njc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC602180Njc extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "context", required = true)
    Map<String, Object> getContext();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = true)
    String getUrl();
}
