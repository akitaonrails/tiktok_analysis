package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1414, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C040D
public interface AnonymousClass1414 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "base64DataCompress", required = false)
    Number getBase64DataCompress();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "imageCompress", required = false)
    Number getImageCompress();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "maxRecordSeconds", required = false)
    Number getMaxRecordSeconds();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "maxSelectAssetCount", required = true)
    Number getMaxSelectAssetCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "maxSelectVideoCount", required = true)
    Number getMaxSelectVideoCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minRecordSeconds", required = false)
    Number getMinRecordSeconds();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "previousPage", required = true)
    String getPreviousPage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showPreviewAfterRecord", required = false)
    Boolean getShowPreviewAfterRecord();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "toolbarType", required = false)
    Number getToolbarType();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "type", required = true)
    Number getType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "videoCompress", required = false)
    Number getVideoCompress();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "videoTargetSize", nestedClassType = AnonymousClass1416.class, required = false)
    AnonymousClass1416 getVideoTargetSize();
}
