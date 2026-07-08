package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0fAT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040E
public interface InterfaceC1116790fAT extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "trigger_strategy_key", required = false)
    String getTriggerStrategyKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trigger_strategy_value", required = false)
    Number getTriggerStrategyValue();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "trigger_strategy_key", required = false)
    void setTriggerStrategyKey(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "trigger_strategy_value", required = false)
    void setTriggerStrategyValue(Number number);
}
