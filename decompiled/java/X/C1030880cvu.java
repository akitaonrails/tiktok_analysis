package X;

import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0cvu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1030880cvu implements InterfaceC1589290rSZ {
    public InterfaceC1030900cvw LIZ;
    public Fragment LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1030910cvx());

    @Override // X.InterfaceC1589290rSZ
    public final void LIZIZ() {
        C1030680cva.LJIJI = false;
        C584470Mw9.LJIIZILJ.put("has_splash", CardStruct.IStatusCode.DEFAULT);
        LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1030880cvu.LIZ():void");
    }

    public final IRealTimeSplashManager LIZJ() {
        return (IRealTimeSplashManager) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC1589290rSZ
    public final void onPause() {
        LIZJ().release();
        LIZJ().LIZIZ(false);
    }

    @Override // X.InterfaceC1589290rSZ
    public final void onResume() {
        LIZ();
    }

    @Override // X.InterfaceC1022320ci6
    public final void init(AbstractC1017400caA abstractC1017400caA) {
        C1030950cw1 c1030950cw1 = (C1030950cw1) abstractC1017400caA;
        this.LIZ = (InterfaceC1030900cvw) c1030950cw1.LIZ;
        Fragment fragment = c1030950cw1.LIZIZ;
        if (fragment == null) {
            fragment = null;
        }
        this.LIZIZ = fragment;
    }
}
