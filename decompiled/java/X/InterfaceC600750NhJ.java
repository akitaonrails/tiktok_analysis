package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0NhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC600750NhJ extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "callbackId", required = true)
    String getCallbackId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "code", required = true)
    Number getCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = false)
    Map<String, Object> getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "msg", required = false)
    String getMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "perfParams", required = false)
    Map<String, Object> getPerfParams();
}
