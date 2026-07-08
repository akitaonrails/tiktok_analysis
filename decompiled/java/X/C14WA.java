package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.14WA, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C040D
public interface C14WA extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "codePosition", nestedClassType = C14WD.class, required = true)
    C14WD getCodePosition();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(stringValue = "info", type = DefaultType.STRING), isEnum = true, isGetter = true, keyPath = "level", required = true)
    @InterfaceC1909307dr(option = {"debug", "error", "info", "verbose", "warn"})
    String getLevel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "message", required = true)
    String getMessage();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(stringValue = "unknown", type = DefaultType.STRING), isGetter = true, keyPath = "tag", required = false)
    String getTag();
}
