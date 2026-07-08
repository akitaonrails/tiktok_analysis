package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.1CTf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2230891CTf extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "flows", nestedClassType = InterfaceC2230961CTm.class, required = true)
    List<InterfaceC2230961CTm> getFlows();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minAppVersion", required = true)
    Number getMinAppVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "startAtFlowId", required = true)
    Number getStartAtFlowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "states", nestedClassType = InterfaceC2230941CTk.class, required = true)
    List<InterfaceC2230941CTk> getStates();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "flows", nestedClassType = InterfaceC2230961CTm.class, required = true)
    void setFlows(List<? extends InterfaceC2230961CTm> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "minAppVersion", required = true)
    void setMinAppVersion(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "startAtFlowId", required = true)
    void setStartAtFlowId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "states", nestedClassType = InterfaceC2230941CTk.class, required = true)
    void setStates(List<? extends InterfaceC2230941CTk> list);
}
