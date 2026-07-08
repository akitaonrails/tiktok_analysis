package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0ypL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1872490ypL extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "alreadyLoggedIn", required = false)
    Boolean getAlreadyLoggedIn();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    @InterfaceC1909307dr(option = {"cancelled", "loggedIn"})
    String getStatus();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "alreadyLoggedIn", required = false)
    void setAlreadyLoggedIn(Boolean bool);

    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    @InterfaceC1909307dr(option = {"cancelled", "loggedIn"})
    void setStatus(String str);
}
