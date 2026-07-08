package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0hDR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C040D
public interface InterfaceC1195510hDR extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bcmObj", required = false)
    Map<String, Object> getBcmObj();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "btmStr", required = false)
    String getBtmStr();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "popupID", required = true)
    String getPopupID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sceneID", required = true)
    String getSceneID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = true)
    String getSchema();
}
