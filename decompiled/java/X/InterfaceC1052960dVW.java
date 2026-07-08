package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0dVW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1052960dVW extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "logExtra", required = false)
    Map<String, Object> getLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tradeOrderId", required = true)
    String getTradeOrderId();
}
