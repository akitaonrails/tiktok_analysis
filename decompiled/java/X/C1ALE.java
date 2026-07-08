package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.Map;

/* JADX INFO: renamed from: X.1ALE, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public interface C1ALE extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "chargeReason", required = true)
    String getChargeReason();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    Map<String, Object> getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "requestPage", required = true)
    String getRequestPage();
}
