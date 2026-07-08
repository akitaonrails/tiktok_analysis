package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0DP5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C040D
public interface C0DP5 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "awemeList", required = true)
    String getAwemeList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "hasMore", required = true)
    Number getHasMore();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "mode", required = false)
    Number getMode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uniqueKey", required = true)
    String getUniqueKey();
}
