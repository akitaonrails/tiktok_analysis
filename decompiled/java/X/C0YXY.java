package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0YXY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public interface C0YXY extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "ext", required = true)
    Map<String, Object> getExt();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minIndex", required = false)
    String getMinIndex();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "readIndex", required = true)
    String getReadIndex();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "version", required = true)
    Number getVersion();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "ext", required = true)
    void setExt(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "minIndex", required = false)
    void setMinIndex(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "readIndex", required = true)
    void setReadIndex(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "version", required = true)
    void setVersion(Number number);
}
