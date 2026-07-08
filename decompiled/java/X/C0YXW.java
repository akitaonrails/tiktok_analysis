package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: renamed from: X.0YXW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C040E
public interface C0YXW extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bizExt", required = false)
    String getBizExt();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationType", required = true)
    Number getConversationType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "coreInfo", nestedClassType = C0YXX.class, required = true)
    C0YXX getCoreInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "countdown", required = true)
    Boolean getCountdown();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "countdownTime", required = false)
    Number getCountdownTime();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_UID, required = true)
    String getId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "members", nestedClassType = C0YXZ.class, required = true)
    List<C0YXZ> getMembers();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minIndex", required = false)
    String getMinIndex();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "readIndex", required = true)
    String getReadIndex();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "settingInfo", nestedClassType = C0YXY.class, required = true)
    C0YXY getSettingInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shortId", required = true)
    String getShortId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "unreadCount", required = true)
    Number getUnreadCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "updateAt", required = true)
    Number getUpdateAt();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isMember", required = true)
    Boolean isMember();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "bizExt", required = false)
    void setBizExt(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "conversationType", required = true)
    void setConversationType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "coreInfo", nestedClassType = C0YXX.class, required = true)
    void setCoreInfo(C0YXX c0yxx);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "countdown", required = true)
    void setCountdown(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "countdownTime", required = false)
    void setCountdownTime(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_UID, required = true)
    void setId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isMember", required = true)
    void setMember(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "members", nestedClassType = C0YXZ.class, required = true)
    void setMembers(List<? extends C0YXZ> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "minIndex", required = false)
    void setMinIndex(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "readIndex", required = true)
    void setReadIndex(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "settingInfo", nestedClassType = C0YXY.class, required = true)
    void setSettingInfo(C0YXY c0yxy);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "shortId", required = true)
    void setShortId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "unreadCount", required = true)
    void setUnreadCount(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "updateAt", required = true)
    void setUpdateAt(Number number);
}
