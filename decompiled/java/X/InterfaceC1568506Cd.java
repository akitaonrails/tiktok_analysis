package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.06Cd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C040D
public interface InterfaceC1568506Cd extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cid", required = true)
    String getCid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "clickData", nestedClassType = InterfaceC1568906Ch.class, required = false)
    InterfaceC1568906Ch getClickData();

    @InterfaceC1909207dq(option = {1, 2, 3})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "clickType", required = true)
    Number getClickType();
}
