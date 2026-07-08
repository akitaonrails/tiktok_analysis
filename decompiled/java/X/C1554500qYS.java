package X;

import android.net.Uri;
import com.bytedance.hybrid.common.autoservice.SparkAioDevtool;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.autoservice.ISparkInnerPIA;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.LynxView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS172S1100000_23;

/* JADX INFO: renamed from: X.0qYS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1554500qYS extends AbstractC1542200qEc {
    public final int $t;

    @Override // X.AbstractC1537870q7d
    public final void LJJZ(InterfaceC1541990qEH interfaceC1541990qEH) {
        if (7 - this.$t != 0) {
            super.LJJZ(interfaceC1541990qEH);
        } else {
            LJJZ$0(this, interfaceC1541990qEH);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        if (7 - this.$t != 0) {
            super.LJL(interfaceC1541990qEH, str, c1542120qEU);
        } else {
            LJL$0(this, interfaceC1541990qEH, str, c1542120qEU);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 4:
                LJLIIIL$0(this, interfaceC1541990qEH);
                break;
            case 5:
            case 6:
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
            case 7:
                LJLIIIL$1(this, interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        switch (this.$t) {
            case 1:
                LJLIIL$0(this, interfaceC1541990qEH, str);
                break;
            case 7:
                LJLIIL$1(this, interfaceC1541990qEH, str);
                break;
            default:
                super.LJLIIL(interfaceC1541990qEH, str);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLILLLLZI() {
        if (7 - this.$t != 0) {
            super.LJLILLLLZI();
        } else {
            C2187451AjH.LIZ;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 0:
                LJLJI$0(this, interfaceC1541990qEH);
                break;
            case 3:
                LJLJI$1(this, interfaceC1541990qEH);
                break;
            case 7:
                C2187451AjH.LIZ;
                break;
            default:
                super.LJLJI(interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJJI() {
        if (7 - this.$t != 0) {
            super.LJLJJI();
        } else {
            C2187451AjH.LIZ;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJJLL(EnumC1067640dtC enumC1067640dtC) {
        if (7 - this.$t != 0) {
            super.LJLJJLL(enumC1067640dtC);
        } else {
            C2187451AjH.LIZ;
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLLI(SparkContext sparkContext) {
        if (2 - this.$t != 0) {
            super.LJLLI(sparkContext);
        } else {
            LJLLI$0(this, sparkContext);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLLJ(SparkContext sparkContext, C1548490qOl c1548490qOl) {
        switch (this.$t) {
            case 2:
                LJLLJ$0(this, sparkContext, c1548490qOl);
                break;
            case 3:
            case 4:
            default:
                super.LJLLJ(sparkContext, c1548490qOl);
                break;
            case 5:
                LJLLJ$1(this, sparkContext, c1548490qOl);
                break;
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLLL(SparkContext sparkContext) {
        if (2 - this.$t != 0) {
            super.LJLLL(sparkContext);
        } else {
            LJLLL$0(this, sparkContext);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void onDestroy() {
        if (7 - this.$t != 0) {
            super.onDestroy();
        } else {
            C2187451AjH.LIZ;
        }
    }

    public C1554500qYS(int i) {
        this.$t = i;
    }

    public static final void LJJZ$0(C1554500qYS c1554500qYS, InterfaceC1541990qEH interfaceC1541990qEH) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AbsLoadCallback, onDestroy, kitView:");
        sbLIZ.append(interfaceC1541990qEH);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJLIIIL$0(C1554500qYS c1554500qYS, InterfaceC1541990qEH interfaceC1541990qEH) {
        SparkAioDevtool.INSTANCE.checkLatest(new InterfaceC1539450qAB() { // from class: X.0qEi
        });
    }

    public static final void LJLIIIL$1(C1554500qYS c1554500qYS, InterfaceC1541990qEH interfaceC1541990qEH) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AbsLoadCallback, onLoadFinish, callback:");
        C1547430qN3.LIZ.getClass();
        sbLIZ.append(C1547430qN3.LJIIL());
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1547420qN2 interfaceC1547420qN2LJIIL = C1547430qN3.LJIIL();
        if (interfaceC1547420qN2LJIIL != null) {
            interfaceC1547420qN2LJIIL.LIZ(interfaceC1541990qEH);
        }
    }

    public static final void LJLJI$0(C1554500qYS c1554500qYS, InterfaceC1541990qEH interfaceC1541990qEH) {
        C587540N2q.LIZ.getClass();
        ISparkInnerPIA iSparkInnerPIA = (ISparkInnerPIA) C587540N2q.LIZ(ISparkInnerPIA.class);
        if (iSparkInnerPIA != null) {
            iSparkInnerPIA.onPostKitCreated(interfaceC1541990qEH);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJLJI$1(C1554500qYS c1554500qYS, InterfaceC1541990qEH interfaceC1541990qEH) {
        LynxView lynxView;
        InterfaceC1531560pxS interfaceC1531560pxS;
        HybridSchemaParam hybridSchemaParamLIZJ;
        if ((interfaceC1541990qEH instanceof LynxView) && (lynxView = (LynxView) interfaceC1541990qEH) != null && (interfaceC1531560pxS = interfaceC1541990qEH.getHybridContext().hybridParams) != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && hybridSchemaParamLIZJ.getUseMotion()) {
            C0NMF c0nmf = new C0NMF();
            C1289410jet c1289410jetLIZ = C1289420jeu.LIZ(lynxView);
            if (c1289410jetLIZ != null) {
                c1289410jetLIZ.LIZ(C0NMF.class, c0nmf);
            }
        }
    }

    public static final void LJLLI$0(C1554500qYS c1554500qYS, SparkContext sparkContext) {
        if (sparkContext != null) {
            C1545510qJx.LIZ.getClass();
            C1545510qJx.LJ(sparkContext);
        }
    }

    public static final void LJLLL$0(C1554500qYS c1554500qYS, SparkContext sparkContext) {
        if (sparkContext != null) {
            C1545510qJx.LIZ.getClass();
            C1545510qJx.LJ(sparkContext);
        }
    }

    public static final void LJLIIL$0(C1554500qYS c1554500qYS, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        String strLIZJ;
        if (interfaceC1541990qEH instanceof LynxView) {
            C1523320pkA.LL.getClass();
            if (str != null) {
                strLIZJ = C1946007jm.LIZJ(C1946007jm.LJ(str), "ec_native_prefetch_key");
            } else {
                strLIZJ = null;
            }
            new AwS172S1100000_23(interfaceC1541990qEH, strLIZJ, 4);
            C1507560pKk.LIZ();
            C1523320pkA.LLILLL.put(interfaceC1541990qEH, strLIZJ);
        }
    }

    public static final void LJLIIL$1(C1554500qYS c1554500qYS, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AbsLoadCallback, onLoadStart, callback:");
        C1547430qN3.LIZ.getClass();
        sbLIZ.append(C1547430qN3.LJIIL());
        sbLIZ.append(", url:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1547420qN2 interfaceC1547420qN2LJIIL = C1547430qN3.LJIIL();
        if (interfaceC1547420qN2LJIIL != null) {
            interfaceC1547420qN2LJIIL.LJ(interfaceC1541990qEH, str);
        }
    }

    public static final void LJLLJ$0(C1554500qYS c1554500qYS, SparkContext sparkContext, C1548490qOl c1548490qOl) {
        if (sparkContext != null) {
            C1545510qJx.LIZ.getClass();
            C1545510qJx.LJ(sparkContext);
        }
    }

    public static final void LJLLJ$1(C1554500qYS c1554500qYS, SparkContext sparkContext, C1548490qOl c1548490qOl) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        SparkContext sparkContext2;
        String strLJIJI;
        Uri uri;
        Map<String, String> mapLIZLLL;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2;
        if (c1548490qOl.LIZIZ == 2 && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1548490qOl.LIZ) != null && (sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null && (strLJIJI = sparkContext2.LJIJI()) != null && (uri = UriProtector.parse(strLJIJI)) != null && (mapLIZLLL = C1946007jm.LIZLLL(uri)) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c1548490qOl.LIZ) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.U0(mapLIZLLL);
        }
    }

    public C1554500qYS(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, SparkContext sparkContext, C1537910q7h c1537910q7h, int i) {
        this.$t = i;
        new AtomicBoolean(false);
    }

    public static final void LJL$0(C1554500qYS c1554500qYS, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AbsLoadCallback, onLoadFailed2, originCode:");
        sbLIZ.append(c1542120qEU.LIZJ);
        sbLIZ.append(", originReason:");
        sbLIZ.append(c1542120qEU.LIZLLL);
        sbLIZ.append(", errorCode:");
        sbLIZ.append(c1542120qEU.LIZ);
        sbLIZ.append(", errorReason:");
        sbLIZ.append(c1542120qEU.LIZIZ);
        sbLIZ.append(", url:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1547430qN3.LIZ.getClass();
        InterfaceC1547420qN2 interfaceC1547420qN2LJIIL = C1547430qN3.LJIIL();
        if (interfaceC1547420qN2LJIIL != null) {
            interfaceC1547420qN2LJIIL.LJFF(str, c1542120qEU);
        }
    }
}
