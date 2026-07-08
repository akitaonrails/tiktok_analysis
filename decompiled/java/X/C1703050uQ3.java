package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uQ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703050uQ3 {
    public static final HashMap<String, C1703050uQ3> LJIIJ = new HashMap<>();
    public final String LIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public AnonymousClass0956 LJIIIIZZ;
    public final C054G LJIIIZ;
    public long LIZIZ = -1;
    public final List<Function1<Long, Unit>> LJI = new ArrayList();
    public long LJII = 1000;

    public final void LIZ() {
        long j;
        long j2 = this.LIZLLL;
        long j3 = this.LJ;
        if (j2 < j3) {
            j = j3 - j2;
        } else {
            long j4 = this.LJFF;
            j = (j3 > j2 || j2 >= j4) ? 0L : j4 - j2;
        }
        this.LIZIZ = j;
        Iterator<Function1<Long, Unit>> it2 = this.LJI.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Long.valueOf(this.LIZIZ));
        }
    }

    public C1703050uQ3(String str) {
        this.LIZ = str;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJIIIZ = C2296808zG.LIZ(C2107308Nj.LIZ);
    }
}
