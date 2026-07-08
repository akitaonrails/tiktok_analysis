package X;

import com.bytedance.android.live.profile.service.ILiveProfileService;

/* JADX INFO: renamed from: X.14dv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20312514dv implements InterfaceC20313714e7 {
    public static final C20312514dv LIZ = new C20312514dv();

    @Override // X.InterfaceC20313714e7
    public final void LIZ(EnumC495860JcW enumC495860JcW, C20313914e9 c20313914e9) {
        ILiveProfileService iLiveProfileService = (ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class);
        if (iLiveProfileService == null) {
            return;
        }
        iLiveProfileService.nN0(enumC495860JcW, c20313914e9);
    }
}
