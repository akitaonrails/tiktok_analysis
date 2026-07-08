package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361990EHd {
    public static final C361970EHb LIZ(C361980EHc c361980EHc) {
        C361970EHb c361970EHb = new C361970EHb();
        c361970EHb.LIZ = c361980EHc.LIZJ;
        c361970EHb.LIZIZ = c361980EHc.LIZLLL;
        c361970EHb.LIZLLL = new AwS549S0100000_5(c361980EHc, 1144);
        c361970EHb.LJ = c361980EHc.LJI;
        String str = c361980EHc.LJIIL;
        if (str != null) {
            c361970EHb.LJIIIIZZ = str;
        }
        if (!((ArrayList) c361980EHc.LIZ).isEmpty()) {
            List<C0EHX> list = c361980EHc.LIZ;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                if (obj instanceof C361980EHc) {
                    arrayList.add(obj);
                }
            }
            c361970EHb.LJFF = arrayList;
        }
        return c361970EHb;
    }
}
