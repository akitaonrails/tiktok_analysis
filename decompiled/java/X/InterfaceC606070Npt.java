package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Npt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040E
public interface InterfaceC606070Npt extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "settings", required = true)
    Map<String, Object> getSettings();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "settings", required = true)
    void setSettings(Map<String, ? extends Object> map);
}
