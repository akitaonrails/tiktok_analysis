package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0qBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040D
public interface InterfaceC1540480qBq extends XBaseParamModel {
    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 1, type = DefaultType.INT), isGetter = true, keyPath = "requestStrategy", required = false)
    Number getRequestStrategy();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ssrCacheKey", required = true)
    String getSsrCacheKey();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, type = DefaultType.INT), isGetter = true, keyPath = "ssrCacheTimeout", required = false)
    Number getSsrCacheTimeout();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ssrRequestBody", nestedClassType = InterfaceC1540500qBs.class, required = false)
    InterfaceC1540500qBs getSsrRequestBody();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "targetUrl", required = true)
    String getTargetUrl();
}
