package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0NjB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC601910NjB extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "entrance", required = true)
    String getEntrance();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = true, type = DefaultType.BOOL), isGetter = true, keyPath = "legacy", required = false)
    boolean getLegacy();
}
