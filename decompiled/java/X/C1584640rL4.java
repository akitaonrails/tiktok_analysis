package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.main.TabChangeManager;

/* JADX INFO: renamed from: X.0rL4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584640rL4 extends AbstractViewOnClickListenerC1584070rK9 {
    public final Context LL;

    public C1584640rL4(Context context) {
        this.LL = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TabChangeManager tabChangeManagerLIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL);
        if (c19egLIZIZ != null) {
            tabChangeManagerLIZ = C343710Ddh.LIZ(c19egLIZIZ);
            if (tabChangeManagerLIZ == null || (strCQ2 = tabChangeManagerLIZ.CQ2()) == null) {
            }
            C1400330mXn c1400330mXn = C1400330mXn.LIZ;
            C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(this.LL);
            c1400330mXn.getClass();
            String strLJIIJ = C1400330mXn.LJIIJ(c19egLIZIZ2, strCQ2, null);
            C0XPD.LIZIZ(C1388190mED.LIZIZ(this.LL), strLJIIJ, "click_friends_tab", null, new C1620940sHc(tabChangeManagerLIZ, 4));
            C2018307vR.LIZ.getClass();
            C2018307vR.LIZ(strLJIIJ, "click_friends_tab");
            C1595430rcT c1595430rcT = C1595430rcT.LIZIZ;
            c1595430rcT.LIZIZ().redDotLogic().LJIIL(strCQ2, null);
            C1587220rPE.LIZ.getClass();
            C1587220rPE.LJ();
            c1595430rcT.LIZIZ().redDotLogic().LIZJ();
        }
        tabChangeManagerLIZ = null;
        String strCQ2 = "";
        C1400330mXn c1400330mXn2 = C1400330mXn.LIZ;
        C19EG c19egLIZIZ22 = C1388190mED.LIZIZ(this.LL);
        c1400330mXn2.getClass();
        String strLJIIJ2 = C1400330mXn.LJIIJ(c19egLIZIZ22, strCQ2, null);
        C0XPD.LIZIZ(C1388190mED.LIZIZ(this.LL), strLJIIJ2, "click_friends_tab", null, new C1620940sHc(tabChangeManagerLIZ, 4));
        C2018307vR.LIZ.getClass();
        C2018307vR.LIZ(strLJIIJ2, "click_friends_tab");
        C1595430rcT c1595430rcT2 = C1595430rcT.LIZIZ;
        c1595430rcT2.LIZIZ().redDotLogic().LJIIL(strCQ2, null);
        C1587220rPE.LIZ.getClass();
        C1587220rPE.LJ();
        c1595430rcT2.LIZIZ().redDotLogic().LIZJ();
    }
}
