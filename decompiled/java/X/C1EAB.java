package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.1EAB, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
@C040E
public interface C1EAB extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "channelId", required = true)
    Number getChannelId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "guestCount", required = true)
    Number getGuestCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "layoutId", required = true)
    String getLayoutId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ongoingPlayList", primitiveClassType = String.class, required = true)
    List<String> getOngoingPlayList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "topGuestPlayId", required = true)
    Number getTopGuestPlayId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userType", required = true)
    String getUserType();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "channelId", required = true)
    void setChannelId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "guestCount", required = true)
    void setGuestCount(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "layoutId", required = true)
    void setLayoutId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "ongoingPlayList", primitiveClassType = String.class, required = true)
    void setOngoingPlayList(List<String> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "topGuestPlayId", required = true)
    void setTopGuestPlayId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "userType", required = true)
    void setUserType(String str);
}
