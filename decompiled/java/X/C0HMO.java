package X;

import Y.ACListenerS141S0100000_6;
import android.content.Context;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import wh6.AbS323S0300000_6;

/* JADX INFO: renamed from: X.0HMO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HMO extends C1619110sEf implements InterfaceC19330810jy {
    public final int[] LL = {1012};
    public InterfaceC539120LCk LLILLJJLI;
    public C0HMN LLILLL;

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIL(int i, InnerPushMessage innerPushMessage) {
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return this.LL;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LIZIZ(InnerPushMessage innerPushMessage) {
        C0HMN c0hmn = this.LLILLL;
        if (c0hmn != null) {
            int visibility = c0hmn.getVisibility();
            c0hmn.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c0hmn);
        }
        C0HYP.LIZ.getClass();
        C0HYP.LJ().storeBoolean("has_shown_failure_push", true);
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        TuxIconView closeIcon;
        Context viewContext;
        C0HMN c0hmn;
        this.LLILLJJLI = c20663515tR;
        C0HMN c0hmn2 = this.LLILLL;
        if (c0hmn2 != null && (viewContext = c0hmn2.getViewContext()) != null && (c0hmn = this.LLILLL) != null) {
            C786410Ut5.I7(new AbS323S0300000_6(viewContext, innerPushMessage, c20663515tR, 3), c0hmn);
        }
        C0HMN c0hmn3 = this.LLILLL;
        if (c0hmn3 != null && (closeIcon = c0hmn3.getCloseIcon()) != null) {
            C786410Ut5.a9(closeIcon, new ACListenerS141S0100000_6(c20663515tR, 160));
        }
        return new C20663815tU(0, this.LLILLL);
    }
}
