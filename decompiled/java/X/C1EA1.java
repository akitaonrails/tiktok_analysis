package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.1EA1, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
@C040E
public interface C1EA1 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "autoMatchEntrance", required = true)
    Number getAutoMatchEntrance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "countdown", required = true)
    Number getCountdown();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isAutoMatch", required = true)
    Number isAutoMatch();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isAutoMatchRequesting", required = true)
    Number isAutoMatchRequesting();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isAutoMatchWaitingToConnect", required = true)
    Number isAutoMatchWaitingToConnect();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isAutoMatch", required = true)
    void setAutoMatch(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "autoMatchEntrance", required = true)
    void setAutoMatchEntrance(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isAutoMatchRequesting", required = true)
    void setAutoMatchRequesting(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isAutoMatchWaitingToConnect", required = true)
    void setAutoMatchWaitingToConnect(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "countdown", required = true)
    void setCountdown(Number number);
}
