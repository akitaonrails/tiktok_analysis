package X;

import com.ss.android.ugc.aweme.im.activity.status.sdk.core.ActivityStatusContainer;
import com.ss.android.ugc.aweme.im.saas.host.api.im.callback.IIMUnder16Proxy;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597200Nba implements InterfaceC595670NXx {
    public final C1231704rr LIZ = new C1231704rr("[AS][ACCOUNT]", null, 6);
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1580006Go());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C597280Nbi());
    public String LIZLLL = "";
    public InterfaceC21512019Gs LJ;

    @Override // X.InterfaceC595670NXx
    public final String LIZ() {
        String curUserId = ((InterfaceC461710I8r) this.LIZIZ.getValue()).getCurUserId();
        return curUserId == null ? "" : curUserId;
    }

    public final boolean LIZLLL() {
        IIMUnder16Proxy iIMUnder16Proxy = (IIMUnder16Proxy) this.LIZJ.getValue();
        if (iIMUnder16Proxy != null) {
            return iIMUnder16Proxy.LIZJ();
        }
        return false;
    }

    @Override // X.InterfaceC595670NXx
    public final boolean isLogin() {
        return ((InterfaceC461710I8r) this.LIZIZ.getValue()).isLogin() && !LIZLLL();
    }

    @Override // X.InterfaceC595670NXx
    public final void LIZIZ(final ActivityStatusContainer activityStatusContainer) {
        if (isLogin() && !LIZLLL()) {
            final String strLIZ = LIZ();
            this.LIZLLL = strLIZ;
            IIMUnder16Proxy iIMUnder16Proxy = (IIMUnder16Proxy) this.LIZJ.getValue();
            if (iIMUnder16Proxy != null) {
                InterfaceC21512019Gs interfaceC21512019Gs = new InterfaceC21512019Gs() { // from class: X.0NbX
                    @Override // X.InterfaceC21512019Gs
                    public final void LIZ() {
                        if (!this.LIZ.LIZLLL()) {
                            activityStatusContainer.LIZJ(C0NZ0.LOGIN, strLIZ);
                        } else {
                            this.LIZ.LIZ.LIZIZ();
                            activityStatusContainer.LIZJ(C0NZ0.LOGOUT, strLIZ);
                        }
                    }
                };
                this.LJ = interfaceC21512019Gs;
                iIMUnder16Proxy.LIZIZ(strLIZ, interfaceC21512019Gs);
            }
        }
        ((InterfaceC461710I8r) this.LIZIZ.getValue()).LIZLLL(new InterfaceC908170Zjz() { // from class: X.0NbZ
            @Override // X.InterfaceC908170Zjz
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                String uid;
                final String uid2;
                IIMUnder16Proxy iIMUnder16Proxy2;
                IIMUnder16Proxy iIMUnder16Proxy3;
                C1231704rr c1231704rr = this.LL.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("account change(");
                sbLIZ.append(i);
                sbLIZ.append(", ");
                if (user != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                sbLIZ.append(uid);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                c1231704rr.LIZIZ();
                if (user == null || (uid2 = user.getUid()) == null) {
                    uid2 = "";
                }
                if (!z) {
                    return;
                }
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        C597200Nba c597200Nba = this.LL;
                        InterfaceC21512019Gs interfaceC21512019Gs2 = c597200Nba.LJ;
                        if (interfaceC21512019Gs2 != null && (iIMUnder16Proxy3 = (IIMUnder16Proxy) c597200Nba.LIZJ.getValue()) != null) {
                            iIMUnder16Proxy3.LIZ(c597200Nba.LIZLLL, interfaceC21512019Gs2);
                        }
                        C1231704rr c1231704rr2 = this.LL.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("account ");
                        sbLIZ2.append(this.LL.LIZLLL);
                        sbLIZ2.append(" logout");
                        C2188811AlT.LIZIZ(sbLIZ2);
                        c1231704rr2.LIZIZ();
                        activityStatusContainer.LIZJ(C0NZ0.LOGOUT, this.LL.LIZLLL);
                        C597200Nba c597200Nba2 = this.LL;
                        c597200Nba2.LIZLLL = "";
                        c597200Nba2.LJ = null;
                        return;
                    }
                    return;
                }
                C597200Nba c597200Nba3 = this.LL;
                InterfaceC21512019Gs interfaceC21512019Gs3 = c597200Nba3.LJ;
                if (interfaceC21512019Gs3 != null && (iIMUnder16Proxy2 = (IIMUnder16Proxy) c597200Nba3.LIZJ.getValue()) != null) {
                    iIMUnder16Proxy2.LIZ(c597200Nba3.LIZLLL, interfaceC21512019Gs3);
                }
                C597200Nba c597200Nba4 = this.LL;
                final String str = c597200Nba4.LIZLLL;
                c597200Nba4.LIZLLL = uid2;
                IIMUnder16Proxy iIMUnder16Proxy4 = (IIMUnder16Proxy) c597200Nba4.LIZJ.getValue();
                if (iIMUnder16Proxy4 == null) {
                    return;
                }
                final C597200Nba c597200Nba5 = this.LL;
                final C0NZ1 c0nz1 = activityStatusContainer;
                InterfaceC21512019Gs interfaceC21512019Gs4 = new InterfaceC21512019Gs() { // from class: X.0NbY
                    @Override // X.InterfaceC21512019Gs
                    public final void LIZ() {
                        if (c597200Nba5.LIZLLL()) {
                            c0nz1.LIZJ(C0NZ0.LOGOUT, uid2);
                            return;
                        }
                        c597200Nba5.LIZ.LIZIZ();
                        if (!Intrinsics.LJFF(str, uid2)) {
                            C1231704rr c1231704rr3 = c597200Nba5.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("account switch, different uid, ");
                            sbLIZ3.append(str);
                            sbLIZ3.append(" logout");
                            C2188811AlT.LIZIZ(sbLIZ3);
                            c1231704rr3.LIZIZ();
                            c0nz1.LIZJ(C0NZ0.LOGOUT, str);
                        }
                        c0nz1.LIZJ(C0NZ0.LOGIN, uid2);
                    }
                };
                c597200Nba5.LJ = interfaceC21512019Gs4;
                iIMUnder16Proxy4.LIZIZ(uid2, interfaceC21512019Gs4);
            }
        });
    }

    @Override // X.InterfaceC595670NXx
    public final boolean LIZJ(String str) {
        return ((InterfaceC461710I8r) this.LIZIZ.getValue()).LIZJ(str);
    }
}
