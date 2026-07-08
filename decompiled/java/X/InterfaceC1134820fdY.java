package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0fdY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040E
public interface InterfaceC1134820fdY extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "dailyWatchLiveDuration", required = true)
    Number getDailyWatchLiveDuration();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "liveState", required = true)
    Number getLiveState();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "timeDiff", required = true)
    Number getTimeDiff();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "dailyWatchLiveDuration", required = true)
    void setDailyWatchLiveDuration(Number number);

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "liveState", required = true)
    void setLiveState(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "timeDiff", required = true)
    void setTimeDiff(Number number);
}
