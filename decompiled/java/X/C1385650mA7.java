package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mA7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385650mA7 {
    public final Map<String, String> LIZ;
    public final C01GW LIZIZ;
    public final List<Character> LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;

    public C1385650mA7() {
        this(null);
    }

    public C1385650mA7(Object obj) {
        this.LIZ = C2097608Jq.LJ();
        this.LIZIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1525));
        this.LIZJ = C1697810uHb.LJIIJJI(' ', ',', '_', '-', '.');
        this.LIZLLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1524));
        this.LJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1526));
    }

    public final C1369340ljo LIZ(String str, String str2, EnumC1240860iOa enumC1240860iOa) {
        Object next;
        int i = C1240870iOb.LIZ[enumC1240860iOa.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return ((C1385630mA5) this.LJ.getValue()).LIZ(str, str2);
                }
                throw new C1954807lC();
            }
            List list = (List) this.LIZLLL.getValue();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C1385640mA6) it2.next()).LIZ(str, str2));
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (((C1369340ljo) next).LIZ > 0.0d) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1369340ljo c1369340ljo = (C1369340ljo) next;
            if (c1369340ljo != null) {
                return c1369340ljo;
            }
            return new C1369340ljo(0.0d, C13BV.INSTANCE);
        }
        return ((C1385620mA4) this.LIZIZ.getValue()).LIZ(str, str2);
    }
}
