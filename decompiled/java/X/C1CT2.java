package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.1CT2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1CT2 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_UID, required = true)
    Number getId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "parallelStateData", nestedClassType = InterfaceC2230761CSs.class, required = false)
    InterfaceC2230761CSs getParallelStateData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "stateType", required = true)
    String getStateType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "taskStateData", nestedClassType = InterfaceC2230811CSx.class, required = false)
    InterfaceC2230811CSx getTaskStateData();

    @InterfaceC1549470qQL(isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_UID, required = true)
    void setId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "parallelStateData", nestedClassType = InterfaceC2230761CSs.class, required = false)
    void setParallelStateData(InterfaceC2230761CSs interfaceC2230761CSs);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "stateType", required = true)
    void setStateType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "taskStateData", nestedClassType = InterfaceC2230811CSx.class, required = false)
    void setTaskStateData(InterfaceC2230811CSx interfaceC2230811CSx);
}
