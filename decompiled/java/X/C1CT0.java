package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.1CT0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1CT0 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "flows", nestedClassType = InterfaceC2230781CSu.class, required = true)
    List<InterfaceC2230781CSu> getFlows();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minAppVersion", required = true)
    Number getMinAppVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "startAtFlowId", required = true)
    Number getStartAtFlowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "states", nestedClassType = C1CT2.class, required = true)
    List<C1CT2> getStates();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "flows", nestedClassType = InterfaceC2230781CSu.class, required = true)
    void setFlows(List<? extends InterfaceC2230781CSu> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "minAppVersion", required = true)
    void setMinAppVersion(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "startAtFlowId", required = true)
    void setStartAtFlowId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "states", nestedClassType = C1CT2.class, required = true)
    void setStates(List<? extends C1CT2> list);
}
