package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: renamed from: X.10W0, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10W0 {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZIZ(Context context, C19258410Vy c19258410Vy) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c19258410Vy));
        c2252611DEt.LJIJJ();
        try {
            C835510Wq5 c835510Wq5LIZ = new C2460609ka(new C2460409kY(context)).LIZ(new C10W3());
            InterfaceC835710WqP interfaceC835710WqP = new InterfaceC835710WqP() { // from class: X.10W9
                @Override // X.InterfaceC835710WqP
                public final void onSuccess(Object obj) {
                    C10WA c10wa = (C10WA) obj;
                    c10wa.LIZJ();
                    Integer numLJ = c10wa.LJ();
                    if (numLJ != null) {
                        numLJ.intValue();
                    }
                    InterfaceC20236714Gf<C10WA> interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(c10wa);
                    interfaceC20236714Gf.resumeWith(c10wa);
                }
            };
            c835510Wq5LIZ.getClass();
            c835510Wq5LIZ.LJI(C835490Wq3.LIZ, interfaceC835710WqP);
            c835510Wq5LIZ.LIZLLL(new InterfaceC835730WqR() { // from class: X.0uwa
                @Override // X.InterfaceC835730WqR
                public final void onFailure(Exception exc) {
                    InterfaceC20236714Gf<C10WA> interfaceC20236714Gf = c2252611DEt;
                    C098200Yq c098200Yq = new C098200Yq(exc);
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf.resumeWith(c098200Yq);
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C098200Yq c098200Yq = new C098200Yq(e);
            C189200o6.m2constructorimpl(c098200Yq);
            c2252611DEt.resumeWith(c098200Yq);
        }
        c2252611DEt.LJJII(AFwS271S0000000_28.get$arr$(301));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c19258410Vy);
        }
        return objLJIJ;
    }

    public static Object LIZ(int i, int i2, int i3, C19258410Vy c19258410Vy) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c19258410Vy));
        c2252611DEt.LJIJJ();
        try {
            C2462509kt c2462509kt = new C2462509kt();
            c2462509kt.LIZ = C2286608xc.LJ(i);
            c2462509kt.LIZIZ = C2286608xc.LJ(i2);
            c2462509kt.LIZJ = C2286608xc.LJ(i3);
            C10W8 c10w8LIZ = c2462509kt.LIZ();
            new C10W5();
            C835510Wq5 c835510Wq5LJ = C835460Wq0.LJ(c10w8LIZ);
            InterfaceC835710WqP interfaceC835710WqP = new InterfaceC835710WqP() { // from class: X.0uwY
                @Override // X.InterfaceC835710WqP
                public final void onSuccess(Object obj) {
                    InterfaceC20236714Gf<C10WA> interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(obj);
                    interfaceC20236714Gf.resumeWith(obj);
                }
            };
            C0TU0 c0tu0 = C835490Wq3.LIZ;
            c835510Wq5LJ.LJI(c0tu0, interfaceC835710WqP);
            c835510Wq5LJ.LJ(c0tu0, new InterfaceC835730WqR() { // from class: X.0uwZ
                @Override // X.InterfaceC835730WqR
                public final void onFailure(Exception exc) {
                    InterfaceC20236714Gf<C10WA> interfaceC20236714Gf = c2252611DEt;
                    C098200Yq c098200Yq = new C098200Yq(exc);
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf.resumeWith(c098200Yq);
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C098200Yq c098200Yq = new C098200Yq(e);
            C189200o6.m2constructorimpl(c098200Yq);
            c2252611DEt.resumeWith(c098200Yq);
        }
        c2252611DEt.LJJII(AFwS271S0000000_28.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c19258410Vy);
        }
        return objLJIJ;
    }
}
