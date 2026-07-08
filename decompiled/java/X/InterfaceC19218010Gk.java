package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.10Gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC19218010Gk extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "settings_value", nestedClassType = InterfaceC19218210Gm.class, required = true)
    List<InterfaceC19218210Gm> getSettingsValue();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "settings_value", nestedClassType = InterfaceC19218210Gm.class, required = true)
    void setSettingsValue(List<? extends InterfaceC19218210Gm> list);
}
