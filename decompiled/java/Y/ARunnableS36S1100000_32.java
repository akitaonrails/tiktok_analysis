package Y;

import X.C01GW;
import X.C049Q;
import X.C18A2;
import X.C18AE;
import X.C18CK;
import X.C18CS;
import X.C18G6;
import X.C18KG;
import X.C18PZ;
import X.C19LZ;
import X.C1C7U;
import X.C21272518Mp;
import X.C21278818Pa;
import X.C21278918Pb;
import X.C21327718dH;
import X.C21386018mg;
import X.C21629019km;
import X.C2188811AlT;
import X.C5182020e;
import X.C786410Ut5;
import X.InterfaceC1752840viM;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.bcm.impl.config.BcmConfigModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.EcCommentAnchorPanelActivity;
import com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageInfo;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.AwS118S0110000_32;
import kotlin.jvm.internal.AwS82S1000000_32;
import kotlin.jvm.internal.AwS87S1000000_2;
import kotlin.text.u;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS36S1100000_32 implements Runnable {
    public final int $t;
    public Object l1;
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
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.18O0] */
    public final void LIZ$0() {
        final EcCommentAnchorPanelActivity ecCommentAnchorPanelActivity = (EcCommentAnchorPanelActivity) this.l1;
        if (ecCommentAnchorPanelActivity.LLJJI == null) {
            ecCommentAnchorPanelActivity.LLJJI = new InterfaceC1752840viM() { // from class: X.18O0
                @Override // X.InterfaceC1752840viM
                public final ViewGroup LJJIJL() {
                    return ecCommentAnchorPanelActivity.LLLLZLLIL();
                }

                @Override // X.InterfaceC1752840viM
                public final View nb() {
                    return ecCommentAnchorPanelActivity.LLLZLZ();
                }
            };
        }
        try {
            CartRefreshEvent cartRefreshEventLIZ = C049Q.LIZ(this.s0);
            Integer num = cartRefreshEventLIZ.count;
            int iIntValue = num != null ? num.intValue() : 0;
            EcCommentAnchorPanelActivity ecCommentAnchorPanelActivity2 = (EcCommentAnchorPanelActivity) this.l1;
            ecCommentAnchorPanelActivity2.LLLZZIL(iIntValue, ecCommentAnchorPanelActivity2.LLJLLIL);
            C21272518Mp c21272518Mp = C21272518Mp.LIZ;
            Integer numValueOf = Integer.valueOf(iIntValue);
            c21272518Mp.getClass();
            C21272518Mp.LIZIZ(numValueOf);
            EcCommentAnchorPanelActivity ecCommentAnchorPanelActivity3 = (EcCommentAnchorPanelActivity) this.l1;
            IECommerceVideoService iECommerceVideoService = ecCommentAnchorPanelActivity3.LLJJIJI;
            if (iECommerceVideoService != null) {
                iECommerceVideoService.LIZJ(ecCommentAnchorPanelActivity3.LLLLZLLIL(), ((EcCommentAnchorPanelActivity) this.l1).LLJJI, cartRefreshEventLIZ.toast);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZ$1() {
        ((C21327718dH) this.l1).LJFF();
        TextView textView = ((C21327718dH) this.l1).LLJILJIL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 0);
        }
        TextView textView2 = ((C21327718dH) this.l1).LLJILJIL;
        if (textView2 != null) {
            textView2.setText(this.s0);
        }
        C21327718dH c21327718dH = (C21327718dH) this.l1;
        TextView textView3 = c21327718dH.LLJILJIL;
        if (textView3 != null) {
            C786410Ut5.T7(textView3, new ACListenerS166S0100000_32(c21327718dH, 98));
        }
        C21327718dH c21327718dH2 = (C21327718dH) this.l1;
        TextView textView4 = c21327718dH2.LLJILJIL;
        if (textView4 != null) {
            textView4.setOnLongClickListener(new C19LZ(c21327718dH2, 1));
        }
    }

    public static final void run$0(ARunnableS36S1100000_32 aRunnableS36S1100000_32) {
        boolean zLIZ;
        C1C7U.LIZ("EcCommentAnchorPanelActivity@962e.onEvent$1");
        try {
            aRunnableS36S1100000_32.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcCommentAnchorPanelActivity@962e.onEvent$1");
    }

    public static final void run$1(ARunnableS36S1100000_32 aRunnableS36S1100000_32) {
        boolean zLIZ;
        C1C7U.LIZ("BottomTipsWidget@d218.onBind$1$1$1");
        try {
            ((C21629019km) aRunnableS36S1100000_32.l1).LIZLLL(aRunnableS36S1100000_32.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomTipsWidget@d218.onBind$1$1$1");
    }

    public static final void run$2(ARunnableS36S1100000_32 aRunnableS36S1100000_32) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.registerAuthorProfileObserver$1$observer$1$onNodeHide$$inlined$runOnWorkerThreadDelay$1");
        try {
            C18PZ.LJFF = false;
            C18PZ c18pz = C18PZ.LIZ;
            Context context = (Context) aRunnableS36S1100000_32.l1;
            C01GW c01gw = C21278818Pa.LIZ;
            Aweme aweme = C21278818Pa.LIZIZ;
            String str = aRunnableS36S1100000_32.s0;
            c18pz.getClass();
            C18PZ.LJIIIZ(context, aweme, str);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.registerAuthorProfileObserver$1$observer$1$onNodeHide$$inlined$runOnWorkerThreadDelay$1");
    }

    public static final void run$3(ARunnableS36S1100000_32 aRunnableS36S1100000_32) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.registerAuthorProfileObserver$1$observer$1$onNodeShow$$inlined$runOnWorkerThread$1");
        try {
            C21278918Pb c21278918Pb = C21278918Pb.LIZ;
            Context context = (Context) aRunnableS36S1100000_32.l1;
            C01GW c01gw = C21278818Pa.LIZ;
            Aweme aweme = C21278818Pa.LIZIZ;
            String str = aRunnableS36S1100000_32.s0;
            c21278918Pb.getClass();
            C21278918Pb.LIZIZ(context, aweme, str, false, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.registerAuthorProfileObserver$1$observer$1$onNodeShow$$inlined$runOnWorkerThread$1");
    }

    public static final void run$4(ARunnableS36S1100000_32 aRunnableS36S1100000_32) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.onVideoPageSwitchOut$$inlined$runOnWorkerThread$1");
        try {
            C18PZ c18pz = C18PZ.LIZ;
            String str = aRunnableS36S1100000_32.s0;
            c18pz.getClass();
            if (C18PZ.LIZJ(str)) {
                C18PZ.LIZJ = false;
                Context context = (Context) aRunnableS36S1100000_32.l1;
                String str2 = aRunnableS36S1100000_32.s0;
                C21278918Pb c21278918Pb = C21278918Pb.LIZ;
                C01GW c01gw = C21278818Pa.LIZ;
                Aweme aweme = C21278818Pa.LIZIZ;
                c21278918Pb.getClass();
                C21278918Pb.LIZIZ(context, aweme, str2, false, false);
                C18PZ.LJIIJ(context);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.onVideoPageSwitchOut$$inlined$runOnWorkerThread$1");
    }

    public static final void run$5(ARunnableS36S1100000_32 aRunnableS36S1100000_32) {
        boolean zLIZ;
        C1C7U.LIZ("MynaRootView@ef40.updateTagText$1");
        try {
            aRunnableS36S1100000_32.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MynaRootView@ef40.updateTagText$1");
    }

    public static final void run$6(ARunnableS36S1100000_32 aRunnableS36S1100000_32) {
        C21386018mg c21386018mg = (C21386018mg) aRunnableS36S1100000_32.l1;
        String str = aRunnableS36S1100000_32.s0;
        C1C7U.LIZ("LegacyCoverUiPresenter$listener$2$1@52c0.onPlayStop$1L");
        if (c21386018mg.LJIILL(c21386018mg.LJI) && !u.LJIJI(str, c21386018mg.LJIILJJIL, false)) {
            c21386018mg.LJIIJ(c21386018mg.LJI);
        }
        C1C7U.LIZIZ("LegacyCoverUiPresenter$listener$2$1@52c0.onPlayStop$1L");
    }

    public static final void run$7(ARunnableS36S1100000_32 aRunnableS36S1100000_32) {
        boolean zLIZ;
        C1C7U.LIZ("FcpReportHandler@8ebd.reportDelay$1");
        try {
            if (!ActivityStack.isAppBackGround()) {
                C18KG c18kg = C18KG.LIZ;
                FcpPageInfo fcpPageInfo = (FcpPageInfo) aRunnableS36S1100000_32.l1;
                String str = aRunnableS36S1100000_32.s0;
                if (fcpPageInfo != null) {
                    c18kg.LIZ(new AwS118S0110000_32(fcpPageInfo, false, 16), new AwS82S1000000_32(str, 12), fcpPageInfo, false);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FcpReportHandler@8ebd.reportDelay$1");
    }

    public static final void run$8(ARunnableS36S1100000_32 aRunnableS36S1100000_32) {
        InputStream inputStream = (InputStream) aRunnableS36S1100000_32.l1;
        String str = aRunnableS36S1100000_32.s0;
        C1C7U.LIZ("BcmConfig$fetchBcmConfig$2@484e.callback$1L");
        if (inputStream != null) {
            try {
                C18A2.LIZ = (BcmConfigModel) C18CS.LIZ().LJFF(new InputStreamReader(inputStream), BcmConfigModel.class);
                C18CK.LIZ("BcmConfig", new AwS87S1000000_2(str, 48), false);
                C18A2.LIZIZ = str;
                C18A2.LIZJ.set(3);
                C01GW c01gw = C18A2.LIZLLL;
                C18G6 c18g6 = (C18G6) c01gw.getValue();
                if (c18g6 != null) {
                    c18g6.LIZJ("BcmConfig", GsonProtectorUtils.toJson(C18CS.LIZ(), C18A2.LIZ));
                }
                C18G6 c18g62 = (C18G6) c01gw.getValue();
                if (c18g62 != null) {
                    c18g62.LIZJ("version", C18A2.LIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C18CK.LIZ("BcmConfig", new C5182020e(th, 636), false);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("load bcm error, fetch status: ");
                sbLIZ.append(C18A2.LIZJ.get());
                C18AE.LIZJ(4004, C2188811AlT.LIZIZ(sbLIZ), null, null, null, null, null, th, null, 1532);
            }
        }
        C1C7U.LIZIZ("BcmConfig$fetchBcmConfig$2@484e.callback$1L");
    }

    public ARunnableS36S1100000_32(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
