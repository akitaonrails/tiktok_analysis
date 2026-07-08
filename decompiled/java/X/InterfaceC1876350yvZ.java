package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0yvZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1876350yvZ extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = false)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "needNotifyUpdate", required = false)
    Boolean getNeedNotifyUpdate();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", nestedClassType = InterfaceC1876410yvf.class, required = true)
    List<InterfaceC1876410yvf> getParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "syncLocalSuccessOnly", required = false)
    Boolean getSyncLocalSuccessOnly();
}
