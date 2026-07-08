package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0yrX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1873850yrX extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "inner_channel_id", required = false)
    String getInnerChannelId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "link_mic", nestedClassType = InterfaceC1873660yrE.class, required = false)
    InterfaceC1873660yrE getLinkMic();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "owner", nestedClassType = InterfaceC1873860yrY.class, required = false)
    InterfaceC1873860yrY getOwner();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "owner_user_id", required = false)
    String getOwnerUserId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "room_id", required = false)
    String getRoomId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "inner_channel_id", required = false)
    void setInnerChannelId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "link_mic", nestedClassType = InterfaceC1873660yrE.class, required = false)
    void setLinkMic(InterfaceC1873660yrE interfaceC1873660yrE);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "owner", nestedClassType = InterfaceC1873860yrY.class, required = false)
    void setOwner(InterfaceC1873860yrY interfaceC1873860yrY);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "owner_user_id", required = false)
    void setOwnerUserId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "room_id", required = false)
    void setRoomId(String str);
}
