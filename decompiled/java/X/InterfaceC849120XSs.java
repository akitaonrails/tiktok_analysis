package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;

/* JADX INFO: renamed from: X.0XSs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C040D
public interface InterfaceC849120XSs extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "logType", required = true)
    String getLogType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "service", required = false)
    String getService();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = false)
    Number getStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "value", required = false)
    Map<String, Object> getValue();
}
