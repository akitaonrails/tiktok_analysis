package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0grr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C040D
public interface InterfaceC1182130grr extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "awemeIds", primitiveClassType = String.class, required = true)
    List<String> getAwemeIds();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "cursor", required = true)
    String getCursor();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "dataVersion", required = false)
    String getDataVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "dimensionKey", required = true)
    String getDimensionKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "poiId", required = true)
    String getPoiId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trackParams", required = true)
    String getTrackParams();
}
