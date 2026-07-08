package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.1CQL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1CQL extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "flows", nestedClassType = InterfaceC2230141CQi.class, required = true)
    List<InterfaceC2230141CQi> getFlows();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minAppVersion", required = true)
    Number getMinAppVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "startAtFlowId", required = true)
    Number getStartAtFlowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "states", nestedClassType = InterfaceC2230131CQh.class, required = true)
    List<InterfaceC2230131CQh> getStates();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "flows", nestedClassType = InterfaceC2230141CQi.class, required = true)
    void setFlows(List<? extends InterfaceC2230141CQi> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "minAppVersion", required = true)
    void setMinAppVersion(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "startAtFlowId", required = true)
    void setStartAtFlowId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "states", nestedClassType = InterfaceC2230131CQh.class, required = true)
    void setStates(List<? extends InterfaceC2230131CQh> list);
}
