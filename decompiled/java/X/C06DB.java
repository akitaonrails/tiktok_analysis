package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.06DB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C040E
public interface C06DB extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "streakInfo", nestedClassType = C06DC.class, required = true)
    C06DC getStreakInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "streakPetInfo", nestedClassType = C06DD.class, required = true)
    C06DD getStreakPetInfo();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "streakInfo", nestedClassType = C06DC.class, required = true)
    void setStreakInfo(C06DC c06dc);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "streakPetInfo", nestedClassType = C06DD.class, required = true)
    void setStreakPetInfo(C06DD c06dd);
}
