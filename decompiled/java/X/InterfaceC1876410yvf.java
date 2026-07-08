package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0yvf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1876410yvf extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "collectionPointID", required = false)
    String getCollectionPointID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "consentKey", required = true)
    String getConsentKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    String getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "flow", required = false)
    String getFlow();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "forceSync", required = false)
    Boolean getForceSync();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    Number getStatus();
}
