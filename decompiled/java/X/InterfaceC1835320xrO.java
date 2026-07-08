package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0xrO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1835320xrO extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "percent", required = false)
    Number getPercent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = false)
    Number getStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = false)
    String getUrl();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "percent", required = false)
    void setPercent(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = false)
    void setStatus(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "url", required = false)
    void setUrl(String str);
}
