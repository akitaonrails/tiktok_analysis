package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.Map;

/* JADX INFO: renamed from: X.1AUQ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public interface C1AUQ extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = false)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterMethod", required = false)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraParams", required = false)
    Map<String, Object> getExtraParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "previousPage", required = false)
    String getPreviousPage();
}
