package Y;

import X.AbstractC1842530y31;
import X.C098200Yq;
import X.C1389890mGx;
import X.C1504130pFD;
import X.C1707910uXt;
import X.C1708910uZV;
import X.C1709050uZj;
import X.C1709220ua0;
import X.C1719430uqT;
import X.C1749280vcc;
import X.C189200o6;
import X.C1954807lC;
import X.C19EG;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C488270JCv;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1707350uWz;
import X.EnumC488160JCk;
import X.InterfaceC1567370qtD;
import X.InterfaceC1704110uRl;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.ConfirmRegisterMobileResponse;
import com.ss.android.ugc.aweme.component.phone.ttmobile.CollectMobileFromTTAssem;
import com.ss.android.ugc.aweme.component.phone.ttmobile.CollectMobileFromTTFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS12S1400000_26 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        C1749280vcc c1749280vcc;
        int i = C488270JCv.LIZ[((EnumC488160JCk) this.l1).ordinal()];
        if (i == 1) {
            View viewLJJIJL = ((UIAssem) this.l2).LJJIJL();
            C786410Ut5.LLLZLZ(viewLJJIJL != null ? (C1749280vcc) viewLJJIJL.findViewById(R.id.z18) : null, 0);
            View viewLJJIJL2 = ((UIAssem) this.l2).LJJIJL();
            if (viewLJJIJL2 == null || (c1749280vcc = (C1749280vcc) viewLJJIJL2.findViewById(R.id.z18)) == null) {
                return;
            }
            c1749280vcc.LJ();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new C1954807lC();
            }
            View viewLJJIJL3 = ((UIAssem) this.l2).LJJIJL();
            C786410Ut5.LLLZLZ(viewLJJIJL3 != null ? (C1749280vcc) viewLJJIJL3.findViewById(R.id.z18) : null, 8);
            C19EG c19egLIZ = C724240Sb0.LIZ((UIAssem) this.l2);
            if (c19egLIZ != null) {
                String str = this.s0;
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        View viewLJJIJL4 = ((UIAssem) this.l2).LJJIJL();
        C786410Ut5.LLLZLZ(viewLJJIJL4 != null ? (C1749280vcc) viewLJJIJL4.findViewById(R.id.z18) : null, 8);
        BaseResponse baseResponse = (BaseResponse) this.l3;
        if (baseResponse != null) {
            CollectMobileFromTTAssem collectMobileFromTTAssem = (CollectMobileFromTTAssem) this.l4;
            UIAssem uIAssem = (UIAssem) this.l2;
            ConfirmRegisterMobileResponse confirmRegisterMobileResponse = (ConfirmRegisterMobileResponse) baseResponse.data;
            String str2 = confirmRegisterMobileResponse != null ? confirmRegisterMobileResponse.verifyInfo : null;
            if ((str2 != null && str2.length() != 0) || collectMobileFromTTAssem.Jo().LLJILLL) {
                ArrayList arrayList = new ArrayList();
                C19EG c19egLIZ2 = C724240Sb0.LIZ(collectMobileFromTTAssem);
                if (c19egLIZ2 != null) {
                    arrayList.add(c19egLIZ2);
                }
                String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken("a2270.b79668.c8964.d24906", PageFinder.via(C724240Sb0.LJI(uIAssem)), null);
                C1719430uqT c1719430uqT = CollectMobileFromTTFragment.LLIZLLLIL;
                String str3 = collectMobileFromTTAssem.Jo().LLILLL;
                c1719430uqT.getClass();
                InterfaceC1567370qtD interfaceC1567370qtD = CollectMobileFromTTFragment.LLJI.get(str3);
                if (interfaceC1567370qtD != null) {
                    interfaceC1567370qtD.LIZ(true, str2, arrayList, null, strCreateJumpSourceBtmToken);
                    return;
                }
                return;
            }
        }
        C19EG c19egLIZ3 = C724240Sb0.LIZ((UIAssem) this.l2);
        if (c19egLIZ3 != null) {
            String str4 = this.s0;
            C1389890mGx c1389890mGx2 = new C1389890mGx(c19egLIZ3);
            c1389890mGx2.LJIIJ(str4);
            c1389890mGx2.LJIIJJI();
        }
    }

    public final void LIZ$1() {
        Layout layout = ((TextView) this.l1).getLayout();
        int lineWidth = layout != null ? (int) layout.getLineWidth(0) : 0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Marquee RESET - ");
        Layout layout2 = ((TextView) this.l1).getLayout();
        sbLIZ.append(layout2 != null ? (int) layout2.getLineWidth(0) : 0);
        sbLIZ.append(" - ");
        sbLIZ.append(((TextView) this.l1).getWidth());
        sbLIZ.append(" - ");
        sbLIZ.append(lineWidth > ((TextView) this.l1).getWidth());
        C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ));
        if (lineWidth <= ((TextView) this.l1).getWidth()) {
            InterfaceC1704110uRl interfaceC1704110uRl = (InterfaceC1704110uRl) this.l4;
            if (interfaceC1704110uRl != null) {
                interfaceC1704110uRl.LIZ(0);
                return;
            }
            return;
        }
        ((AbstractC1842530y31) this.l2).LJJII = true;
        ((TextView) this.l1).setText(((SpannableStringBuilder) this.l3).append((CharSequence) "     "));
        AbstractC1842530y31 abstractC1842530y31 = (AbstractC1842530y31) this.l2;
        TextView textView = (TextView) this.l1;
        abstractC1842530y31.getClass();
        AbstractC1842530y31.LJIIJ(textView);
        Layout layout3 = ((TextView) this.l1).getLayout();
        int lineWidth2 = layout3 != null ? (int) layout3.getLineWidth(0) : 0;
        ((TextView) this.l1).setText(((SpannableStringBuilder) this.l3).append((CharSequence) this.s0));
        TextView textView2 = (TextView) this.l1;
        HandlerHook.viewPost(textView2, new ARunnableS15S0301000_26(lineWidth2, (AbstractC1842530y31) this.l2, textView2, (InterfaceC1704110uRl) this.l4, 3));
    }

    public final void LIZ$2() {
        ((C1709050uZj) this.l1).LIZIZ();
        ((C1709050uZj) this.l1).getClass();
        C1709050uZj.LIZJ = false;
        C1709050uZj.LIZLLL = 0L;
        C1709220ua0 c1709220ua0 = (C1709220ua0) this.l2;
        Unit unit = null;
        if (c1709220ua0 == null || c1709220ua0.LJFF == null) {
            EnumC1707350uWz enumC1707350uWz = EnumC1707350uWz.PAY_RESULT_NETWORK_ERROR;
            C1707910uXt.LJFF((CashierKey) this.l3, enumC1707350uWz.getErrorCode(), enumC1707350uWz.getErrorMessage(), null, 72);
        } else {
            c1709220ua0.LJFF.invoke(this.s0);
        }
        try {
            IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
            if (iProbeService != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((C1708910uZV) this.l4).LIZLLL.LJ);
                sbLIZ.append("_cashier");
                iProbeService.LJIIJJI(new C1504130pFD(C2188811AlT.LIZIZ(sbLIZ)));
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void run$0(ARunnableS12S1400000_26 aRunnableS12S1400000_26) {
        boolean zLIZ;
        C1C7U.LIZ("CollectMobileFromTTAssem@b73c.onViewCreated$13$1");
        try {
            aRunnableS12S1400000_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CollectMobileFromTTAssem@b73c.onViewCreated$13$1");
    }

    public static final void run$1(ARunnableS12S1400000_26 aRunnableS12S1400000_26) {
        boolean zLIZ;
        C1C7U.LIZ("IAnimationProcessor@b62a.startMarqueeForUnifiedEntrance$2");
        try {
            aRunnableS12S1400000_26.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IAnimationProcessor@b62a.startMarqueeForUnifiedEntrance$2");
    }

    public static final void run$2(ARunnableS12S1400000_26 aRunnableS12S1400000_26) {
        boolean zLIZ;
        C1C7U.LIZ("CashierFragmentStarter@5926.openCashierFragmentFromSchema$callback$2$invoke$$inlined$runInMainThread$1");
        try {
            aRunnableS12S1400000_26.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CashierFragmentStarter@5926.openCashierFragmentFromSchema$callback$2$invoke$$inlined$runInMainThread$1");
    }

    public ARunnableS12S1400000_26(Object obj, Object obj2, Object obj3, String str, Object obj4, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.s0 = str;
        this.l4 = obj4;
    }
}
