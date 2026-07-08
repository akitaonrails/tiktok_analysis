package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0QmE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface InterfaceC680240QmE extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "keyword", required = false)
    String getKeyword();

    @InterfaceC1909207dq(option = {0, 1, 2, 3})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "op", required = true)
    Number getOp();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "source", required = false)
    String getSource();
}
