package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pipo.ttpay.recharge.RechargeAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.map2.AddressMapDetailFragment2;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0wJC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775680wJC extends AbstractC2173821A5s {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC2173821A5s
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            case 2:
                LIZIZ$2(this);
                break;
            case 3:
                LIZIZ$3(this);
                break;
            default:
                super.LIZIZ();
                break;
        }
    }

    public static final void LIZIZ$0(C1775680wJC c1775680wJC) {
        ViewGroup viewGroup;
        View childAt;
        SettingsManager.LIZLLL().getClass();
        boolean z = true;
        if (SettingsManager.LIZ("pipo_ttpay_landing_back_enable_operation", true)) {
            try {
                TuxNavBar tuxNavBar = (TuxNavBar) ((C19EG) c1775680wJC.l0).findViewById(R.id.ywz);
                if (tuxNavBar.getVisibility() != 0) {
                    z = false;
                }
                if (z) {
                    ((ViewGroup) tuxNavBar.findViewById(R.id.p25)).performClick();
                    return;
                }
                TuxNavBar tuxNavBar2 = (TuxNavBar) ((C19EG) c1775680wJC.l0).findViewById(R.id.dfg);
                if (tuxNavBar2 != null && (viewGroup = (ViewGroup) tuxNavBar2.findViewById(R.id.p25)) != null && (childAt = viewGroup.getChildAt(0)) != null) {
                    childAt.performClick();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static final void LIZIZ$1(C1775680wJC c1775680wJC) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", "leave"), new Pair("quit_type", "return"), new Pair("stay_time", String.valueOf(System.currentTimeMillis() - ((RechargeAssem) c1775680wJC.l0).LLIZLLLIL)));
        mapLJIIJ.putAll(((RechargeAssem) c1775680wJC.l0).Oo());
        C1716310ulR.LIZ.getClass();
        C1716310ulR.LIZLLL("pipo_page_stay", mapLJIIJ);
        C19EG c19egLIZ = C724240Sb0.LIZ((RechargeAssem) c1775680wJC.l0);
        if (c19egLIZ != null) {
            c19egLIZ.finish();
        }
    }

    public static final void LIZIZ$2(C1775680wJC c1775680wJC) {
        ((AddressMapDetailFragment) c1775680wJC.l0).ZR().LLJJ = "return";
        c1775680wJC.LJ();
    }

    public static final void LIZIZ$3(C1775680wJC c1775680wJC) {
        ((AddressMapDetailFragment2) c1775680wJC.l0).WR().LLILZIL = "return";
        c1775680wJC.LJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775680wJC(Object obj, int i) {
        super(true);
        this.$t = i;
        this.l0 = obj;
    }
}
