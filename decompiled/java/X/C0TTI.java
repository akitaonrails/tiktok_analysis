package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0TTI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C040E
public interface C0TTI extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "height", required = true)
    Number getHeight();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "width", required = true)
    Number getWidth();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "height", required = true)
    void setHeight(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "width", required = true)
    void setWidth(Number number);
}
