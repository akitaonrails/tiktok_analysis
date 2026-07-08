package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0KFY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public interface C0KFY extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "index", required = true)
    Number getIndex();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "text", required = false)
    String getText();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "variant", required = true)
    @InterfaceC1909307dr(option = {"primary", "secondary", "destructive"})
    String getVariant();
}
