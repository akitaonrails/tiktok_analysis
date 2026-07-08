package X;

import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.autoservice.ISparkInnerJSInjectService;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.lynx.tasm.LynxView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0qYU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1554520qYU extends AbstractC1542200qEc {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1537870q7d
    public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        if (7 - this.$t != 0) {
            super.LJJZZIII(interfaceC1541990qEH, str);
        } else {
            LJJZZIII$0(this, interfaceC1541990qEH, str);
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
    public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        switch (this.$t) {
            case 5:
                LJLI$0(this, interfaceC1541990qEH, str, str2);
                break;
            case 6:
            default:
                super.LJLI(interfaceC1541990qEH, str, str2);
                break;
            case 7:
                LJLI$1(this, interfaceC1541990qEH, str, str2);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 3:
                LJLIIIL$0(this, interfaceC1541990qEH);
                break;
            case 4:
            case 5:
            case 6:
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
            case 7:
                LJLIIIL$1(this, interfaceC1541990qEH);
                break;
            case 8:
                LJLIIIL$2(this, interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        switch (this.$t) {
            case 3:
                LJLIIL$0(this, interfaceC1541990qEH, str);
                break;
            case 4:
            case 5:
            case 6:
            default:
                super.LJLIIL(interfaceC1541990qEH, str);
                break;
            case 7:
                LJLIIL$1(this, interfaceC1541990qEH, str);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 2:
                LJLJI$0(this, interfaceC1541990qEH);
                break;
            case 3:
                LJLJI$1(this, interfaceC1541990qEH);
                break;
            default:
                super.LJLJI(interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJJI() {
        switch (this.$t) {
            case 3:
                LJLJJI$0(this);
                break;
            case 4:
                LJLJJI$1(this);
                break;
            case 5:
            case 6:
            default:
                super.LJLJJI();
                break;
            case 7:
                LJLJJI$2(this);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJJL(String str, byte[] bArr) {
        if (3 - this.$t != 0) {
            super.LJLJJL(str, bArr);
        } else {
            LJLJJL$0(this, str, bArr);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLLJ(SparkContext sparkContext, C1548490qOl c1548490qOl) {
        switch (this.$t) {
            case 0:
                LJLLJ$0(this, sparkContext, c1548490qOl);
                break;
            case 1:
                LJLLJ$1(this, sparkContext, c1548490qOl);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                super.LJLLJ(sparkContext, c1548490qOl);
                break;
            case 6:
                LJLLJ$2(this, sparkContext, c1548490qOl);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void onDestroy() {
        if (7 - this.$t != 0) {
            super.onDestroy();
        } else {
            onDestroy$0(this);
        }
    }

    public static final void LJLJJI$0(C1554520qYU c1554520qYU) {
        C1523590pkb c1523590pkb = C1523590pkb.LIZ;
        C1523630pkf c1523630pkf = (C1523630pkf) c1554520qYU.l0;
        Uri uri = c1523630pkf.LLILLJJLI;
        String str = c1523630pkf.LLILLL;
        c1523590pkb.getClass();
        C1523590pkb.LIZLLL(uri, str, "container_create_start", false, null, false);
    }

    public static final void LJLJJI$1(C1554520qYU c1554520qYU) {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = ((SparkContext) c1554520qYU.l0).LJJIJLIJ();
        if (interfaceC1059280dfiLJJIJLIJ != null) {
            interfaceC1059280dfiLJJIJLIJ.close();
        }
    }

    public static final void LJLJJI$2(C1554520qYU c1554520qYU) {
        ((C1536330q59) c1554520qYU.l0).getClass();
    }

    public static final void onDestroy$0(C1554520qYU c1554520qYU) {
        ((C1536330q59) c1554520qYU.l0).onDestroy();
    }

    public C1554520qYU(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIIL$0(C1554520qYU c1554520qYU, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1523590pkb c1523590pkb = C1523590pkb.LIZ;
        C1523630pkf c1523630pkf = (C1523630pkf) c1554520qYU.l0;
        Uri uri = c1523630pkf.LLILLJJLI;
        String str = c1523630pkf.LLILLL;
        c1523590pkb.getClass();
        C1523590pkb.LIZLLL(uri, str, "load_template_end", false, null, false);
    }

    public static final void LJLIIIL$1(C1554520qYU c1554520qYU, InterfaceC1541990qEH interfaceC1541990qEH) {
        ((C1536330q59) c1554520qYU.l0).LJLIIIL(interfaceC1541990qEH);
    }

    public static final void LJLIIIL$2(C1554520qYU c1554520qYU, InterfaceC1541990qEH interfaceC1541990qEH) {
        InterfaceC1892990zMP interfaceC1892990zMP;
        InterfaceC1892990zMP interfaceC1892990zMP2;
        InterfaceC1892990zMP interfaceC1892990zMP3;
        if (interfaceC1541990qEH instanceof WebKitView) {
            if (((WebKitView) interfaceC1541990qEH).canGoBack()) {
                WeakReference<InterfaceC1892990zMP> weakReference = ((C1548240qOM) c1554520qYU.l0).LIZIZ;
                if (weakReference != null && (interfaceC1892990zMP3 = weakReference.get()) != null) {
                    interfaceC1892990zMP3.LJJJJ(true);
                    return;
                }
                return;
            }
            WeakReference<InterfaceC1892990zMP> weakReference2 = ((C1548240qOM) c1554520qYU.l0).LIZIZ;
            if (weakReference2 == null || (interfaceC1892990zMP2 = weakReference2.get()) == null) {
                return;
            }
            interfaceC1892990zMP2.LJJJJ(false);
            return;
        }
        WeakReference<InterfaceC1892990zMP> weakReference3 = ((C1548240qOM) c1554520qYU.l0).LIZIZ;
        if (weakReference3 == null || (interfaceC1892990zMP = weakReference3.get()) == null) {
            return;
        }
        interfaceC1892990zMP.LJJJJ(false);
    }

    public static final void LJLJI$0(C1554520qYU c1554520qYU, InterfaceC1541990qEH interfaceC1541990qEH) {
        SparkSchemaParam sparkSchemaParam = ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) c1554520qYU.l0).LLJJJ;
        if (sparkSchemaParam != null) {
            C587540N2q.LIZ.getClass();
            ISparkInnerJSInjectService iSparkInnerJSInjectService = (ISparkInnerJSInjectService) C587540N2q.LIZ(ISparkInnerJSInjectService.class);
            if (iSparkInnerJSInjectService != null) {
                iSparkInnerJSInjectService.preload(interfaceC1541990qEH, sparkSchemaParam);
            }
        }
    }

    public static final void LJLJI$1(C1554520qYU c1554520qYU, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1523590pkb c1523590pkb = C1523590pkb.LIZ;
        C1523630pkf c1523630pkf = (C1523630pkf) c1554520qYU.l0;
        Uri uri = c1523630pkf.LLILLJJLI;
        String str = c1523630pkf.LLILLL;
        c1523590pkb.getClass();
        C1523590pkb.LIZLLL(uri, str, "container_create_end", false, null, false);
        ((C1523630pkf) c1554520qYU.l0).LJLLLL(interfaceC1541990qEH);
    }

    public static final void LJJZZIII$0(C1554520qYU c1554520qYU, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        ((C1536330q59) c1554520qYU.l0).getClass();
    }

    public static final void LJLIIL$0(C1554520qYU c1554520qYU, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C1523590pkb c1523590pkb = C1523590pkb.LIZ;
        C1523630pkf c1523630pkf = (C1523630pkf) c1554520qYU.l0;
        Uri uri = c1523630pkf.LLILLJJLI;
        String str2 = c1523630pkf.LLILLL;
        c1523590pkb.getClass();
        C1523590pkb.LIZLLL(uri, str2, "spark_fragment_view_created_start", false, null, false);
    }

    public static final void LJLIIL$1(C1554520qYU c1554520qYU, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        ((C1536330q59) c1554520qYU.l0).LJLIIL(interfaceC1541990qEH, str);
    }

    public static final void LJLJJL$0(C1554520qYU c1554520qYU, String str, byte[] bArr) {
        C1523590pkb c1523590pkb = C1523590pkb.LIZ;
        C1523630pkf c1523630pkf = (C1523630pkf) c1554520qYU.l0;
        Uri uri = c1523630pkf.LLILLJJLI;
        String str2 = c1523630pkf.LLILLL;
        c1523590pkb.getClass();
        C1523590pkb.LIZLLL(uri, str2, "load_template_start", false, null, false);
    }

    public static final void LJLLJ$0(C1554520qYU c1554520qYU, SparkContext sparkContext, C1548490qOl c1548490qOl) {
        InterfaceC1541990qEH kitView;
        C1549850qQx c1549850qQx = (C1549850qQx) c1554520qYU.l0;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1548490qOl.LIZ;
        InterfaceC1541990qEH interfaceC1541990qEH = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
        } else {
            kitView = null;
        }
        if (kitView instanceof WebKitView) {
            interfaceC1541990qEH = kitView;
        }
        c1549850qQx.LLIZ = new WeakReference<>(interfaceC1541990qEH);
    }

    public static final void LJLLJ$1(C1554520qYU c1554520qYU, SparkContext sparkContext, C1548490qOl c1548490qOl) {
        InterfaceC1541990qEH kitView;
        C1549840qQw c1549840qQw = (C1549840qQw) c1554520qYU.l0;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1548490qOl.LIZ;
        InterfaceC1541990qEH interfaceC1541990qEH = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
        } else {
            kitView = null;
        }
        if (kitView instanceof WebKitView) {
            interfaceC1541990qEH = kitView;
        }
        c1549840qQw.LLIZ = new WeakReference<>(interfaceC1541990qEH);
    }

    public static final void LJLLJ$2(C1554520qYU c1554520qYU, SparkContext sparkContext, C1548490qOl c1548490qOl) {
        LynxView lynxView;
        if (c1548490qOl.LIZIZ == 2 && ((C1548440qOg) c1554520qYU.l0).LJFF == EnumC1548460qOi.SPARK_PRELOAD_PENDING_RUNTIME) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1548490qOl.LIZ;
            Object kitView = null;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
            }
            if ((kitView instanceof C1537710q7N) && (lynxView = (LynxView) kitView) != null) {
                lynxView.startLynxRuntime();
            }
        }
    }

    public static final void LJL$0(C1554520qYU c1554520qYU, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        C1536330q59 c1536330q59 = (C1536330q59) c1554520qYU.l0;
        c1536330q59.getClass();
        c1536330q59.LJLI(interfaceC1541990qEH, str, c1542120qEU.LIZIZ);
    }

    public static final void LJLI$0(C1554520qYU c1554520qYU, InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        C1540890qCV c1540890qCV = (C1540890qCV) c1554520qYU.l0;
        c1540890qCV.LIZ.LJIIIZ(EnumC1541150qCv.TASK_FAILED);
    }

    public static final void LJLI$1(C1554520qYU c1554520qYU, InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        ((C1536330q59) c1554520qYU.l0).LJJZZIII(interfaceC1541990qEH, str);
    }
}
