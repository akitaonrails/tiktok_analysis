package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0pVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040D
public interface InterfaceC1514310pVd extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = false)
    String getSchema();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "step", required = true)
    String getStep();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "time", required = true)
    Number getTime();
}
