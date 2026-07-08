package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.1AwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C040D
public interface InterfaceC2195441AwA extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "log_extra", required = false)
    Map<String, Object> getLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trade_order_id", required = true)
    String getTradeOrderId();
}
