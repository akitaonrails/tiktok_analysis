package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0w7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1768520w7e extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cacheParamsKey", primitiveClassType = String.class, required = true)
    List<String> getCacheParamsKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "commonParams", required = true)
    Map<String, Object> getCommonParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "expireTime", required = false)
    Number getExpireTime();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "prefetchScene", required = true)
    String getPrefetchScene();
}
