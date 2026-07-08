package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0udu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1711640udu extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "paymentInfo", required = false)
    String getPaymentInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    Number getStatus();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "paymentInfo", required = false)
    void setPaymentInfo(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    void setStatus(Number number);
}
