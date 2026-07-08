package Y;

import X.C1397510mTF;
import X.C1397580mTM;
import X.C1524305xx;
import X.C19EG;
import X.C1C7U;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2274381E0m;
import X.C2344009Gk;
import X.C985403tE;
import X.EnumC12947054v;
import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.BasePdpSheetFragment;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public class ARunnableS8S1100000_2 implements Runnable {
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1397580mTM c1397580mTM = new C1397580mTM((Context) this.l1);
        c1397580mTM.LJI("MiniDramaLynxService Warning");
        c1397580mTM.LIZIZ(this.s0);
        C985403tE.LIZ(c1397580mTM, AFwS229S0000000_2.get$arr$(888));
        c1397580mTM.LJII = true;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static final void run$0(ARunnableS8S1100000_2 aRunnableS8S1100000_2) {
        boolean zLIZ;
        boolean z;
        C1C7U.LIZ("IMGroupChatApi$Companion@c57e.trackDfInstallStatus$1");
        try {
            C2274381E0m c2274381E0m = C2274381E0m.LIZIZ;
            String str = aRunnableS8S1100000_2.s0;
            if (aRunnableS8S1100000_2.l1 != null) {
                z = true;
            } else {
                z = false;
            }
            c2274381E0m.LIZ(str, z);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMGroupChatApi$Companion@c57e.trackDfInstallStatus$1");
    }

    public static final void run$1(ARunnableS8S1100000_2 aRunnableS8S1100000_2) {
        boolean zLIZ;
        C1C7U.LIZ("FlexiblePanelLogger@7293.onEventReportInBackground$1");
        try {
            C20684815ws.LJIILLIIL(aRunnableS8S1100000_2.s0, ((C2344009Gk) aRunnableS8S1100000_2.l1).LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FlexiblePanelLogger@7293.onEventReportInBackground$1");
    }

    public static final void run$2(ARunnableS8S1100000_2 aRunnableS8S1100000_2) {
        boolean zLIZ;
        View view;
        C1C7U.LIZ("BasePdpSheetFragment@eed5.acquireExpandedPlaybackBlocker$1");
        try {
            BasePdpSheetFragment basePdpSheetFragment = (BasePdpSheetFragment) aRunnableS8S1100000_2.l1;
            if (basePdpSheetFragment.LLILZIL && (view = basePdpSheetFragment.getView()) != null && view.getParent() != null) {
                BasePdpSheetFragment basePdpSheetFragment2 = (BasePdpSheetFragment) aRunnableS8S1100000_2.l1;
                if (basePdpSheetFragment2.LLILZ == null) {
                    C1524305xx c1524305xx = C1524305xx.LIZ;
                    String str = aRunnableS8S1100000_2.s0;
                    String str2 = (String) basePdpSheetFragment2.LLILLJJLI.getValue();
                    EnumC12947054v enumC12947054v = EnumC12947054v.EXPANDED_PDP_SHEET;
                    C19EG activity = ((BasePdpSheetFragment) aRunnableS8S1100000_2.l1).getActivity();
                    c1524305xx.getClass();
                    basePdpSheetFragment2.LLILZ = C1524305xx.LIZ(str, str2, enumC12947054v, activity);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BasePdpSheetFragment@eed5.acquireExpandedPlaybackBlocker$1");
    }

    public static final void run$3(ARunnableS8S1100000_2 aRunnableS8S1100000_2) {
        boolean zLIZ;
        C1C7U.LIZ("RavenFragment@d0e1.handleBodyResponseUpdate$visibilityObserver$1$restore$3");
        try {
            RavenFragment ravenFragment = (RavenFragment) aRunnableS8S1100000_2.l1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("adapter commit: ");
            sbLIZ.append(aRunnableS8S1100000_2.s0);
            ravenFragment.hT(C2188811AlT.LIZIZ(sbLIZ));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RavenFragment@d0e1.handleBodyResponseUpdate$visibilityObserver$1$restore$3");
    }

    public static final void run$4(ARunnableS8S1100000_2 aRunnableS8S1100000_2) {
        boolean zLIZ;
        C1C7U.LIZ("MiniDramaLynxServiceImpl@6f89.showDuplicateKeysDialog$1");
        try {
            aRunnableS8S1100000_2.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniDramaLynxServiceImpl@6f89.showDuplicateKeysDialog$1");
    }

    public ARunnableS8S1100000_2(C2344009Gk c2344009Gk, int i) {
        this.$t = i;
        this.s0 = "enter_detail_full_page";
        this.l1 = c2344009Gk;
    }

    public ARunnableS8S1100000_2(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
