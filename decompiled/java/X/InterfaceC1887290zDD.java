package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0zDD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1887290zDD extends XBaseParamModel {
    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(stringValue = "Cancel", type = DefaultType.STRING), isGetter = true, keyPath = "cancelText", required = false)
    String getCancelText();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(stringValue = "OK", type = DefaultType.STRING), isGetter = true, keyPath = "confirmText", required = false)
    String getConfirmText();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(stringValue = "", type = DefaultType.STRING), isGetter = true, keyPath = "content", required = false)
    String getContent();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = false, type = DefaultType.BOOL), isGetter = true, keyPath = "showCancel", required = false)
    boolean getShowCancel();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = false, type = DefaultType.BOOL), isGetter = true, keyPath = "tapMaskToDismiss", required = false)
    boolean getTapMaskToDismiss();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(stringValue = "", type = DefaultType.STRING), isGetter = true, keyPath = "title", required = false)
    String getTitle();
}
