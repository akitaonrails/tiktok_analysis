package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.152j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C040D
public interface InterfaceC204555152j extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "comment", required = false)
    String getComment();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minAppVersion", required = true)
    Number getMinAppVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "parameter", required = false)
    String getParameter();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "stateName", required = true)
    String getStateName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "version", required = true)
    Number getVersion();
}
