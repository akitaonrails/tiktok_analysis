package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0OQW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public interface C0OQW extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "aid", required = false)
    String getAid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "channel_id", required = true)
    String getChannelId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    String getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "images", required = false)
    String getImages();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "item_type", required = true)
    Number getItemType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "links", required = false)
    String getLinks();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "text", required = false)
    String getText();
}
