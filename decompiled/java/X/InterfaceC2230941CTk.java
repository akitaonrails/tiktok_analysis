package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.1CTk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2230941CTk extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_UID, required = true)
    Number getId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "parallelStateData", nestedClassType = InterfaceC2230851CTb.class, required = false)
    InterfaceC2230851CTb getParallelStateData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "stateType", required = true)
    String getStateType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "taskStateData", nestedClassType = C1CTX.class, required = false)
    C1CTX getTaskStateData();

    @InterfaceC1549470qQL(isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_UID, required = true)
    void setId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "parallelStateData", nestedClassType = InterfaceC2230851CTb.class, required = false)
    void setParallelStateData(InterfaceC2230851CTb interfaceC2230851CTb);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "stateType", required = true)
    void setStateType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "taskStateData", nestedClassType = C1CTX.class, required = false)
    void setTaskStateData(C1CTX c1ctx);
}
