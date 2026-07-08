package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0zDZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1887510zDZ extends XBaseParamModel {
    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(stringValue = "", type = DefaultType.STRING), isGetter = true, keyPath = "backgroundColor", required = false)
    String getBackgroundColor();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(stringValue = "", type = DefaultType.STRING), isEnum = true, isGetter = true, keyPath = "style", required = false)
    @InterfaceC1909307dr(option = {"dark", "light"})
    String getStyle();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = false, type = DefaultType.BOOL), isGetter = true, keyPath = "visible", required = false)
    boolean getVisible();
}
