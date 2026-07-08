package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1AQN, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C040D
public interface C1AQN extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "current_position", required = false)
    Number getCurrentPosition();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "from_page", required = false)
    String getFromPage();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "orientation", required = false)
    @InterfaceC1909307dr(option = {"portrait", "landscape"})
    String getOrientation();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "video_len", required = false)
    Number getVideoLen();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "video_url", required = false)
    String getVideoUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_auto_play", required = false)
    Boolean isAutoPlay();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_mute", required = false)
    Boolean isMute();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_pause", required = false)
    Boolean isPause();
}
