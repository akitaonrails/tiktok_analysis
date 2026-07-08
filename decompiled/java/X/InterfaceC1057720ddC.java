package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0ddC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1057720ddC extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "logExtra", required = false)
    Map<String, Object> getLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pageIdentifier", required = true)
    String getPageIdentifier();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "popupIdentifier", required = true)
    String getPopupIdentifier();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = true)
    String getSchema();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showImmediately", required = false)
    Boolean getShowImmediately();
}
