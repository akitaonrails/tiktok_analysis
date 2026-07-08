package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0yzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1878700yzM extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "anchorId", required = false)
    String getAnchorId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "contentDesc", required = true)
    String getContentDesc();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "contentPb", required = true)
    String getContentPb();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = false)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFromPage", required = false)
    String getEnterFromPage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "imageURL", required = true)
    String getImageURL();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "roomId", required = false)
    String getRoomId();
}
