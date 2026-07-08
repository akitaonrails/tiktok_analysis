package X;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0f4V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1113090f4V implements InterfaceC1113260f4m {
    public final double LIZ;
    public int LIZJ;
    public boolean LJ;
    public final Map<Integer, C1113280f4o> LIZIZ = new LinkedHashMap();
    public final C1113270f4n LIZLLL = new C1113270f4n();

    @Override // X.InterfaceC1113260f4m
    public final void start() {
        this.LJ = new SecureRandom().nextDouble() > this.LIZ;
    }

    public AbstractC1113090f4V(double d) {
        this.LIZ = d;
    }

    @Override // X.InterfaceC1113260f4m
    public final void LIZ(Map<String, String> map) {
        float f;
        if (this.LJ) {
            return;
        }
        Collection collectionValues = ((LinkedHashMap) this.LIZIZ).values();
        ArrayList<C1113280f4o> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            C1113280f4o c1113280f4o = (C1113280f4o) obj;
            if (((int) (c1113280f4o.LIZIZ - c1113280f4o.LIZ)) > 0) {
                arrayList.add(obj);
            }
        }
        long j = 0;
        float f2 = 0.0f;
        for (C1113280f4o c1113280f4o2 : arrayList) {
            f2 += 1.0f;
            int i = (int) (c1113280f4o2.LIZIZ - c1113280f4o2.LIZ);
            j += (long) i;
            C1113270f4n c1113270f4n = this.LIZLLL;
            c1113270f4n.LIZIZ = Math.max(i, c1113270f4n.LIZIZ);
            C1113270f4n c1113270f4n2 = this.LIZLLL;
            c1113270f4n2.LIZJ = Math.min(i, c1113270f4n2.LIZJ);
        }
        C1113270f4n c1113270f4n3 = this.LIZLLL;
        if (f2 == 0.0f) {
            f = 0.0f;
        } else {
            f = j / f2;
        }
        c1113270f4n3.LIZ = f;
        ((C1113170f4d) this).LIZIZ(map);
        C1113270f4n c1113270f4n4 = this.LIZLLL;
        c1113270f4n4.LIZ = 0.0f;
        c1113270f4n4.LIZJ = Integer.MAX_VALUE;
        c1113270f4n4.LIZIZ = 0;
        ((LinkedHashMap) this.LIZIZ).clear();
        this.LJ = false;
    }
}
