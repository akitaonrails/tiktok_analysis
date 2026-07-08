package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0yxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1877820yxw extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventKey", required = true)
    String getEventKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    String getStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "taskKey", required = false)
    String getTaskKey();
}
