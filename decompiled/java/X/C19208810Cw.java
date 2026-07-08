package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;

/* JADX INFO: renamed from: X.10Cw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("inbox_guide_user_out_push")
public final class C19208810Cw extends AbstractC20659615so<TuxSheet> {
    public final C19EG LL;
    public final ViewOnClickListenerC19207210Cg LLILLJJLI;
    public final C10DT LLILLL;
    public final C10DU LLILZ;
    public final int LLILZIL = 500;

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final void LIZIZ() {
        this.LLILLJJLI.onShow();
        C10DU c10du = this.LLILZ;
        if (c10du != null) {
            c10du.LIZIZ();
        }
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        ViewOnClickListenerC19207210Cg viewOnClickListenerC19207210Cg = this.LLILLJJLI;
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIII = viewOnClickListenerC19207210Cg;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC19333210kM(this, 0);
        tuxSheet.LL = new DialogInterfaceOnCancelListenerC19332810kI(this, 2);
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIIJIL = true;
        return tuxSheet2;
    }

    public C19208810Cw(C19EG c19eg, ViewOnClickListenerC19207210Cg viewOnClickListenerC19207210Cg, C10DP c10dp, C10D7 c10d7) {
        this.LL = c19eg;
        this.LLILLJJLI = viewOnClickListenerC19207210Cg;
        this.LLILLL = c10dp;
        this.LLILZ = c10d7;
    }
}
