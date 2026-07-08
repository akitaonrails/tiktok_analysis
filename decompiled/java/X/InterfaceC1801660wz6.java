package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0wz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1801660wz6 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "aspectRatio", required = true)
    Number getAspectRatio();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "maximalOverlappingEdges", required = false)
    Number getMaximalOverlappingEdges();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minimalAreaRatio", required = false)
    Number getMinimalAreaRatio();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tipResources", nestedClassType = InterfaceC1801650wz5.class, required = false)
    InterfaceC1801650wz5 getTipResources();
}
