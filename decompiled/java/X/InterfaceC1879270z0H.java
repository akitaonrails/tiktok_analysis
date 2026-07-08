package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0z0H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1879270z0H extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "contentPb", required = true)
    String getContentPb();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "defaultSelectedUids", required = false)
    String getDefaultSelectedUids();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "defaultText", required = false)
    String getDefaultText();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = false)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterMethod", required = false)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    Map<String, Object> getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "previewCoverUrl", required = false)
    String getPreviewCoverUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    String getScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shareType", required = true)
    Number getShareType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showBottomSendViewEmoji", required = false)
    Boolean getShowBottomSendViewEmoji();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isHalfScreen", required = false)
    Boolean isHalfScreen();
}
