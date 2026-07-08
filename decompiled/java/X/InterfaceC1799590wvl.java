package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0wvl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1799590wvl extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "consumeURL", required = false)
    String getConsumeURL();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "content", required = false)
    Map<String, Object> getContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "keyword", required = false)
    String getKeyword();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "subtype", required = false)
    String getSubtype();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "type", required = true)
    Number getType();
}
