package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0ywL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1876830ywL extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "collectionFlow", required = true)
    String getCollectionFlow();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "consentKey", required = true)
    String getConsentKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "scenario", required = false)
    String getScenario();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "state", required = true)
    Number getState();
}
