package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.18RJ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C040E
public interface C18RJ extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bcmChain", required = false)
    String getBcmChain();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "entranceInfo", required = true)
    String getEntranceInfo();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "bcmChain", required = false)
    void setBcmChain(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "entranceInfo", required = true)
    void setEntranceInfo(String str);
}
