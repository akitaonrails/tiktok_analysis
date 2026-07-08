package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0PgT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface InterfaceC651190PgT extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cardIndex", required = true)
    Number getCardIndex();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ctxProductIds", required = true)
    String getCtxProductIds();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "productId", required = true)
    String getProductId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "query", required = true)
    String getQuery();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    String getScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "srcId", required = true)
    String getSrcId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userAction", required = true)
    Map<String, Object> getUserAction();
}
