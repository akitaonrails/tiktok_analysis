package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0QBO, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface C0QBO extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "consentKey", required = true)
    String getConsentKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    Map<String, Object> getExtra();
}
