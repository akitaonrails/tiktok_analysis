package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0NkD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC602550NkD extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "requestExtraParams", required = true)
    Map<String, Object> getRequestExtraParams();

    @InterfaceC1909207dq(option = {1, 2, 3, 4, 5, 6, 7, 8})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "type", required = true)
    Number getType();
}
