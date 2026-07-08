package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0v9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1731320v9e extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "activityId", required = false)
    String getActivityId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "templateCacheKey", required = true)
    String getTemplateCacheKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trackParams", nestedClassType = InterfaceC1731330v9f.class, required = true)
    InterfaceC1731330v9f getTrackParams();
}
