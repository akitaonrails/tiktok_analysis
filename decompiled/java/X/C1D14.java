package X;

import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.minis.payment.MinisRechargeFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D14, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1D14 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
        }
    }

    public static final void onDismiss$0(C1D14 c1d14, DialogInterface dialogInterface) {
        String str;
        int i;
        int i2;
        Function0 function0 = (Function0) c1d14.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C786410Ut5.LJIIJ(((C2197431AzN) c1d14.l1).LJ);
        String str2 = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        C343970De7 c343970De7 = C343970De7.LIZ;
        if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, c343970De7)) {
            str = "end_by_user";
        } else {
            str = "end_by_flow";
        }
        if (Intrinsics.LJFF(C1391190mJ3.LJIIJJI(dialogInterface), c343970De7) || Intrinsics.LJFF(C1391190mJ3.LJIIJJI(dialogInterface), C343960De6.LIZ)) {
            C2197431AzN c2197431AzN = (C2197431AzN) c1d14.l1;
            C1232850iBf c1232850iBf = c2197431AzN.LJIIJ.LJIJJ;
            if (c1232850iBf != null && (i = c1232850iBf.LIZ) != 0) {
                c2197431AzN.LIZJ.LIZIZ(new C2195941Awy(EnumC2197771Azv.USER_CLOSE_PANEL, new C2195931Awx(i, null, null, EnumC2197781Azw.EXCEPTION, 6), c1232850iBf, 4));
            } else {
                C1232850iBf c1232850iBf2 = C2197731Azr.LJIIL;
                c2197431AzN.LIZJ.LIZIZ(new C2195941Awy(EnumC2197771Azv.USER_CLOSE_PANEL, new C2195931Awx(c1232850iBf2.LIZ, null, null, EnumC2197781Azw.EXCEPTION, 6), c1232850iBf2, 4));
            }
        }
        C2197481AzS c2197481AzS = ((C2197431AzN) c1d14.l1).LJIIJ;
        C2197481AzS.LIZJ(c2197481AzS, "dismiss_normal_pay_sheet", 0, null, c2197481AzS.LIZ("show_normal_pay_sheet"), 0, 0L, 0L, str, null, 0, null, null, false, null, null, null, 65398);
        C2197431AzN c2197431AzN2 = (C2197431AzN) c1d14.l1;
        C2197481AzS c2197481AzS2 = c2197431AzN2.LJIIJ;
        MinisRechargeFragment minisRechargeFragment = c2197431AzN2.LIZLLL;
        if (minisRechargeFragment != null && minisRechargeFragment.iS()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C2197481AzS.LIZIZ(c2197481AzS2, "tm_unlock_N_episodes_panel_exit", ((C2197431AzN) c1d14.l1).LJIIJ.LIZ("show_normal_pay_sheet"), i2, str, null, null, 48);
    }

    public static final void onDismiss$1(C1D14 c1d14, DialogInterface dialogInterface) {
        String str;
        int i;
        String str2 = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        C343970De7 c343970De7 = C343970De7.LIZ;
        if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, c343970De7)) {
            str = "end_by_user";
        } else {
            str = "end_by_flow";
        }
        if (Intrinsics.LJFF(C1391190mJ3.LJIIJJI(dialogInterface), c343970De7) || Intrinsics.LJFF(C1391190mJ3.LJIIJJI(dialogInterface), C343960De6.LIZ)) {
            C2197471AzR c2197471AzR = (C2197471AzR) c1d14.l0;
            C1232850iBf c1232850iBf = c2197471AzR.LJIIJ.LJIJJ;
            if (c1232850iBf != null && (i = c1232850iBf.LIZ) != 0) {
                c2197471AzR.LIZJ.LIZIZ(new C2195941Awy(EnumC2197771Azv.USER_CLOSE_PANEL, new C2195931Awx(i, null, null, EnumC2197781Azw.EXCEPTION, 6), c1232850iBf, 4));
            } else {
                C1232850iBf c1232850iBf2 = C2197731Azr.LJIIL;
                c2197471AzR.LIZJ.LIZIZ(new C2195941Awy(EnumC2197771Azv.USER_CLOSE_PANEL, new C2195931Awx(c1232850iBf2.LIZ, null, null, EnumC2197781Azw.EXCEPTION, 6), c1232850iBf2, 4));
            }
        }
        ((C2197471AzR) c1d14.l0).LJI(str);
        Function0 function0 = (Function0) c1d14.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onDismiss$2(C1D14 c1d14, DialogInterface dialogInterface) {
        String str;
        int i;
        String str2 = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        C343970De7 c343970De7 = C343970De7.LIZ;
        if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, c343970De7)) {
            str = "end_by_user";
        } else {
            str = "end_by_flow";
        }
        ((C2197541AzY) c1d14.l0).LJ.LJIILLIIL = str;
        if (Intrinsics.LJFF(C1391190mJ3.LJIIJJI(dialogInterface), c343970De7) || Intrinsics.LJFF(C1391190mJ3.LJIIJJI(dialogInterface), C343960De6.LIZ)) {
            C2197541AzY c2197541AzY = (C2197541AzY) c1d14.l0;
            C1232850iBf c1232850iBf = c2197541AzY.LJ.LJIIZILJ;
            if (c1232850iBf != null && (i = c1232850iBf.LIZ) != 0) {
                c2197541AzY.LIZLLL.LIZIZ(new C2195941Awy(EnumC2197771Azv.USER_CLOSE_PANEL, new C2195931Awx(i, null, null, EnumC2197781Azw.EXCEPTION, 6), c1232850iBf, 4));
            } else {
                C1232850iBf c1232850iBf2 = C2197731Azr.LJIIL;
                c2197541AzY.LIZLLL.LIZIZ(new C2195941Awy(EnumC2197771Azv.USER_CLOSE_PANEL, new C2195931Awx(c1232850iBf2.LIZ, null, null, EnumC2197781Azw.EXCEPTION, 6), c1232850iBf2, 4));
            }
        }
        C2197541AzY c2197541AzY2 = (C2197541AzY) c1d14.l0;
        c2197541AzY2.getClass();
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logRechargeSheetDismiss, reason:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C2197491AzT c2197491AzT = c2197541AzY2.LJ;
        long jLIZ = c2197491AzT.LIZ("show_recharge_sheet");
        C2197491AzT c2197491AzT2 = c2197541AzY2.LJ;
        C2197491AzT.LIZIZ(c2197491AzT, "dismiss_recharge_sheet", 0, null, jLIZ, c2197491AzT2.LJIILJJIL, c2197491AzT2.LJIILL, str, null, null, null, false, null, null, null, 16260);
        Function0 function0 = (Function0) c1d14.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1D14(Object obj, C2197471AzR c2197471AzR, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = obj;
        this.l1 = c2197471AzR;
    }
}
