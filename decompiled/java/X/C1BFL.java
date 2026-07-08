package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1BFL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C040D
public interface C1BFL extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "center", required = true)
    String getCenter();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "imageHeight", required = true)
    Number getImageHeight();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "imageWidth", required = true)
    Number getImageWidth();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "maptype", required = false)
    String getMaptype();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "markers", required = true)
    String getMarkers();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "scale", required = false)
    String getScale();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "style", required = false)
    String getStyle();
}
