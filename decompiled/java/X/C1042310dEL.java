package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0dEL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042310dEL {
    public final CopyOnWriteArrayList<C1042320dEM> LIZ = new CopyOnWriteArrayList<>();

    public final C1042120dE2 LIZ(String str) {
        C1042320dEM next;
        Iterator<C1042320dEM> it2 = this.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C1042130dE3 c1042130dE3 = C1042130dE3.LIZ;
                String str2 = next.LIZ.LIZ;
                c1042130dE3.getClass();
                if (C1042130dE3.LJI(str, str2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1042320dEM c1042320dEM = next;
        if (c1042320dEM == null) {
            return null;
        }
        c1042320dEM.LIZIZ = System.currentTimeMillis();
        return c1042320dEM.LIZ;
    }

    public final void LIZIZ(C1042120dE2 c1042120dE2) {
        long j;
        C19719612Di.LJJIIJ(this.LIZ, new AwS595S0100000_16(c1042120dE2, 355), true);
        this.LIZ.add(new C1042320dEM(c1042120dE2, System.currentTimeMillis()));
        if (this.LIZ.size() > 10) {
            Object objLJJJLL = C13LP.LJJJLL(this.LIZ);
            for (C1042320dEM c1042320dEM : this.LIZ) {
                long j2 = c1042320dEM.LIZIZ;
                C1042320dEM c1042320dEM2 = (C1042320dEM) objLJJJLL;
                if (c1042320dEM2 != null) {
                    j = c1042320dEM2.LIZIZ;
                } else {
                    j = 0;
                }
                if (j2 < j) {
                    objLJJJLL = c1042320dEM;
                }
            }
            this.LIZ.remove(objLJJJLL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("autoRemove: ");
            sbLIZ.append(objLJJJLL);
            sbLIZ.append(" after size: ");
            sbLIZ.append(this.LIZ.size());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
