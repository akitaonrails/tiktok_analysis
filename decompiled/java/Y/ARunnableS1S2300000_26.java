package Y;

import X.C0JD4;
import X.C1238130iKB;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1533950q1J;
import X.C1707980uY0;
import X.C1709110uZp;
import X.C1710880ucg;
import X.C1710930ucl;
import X.C1749280vcc;
import X.C1954807lC;
import X.C197039127h;
import X.C19EG;
import X.C1C7U;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1710890uch;
import X.EnumC488160JCk;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.component.phone.change.setting.PhoneSettingAssem;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment;
import com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.RefundCashierAssem;
import com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.RefundCashierFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS1S2300000_26 implements Runnable {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1749280vcc c1749280vcc;
        int i = C0JD4.LIZ[((EnumC488160JCk) this.l2).ordinal()];
        if (i == 1) {
            View viewLJJIJL = ((UIAssem) this.l3).LJJIJL();
            C786410Ut5.LLLZLZ(viewLJJIJL != null ? (C1749280vcc) viewLJJIJL.findViewById(R.id.z18) : null, 0);
            View viewLJJIJL2 = ((UIAssem) this.l3).LJJIJL();
            if (viewLJJIJL2 == null || (c1749280vcc = (C1749280vcc) viewLJJIJL2.findViewById(R.id.z18)) == null) {
                return;
            }
            c1749280vcc.LJ();
            return;
        }
        if (i == 2) {
            View viewLJJIJL3 = ((UIAssem) this.l3).LJJIJL();
            C786410Ut5.LLLZLZ(viewLJJIJL3 != null ? (C1749280vcc) viewLJJIJL3.findViewById(R.id.z18) : null, 8);
            return;
        }
        if (i != 3) {
            throw new C1954807lC();
        }
        Fragment fragmentLJI = C724240Sb0.LJI((UIAssem) this.l3);
        if (fragmentLJI != null) {
            String str = this.s0;
            UIAssem uIAssem = (UIAssem) this.l3;
            String str2 = this.s1;
            PhoneSettingAssem phoneSettingAssem = (PhoneSettingAssem) this.l4;
            if (u.LJIJI(str, "RISK_REJECTED", false)) {
                C19EG c19egLIZ = C724240Sb0.LIZ(uIAssem);
                if (c19egLIZ != null) {
                    C1397580mTM c1397580mTM = new C1397580mTM(c19egLIZ);
                    c1397580mTM.LJII = false;
                    c1397580mTM.LJI(c19egLIZ.getString(2131840367));
                    c1397580mTM.LIZIZ(c19egLIZ.getString(2131840365));
                    C1238130iKB.LIZ(c1397580mTM, new AwS392S0200000_26(phoneSettingAssem, c19egLIZ, 15));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    phoneSettingAssem.So().zQ2("phone_set_change_risk_block");
                }
            } else {
                C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI);
                c1389890mGx.LJIIJ(str2);
                c1389890mGx.LIZLLL(3000L);
                c1389890mGx.LJIIJJI();
            }
        }
        View viewLJJIJL4 = ((UIAssem) this.l3).LJJIJL();
        C786410Ut5.LLLZLZ(viewLJJIJL4 != null ? (C1749280vcc) viewLJJIJL4.findViewById(R.id.z18) : null, 8);
    }

    public final void LIZ$1() {
        PipoCashierBaseFragment pipoCashierBaseFragment;
        String str;
        PipoCashierBaseFragment pipoCashierBaseFragment2;
        PipoCashierBaseFragment pipoCashierBaseFragment3;
        int i = C1710880ucg.LIZ[((EnumC1710890uch) this.l2).ordinal()];
        if (i == 1) {
            View viewLJJIJL = ((UIAssem) this.l3).LJJIJL();
            (viewLJJIJL != null ? (C197039127h) viewLJJIJL.findViewById(R.id.cal) : null).setLoading(false);
            return;
        }
        if (i == 2) {
            View viewLJJIJL2 = ((UIAssem) this.l3).LJJIJL();
            (viewLJJIJL2 != null ? (C197039127h) viewLJJIJL2.findViewById(R.id.cal) : null).setLoading(true);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new C1954807lC();
            }
            View viewLJJIJL3 = ((UIAssem) this.l3).LJJIJL();
            (viewLJJIJL3 != null ? (C197039127h) viewLJJIJL3.findViewById(R.id.cal) : null).setLoading(false);
            Fragment fragmentLJI = C724240Sb0.LJI((UIAssem) this.l3);
            if ((fragmentLJI instanceof RefundCashierFragment) && (pipoCashierBaseFragment3 = (PipoCashierBaseFragment) fragmentLJI) != null) {
                pipoCashierBaseFragment3.UR(false);
            }
            ((RefundCashierAssem) this.l4).Zo("", true);
            if (C724240Sb0.LJI((UIAssem) this.l3) instanceof RefundCashierFragment) {
                Fragment fragmentLJI2 = C724240Sb0.LJI((UIAssem) this.l3);
                if ((fragmentLJI2 instanceof RefundCashierFragment) && (pipoCashierBaseFragment2 = (PipoCashierBaseFragment) fragmentLJI2) != null) {
                    pipoCashierBaseFragment2.WR("auto_close");
                }
            }
            C1709110uZp c1709110uZp = ((RefundCashierAssem) this.l4).Lo().LL;
            if (c1709110uZp != null && (str = c1709110uZp.LJIIJ) != null) {
                C1707980uY0.LIZ(0, str, null, null);
            }
            String str2 = RefundCashierFragment._pnsPageId;
            RefundCashierFragment.LLJJJJJIL.put(((RefundCashierAssem) this.l4).Oo(), Boolean.TRUE);
            return;
        }
        Fragment fragmentLJI3 = C724240Sb0.LJI((UIAssem) this.l3);
        if ((fragmentLJI3 instanceof RefundCashierFragment) && (pipoCashierBaseFragment = (PipoCashierBaseFragment) fragmentLJI3) != null) {
            pipoCashierBaseFragment.UR(false);
        }
        RefundCashierAssem refundCashierAssem = (RefundCashierAssem) this.l4;
        String str3 = this.s0;
        if (str3 == null) {
            str3 = "";
        }
        refundCashierAssem.Zo(str3, false);
        View viewLJJIJL4 = ((UIAssem) this.l3).LJJIJL();
        (viewLJJIJL4 != null ? (C197039127h) viewLJJIJL4.findViewById(R.id.cal) : null).setLoading(false);
        Fragment fragmentLJI4 = C724240Sb0.LJI((UIAssem) this.l3);
        if (fragmentLJI4 != null) {
            String str4 = this.s1;
            String string = this.s0;
            if (C1533950q1J.LJ(str4)) {
                C1710930ucl.LIZLLL(C1710930ucl.LIZ, fragmentLJI4, str4 != null ? str4 : "");
            } else {
                if (string == null || string.length() == 0) {
                    string = fragmentLJI4.getString(2131840179);
                }
                C1389880mGw c1389880mGw = new C1389880mGw(fragmentLJI4);
                c1389880mGw.LJIIIZ(string);
                c1389880mGw.LJIIJ();
            }
        }
        String str5 = RefundCashierFragment._pnsPageId;
        RefundCashierFragment.LLJJJJJIL.put(((RefundCashierAssem) this.l4).Oo(), Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS1S2300000_26.LIZ$2():void");
    }

    public static final void run$0(ARunnableS1S2300000_26 aRunnableS1S2300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("PhoneSettingAssem@3e8c.onViewCreated$6$1");
        try {
            aRunnableS1S2300000_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhoneSettingAssem@3e8c.onViewCreated$6$1");
    }

    public static final void run$1(ARunnableS1S2300000_26 aRunnableS1S2300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("RefundCashierAssem@d6e8.initSubscribe$10$1");
        try {
            aRunnableS1S2300000_26.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RefundCashierAssem@d6e8.initSubscribe$10$1");
    }

    public static final void run$2(ARunnableS1S2300000_26 aRunnableS1S2300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("EcMixMallDiversionAssem@3af6.initOrUpdatePendantLayer$1");
        try {
            aRunnableS1S2300000_26.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcMixMallDiversionAssem@3af6.initOrUpdatePendantLayer$1");
    }

    public ARunnableS1S2300000_26(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l3 = obj2;
        this.l4 = obj3;
        this.s0 = str;
        this.s1 = str2;
    }
}
