package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0v15, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1726010v15 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "rawResponse", required = false)
    String getRawResponse();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "requestInfo", required = false)
    Object getRequestInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "response", required = false)
    Object getResponse();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    @InterfaceC1909307dr(option = {"success", "fail", "none", "pending"})
    String getStatus();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "rawResponse", required = false)
    void setRawResponse(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "requestInfo", required = false)
    void setRequestInfo(Object obj);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "response", required = false)
    void setResponse(Object obj);

    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    @InterfaceC1909307dr(option = {"success", "fail", "none", "pending"})
    void setStatus(String str);
}
