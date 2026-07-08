package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0q2Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040E
public interface InterfaceC1534720q2Y extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "states", nestedClassType = InterfaceC1534810q2h.class, required = false)
    List<InterfaceC1534810q2h> getStates();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "states", nestedClassType = InterfaceC1534810q2h.class, required = false)
    void setStates(List<? extends InterfaceC1534810q2h> list);
}
