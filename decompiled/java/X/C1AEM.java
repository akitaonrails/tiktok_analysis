package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.1AEM, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C040D
public interface C1AEM extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "attachProducts", required = false)
    String getAttachProducts();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = false)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFromSecond", required = false)
    String getEnterFromSecond();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterMethod", required = true)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    Map<String, Object> getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "imageUrl", required = false)
    String getImageUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "originIsMallTab", required = false)
    String getOriginIsMallTab();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "photoProductInfo", required = false)
    Map<String, Object> getPhotoProductInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "photoSearchExtra", required = false)
    Map<String, Object> getPhotoSearchExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "photoSearchModule", required = false)
    String getPhotoSearchModule();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "photoSearchPreviousPage", required = false)
    String getPhotoSearchPreviousPage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "photoSearchPreviousSearchType", required = false)
    String getPhotoSearchPreviousSearchType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "photoSearchTypeDetail", required = false)
    String getPhotoSearchTypeDetail();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "previousPage", required = false)
    String getPreviousPage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "rawPhotoSource", required = false)
    String getRawPhotoSource();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "rootEnterFromType", required = true)
    Number getRootEnterFromType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "searchEntrance", required = false)
    String getSearchEntrance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sourcePageName", required = false)
    String getSourcePageName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trackId", required = false)
    String getTrackId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trafficSourceList", required = true)
    String getTrafficSourceList();
}
