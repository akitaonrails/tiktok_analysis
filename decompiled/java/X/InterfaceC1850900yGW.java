package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0yGW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1850900yGW extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "channelId", required = true)
    Number getChannelId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "connectionType", required = true)
    String getConnectionType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pkId", required = true)
    Number getPkId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isMatchOpponent", required = true)
    Boolean isMatchOpponent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isTransfer", required = true)
    Boolean isTransfer();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "channelId", required = true)
    void setChannelId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "connectionType", required = true)
    void setConnectionType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isMatchOpponent", required = true)
    void setMatchOpponent(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "pkId", required = true)
    void setPkId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isTransfer", required = true)
    void setTransfer(Boolean bool);
}
