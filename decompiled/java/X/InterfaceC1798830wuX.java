package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0wuX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1798830wuX extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "formattedPrices", required = true)
    Map<String, Object> getFormattedPrices();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "formattedPrices", required = true)
    void setFormattedPrices(Map<String, ? extends Object> map);
}
