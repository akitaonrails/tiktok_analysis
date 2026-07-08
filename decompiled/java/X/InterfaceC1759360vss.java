package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0vss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1759360vss extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "delayMs", required = false)
    Number getDelayMs();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pdpUniqueId", required = true)
    String getPdpUniqueId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = true)
    String getSchema();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "templateData", required = true)
    String getTemplateData();
}
