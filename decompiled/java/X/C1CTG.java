package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.1CTG, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1CTG extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_UID, required = true)
    Number getId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "parallelStateData", nestedClassType = C1CTF.class, required = false)
    C1CTF getParallelStateData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "stateType", required = true)
    String getStateType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "taskStateData", nestedClassType = C1CTD.class, required = false)
    C1CTD getTaskStateData();
}
