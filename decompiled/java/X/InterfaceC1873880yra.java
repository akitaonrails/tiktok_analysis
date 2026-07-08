package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0yra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1873880yra extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "follow_status", required = false)
    String getFollowStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "follower_count", required = false)
    String getFollowerCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "following_count", required = false)
    String getFollowingCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "push_status", required = false)
    String getPushStatus();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "follow_status", required = false)
    void setFollowStatus(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "follower_count", required = false)
    void setFollowerCount(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "following_count", required = false)
    void setFollowingCount(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "push_status", required = false)
    void setPushStatus(String str);
}
