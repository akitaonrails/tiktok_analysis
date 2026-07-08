package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.18fN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C040D
public interface InterfaceC21340718fN extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "exchangeScenario", required = false)
    String getExchangeScenario();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftEnterFrom", required = true)
    String getGiftEnterFrom();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = false, type = DefaultType.BOOL), isGetter = true, keyPath = "notRequireOpenTaskPage", required = false)
    boolean getNotRequireOpenTaskPage();
}
