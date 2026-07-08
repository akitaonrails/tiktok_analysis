package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0fP6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125860fP6 {
    public final long LIZ;
    public final long LIZIZ;
    public final List<C1125920fPC> LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GoalGetInfo(goalId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", expireTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", subGoals=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", challengeType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1125920fPC LIZ() {
        List<C1125920fPC> list = this.LIZJ;
        C1125920fPC c1125920fPC = null;
        if (list == null) {
            return null;
        }
        Iterator<C1125920fPC> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1125920fPC next = it2.next();
            C1125920fPC c1125920fPC2 = next;
            if (c1125920fPC2.LIZIZ <= c1125920fPC2.LIZJ) {
                c1125920fPC = next;
                break;
            }
        }
        return c1125920fPC;
    }

    public final List<C1125920fPC> LIZJ() {
        List<C1125920fPC> list = this.LIZJ;
        if (list == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (C1125920fPC c1125920fPC : list) {
            C1125920fPC c1125920fPC2 = c1125920fPC;
            if (c1125920fPC2.LIZIZ <= c1125920fPC2.LIZJ) {
                arrayList.add(c1125920fPC);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public final int LIZIZ(long j) {
        ?? arrayList;
        if (!LJFF(Long.valueOf(j))) {
            return -1;
        }
        List<C1125920fPC> list = this.LIZJ;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1125920fPC> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().LIZ));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        int iIndexOf = arrayList.indexOf(Long.valueOf(j));
        if (iIndexOf == -1) {
            return -1;
        }
        return iIndexOf + 1;
    }

    public final C1125920fPC LIZLLL(long j) {
        List<C1125920fPC> list = this.LIZJ;
        C1125920fPC c1125920fPC = null;
        if (list == null) {
            return null;
        }
        Iterator<C1125920fPC> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1125920fPC next = it2.next();
            if (next.LIZ == j) {
                c1125920fPC = next;
                break;
            }
        }
        return c1125920fPC;
    }

    public final boolean LJ(Long l) {
        List<C1125920fPC> list = this.LIZJ;
        if (list != null) {
            for (C1125920fPC c1125920fPC : list) {
                C1125920fPC c1125920fPC2 = c1125920fPC;
                long j = c1125920fPC2.LIZ;
                if (l != null && j == l.longValue() && c1125920fPC2.LIZIZ == c1125920fPC2.LIZJ) {
                    if (c1125920fPC != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean LJFF(Long l) {
        List<C1125920fPC> list = this.LIZJ;
        if (list != null) {
            for (C1125920fPC c1125920fPC : list) {
                C1125920fPC c1125920fPC2 = c1125920fPC;
                long j = c1125920fPC2.LIZ;
                if (l != null && j == l.longValue() && c1125920fPC2.LIZIZ <= c1125920fPC2.LIZJ) {
                    if (c1125920fPC != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public C1125860fP6(long j, long j2, String str, List list) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = list;
        this.LIZLLL = str;
    }
}
