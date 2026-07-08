package X;

import android.view.KeyEvent;

/* JADX INFO: renamed from: X.0Q1R, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q1R implements InterfaceC1399350mWD {
    public static final C0Q1R LL = new C0Q1R();

    @Override // X.InterfaceC1399350mWD
    public final /* synthetic */ boolean Fi() {
        return false;
    }

    @Override // X.InterfaceC1399350mWD
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        EnumC655500PnQ enumC655500PnQ;
        C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
        if (c2174741A9g.LJIILJJIL()) {
            if (i != 24) {
                if (i == 25) {
                    enumC655500PnQ = EnumC655500PnQ.TURN_DOWN_VOLUME;
                } else {
                    return false;
                }
            } else {
                enumC655500PnQ = EnumC655500PnQ.TURN_UP_VOLUME;
            }
            c2174741A9g.LJIILL("general_search", enumC655500PnQ, C0SVP.STYLE_NO_BUTTON);
            return false;
        }
        return false;
    }
}
