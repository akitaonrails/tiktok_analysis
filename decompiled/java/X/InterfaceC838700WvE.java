package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0WvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C040D
public interface InterfaceC838700WvE extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "log_type", required = false)
    String getLogType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "service", required = false)
    String getService();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = false)
    Object getStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "value", required = false)
    Object getValue();
}
