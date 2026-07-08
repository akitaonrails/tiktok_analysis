package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0cWQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1015080cWQ extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "logExtra", required = false)
    Map<String, Object> getLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "lynxSchema", required = false)
    String getLynxSchema();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "openUrl", required = false)
    String getOpenUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "webUrl", required = true)
    String getWebUrl();
}
