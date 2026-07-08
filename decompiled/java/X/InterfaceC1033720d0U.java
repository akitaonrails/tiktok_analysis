package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0d0U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1033720d0U extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "commonParams", required = true)
    String getCommonParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraParams", required = true)
    String getExtraParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "logExtra", required = true)
    String getLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "prefetchParams", required = true)
    String getPrefetchParams();
}
