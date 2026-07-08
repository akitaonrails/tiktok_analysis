package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0QVE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface C0QVE extends XBaseParamModel {
    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 0, type = DefaultType.INT), isGetter = true, keyPath = "shop_card_height", required = false)
    Number getShopCardHeight();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "visible", required = true)
    boolean getVisible();
}
