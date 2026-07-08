package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.14WD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public interface C14WD extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "file", required = true)
    String getFile();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "function", required = true)
    String getFunction();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 0, type = DefaultType.INT), isGetter = true, keyPath = "line", required = true)
    Number getLine();
}
