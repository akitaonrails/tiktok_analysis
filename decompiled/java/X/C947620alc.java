package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;

/* JADX INFO: renamed from: X.0alc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947620alc {
    public static EnumC947600ala LIZ() {
        int iZt = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).zt();
        return iZt != 0 ? iZt != 1 ? iZt != 2 ? EnumC947600ala.AUDIENCE : EnumC947600ala.HOST : EnumC947600ala.GUEST : EnumC947600ala.AUDIENCE;
    }
}
