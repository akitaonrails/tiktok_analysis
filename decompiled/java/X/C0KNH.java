package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KNH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KNH implements InterfaceC516080KLu {
    public final C0KNQ LIZ;

    public final boolean LJFF() {
        this.LIZ.getClass();
        return true;
    }

    public final String LJI() {
        Object c098200Yq;
        C0KNQ c0knq = this.LIZ;
        c0knq.getClass();
        try {
            c098200Yq = c0knq.LIZ.getBillingCountryCode();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = "";
        }
        return (String) c098200Yq;
    }

    public final String LJII() {
        this.LIZ.getClass();
        return "";
    }

    public C0KNH(InterfaceC1791930wjP interfaceC1791930wjP) {
        this.LIZ = new C0KNQ(interfaceC1791930wjP);
    }

    @Override // X.InterfaceC516080KLu
    public final void LJ(C0KL0 c0kl0) {
        this.LIZ.LJ(c0kl0);
    }

    @Override // X.InterfaceC516080KLu
    public final void LIZ(C1617170sBX c1617170sBX, InterfaceC1791300wiO interfaceC1791300wiO) {
        this.LIZ.LIZ(c1617170sBX, interfaceC1791300wiO);
    }

    @Override // X.InterfaceC516080KLu
    public final void LIZJ(InterfaceC518100KTo interfaceC518100KTo, C1789940wgC c1789940wgC) {
        this.LIZ.LIZJ(interfaceC518100KTo, c1789940wgC);
    }

    @Override // X.InterfaceC516080KLu
    public final void LIZLLL(EnumC1782240wTm enumC1782240wTm, Context context) {
        this.LIZ.LIZLLL(enumC1782240wTm, context);
    }

    @Override // X.InterfaceC516080KLu
    public final void triggerInAppMessages(Activity activity, String str) {
        this.LIZ.triggerInAppMessages(activity, str);
    }

    @Override // X.InterfaceC516080KLu
    public final void LIZIZ(Activity activity, C1789970wgF c1789970wgF, InterfaceC518120KTq interfaceC518120KTq) {
        this.LIZ.LIZIZ(activity, c1789970wgF, interfaceC518120KTq);
    }
}
