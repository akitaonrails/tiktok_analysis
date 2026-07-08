package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0DPA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C040E
public interface C0DPA extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "resultData", required = false)
    Map<String, Object> getResultData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "strategyCode", required = false)
    Number getStrategyCode();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "resultData", required = false)
    void setResultData(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "strategyCode", required = false)
    void setStrategyCode(Number number);
}
