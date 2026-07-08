package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.Map;

/* JADX INFO: renamed from: X.1B1W, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1B1W extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "coverUri", required = false)
    String getCoverUri();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "metaInfo", required = false)
    Map<String, Object> getMetaInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "vid", required = false)
    String getVid();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "coverUri", required = false)
    void setCoverUri(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "metaInfo", required = false)
    void setMetaInfo(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "vid", required = false)
    void setVid(String str);
}
