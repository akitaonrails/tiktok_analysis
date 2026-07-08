package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0qNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040D
public interface InterfaceC1547900qNo extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "biz", required = true)
    String getBiz();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "cacheKey", required = true)
    String getCacheKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "keepAliveWhenUsed", required = false)
    Boolean getKeepAliveWhenUsed();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "matchCacheRegex", required = false)
    String getMatchCacheRegex();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "maxCacheKeyCount", required = false)
    Number getMaxCacheKeyCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "maxPrerenderCountPerCacheKey", required = false)
    Number getMaxPrerenderCountPerCacheKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "now", required = false)
    Boolean getNow();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pendingLoad", required = false)
    Boolean getPendingLoad();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "prerenderCheckStatusType", required = false)
    Number getPrerenderCheckStatusType();
}
