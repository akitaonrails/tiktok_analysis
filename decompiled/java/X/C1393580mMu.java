package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.multi.maker.ShopWindowAnchorMaker;

/* JADX INFO: renamed from: X.0mMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393580mMu extends C1393570mMt {
    public static DialogC1393760mNC LJ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1393530mMp());
    public DialogC1393760mNC LIZLLL;

    @Override // X.C1393570mMt
    public final void LJIIJ() {
        DialogC1393760mNC dialogC1393760mNC = this.LIZLLL;
        if (dialogC1393760mNC != null) {
            dialogC1393760mNC.dismiss();
            C785410UrT.LIZ(dialogC1393760mNC);
        }
    }

    @Override // X.C1393570mMt
    public final void LIZJ(C712520RxC c712520RxC) {
        for (InterfaceC1393560mMs interfaceC1393560mMs : c712520RxC.LJIILL()) {
            interfaceC1393560mMs.LLLIZZ(interfaceC1393560mMs.LJII().LJJLIIIJJIZ());
        }
        LJ = null;
    }

    @Override // X.C1393570mMt
    public final boolean LJI(C712520RxC c712520RxC) {
        if (c712520RxC.LJIIJ() > 1) {
            return true;
        }
        return false;
    }

    @Override // X.C1393570mMt
    public final void LIZLLL(InterfaceC705550Rlx interfaceC705550Rlx, C712520RxC c712520RxC) {
        super.LIZLLL(interfaceC705550Rlx, c712520RxC);
        try {
            if (c712520RxC.LJIIJ() < 2) {
                for (InterfaceC1393560mMs interfaceC1393560mMs : c712520RxC.LJIILL()) {
                    if (interfaceC1393560mMs instanceof ShopWindowAnchorMaker) {
                        ShopWindowAnchorMaker shopWindowAnchorMaker = (ShopWindowAnchorMaker) interfaceC1393560mMs;
                        InterfaceC1392640mLO interfaceC1392640mLO = ((ShopWindowAnchorMaker) interfaceC1393560mMs).LL;
                        if (interfaceC1392640mLO == null) {
                            interfaceC1392640mLO = null;
                        }
                        shopWindowAnchorMaker.It(interfaceC705550Rlx.LJIIL(), interfaceC1392640mLO.LJJLIIIJJIZ(), true);
                    }
                }
                return;
            }
            for (InterfaceC1393560mMs interfaceC1393560mMs2 : c712520RxC.LJIILL()) {
                interfaceC1393560mMs2.It(interfaceC705550Rlx.LJIIL(), interfaceC1393560mMs2.LJII().LJJLIIIJJIZ(), false);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0170  */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.jvm.internal.AwS318S0300000_21] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // X.C1393570mMt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(final X.InterfaceC705550Rlx r23, final X.C712520RxC r24) {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1393580mMu.LJ(X.0Rlx, X.0RxC):void");
    }

    @Override // X.C1393570mMt
    public final void LIZ(C712520RxC c712520RxC, View view, C2344009Gk c2344009Gk) {
        String str;
        if (c712520RxC.LJIIJ() < 2) {
            str = "c20736.d0";
        } else {
            str = "c9855.d40179";
        }
        c2344009Gk.LJ(C1104190eq9.LIZ(view, str), "btm_param_map_key");
        c2344009Gk.LJII(C1104190eq9.LIZ(view, str));
    }
}
