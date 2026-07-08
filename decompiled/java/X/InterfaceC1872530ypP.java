package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0ypP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1872530ypP extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "context", required = false)
    Map<String, Object> getContext();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = true, type = DefaultType.BOOL), isGetter = true, keyPath = "keepOpen", required = false)
    boolean getKeepOpen();
}
