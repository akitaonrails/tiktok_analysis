package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.1ALK, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C040E
public interface C1ALK extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "location", nestedClassType = C1ALI.class, required = true)
    C1ALI getLocation();

    @InterfaceC1909207dq(option = {0, 1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    Number getStatus();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "location", nestedClassType = C1ALI.class, required = true)
    void setLocation(C1ALI c1ali);

    @InterfaceC1909207dq(option = {0, 1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    void setStatus(Number number);
}
