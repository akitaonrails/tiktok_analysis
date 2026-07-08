package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0KFX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C040D
public interface C0KFX extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "actions", nestedClassType = C0KFY.class, required = false)
    List<C0KFY> getActions();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "descriptions", nestedClassType = C0KFZ.class, required = false)
    List<C0KFZ> getDescriptions();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = false)
    String getTitle();
}
