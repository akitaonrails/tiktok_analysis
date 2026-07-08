package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0yvj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1876450yvj extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "time_string", required = true)
    String getTimeString();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_hour_24_format", required = true)
    Boolean isHour24Format();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_hour_24_format", required = true)
    void setHour24Format(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "time_string", required = true)
    void setTimeString(String str);
}
