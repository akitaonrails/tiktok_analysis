package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0m9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C040D
public interface InterfaceC1385340m9c extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "customIconName", required = false)
    String getCustomIconName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "duration", required = false)
    Number getDuration();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "hasClose", required = false)
    Boolean getHasClose();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "iconType", required = true)
    @InterfaceC1909307dr(option = {"none", "info", "success", "warning", "error", "custom"})
    String getIconType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "message", required = false)
    String getMessage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "offset", nestedClassType = InterfaceC1385350m9d.class, required = false)
    InterfaceC1385350m9d getOffset();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = false, type = DefaultType.BOOL), isGetter = true, keyPath = "shouldUseLynxDialogContext", required = false)
    boolean getShouldUseLynxDialogContext();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "theme", required = false)
    @InterfaceC1909307dr(option = {"auto", "light", "dark"})
    String getTheme();
}
