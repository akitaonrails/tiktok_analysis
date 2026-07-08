package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.18ly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C040D
public interface InterfaceC21381618ly extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "download_url", required = false)
    String getDownloadUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "duration", required = false)
    Number getDuration();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_from", required = false)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_from_page", required = false)
    String getEnterFromPage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "m3u8_url", required = true)
    String getM3u8Url();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "room_id", required = true)
    String getRoomId();

    @InterfaceC1909207dq(option = {0, 1, 2, 3, 4})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    Number getStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "video_info", nestedClassType = InterfaceC21381518lx.class, required = false)
    InterfaceC21381518lx getVideoInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "video_length", required = false)
    Number getVideoLength();
}
