package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0OQS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface C0OQS extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bulletinBoardId", required = true)
    String getBulletinBoardId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventData", nestedClassType = C0OQV.class, required = true)
    List<C0OQV> getEventData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "mobExtra", required = false)
    Map<String, Object> getMobExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "needMockMessage", required = false)
    Boolean getNeedMockMessage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "needQuickFail", required = false)
    Boolean getNeedQuickFail();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "postDetailData", nestedClassType = C0OQW.class, required = true)
    List<C0OQW> getPostDetailData();
}
