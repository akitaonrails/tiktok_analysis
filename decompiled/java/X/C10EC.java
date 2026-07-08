package X;

import android.app.AlertDialog;
import android.app.Dialog;

/* JADX INFO: renamed from: X.10EC, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("default_notice_opt_in")
public final class C10EC extends AbstractC20660015ss<Dialog> {
    public final C19EG LL;
    public final boolean LLILLJJLI;
    public final AlertDialog LLILLL;
    public final C1397510mTF LLILZ;
    public final C10EI LLILZIL;
    public final int LLILZLL = 500;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    @Override // com.bytedance.poplayer.IPopupTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showPopup(X.C688120Qyw r11) {
        /*
            r10 = this;
            boolean r0 = r10.LLILLJJLI
            java.lang.String r2 = "477"
            if (r0 == 0) goto L47
            android.app.AlertDialog r3 = r10.LLILLL
            if (r3 == 0) goto L53
            X.10kM r1 = new X.10kM
            r0 = 8
            r1.<init>(r10, r0)
            r3.setOnDismissListener(r1)
            X.C1391850mK7.LIZIZ(r3, r2)
            X.C786410Ut5.A4(r3)
        L1a:
            X.10EI r7 = r10.LLILZIL
            X.10EH r7 = (X.C10EH) r7
            X.10EB r1 = r7.LIZ
            boolean r0 = r1.LLILZIL
            java.lang.String r9 = "enter_from"
            if (r0 == 0) goto L55
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r0 = "notification_setting_page"
            r2.LJIIIIZZ(r9, r0)
            X.10Ec r0 = X.C19212010Ec.LIZJ
            X.05RV r0 = r0.LIZJ()
            java.lang.String r1 = r0.getMobValue()
            java.lang.String r0 = "inbox_mode"
            r2.LJIIIIZZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "notification_setting_alert_show"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return r3
        L47:
            X.0mTF r0 = r10.LLILZ
            if (r0 == 0) goto L53
            X.C1391850mK7.LIZIZ(r0, r2)
            android.app.Dialog r3 = r0.LJ()
            goto L1a
        L53:
            r3 = 0
            goto L1a
        L55:
            X.10EF r0 = r1.LLILZLL
            java.lang.String r5 = "general"
            java.lang.String r4 = "enter_reason"
            java.lang.String r8 = "enter_method"
            java.lang.String r2 = "push_pre_permission_show"
            if (r0 == 0) goto L97
            X.09Gk r6 = new X.09Gk
            r6.<init>()
            X.10EB r0 = r7.LIZ
            X.10EF r0 = r0.LLILZLL
            java.lang.String r0 = r0.LIZJ
            r6.LJIIIIZZ(r9, r0)
            X.10EB r0 = r7.LIZ
            X.10EF r0 = r0.LLILZLL
            java.lang.String r0 = r0.LIZLLL
            r6.LJIIIIZZ(r8, r0)
            X.10EB r0 = r7.LIZ
            X.10EF r0 = r0.LLILZLL
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = "room_id"
            r6.LJIIIIZZ(r0, r1)
            X.10EB r0 = r7.LIZ
            X.10EF r0 = r0.LLILZLL
            java.lang.String r1 = r0.LIZIZ
            java.lang.String r0 = "anchor_id"
            r6.LJIIIIZZ(r0, r1)
            r6.LJIIIIZZ(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.LIZ
            X.C20684815ws.LJIILLIIL(r2, r0)
            return r3
        L97:
            boolean r0 = r1.LLIZ
            if (r0 == 0) goto Lb5
            X.09Gk r1 = new X.09Gk
            r1.<init>()
            X.10EB r0 = r7.LIZ
            java.lang.String r0 = r0.LLILZ
            r1.LJIIIIZZ(r9, r0)
            java.lang.String r0 = "notification_bell"
            r1.LJIIIIZZ(r8, r0)
            r1.LJIIIIZZ(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.LIZ
            X.C20684815ws.LJIILLIIL(r2, r0)
            return r3
        Lb5:
            X.09Gk r0 = new X.09Gk
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.LIZ
            X.C20684815ws.LJIILLIIL(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10EC.showPopup(X.0Qyw):java.lang.Object");
    }

    public C10EC(C19EG c19eg, boolean z, AlertDialog alertDialog, C1397510mTF c1397510mTF, C10EH c10eh) {
        this.LL = c19eg;
        this.LLILLJJLI = z;
        this.LLILLL = alertDialog;
        this.LLILZ = c1397510mTF;
        this.LLILZIL = c10eh;
    }
}
