package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.1536, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public interface AnonymousClass1536 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_UID, required = true)
    Number getId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "parallelStateData", nestedClassType = AnonymousClass1535.class, required = false)
    AnonymousClass1535 getParallelStateData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "stateType", required = true)
    String getStateType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "taskStateData", nestedClassType = AnonymousClass1534.class, required = false)
    AnonymousClass1534 getTaskStateData();

    @InterfaceC1549470qQL(isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_UID, required = true)
    void setId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "parallelStateData", nestedClassType = AnonymousClass1535.class, required = false)
    void setParallelStateData(AnonymousClass1535 anonymousClass1535);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "stateType", required = true)
    void setStateType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "taskStateData", nestedClassType = AnonymousClass1534.class, required = false)
    void setTaskStateData(AnonymousClass1534 anonymousClass1534);
}
