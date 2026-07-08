package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0dUn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1052510dUn extends XBaseParamModel {
    @InterfaceC1909207dq(option = {0, 1, 2})
    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 0, type = DefaultType.INT), isEnum = true, isGetter = true, keyPath = "action", required = false)
    Number getAction();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "animated", required = false)
    Boolean getAnimated();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "replace", required = false)
    Boolean getReplace();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(stringValue = "onlyCloseAfterOpenSucceed", type = DefaultType.STRING), isEnum = true, isGetter = true, keyPath = "replaceType", required = false)
    @InterfaceC1909307dr(option = {"alwaysCloseAfterOpen", "alwaysCloseBeforeOpen", "onlyCloseAfterOpenSucceed"})
    String getReplaceType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = true)
    String getSchema();
}
