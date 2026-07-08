package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.1B1Z, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C040E
public interface C1B1Z extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorInfo", nestedClassType = C1B1T.class, required = false)
    C1B1T getErrorInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "imageInfos", nestedClassType = C1B1P.class, required = false)
    List<C1B1P> getImageInfos();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "traceId", required = true)
    String getTraceId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorInfo", nestedClassType = C1B1T.class, required = false)
    void setErrorInfo(C1B1T c1b1t);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "imageInfos", nestedClassType = C1B1P.class, required = false)
    void setImageInfos(List<? extends C1B1P> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "traceId", required = true)
    void setTraceId(String str);
}
