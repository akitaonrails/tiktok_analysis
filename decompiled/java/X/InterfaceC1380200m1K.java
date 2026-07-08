package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;

/* JADX INFO: renamed from: X.0m1K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C040D
public interface InterfaceC1380200m1K extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_UID, required = true)
    String getId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "internalURL", required = true)
    String getInternalURL();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "liveEventUserResponse", required = true)
    Map<String, Object> getLiveEventUserResponse();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "organizer", required = true)
    Map<String, Object> getOrganizer();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shareURL", required = true)
    String getShareURL();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "start_time", required = true)
    String getStartTime();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = true)
    String getTitle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "track_info", required = true)
    Map<String, Object> getTrackInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "unreadRegisteredGuestCount", required = true)
    Number getUnreadRegisteredGuestCount();
}
