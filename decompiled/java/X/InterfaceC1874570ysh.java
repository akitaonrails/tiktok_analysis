package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0ysh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1874570ysh extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cohostEnable", required = true)
    Number getCohostEnable();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "quickCohostEnable", required = true)
    Number getQuickCohostEnable();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "cohostEnable", required = true)
    void setCohostEnable(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "quickCohostEnable", required = true)
    void setQuickCohostEnable(Number number);
}
