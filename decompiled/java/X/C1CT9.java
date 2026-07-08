package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.1CT9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1CT9 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "flows", nestedClassType = C1CTJ.class, required = true)
    List<C1CTJ> getFlows();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minAppVersion", required = true)
    Number getMinAppVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "startAtFlowId", required = true)
    Number getStartAtFlowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "states", nestedClassType = C1CTH.class, required = true)
    List<C1CTH> getStates();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "flows", nestedClassType = C1CTJ.class, required = true)
    void setFlows(List<? extends C1CTJ> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "minAppVersion", required = true)
    void setMinAppVersion(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "startAtFlowId", required = true)
    void setStartAtFlowId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "states", nestedClassType = C1CTH.class, required = true)
    void setStates(List<? extends C1CTH> list);
}
