package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0xzw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1840620xzw extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "accepted", required = false)
    Boolean getAccepted();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    String getStatus();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "accepted", required = false)
    void setAccepted(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    void setStatus(String str);
}
