package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0WU7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C040D
public interface C0WU7 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "routeUrls", primitiveClassType = String.class, required = false)
    List<String> getRouteUrls();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shortcutIconData", required = false)
    String getShortcutIconData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shortcutIconPath", required = false)
    String getShortcutIconPath();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shortcutId", required = true)
    String getShortcutId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shortcutLabel", required = true)
    String getShortcutLabel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shortcutNeedLogin", required = true)
    boolean getShortcutNeedLogin();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shortcutRouteAction", required = false)
    String getShortcutRouteAction();
}
