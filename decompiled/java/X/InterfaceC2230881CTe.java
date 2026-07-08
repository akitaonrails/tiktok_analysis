package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.1CTe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2230881CTe extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "flows", nestedClassType = InterfaceC2230951CTl.class, required = true)
    List<InterfaceC2230951CTl> getFlows();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minAppVersion", required = true)
    Number getMinAppVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "startAtFlowId", required = true)
    Number getStartAtFlowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "states", nestedClassType = InterfaceC2230921CTi.class, required = true)
    List<InterfaceC2230921CTi> getStates();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "flows", nestedClassType = InterfaceC2230951CTl.class, required = true)
    void setFlows(List<? extends InterfaceC2230951CTl> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "minAppVersion", required = true)
    void setMinAppVersion(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "startAtFlowId", required = true)
    void setStartAtFlowId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "states", nestedClassType = InterfaceC2230921CTi.class, required = true)
    void setStates(List<? extends InterfaceC2230921CTi> list);
}
