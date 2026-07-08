package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1BmB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C040D
public interface InterfaceC2214731BmB extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "mob", required = false)
    String getMob();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "operation", required = true)
    String getOperation();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = true)
    String getParams();
}
