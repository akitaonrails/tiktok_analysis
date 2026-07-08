package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.09Vi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C040D
public interface InterfaceC2382809Vi extends XBaseParamModel {
    @InterfaceC1909207dq(option = {0, 1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "type", required = false)
    Number getType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = true)
    String getUrl();
}
