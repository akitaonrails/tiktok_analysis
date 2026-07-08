package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0yrY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1873860yrY extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "avatar_thumb", nestedClassType = InterfaceC1873600yr8.class, required = false)
    InterfaceC1873600yr8 getAvatarThumb();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "display_id", required = false)
    String getDisplayId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "follow_info", nestedClassType = InterfaceC1873880yra.class, required = false)
    InterfaceC1873880yra getFollowInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "name_label", required = false)
    String getNameLabel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "nickname", required = false)
    String getNickname();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "avatar_thumb", nestedClassType = InterfaceC1873600yr8.class, required = false)
    void setAvatarThumb(InterfaceC1873600yr8 interfaceC1873600yr8);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "display_id", required = false)
    void setDisplayId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "follow_info", nestedClassType = InterfaceC1873880yra.class, required = false)
    void setFollowInfo(InterfaceC1873880yra interfaceC1873880yra);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "name_label", required = false)
    void setNameLabel(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "nickname", required = false)
    void setNickname(String str);
}
