package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0fAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040D
public interface InterfaceC1116870fAb extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "async", required = false)
    Boolean getAsync();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "input_params", required = false)
    Map<String, Object> getInputParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pending_timeout", required = false)
    Number getPendingTimeout();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "task_key", required = true)
    String getTaskKey();
}
