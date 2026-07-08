package X;

import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.TemplateBundle;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0qLE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546300qLE {
    public static C1546340qLI LIZIZ(String str) {
        boolean z = true;
        String str2 = null;
        if (C1155800gBO.LIZJ()) {
            C1546400qLO.LIZ.getClass();
            C1537480q70 c1537480q70 = (C1537480q70) ((ConcurrentHashMap) C1546400qLO.LIZJ.getValue()).get(str);
            if (c1537480q70 != null) {
                if (c1537480q70.LJFF(TemplateBundle.class) == null) {
                    z = false;
                }
                C1536830q5x c1536830q5x = (C1536830q5x) c1537480q70.LJFF(C1536830q5x.class);
                if (c1536830q5x != null) {
                    str2 = c1536830q5x.LIZ;
                }
                return new C1546340qLI(str2, z);
            }
        } else {
            C1546390qLN.LIZ.getClass();
            C1537480q70 c1537480q702 = (C1537480q70) ((ConcurrentHashMap) C1546390qLN.LJIIIZ.getValue()).get(str);
            if (c1537480q702 != null) {
                if (c1537480q702.LJFF(TemplateBundle.class) == null) {
                    z = false;
                }
                C1536830q5x c1536830q5x2 = (C1536830q5x) c1537480q702.LJFF(C1536830q5x.class);
                if (c1536830q5x2 != null) {
                    str2 = c1536830q5x2.LIZ;
                }
                return new C1546340qLI(str2, z);
            }
        }
        return null;
    }

    public static SparkContext LIZ(String str, ViewGroup viewGroup) {
        C1538590q8n c1538590q8n = new C1538590q8n();
        c1538590q8n.LIZLLL = false;
        c1538590q8n.LJ = false;
        c1538590q8n.LJFF = false;
        c1538590q8n.LJI = false;
        SparkContext sparkContextLIZJ = C1538140q84.LIZ.LIZJ(str, c1538590q8n);
        if (viewGroup != null) {
            sparkContextLIZJ.LJJ(InterfaceC1538610q8p.class, new C21395118o9(viewGroup));
        }
        return sparkContextLIZJ;
    }
}
