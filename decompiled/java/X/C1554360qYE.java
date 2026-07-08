package X;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewClient;
import java.util.Map;
import kotlin.jvm.internal.AwS87S1000000_2;

/* JADX INFO: renamed from: X.0qYE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1554360qYE extends LynxViewClient {
    public final int $t;
    public Object l0;

    @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
    public final void LJFF(LynxError lynxError) {
        if (this.$t != 0) {
            super.LJFF(lynxError);
        } else {
            LJFF$0(this, lynxError);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        if (this.$t != 0) {
            super.LJII();
        } else {
            LJII$0(this);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILJJIL() {
        if (1 - this.$t != 0) {
            super.LJIILJJIL();
        } else {
            LJIILJJIL$0(this);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIZ(String str, Map map, Map map2) {
        if (this.$t != 0) {
            super.LJJIIZ(str, map, map2);
        } else {
            LJJIIZ$0(this, str, map, map2);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void onTimingSetup(Map<String, ? extends Object> map) {
        if (this.$t != 0) {
            super.onTimingSetup(map);
        } else {
            onTimingSetup$0(this, map);
        }
    }

    public static final void LJII$0(C1554360qYE c1554360qYE) {
        C1523590pkb c1523590pkb = C1523590pkb.LIZ;
        C1523630pkf c1523630pkf = (C1523630pkf) c1554360qYE.l0;
        Uri uri = c1523630pkf.LLILLJJLI;
        String str = c1523630pkf.LLILLL;
        c1523590pkb.getClass();
        C1523590pkb.LIZLLL(uri, str, "onDataUpdated", false, null, false);
    }

    public static final void LJIILJJIL$0(C1554360qYE c1554360qYE) {
        SparkFragment sparkFragment;
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = ((SparkContext) c1554360qYE.l0).LJJIJLIJ();
        Object kitView = null;
        try {
            if (interfaceC1059280dfiLJJIJLIJ instanceof InterfaceC1546650qLn) {
                SparkFragment sparkFragment2 = ((InterfaceC1546650qLn) interfaceC1059280dfiLJJIJLIJ).getSparkFragment();
                if (sparkFragment2 != null) {
                    kitView = sparkFragment2.getKitView();
                }
            } else if (interfaceC1059280dfiLJJIJLIJ instanceof SparkPopup) {
                Fragment fragmentLJJJJZI = ((SparkPopup) interfaceC1059280dfiLJJIJLIJ).getChildFragmentManager().LJJJJZI("popup");
                if ((fragmentLJJJJZI instanceof SparkFragment) && (sparkFragment = (SparkFragment) fragmentLJJJJZI) != null) {
                    kitView = sparkFragment.getKitView();
                }
            } else if (interfaceC1059280dfiLJJIJLIJ instanceof SparkFragment) {
                kitView = ((SparkFragment) interfaceC1059280dfiLJJIJLIJ).getKitView();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (kitView instanceof LynxView) {
            LynxView lynxView = (LynxView) kitView;
            C1523320pkA.LL.getClass();
            String strRemove = C1523320pkA.LLILLL.remove(lynxView);
            if (strRemove != null) {
                new AwS87S1000000_2(strRemove, 27);
                C1507560pKk.LIZ();
                C1523320pkA.LIZJ(lynxView, strRemove);
            }
        }
    }

    public C1554360qYE(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJFF$0(C1554360qYE c1554360qYE, LynxError lynxError) {
        int iIntValue;
        Integer numValueOf;
        if (lynxError != null && (numValueOf = Integer.valueOf(lynxError.LIZIZ())) != null && numValueOf.intValue() != 0) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 1;
        }
        C1523590pkb c1523590pkb = C1523590pkb.LIZ;
        C1523630pkf c1523630pkf = (C1523630pkf) c1554360qYE.l0;
        Uri uri = c1523630pkf.LLILLJJLI;
        String str = c1523630pkf.LLILLL;
        Integer numValueOf2 = Integer.valueOf(iIntValue);
        c1523590pkb.getClass();
        C1523590pkb.LIZLLL(uri, str, "ec_lynx_code", false, numValueOf2, false);
        C1523590pkb.LIZIZ(((C1523630pkf) c1554360qYE.l0).LLILLJJLI);
    }

    public static final void onTimingSetup$0(C1554360qYE c1554360qYE, Map map) {
        C1523590pkb c1523590pkb = C1523590pkb.LIZ;
        C1523630pkf c1523630pkf = (C1523630pkf) c1554360qYE.l0;
        Uri uri = c1523630pkf.LLILLJJLI;
        String str = c1523630pkf.LLILLL;
        c1523590pkb.getClass();
        C1523590pkb.LIZLLL(uri, str, "onTimingSetup", false, null, false);
    }

    public static final void LJJIIZ$0(C1554360qYE c1554360qYE, String str, Map map, Map map2) {
        C1523590pkb c1523590pkb = C1523590pkb.LIZ;
        C1523630pkf c1523630pkf = (C1523630pkf) c1554360qYE.l0;
        Uri uri = c1523630pkf.LLILLJJLI;
        String str2 = c1523630pkf.LLILLL;
        c1523590pkb.getClass();
        C1523590pkb.LIZLLL(uri, str2, "ec_lynx_code", false, 0, false);
        C1523630pkf c1523630pkf2 = (C1523630pkf) c1554360qYE.l0;
        Uri uri2 = c1523630pkf2.LLILLJJLI;
        String str3 = c1523630pkf2.LLILLL;
        c1523590pkb.getClass();
        C1523590pkb.LIZLLL(uri2, str3, "ec_lynx_update_flag", false, str, false);
        C1523630pkf c1523630pkf3 = (C1523630pkf) c1554360qYE.l0;
        Uri uri3 = c1523630pkf3.LLILLJJLI;
        String str4 = c1523630pkf3.LLILLL;
        c1523590pkb.getClass();
        C1523590pkb.LIZLLL(uri3, str4, "onTimingUpdate", false, null, false);
        C1523590pkb.LJFF(((C1523630pkf) c1554360qYE.l0).LLILLL, map2);
        C1523590pkb.LIZIZ(((C1523630pkf) c1554360qYE.l0).LLILLJJLI);
    }
}
