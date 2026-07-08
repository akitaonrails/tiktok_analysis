package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0yq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1872990yq9 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "constraint", nestedClassType = InterfaceC1873000yqA.class, required = false)
    InterfaceC1873000yqA getConstraint();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "expireTime", required = true)
    Number getExpireTime();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "key", required = true)
    String getKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "storeTime", required = true)
    Number getStoreTime();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "value", required = true)
    Map<String, Object> getValue();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "version", required = true)
    String getVersion();
}
