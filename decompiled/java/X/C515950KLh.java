package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: renamed from: X.0KLh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515950KLh implements InterfaceC516080KLu {
    public static volatile InterfaceC1791930wjP LIZIZ;
    public static final C515950KLh LIZ = new C515950KLh();
    public static volatile String LIZJ = "";

    public static C0KNH LJI() {
        Object c098200Yq;
        InterfaceC1791930wjP interfaceC1791930wjP = LIZIZ;
        if (interfaceC1791930wjP == null) {
            try {
                c098200Yq = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLFZ();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            interfaceC1791930wjP = (InterfaceC1791930wjP) c098200Yq;
            if (interfaceC1791930wjP == null) {
                return null;
            }
            LIZIZ = interfaceC1791930wjP;
        }
        return new C0KNH(interfaceC1791930wjP);
    }

    public static final String LJFF() {
        C0KNH c0knhLJI = LJI();
        String strLJI = c0knhLJI != null ? c0knhLJI.LJI() : null;
        if (strLJI == null) {
            strLJI = "";
        }
        if (strLJI.length() > 0) {
            LIZJ = strLJI;
            return strLJI;
        }
        String str = LIZJ;
        return str.length() != 0 ? str : "";
    }

    @Override // X.InterfaceC516080KLu
    public final void LJ(C0KL0 c0kl0) {
        InterfaceC516080KLu interfaceC516080KLuLJI = LJI();
        if (interfaceC516080KLuLJI == null) {
            interfaceC516080KLuLJI = C518070KTl.LIZ;
        }
        interfaceC516080KLuLJI.LJ(c0kl0);
    }

    @Override // X.InterfaceC516080KLu
    public final void LIZ(C1617170sBX c1617170sBX, InterfaceC1791300wiO interfaceC1791300wiO) {
        InterfaceC516080KLu interfaceC516080KLuLJI = LJI();
        if (interfaceC516080KLuLJI == null) {
            interfaceC516080KLuLJI = C518070KTl.LIZ;
        }
        interfaceC516080KLuLJI.LIZ(c1617170sBX, interfaceC1791300wiO);
    }

    @Override // X.InterfaceC516080KLu
    public final void LIZJ(InterfaceC518100KTo interfaceC518100KTo, C1789940wgC c1789940wgC) {
        InterfaceC516080KLu interfaceC516080KLuLJI = LJI();
        if (interfaceC516080KLuLJI == null) {
            interfaceC516080KLuLJI = C518070KTl.LIZ;
        }
        interfaceC516080KLuLJI.LIZJ(interfaceC518100KTo, c1789940wgC);
    }

    @Override // X.InterfaceC516080KLu
    public final void LIZLLL(EnumC1782240wTm enumC1782240wTm, Context context) {
        InterfaceC516080KLu interfaceC516080KLuLJI = LJI();
        if (interfaceC516080KLuLJI == null) {
            interfaceC516080KLuLJI = C518070KTl.LIZ;
        }
        interfaceC516080KLuLJI.LIZLLL(enumC1782240wTm, context);
    }

    @Override // X.InterfaceC516080KLu
    public final void triggerInAppMessages(Activity activity, String str) {
        InterfaceC516080KLu interfaceC516080KLuLJI = LJI();
        if (interfaceC516080KLuLJI == null) {
            interfaceC516080KLuLJI = C518070KTl.LIZ;
        }
        interfaceC516080KLuLJI.triggerInAppMessages(activity, str);
    }

    @Override // X.InterfaceC516080KLu
    public final void LIZIZ(Activity activity, C1789970wgF c1789970wgF, InterfaceC518120KTq interfaceC518120KTq) {
        InterfaceC516080KLu interfaceC516080KLuLJI = LJI();
        if (interfaceC516080KLuLJI == null) {
            interfaceC516080KLuLJI = C518070KTl.LIZ;
        }
        interfaceC516080KLuLJI.LIZIZ(activity, c1789970wgF, interfaceC518120KTq);
    }
}
