package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0OXN, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface C0OXN extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bulletinBoardId", required = true)
    String getBulletinBoardId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "itemId", required = true)
    String getItemId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "mobExtra", required = true)
    Map<String, Object> getMobExtra();
}
