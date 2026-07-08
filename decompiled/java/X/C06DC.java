package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.06DC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public interface C06DC extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "streakCreateTime", required = false)
    Number getStreakCreateTime();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "streakStatus", required = false)
    Number getStreakStatus();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "streakCreateTime", required = false)
    void setStreakCreateTime(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "streakStatus", required = false)
    void setStreakStatus(Number number);
}
