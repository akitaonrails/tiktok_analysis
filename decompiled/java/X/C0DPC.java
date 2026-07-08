package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0DPC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C040D
public interface C0DPC extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    Map<String, Object> getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "strategyName", required = true)
    String getStrategyName();

    @InterfaceC1909207dq(option = {0, 1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "strategyType", required = true)
    Number getStrategyType();
}
