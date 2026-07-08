package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.1B1q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C040E
public interface InterfaceC2198241B1q extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorInfo", nestedClassType = C1B1V.class, required = false)
    C1B1V getErrorInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "traceId", required = true)
    String getTraceId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "videoInfo", nestedClassType = C1B1W.class, required = false)
    C1B1W getVideoInfo();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorInfo", nestedClassType = C1B1V.class, required = false)
    void setErrorInfo(C1B1V c1b1v);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "traceId", required = true)
    void setTraceId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "videoInfo", nestedClassType = C1B1W.class, required = false)
    void setVideoInfo(C1B1W c1b1w);
}
