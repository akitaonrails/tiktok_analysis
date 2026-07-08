package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0fda, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040D
public interface InterfaceC1134840fda extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "dayEndTime", required = false)
    String getDayEndTime();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "type", required = true)
    @InterfaceC1909307dr(option = {"get", "startRecord"})
    String getType();
}
