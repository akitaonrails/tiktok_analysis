package X;

import Y.ARunnableS126S0100000_26;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CCDCAddCardFragment;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POConfiguration;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: renamed from: X.0ucQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710720ucQ {
    public final Context LIZ;
    public final C1708220uYO LIZIZ;

    public C1710720ucQ(Context context) {
        C1708220uYO c1708220uYO = new C1708220uYO();
        this.LIZ = context;
        this.LIZIZ = c1708220uYO;
    }

    public static void LIZ(C1710720ucQ c1710720ucQ, CashierEnterParams cashierEnterParams, PipoCashierBaseFragment pipoCashierBaseFragment, EnumC1709560uaY enumC1709560uaY, PaymentOption paymentOption, boolean z, InterfaceC1708270uYT interfaceC1708270uYT, int i) {
        C1709570uaZ c1709570uaZ;
        boolean z2;
        POConfiguration.CCDCBindType cCDCBindType;
        boolean z3;
        EnumC1709200uZy enumC1709200uZy;
        EnumC1710710ucP enumC1710710ucP;
        C1192680h8s c1192680h8sInvoke;
        Function0<Unit> function0;
        C1709570uaZ c1709570uaZ2;
        CashierEnterParams cashierEnterParams2;
        C1709220ua0 c1709220ua0;
        Function1<EnumC334240D8k, C1192680h8s> function1;
        POConfiguration pOConfiguration;
        InterfaceC1708270uYT interfaceC1708270uYT2 = interfaceC1708270uYT;
        boolean z4 = z;
        if ((i & 16) != 0) {
            z4 = false;
        }
        AwS270S0300000_26 awS270S0300000_26 = null;
        if ((i & 32) != 0) {
            interfaceC1708270uYT2 = null;
        }
        if (cashierEnterParams != null && (c1709570uaZ = cashierEnterParams.paymentData) != null) {
            if (enumC1709560uaY == EnumC1709560uaY.CCDC) {
                z2 = true;
            } else {
                z2 = false;
            }
            PaymentOption paymentOptionLJJII = c1709570uaZ.LJJII(z2);
            if (paymentOptionLJJII != null && (pOConfiguration = paymentOptionLJJII.config) != null) {
                cCDCBindType = pOConfiguration.bindType;
            } else {
                cCDCBindType = null;
            }
            if (cCDCBindType == POConfiguration.CCDCBindType.REAL) {
                z3 = true;
            } else {
                z3 = false;
            }
            C1709070uZl c1709070uZl = cashierEnterParams.LIZIZ;
            if (c1709070uZl != null) {
                enumC1709200uZy = c1709070uZl.LIZIZ;
            } else {
                enumC1709200uZy = null;
            }
            if ((enumC1709200uZy == EnumC1709200uZy.PAY_NOW || z3) && pipoCashierBaseFragment != null) {
                enumC1710710ucP = EnumC1710710ucP.POPUP;
            } else {
                enumC1710710ucP = EnumC1710710ucP.DISMISS;
            }
            if (z4 && (c1709570uaZ2 = cashierEnterParams.paymentData) != null) {
                if (c1709570uaZ2.LJIILIIL(paymentOption)) {
                    cashierEnterParams2 = cashierEnterParams;
                } else {
                    cashierEnterParams2 = null;
                }
                if (c1709570uaZ2.LJIILLIIL(c1710720ucQ.LIZ, null).LIZ == EnumC1709470uaP.DIRECT_CHECKOUT && cashierEnterParams2 != null && (c1709220ua0 = cashierEnterParams2.LJ) != null && (function1 = c1709220ua0.LIZIZ) != null) {
                    c1192680h8sInvoke = function1.invoke(EnumC334240D8k.CCDC);
                } else {
                    c1192680h8sInvoke = null;
                }
            } else {
                c1192680h8sInvoke = null;
            }
            C1709220ua0 c1709220ua02 = cashierEnterParams.LJ;
            if (c1709220ua02 != null && (function0 = c1709220ua02.LIZJ) != null && z4 && !z3) {
                awS270S0300000_26 = new AwS270S0300000_26(cashierEnterParams, (CashierEnterParams) function0, (Function0<Unit>) pipoCashierBaseFragment, (PipoCashierBaseFragment) 111);
            }
            C1709640uag c1709640uag = new C1709640uag(cashierEnterParams, enumC1709560uaY, paymentOption, enumC1710710ucP, interfaceC1708270uYT2, c1192680h8sInvoke, awS270S0300000_26, z4);
            C1708220uYO c1708220uYO = c1710720ucQ.LIZIZ;
            Context context = c1710720ucQ.LIZ;
            c1708220uYO.getClass();
            CCDCAddCardFragment cCDCAddCardFragment = new CCDCAddCardFragment();
            cCDCAddCardFragment.LLJJJ = c1709640uag;
            if (pipoCashierBaseFragment == null) {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ == null) {
                    Activity activityLIZ = C1388190mED.LIZ(context);
                    if (!(activityLIZ instanceof C19EG) || (c19egLIZIZ = (C19EG) activityLIZ) == null) {
                        return;
                    }
                }
                cCDCAddCardFragment.LLJI = true;
                cCDCAddCardFragment.LLJIJIL = false;
                if (cCDCAddCardFragment.LLIZLLLIL == null) {
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJJIJI = cCDCAddCardFragment;
                    tuxSheet.LLJJIJIIJIL = true;
                    tuxSheet.LLJLILLLLZIIL = false;
                    tuxSheet.LLJLL = true;
                    c1390920mIc.LJIIIIZZ(3);
                    c1390920mIc.LJFF(1.0f);
                    if (cCDCAddCardFragment.LLJILJIL) {
                        c1390920mIc.LIZ.LLLIIIIL = cCDCAddCardFragment.LLJILLL;
                    } else {
                        c1390920mIc.LIZ.LLLIIII = cCDCAddCardFragment.LLJILJILJ;
                    }
                    cCDCAddCardFragment.LLIZLLLIL = c1390920mIc.LIZ;
                }
                cCDCAddCardFragment.LLJJIII = 3;
                TuxSheet tuxSheet2 = cCDCAddCardFragment.LLIZLLLIL;
                if (tuxSheet2 != null) {
                    tuxSheet2.show(c19egLIZIZ.getSupportFragmentManager(), String.valueOf(cCDCAddCardFragment.hashCode()));
                }
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJIIIIZZ(cCDCAddCardFragment, true);
                C786410Ut5.LJLIIL(300L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS126S0100000_26(cCDCAddCardFragment, 121));
                return;
            }
            if (!pipoCashierBaseFragment.bS()) {
                C786410Ut5.LJLIIL(200L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS126S0100000_26(pipoCashierBaseFragment, 118));
            }
            pipoCashierBaseFragment.nS(cCDCAddCardFragment, true);
        }
    }
}
