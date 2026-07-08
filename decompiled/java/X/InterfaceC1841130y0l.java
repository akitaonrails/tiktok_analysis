package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0y0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1841130y0l extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "anchor_id", required = false)
    String getAnchorId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "cut_content_type", required = false)
    Number getCutContentType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "duration", required = false)
    Number getDuration();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_from", required = false)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_from_page", required = false)
    String getEnterFromPage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    Map<String, Object> getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "initial_duration_s", required = false)
    Number getInitialDurationS();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "initial_time_s", required = false)
    Number getInitialTimeS();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "last_page", required = false)
    String getLastPage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "play_url", required = true)
    String getPlayUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "room_id", required = true)
    String getRoomId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sprite_images", nestedClassType = InterfaceC1841150y0n.class, required = false)
    List<InterfaceC1841150y0n> getSpriteImages();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "user_type", required = false)
    Number getUserType();
}
