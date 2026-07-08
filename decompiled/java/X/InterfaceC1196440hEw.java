package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0hEw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C040D
public interface InterfaceC1196440hEw extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bottomButton", nestedClassType = InterfaceC1196420hEu.class, required = false)
    InterfaceC1196420hEu getBottomButton();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "customLynxData", nestedClassType = InterfaceC1196470hEz.class, required = false)
    InterfaceC1196470hEz getCustomLynxData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "description_list", primitiveClassType = String.class, required = true)
    List<String> getDescriptionList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "disableAudienceFocus", required = false)
    Boolean getDisableAudienceFocus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "imageIds", primitiveClassType = String.class, required = false)
    List<String> getImageIds();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "images", required = true)
    List<Object> getImages();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "index", required = true)
    Number getIndex();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "loop", required = true)
    boolean getLoop();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "needDownload", required = true)
    boolean getNeedDownload();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "needReport", required = false)
    Boolean getNeedReport();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "openType", required = true)
    String getOpenType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "poiBizInfo", required = false)
    Map<String, Object> getPoiBizInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "style", required = true)
    Number getStyle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "thumbnailUrls", primitiveClassType = String.class, required = false)
    List<String> getThumbnailUrls();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trackParams", required = false)
    Map<String, Object> getTrackParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uid", required = false)
    String getUid();
}
