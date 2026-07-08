package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0mE6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C040D
public interface InterfaceC1388120mE6 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bottomDistance", required = false)
    Number getBottomDistance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "delay", required = false)
    Number getDelay();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "dispatchTouchEventOnDialog", required = false)
    Boolean getDispatchTouchEventOnDialog();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "duration", required = false)
    Number getDuration();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "message", required = true)
    String getMessage();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "theme", required = false)
    @InterfaceC1909307dr(option = {"auto", "light", "dark"})
    String getTheme();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "trailingSlot", required = false)
    @InterfaceC1909307dr(option = {"Link", "Button", "Chevron", "Empty"})
    String getTrailingSlot();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trailingText", required = false)
    String getTrailingText();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "type", required = true)
    @InterfaceC1909307dr(option = {"none", "info", "success", "warning", "error"})
    String getType();
}
