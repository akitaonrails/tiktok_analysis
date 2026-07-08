package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0wuZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1798850wuZ extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "currencyCode", required = true)
    String getCurrencyCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "decimalPoint", required = true)
    Number getDecimalPoint();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "defaultLocale", required = false)
    Number getDefaultLocale();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "locale", required = false)
    String getLocale();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "prices", primitiveClassType = String.class, required = true)
    List<String> getPrices();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showCurrencySymbol", required = false)
    Boolean getShowCurrencySymbol();
}
