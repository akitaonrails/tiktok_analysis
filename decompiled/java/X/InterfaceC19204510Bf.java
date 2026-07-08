package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.10Bf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC19204510Bf extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "changeset", nestedClassType = InterfaceC19204310Bd.class, required = true)
    List<InterfaceC19204310Bd> getChangeset();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "timestamp", required = false)
    Number getTimestamp();
}
