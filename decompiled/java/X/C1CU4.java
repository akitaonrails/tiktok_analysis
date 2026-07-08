package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.1CU4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1CU4 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "flows", nestedClassType = C1CU6.class, required = true)
    List<C1CU6> getFlows();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minAppVersion", required = true)
    Number getMinAppVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "startAtFlowId", required = true)
    Number getStartAtFlowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "states", nestedClassType = C1CU5.class, required = true)
    List<C1CU5> getStates();
}
