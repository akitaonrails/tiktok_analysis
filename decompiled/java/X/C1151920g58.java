package X;

import com.bytedance.hybrid.spark.SparkContext;

/* JADX INFO: renamed from: X.0g58, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151920g58 extends AbstractC1542200qEc {
    public final int $t;

    public static final void LJLI$0(C1151920g58 c1151920g58, InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
    }

    public static final void LJLIIIL$0(C1151920g58 c1151920g58, InterfaceC1541990qEH interfaceC1541990qEH) {
    }

    public static final void LJLIIIL$1(C1151920g58 c1151920g58, InterfaceC1541990qEH interfaceC1541990qEH) {
    }

    public static final void LJLIIIL$2(C1151920g58 c1151920g58, InterfaceC1541990qEH interfaceC1541990qEH) {
    }

    public static final void LJLIIL$0(C1151920g58 c1151920g58, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
    }

    public static final void LJLIIL$1(C1151920g58 c1151920g58, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
    }

    public static final void LJLIIL$2(C1151920g58 c1151920g58, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
    }

    public static final void LJLJLLL$0(C1151920g58 c1151920g58, SparkContext sparkContext) {
    }

    public static final void LJLL$0(C1151920g58 c1151920g58, SparkContext sparkContext) {
    }

    public static final void onDestroy$0(C1151920g58 c1151920g58) {
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        if (4 - this.$t != 0) {
            super.LJL(interfaceC1541990qEH, str, c1542120qEU);
        } else {
            LJL$0(this, interfaceC1541990qEH, str, c1542120qEU);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        if (this.$t != 0) {
            super.LJLI(interfaceC1541990qEH, str, str2);
        } else {
            LJLI$0(this, interfaceC1541990qEH, str, str2);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 0:
                LJLIIIL$0(this, interfaceC1541990qEH);
                break;
            case 1:
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
            case 2:
                LJLIIIL$1(this, interfaceC1541990qEH);
                break;
            case 3:
                LJLIIIL$2(this, interfaceC1541990qEH);
                break;
            case 4:
                C20441214yg.LJIIIZ("HammerSparkViewManager", "sparkView onLoadFinish");
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        switch (this.$t) {
            case 0:
                LJLIIL$0(this, interfaceC1541990qEH, str);
                break;
            case 1:
            default:
                super.LJLIIL(interfaceC1541990qEH, str);
                break;
            case 2:
                LJLIIL$1(this, interfaceC1541990qEH, str);
                break;
            case 3:
                LJLIIL$2(this, interfaceC1541990qEH, str);
                break;
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLJLLL(SparkContext sparkContext) {
        if (6 - this.$t != 0) {
            super.LJLJLLL(sparkContext);
        } else {
            LJLJLLL$0(this, sparkContext);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLL(SparkContext sparkContext) {
        if (6 - this.$t != 0) {
            super.LJLL(sparkContext);
        } else {
            LJLL$0(this, sparkContext);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLLJ(SparkContext sparkContext, C1548490qOl c1548490qOl) {
        if (5 - this.$t != 0) {
            super.LJLLJ(sparkContext, c1548490qOl);
        } else {
            LJLLJ$0(this, sparkContext, c1548490qOl);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void onDestroy() {
        if (1 - this.$t != 0) {
            super.onDestroy();
        } else {
            onDestroy$0(this);
        }
    }

    public C1151920g58(int i) {
        this.$t = i;
    }

    public static final void LJLLJ$0(C1151920g58 c1151920g58, SparkContext sparkContext, C1548490qOl c1548490qOl) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        if (c1548490qOl.LIZIZ == 2 && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1548490qOl.LIZ) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
        }
    }

    public static final void LJL$0(C1151920g58 c1151920g58, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        c1151920g58.LJLI(interfaceC1541990qEH, str, c1542120qEU.LIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sparkView onLoadFailed: ");
        sbLIZ.append(c1542120qEU.LIZ());
        C20441214yg.LJ("HammerSparkViewManager", C2188811AlT.LIZIZ(sbLIZ));
    }
}
