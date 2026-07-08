package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0x7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1807120x7u extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "coinBalance", required = true)
    Number getCoinBalance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "liveBalance", required = true)
    Number getLiveBalance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ugBalance", required = true)
    Number getUgBalance();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "coinBalance", required = true)
    void setCoinBalance(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "liveBalance", required = true)
    void setLiveBalance(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "ugBalance", required = true)
    void setUgBalance(Number number);
}
