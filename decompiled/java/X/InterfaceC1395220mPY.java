package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0mPY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C040E
public interface InterfaceC1395220mPY extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "preloadKey", required = false)
    String getPreloadKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "preloadUrl", required = false)
    String getPreloadUrl();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "preloadKey", required = false)
    void setPreloadKey(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "preloadUrl", required = false)
    void setPreloadUrl(String str);
}
