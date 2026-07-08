package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0w3R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1765910w3R extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "from_page", required = false)
    String getFromPage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "video_cover", required = false)
    String getVideoCover();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "video_len", required = false)
    Number getVideoLen();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "video_url", required = true)
    String getVideoUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_auto_play", required = false)
    Boolean isAutoPlay();
}
