package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0zHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1890070zHh extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "localVersion", required = false)
    Number getLocalVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "needUpdate", required = true)
    Boolean getNeedUpdate();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = false)
    Number getStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "totalSize", required = false)
    Number getTotalSize();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "version", required = false)
    String getVersion();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "localVersion", required = false)
    void setLocalVersion(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "needUpdate", required = true)
    void setNeedUpdate(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = false)
    void setStatus(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "totalSize", required = false)
    void setTotalSize(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "version", required = false)
    void setVersion(String str);
}
