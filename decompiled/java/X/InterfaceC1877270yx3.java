package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;

/* JADX INFO: renamed from: X.0yx3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1877270yx3 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = true)
    Map<String, Object> getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sourceId", required = true)
    String getSourceId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    Number getStatus();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "extra", required = true)
    void setExtra(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sourceId", required = true)
    void setSourceId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    void setStatus(Number number);
}
