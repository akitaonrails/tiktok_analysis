package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0dhP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1060330dhP extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "args", required = false)
    Map<String, Object> getArgs();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "keep_open", required = false)
    Number getKeepOpen();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "page_type", required = false)
    Number getPageType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "panel_type", required = false)
    String getPanelType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "type", required = false)
    String getType();
}
