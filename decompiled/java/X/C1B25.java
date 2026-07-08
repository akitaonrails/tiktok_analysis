package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.1B25, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C040E
public interface C1B25 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "settings_value", nestedClassType = C1B26.class, required = true)
    List<C1B26> getSettingsValue();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "settings_value", nestedClassType = C1B26.class, required = true)
    void setSettingsValue(List<? extends C1B26> list);
}
