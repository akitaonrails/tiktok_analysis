package X;

import com.bytedance.hybrid.spark.SparkContext;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0dDp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041990dDp {
    public static final C1041990dDp LIZ = new C1041990dDp();
    public static final Map<String, SparkContext> LIZIZ = new LinkedHashMap();
    public static final Map<String, WeakReference<SparkContext>> LIZJ = new LinkedHashMap();
    public static final boolean LIZLLL;

    static {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
        LIZLLL = (c1538050q7v == null || c1538050q7v.getUseWeakReferenceForSparkContextTransfer()) ? false : true;
    }

    public static SparkContext LIZ(String str) {
        if (LIZLLL) {
            Map<String, WeakReference<SparkContext>> map = LIZJ;
            if (str == null) {
                str = "";
            }
            Reference reference = (Reference) ((LinkedHashMap) map).get(str);
            if (reference != null) {
                return (SparkContext) reference.get();
            }
            return null;
        }
        Map<String, SparkContext> map2 = LIZIZ;
        if (str == null) {
            str = "";
        }
        return (SparkContext) ((LinkedHashMap) map2).get(str);
    }

    public static void LIZIZ(String str) {
        if (LIZLLL) {
            Map<String, WeakReference<SparkContext>> map = LIZJ;
            if (str == null) {
                str = "";
            }
            map.remove(str);
            return;
        }
        Map<String, SparkContext> map2 = LIZIZ;
        if (str == null) {
            str = "";
        }
        map2.remove(str);
    }

    public static void LIZJ(SparkContext sparkContext) {
        if (LIZLLL) {
            LIZJ.put(sparkContext.containerId, new WeakReference<>(sparkContext));
        } else {
            LIZIZ.put(sparkContext.containerId, sparkContext);
        }
    }
}
