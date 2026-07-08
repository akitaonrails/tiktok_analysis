package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMultiGuestSwitchLayoutOptSetting;

/* JADX INFO: renamed from: X.0aJW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930200aJW implements InterfaceC930220aJY {
    public static final C930200aJW LIZ = new C930200aJW();
    public static Integer LIZIZ;
    public static Integer LIZJ;

    @Override // X.InterfaceC930220aJY
    public final void LIZLLL(int i) {
    }

    @Override // X.InterfaceC930220aJY
    public final Integer LJFF() {
        return null;
    }

    @Override // X.InterfaceC930220aJY
    public final void LJI() {
    }

    @Override // X.InterfaceC930220aJY
    public final void LJIIIIZZ() {
        LIZIZ = null;
        LIZJ = null;
    }

    @Override // X.InterfaceC930220aJY
    public final void LJIIIZ(int i) {
    }

    @Override // X.InterfaceC930220aJY
    public final int LIZJ() {
        Integer num;
        return (!LinkMicMultiGuestSwitchLayoutOptSetting.enable() || (num = LIZJ) == null) ? C940770aaZ.LIZ().getDataSource().LIZJ() : num.intValue();
    }

    @Override // X.InterfaceC930220aJY
    public final int getPanelLayoutType() {
        Integer num;
        return (!LinkMicMultiGuestSwitchLayoutOptSetting.enable() || (num = LIZIZ) == null) ? C940770aaZ.LIZ().getDataSource().getPanelLayoutType() : num.intValue();
    }

    @Override // X.InterfaceC930220aJY
    public final int LJII(int i) {
        C942210act.LIZ.getClass();
        return C942210act.LJFF(i);
    }

    @Override // X.InterfaceC930220aJY
    public final void LJ(int i, int i2) {
        if (!LinkMicMultiGuestSwitchLayoutOptSetting.enable()) {
            return;
        }
        LIZIZ = Integer.valueOf(i);
        LIZJ = Integer.valueOf(i2);
    }
}
