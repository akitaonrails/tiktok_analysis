package X;

import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0w9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1769940w9w implements InterfaceC1769890w9r {
    public final Set<Integer> LIZ = new LinkedHashSet();

    @Override // X.InterfaceC1769890w9r
    public final boolean LIZIZ(String str) {
        if (C1770030wA5.LIZ() && C1770030wA5.LIZIZ().getLynxScenes().contains(str)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1769890w9r
    public final void LIZ(SparkContext sparkContext, String str, String str2) {
        EnumC1105200erm enumC1105200ermLIZ;
        Uri uriLIZJ = C1943307jL.LIZJ(sparkContext.LJIJI());
        if (uriLIZJ != null) {
            enumC1105200ermLIZ = C1105230erp.LIZ(uriLIZJ);
        } else {
            enumC1105200ermLIZ = null;
        }
        if (enumC1105200ermLIZ != EnumC1105200erm.LYNX) {
            return;
        }
        final C1770020wA4 c1770020wA4 = new C1770020wA4();
        sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0w9x
            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                if (interfaceC1531560pxS instanceof C1537910q7h) {
                    ((C1537910q7h) interfaceC1531560pxS).LJIIIIZZ(new C1775720wJG(this.LLILLJJLI, c1770020wA4, 1));
                }
            }
        });
    }
}
