package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;

/* JADX INFO: renamed from: X.10Cu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("inbox_guide_user_out_push")
public final class C19208610Cu extends C10GR {
    public final C19EG LL;
    public final ViewOnClickListenerC19207210Cg LLILLJJLI;
    public final C10DT LLILLL;
    public final C10DU LLILZ;
    public final int LLILZIL = 500;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        ViewOnClickListenerC19207210Cg viewOnClickListenerC19207210Cg = this.LLILLJJLI;
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIII = viewOnClickListenerC19207210Cg;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC19333110kL(this, c20656615sK, 0);
        tuxSheet.LL = new DialogInterfaceOnCancelListenerC19332810kI(this, 1);
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIIJIL = true;
        C1391850mK7.LIZIZ(tuxSheet2, "338");
        tuxSheet2.show(this.LL.getSupportFragmentManager(), "");
        this.LLILLJJLI.onShow();
        C10DU c10du = this.LLILZ;
        if (c10du != null) {
            c10du.LIZIZ();
        }
    }

    @Override // X.AbstractC20656215sG
    public final void showPopupFailed(int i, String str) {
        super.showPopupFailed(i, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showPopupFailed! errCode = ");
        sbLIZ.append(i);
        sbLIZ.append(", errMsg = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push]");
    }

    public C19208610Cu(C19EG c19eg, ViewOnClickListenerC19207210Cg viewOnClickListenerC19207210Cg, C10DQ c10dq, C10D8 c10d8) {
        this.LL = c19eg;
        this.LLILLJJLI = viewOnClickListenerC19207210Cg;
        this.LLILLL = c10dq;
        this.LLILZ = c10d8;
    }
}
