package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0veP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public interface InterfaceC1750390veP extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "avatar", nestedClassType = InterfaceC1750360veM.class, required = true)
    InterfaceC1750360veM getAvatar();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "name", required = true)
    String getName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "seller_id", required = true)
    String getSellerId();
}
