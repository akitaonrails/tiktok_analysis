package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.06DD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public interface C06DD extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "streakPetCreateTime", required = false)
    Number getStreakPetCreateTime();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "streakPetStatus", required = false)
    Number getStreakPetStatus();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "streakPetCreateTime", required = false)
    void setStreakPetCreateTime(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "streakPetStatus", required = false)
    void setStreakPetStatus(Number number);
}
