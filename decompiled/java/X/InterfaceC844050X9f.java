package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0X9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C040D
public interface InterfaceC844050X9f extends XBaseParamModel {
    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 0, type = DefaultType.INT), isEnum = true, isGetter = true, keyPath = "action", required = false)
    Number getAction();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "packageName", required = false)
    String getPackageName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = true)
    String getSchema();
}
