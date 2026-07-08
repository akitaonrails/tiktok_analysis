package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0vfA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1750860vfA extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "favoriteReq", nestedClassType = InterfaceC1750850vf9.class, required = false)
    InterfaceC1750850vf9 getFavoriteReq();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "type", required = true)
    @InterfaceC1909307dr(option = {"share", "favoire", "addToCart", "buyNow"})
    String getType();
}
