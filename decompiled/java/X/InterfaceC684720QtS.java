package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0QtS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface InterfaceC684720QtS extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "across_activities", required = false)
    Number getAcrossActivities();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "icon_type", required = false)
    String getIconType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "toast", required = true)
    String getToast();
}
