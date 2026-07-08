package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0ccW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040E
public interface InterfaceC1018860ccW extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "height", required = true)
    Number getHeight();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "scale", required = true)
    Number getScale();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "width", required = true)
    Number getWidth();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "height", required = true)
    void setHeight(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "scale", required = true)
    void setScale(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "width", required = true)
    void setWidth(Number number);
}
