package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0yqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1873470yqv extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "settings", nestedClassType = InterfaceC1873500yqy.class, required = true)
    List<InterfaceC1873500yqy> getSettings();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "settings", nestedClassType = InterfaceC1873500yqy.class, required = true)
    void setSettings(List<? extends InterfaceC1873500yqy> list);
}
