package X;

import com.bytedance.hybrid.spark.SparkContext;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0bNF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC970950bNF extends AbstractC1542200qEc implements InterfaceC1141530foN {
    public final Map<String, Object> LLILLJJLI = new LinkedHashMap();
    public final Map<String, String> LLILLL = new LinkedHashMap();
    public final Set<String> LLILZ = new LinkedHashSet();
    public final int LLILZIL = (int) C497740JfY.LJJI(C497740JfY.LJIIZILJ());
    public final int LLILZLL = -1;

    public abstract List<String> LJLLLL();

    public abstract String LJLLLLLL();

    public void LJLZ(SparkContext sparkContext) {
    }

    public void mh2(C262100zr c262100zr) {
    }

    @Override // X.AbstractC1537870q7d
    public void LJJZ(InterfaceC1541990qEH interfaceC1541990qEH) {
        Iterator<String> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            C1548820qPI.LJIIIIZZ(it2.next(), this);
        }
        this.LLILZ.clear();
    }

    public static void LJZ(AbstractC970950bNF abstractC970950bNF, String str, boolean z) {
        abstractC970950bNF.getClass();
        C389001fE.LIZ(str, null, System.currentTimeMillis() + 3000, z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this:");
        sbLIZ.append(abstractC970950bNF);
        sbLIZ.append(" sendEvent: ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append((Object) null);
        C20441214yg.LJIIIZ("LynxPage", C2188811AlT.LIZIZ(sbLIZ));
    }
}
