package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.1AuV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2194411AuV extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "avatarUrl", required = false)
    String getAvatarUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", nestedClassType = InterfaceC2194481Auc.class, required = false)
    List<InterfaceC2194481Auc> getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "displayName", required = false)
    String getDisplayName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "openId", required = false)
    String getOpenId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "avatarUrl", required = false)
    void setAvatarUrl(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "data", nestedClassType = InterfaceC2194481Auc.class, required = false)
    void setData(List<? extends InterfaceC2194481Auc> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "displayName", required = false)
    void setDisplayName(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "openId", required = false)
    void setOpenId(String str);
}
