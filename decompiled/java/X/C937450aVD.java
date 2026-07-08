package X;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0aVD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937450aVD {
    public static final /* synthetic */ int LIZJ = 0;
    public EnumC1998407sE LIZ = EnumC1998407sE.NORMAL;
    public final Map<C0N5J, Integer> LIZIZ = new EnumMap(C0N5J.class);

    public final int LIZ() {
        Iterator it2 = ((EnumMap) this.LIZIZ).entrySet().iterator();
        if (!it2.hasNext()) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(((Number) ((Map.Entry) it2.next()).getValue()).intValue());
        while (it2.hasNext()) {
            Integer numValueOf2 = Integer.valueOf(((Number) ((Map.Entry) it2.next()).getValue()).intValue());
            if (numValueOf.compareTo(numValueOf2) < 0) {
                numValueOf = numValueOf2;
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
