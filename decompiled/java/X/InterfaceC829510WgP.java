package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0WgP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C040E
public interface InterfaceC829510WgP extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "auth_result", required = false)
    Number getAuthResult();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = false)
    String getStatus();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "auth_result", required = false)
    void setAuthResult(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = false)
    void setStatus(String str);
}
