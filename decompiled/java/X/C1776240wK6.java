package X;

import android.os.SystemClock;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelContentAssem;
import com.ss.android.ugc.aweme.ecommerce.base.review.lynx.ReviewLynxAssem;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS109S1200000_26;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wK6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776240wK6 extends AbstractC1542200qEc {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1537870q7d
    public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        if (3 - this.$t != 0) {
            super.LJJZZIII(interfaceC1541990qEH, str);
        } else {
            LJJZZIII$0(this, interfaceC1541990qEH, str);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        switch (this.$t) {
            case 1:
                LJL$0(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            case 2:
            case 3:
            default:
                super.LJL(interfaceC1541990qEH, str, c1542120qEU);
                break;
            case 4:
                LJL$1(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 0:
                LJLIIIL$0(this, interfaceC1541990qEH);
                break;
            case 1:
            case 2:
            case 4:
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
            case 3:
                LJLIIIL$1(this, interfaceC1541990qEH);
                break;
            case 5:
                LJLIIIL$2(this, interfaceC1541990qEH);
                break;
            case 6:
                LJLIIIL$3(this, interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        switch (this.$t) {
            case 1:
                LJLIIL$0(this, interfaceC1541990qEH, str);
                break;
            case 2:
            case 3:
            default:
                super.LJLIIL(interfaceC1541990qEH, str);
                break;
            case 4:
                LJLIIL$1(this, interfaceC1541990qEH, str);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
        if (2 - this.$t != 0) {
            super.LJLJI(interfaceC1541990qEH);
        } else {
            LJLJI$0(this, interfaceC1541990qEH);
        }
    }

    public C1776240wK6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIIL$0(C1776240wK6 c1776240wK6, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1390410mHn c1390410mHnVS = ((TabStoreFragment) c1776240wK6.l0).VS();
        if (c1390410mHnVS != null) {
            c1390410mHnVS.LIZLLL();
        }
        C1390410mHn c1390410mHnVS2 = ((TabStoreFragment) c1776240wK6.l0).VS();
        if (c1390410mHnVS2 != null) {
            C786410Ut5.LJLLLLLL(8, c1390410mHnVS2);
        }
    }

    public static final void LJLIIIL$1(C1776240wK6 c1776240wK6, InterfaceC1541990qEH interfaceC1541990qEH) {
        ((C1716570ulr) c1776240wK6.l0).LJIIJ = Boolean.TRUE;
    }

    public static final void LJLIIIL$2(C1776240wK6 c1776240wK6, InterfaceC1541990qEH interfaceC1541990qEH) {
        ((SparkContext) c1776240wK6.l0).LJJ(InterfaceC1541800qDy.class, null);
    }

    public static final void LJLIIIL$3(C1776240wK6 c1776240wK6, InterfaceC1541990qEH interfaceC1541990qEH) {
        ((SparkContext) c1776240wK6.l0).LJJ(InterfaceC1541800qDy.class, null);
    }

    public static final void LJLJI$0(C1776240wK6 c1776240wK6, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1739060vM8 c1739060vM8 = (C1739060vM8) c1776240wK6.l0;
        c1739060vM8.getClass();
        c1739060vM8.LIZJ = new WeakReference<>(interfaceC1541990qEH);
    }

    public static final void LJJZZIII$0(C1776240wK6 c1776240wK6, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        if (!Intrinsics.LJFF(((C1716570ulr) c1776240wK6.l0).LJIIJ, Boolean.TRUE)) {
            ((C1716570ulr) c1776240wK6.l0).LJIIJ = Boolean.FALSE;
        }
    }

    public static final void LJLIIL$0(C1776240wK6 c1776240wK6, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        ((BundlePanelContentAssem) c1776240wK6.l0).getClass();
        BundlePanelContentAssem bundlePanelContentAssem = (BundlePanelContentAssem) c1776240wK6.l0;
        SystemClock.elapsedRealtime();
        bundlePanelContentAssem.getClass();
    }

    public static final void LJLIIL$1(C1776240wK6 c1776240wK6, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        ReviewLynxAssem reviewLynxAssem = (ReviewLynxAssem) c1776240wK6.l0;
        reviewLynxAssem.LLJIJIL = str;
        reviewLynxAssem.LLJILJIL = SystemClock.elapsedRealtime();
        C1747980vaW c1747980vaW = new C1747980vaW();
        c1747980vaW.LJIIIIZZ(new AwS140S1100000_26(str, (ReviewLynxAssem) c1776240wK6.l0, 54));
        c1747980vaW.LIZJ(false);
    }

    public static final void LJL$0(C1776240wK6 c1776240wK6, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        C1326490kch c1326490kch = C1326490kch.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((BundlePanelContentAssem) c1776240wK6.l0).LLIZLLLIL);
        sbLIZ.append(":container load error");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1326490kch.getClass();
        C1326490kch.LIZ(strLIZIZ);
        ((BundlePanelContentAssem) c1776240wK6.l0).Go().setState(AFwS268S0000000_26.get$arr$(503));
    }

    public static final void LJL$1(C1776240wK6 c1776240wK6, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        C1747980vaW c1747980vaW = new C1747980vaW();
        c1747980vaW.LJIIIIZZ(new AwS109S1200000_26(str, (ReviewLynxAssem) c1776240wK6.l0, c1542120qEU, 34));
        c1747980vaW.LIZJ(false);
        ((ReviewLynxAssem) c1776240wK6.l0).Jo().setState(AFwS268S0000000_26.get$arr$(714));
    }
}
