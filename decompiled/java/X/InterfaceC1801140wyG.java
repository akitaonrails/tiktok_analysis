package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0wyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1801140wyG extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "categorySubscriptionStates", nestedClassType = InterfaceC1801150wyH.class, required = false)
    List<InterfaceC1801150wyH> getCategorySubscriptionStates();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "channelSubscriptionState", required = false)
    Boolean getChannelSubscriptionState();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "categorySubscriptionStates", nestedClassType = InterfaceC1801150wyH.class, required = false)
    void setCategorySubscriptionStates(List<? extends InterfaceC1801150wyH> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "channelSubscriptionState", required = false)
    void setChannelSubscriptionState(Boolean bool);
}
