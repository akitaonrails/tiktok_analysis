package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0xdU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1826700xdU extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "context", nestedClassType = InterfaceC1826720xdW.class, required = false)
    InterfaceC1826720xdW getContext();

    @InterfaceC1909207dq(option = {1, 2, 3})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "lifeCycle", required = true)
    Number getLifeCycle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "linkId", required = false)
    Number getLinkId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "viewName", required = true)
    String getViewName();

    @InterfaceC1909207dq(option = {1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "viewType", required = true)
    Number getViewType();
}
