package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.1AEO, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C040D
public interface C1AEO extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "autoRouteSchema", required = false)
    String getAutoRouteSchema();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "bagAutoRoute", required = false)
    Number getBagAutoRoute();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "bagLogExtra", required = false)
    String getBagLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFromMerge", required = true)
    String getEnterFromMerge();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterMethod", required = true)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    Map<String, Object> getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "hasCommerceGoods", required = false)
    Boolean getHasCommerceGoods();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "logExtra", required = false)
    Map<String, Object> getLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "owner", required = false)
    String getOwner();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "playerTag", required = false)
    String getPlayerTag();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "roomId", required = true)
    String getRoomId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "streamData", required = false)
    String getStreamData();
}
