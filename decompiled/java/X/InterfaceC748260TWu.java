package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0TWu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C040D
public interface InterfaceC748260TWu extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "collectStatus", required = true)
    boolean getCollectStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "poiAddress", required = false)
    String getPoiAddress();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "poiID", required = true)
    String getPoiID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "poiName", required = false)
    String getPoiName();
}
