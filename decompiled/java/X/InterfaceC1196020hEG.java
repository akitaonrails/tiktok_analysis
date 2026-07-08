package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0hEG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C040D
public interface InterfaceC1196020hEG extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "defaultTime", required = true)
    Number getDefaultTime();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = false)
    String getTitle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isTimeIndicatorSuffix", required = false)
    Boolean isTimeIndicatorSuffix();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isTwelveHourFormat", required = false)
    Boolean isTwelveHourFormat();
}
