package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0ipI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257420ipI implements InterfaceC1257430ipJ {
    public static final C1257420ipI LIZIZ = new C1257420ipI();
    public final /* synthetic */ InterfaceC1257430ipJ LIZ = C1260090itb.LIZIZ.bridgeService();

    @Override // X.InterfaceC1257430ipJ
    public final InterfaceC1257400ipG createAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return this.LIZ.createAwemeListFragment(i, i2, str, str2, true, true, false, z4);
    }

    @Override // X.InterfaceC1257430ipJ
    public final InterfaceC1054820dYW getBulletABHelper() {
        return this.LIZ.getBulletABHelper();
    }

    @Override // X.InterfaceC1257430ipJ
    public final boolean needShowSafeInfoNotice() {
        return this.LIZ.needShowSafeInfoNotice();
    }

    @Override // X.InterfaceC1257430ipJ
    public final void onFeedStop() {
        this.LIZ.onFeedStop();
    }

    @Override // X.InterfaceC1257430ipJ
    public final void postSafeInfoNoticeEvent(boolean z) {
        this.LIZ.postSafeInfoNoticeEvent(z);
    }

    @Override // X.InterfaceC1257430ipJ
    public final void startThirdSocialActivity(Context context, C10HO c10ho, int i, boolean z) {
        this.LIZ.startThirdSocialActivity(context, c10ho, i, z);
    }
}
