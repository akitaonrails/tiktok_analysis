package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0wib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1791430wib extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "encodedPayload", required = true)
    String getEncodedPayload();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trackingMap", required = false)
    Map<String, Object> getTrackingMap();
}
