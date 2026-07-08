package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.152s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC204564152s extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "flows", nestedClassType = InterfaceC204567152v.class, required = true)
    List<InterfaceC204567152v> getFlows();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minAppVersion", required = true)
    Number getMinAppVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "startAtFlowId", required = true)
    Number getStartAtFlowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "states", nestedClassType = InterfaceC204565152t.class, required = true)
    List<InterfaceC204565152t> getStates();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "flows", nestedClassType = InterfaceC204567152v.class, required = true)
    void setFlows(List<? extends InterfaceC204567152v> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "minAppVersion", required = true)
    void setMinAppVersion(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "startAtFlowId", required = true)
    void setStartAtFlowId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "states", nestedClassType = InterfaceC204565152t.class, required = true)
    void setStates(List<? extends InterfaceC204565152t> list);
}
