package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.1CTH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1CTH extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_UID, required = true)
    Number getId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "parallelStateData", nestedClassType = C1CTE.class, required = false)
    C1CTE getParallelStateData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "stateType", required = true)
    String getStateType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "taskStateData", nestedClassType = C1CTC.class, required = false)
    C1CTC getTaskStateData();

    @InterfaceC1549470qQL(isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_UID, required = true)
    void setId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "parallelStateData", nestedClassType = C1CTE.class, required = false)
    void setParallelStateData(C1CTE c1cte);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "stateType", required = true)
    void setStateType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "taskStateData", nestedClassType = C1CTC.class, required = false)
    void setTaskStateData(C1CTC c1ctc);
}
