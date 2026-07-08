package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0pF1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040E
public interface InterfaceC1504010pF1 extends XBaseResultModel {
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    @InterfaceC1909307dr(option = {"cancelled", "loggedOut"})
    String getStatus();

    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    @InterfaceC1909307dr(option = {"cancelled", "loggedOut"})
    void setStatus(String str);
}
