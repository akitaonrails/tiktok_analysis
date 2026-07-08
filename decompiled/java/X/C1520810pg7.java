package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0pg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520810pg7 extends AbstractC1520800pg6 {
    public static final C1520810pg7 LIZLLL = new C1520810pg7();

    public C1520810pg7() {
        super("regex_param_bid");
    }

    @Override // X.AbstractC1520800pg6
    public final C1520610pfn LIZJ(List<String> list, EnumC1520910pgH enumC1520910pgH, boolean z) {
        String strLIZIZ;
        boolean z2 = C1520630pfp.LIZJ;
        Iterator<String> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                String next = it2.next();
                strLIZIZ = LIZIZ(next);
                if (strLIZIZ == null) {
                    strLIZIZ = C08HX.LJI(Collections.singletonList(next), C1520600pfm.LIZJ);
                    C1520810pg7 c1520810pg7 = LIZLLL;
                    if (!z2 || C1520370pfP.LIZ(strLIZIZ)) {
                        c1520810pg7.LIZ(next, strLIZIZ);
                    }
                }
                if (strLIZIZ.length() > 0) {
                    break;
                }
            } else {
                strLIZIZ = "__hybrid_default";
                break;
            }
        }
        return new C1520610pfn(strLIZIZ, this.LIZ);
    }
}
