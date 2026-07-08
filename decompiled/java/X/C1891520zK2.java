package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.promote.model.OptimizationData;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS326S0000000_1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0zK2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891520zK2 {
    public static final C1891520zK2 LIZ = new C1891520zK2();
    public static String LIZIZ;
    public static volatile boolean LIZJ;
    public static String LIZLLL;

    public static void LIZ(final String str) {
        C1537480q70 c1537480q70;
        if (LIZJ) {
            return;
        }
        C1529880puk c1529880puk = SparkContext.Companion;
        String str2 = LIZIZ;
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(str2);
        if (c1537480q70LIZIZ != null) {
            OptimizationData optimizationData = (OptimizationData) c1537480q70LIZIZ.LJFF(OptimizationData.class);
            c1537480q70 = c1537480q70LIZIZ;
            if (optimizationData != null) {
                c1537480q70 = c1537480q70LIZIZ;
                if (Intrinsics.LJFF(optimizationData.getPreCreate(), Boolean.TRUE)) {
                    return;
                }
            }
        } else {
            LIZJ = false;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str);
            sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0zK3
                public final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);

                @Override // X.AbstractC1537870q7d
                public final void LJJZ(InterfaceC1541990qEH interfaceC1541990qEH) {
                    if (this.LLILLJJLI.compareAndSet(false, true) && !C1891520zK2.LIZJ) {
                        C1891520zK2 c1891520zK2 = C1891520zK2.LIZ;
                        String str3 = str;
                        c1891520zK2.getClass();
                        C1891520zK2.LIZ(str3);
                    }
                }

                @Override // X.AbstractC1542100qES
                public final void LJLLJ(SparkContext sparkContext2, C1548490qOl c1548490qOl) throws JSONException {
                    String str3;
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
                    if (c1548490qOl.LIZIZ == 2 && (str3 = C1891520zK2.LIZLLL) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1548490qOl.LIZ) != null) {
                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJLIJ(null, str3, true);
                    }
                }
            });
            sparkContext.LJJ(OptimizationData.class, new OptimizationData(null, Boolean.FALSE, Boolean.TRUE));
            LIZIZ = sparkContext.containerId;
            c1537480q70 = sparkContext;
        }
        C1537060q6K.LJIIJJI(C1529590puH.LIZ, str, "tiktok_promote_spark_biz", c1537480q70, null, false, null, 40);
    }

    public static void LIZIZ(boolean z) {
        C1529880puk c1529880puk = SparkContext.Companion;
        String str = LIZIZ;
        c1529880puk.getClass();
        if (C1529880puk.LIZIZ(str) != null) {
            return;
        }
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1097680efe c1097680efe = new C1097680efe();
        c1097680efe.LJIIZILJ = true;
        c1097680efe.LIZ = "tiktok_promote_spark_biz";
        c1097680efe.LJ = z;
        c1097680efe.LJIJ = 1;
        c1097680efe.LJIJI = 600;
        c1097680efe.LJIIIIZZ = AnonymousClass0208.get$arr$(69);
        c1097680efe.LJIJJ = AFwS326S0000000_1.get$arr$(19);
        C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
    }
}
