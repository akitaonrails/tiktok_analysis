package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0YXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC875790YXh extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "content", required = true)
    String getContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ext", required = true)
    Map<String, Object> getExt();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "type", required = true)
    Number getType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uuid", required = false)
    String getUuid();
}
