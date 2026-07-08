package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0wlW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1793240wlW extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "canReceiveReward", required = true)
    Boolean getCanReceiveReward();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "rewardData", required = false)
    Map<String, Object> getRewardData();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "canReceiveReward", required = true)
    void setCanReceiveReward(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "rewardData", required = false)
    void setRewardData(Map<String, ? extends Object> map);
}
