package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AsI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193041AsI {
    public final List<C2193061AsK> LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final C2193061AsK LIZJ() {
        CopyOnWriteArrayList<C12E4> copyOnWriteArrayList = C12E5.LIZ;
        C2193061AsK c2193061AsK = (C2193061AsK) C13LP.LJJJLL(LIZIZ());
        for (C12E4 c12e4 : copyOnWriteArrayList) {
            if (c2193061AsK != null && Intrinsics.LJFF(c12e4.LJFF(), c2193061AsK.LIZ.LJIIZILJ) && Intrinsics.LJFF(c12e4.LIZLLL(c2193061AsK.LIZ, C2193081AsM.LJIILIIL, null), Boolean.FALSE)) {
                c2193061AsK.LJ = true;
                C2193061AsK.LJIIIIZZ.add(Integer.valueOf(c2193061AsK.LIZ.hashCode()));
            }
        }
        return (C2193061AsK) C13LP.LJJJLL(LIZIZ());
    }

    public final C2159008d2 LIZ() {
        int size = LIZIZ().size();
        Long lValueOf = Long.valueOf(this.LIZIZ);
        lValueOf.longValue();
        boolean z = true;
        if (size <= 0) {
            lValueOf = null;
            if (size == 0) {
                z = false;
            }
        }
        return new C2159008d2(size, z, lValueOf, 8);
    }

    public final List<C2193061AsK> LIZIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get valid banners, now: ");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", expire time: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", compare: ");
        sbLIZ.append(this.LIZIZ > jCurrentTimeMillis);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZIZ <= jCurrentTimeMillis) {
            return C13BV.INSTANCE;
        }
        List<C2193061AsK> list = this.LIZ;
        ArrayList arrayList = new ArrayList();
        for (C2193061AsK c2193061AsK : list) {
            C2193061AsK c2193061AsK2 = c2193061AsK;
            if (!c2193061AsK2.LIZIZ && !c2193061AsK2.LIZJ && !c2193061AsK2.LIZLLL && !c2193061AsK2.LJ) {
                arrayList.add(c2193061AsK);
            }
        }
        return arrayList;
    }

    public C2193041AsI(long j, int i, int i2, int i3, List list) {
        this.LIZ = list;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
    }
}
