package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0OWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC620800OWo extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bulletinBoardId", required = true)
    String getBulletinBoardId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "mobExtra", required = false)
    Map<String, Object> getMobExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "postContentMap", required = false)
    Map<String, Object> getPostContentMap();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "postType", required = true)
    Number getPostType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "taskSceneParams", required = false)
    Map<String, Object> getTaskSceneParams();
}
