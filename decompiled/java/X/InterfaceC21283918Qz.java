package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.18Qz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public interface InterfaceC21283918Qz extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bottomToastDistance", required = false)
    Number getBottomToastDistance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "needDialogShow", required = true)
    boolean getNeedDialogShow();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "needToast", required = true)
    boolean getNeedToast();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = false, type = DefaultType.BOOL), isGetter = true, keyPath = "successVibrate", required = false)
    boolean getSuccessVibrate();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "toastDelayMS", required = false)
    Number getToastDelayMS();
}
