package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EHW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EHW {
    public ArrayList<C361980EHc> LIZ = new ArrayList<>();
    public final C361980EHc LIZIZ;
    public int LIZJ;

    public C0EHW() {
        C361970EHb c361970EHb = new C361970EHb();
        c361970EHb.LJ = "root_item";
        this.LIZIZ = c361970EHb.LIZ();
    }

    public final C361980EHc LIZ(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.offer(this.LIZIZ);
        while (!linkedList.isEmpty()) {
            C361980EHc c361980EHc = (C361980EHc) linkedList.poll();
            if (!TextUtils.equals(str, c361980EHc.LJI)) {
                Iterator it2 = ((ArrayList) c361980EHc.LIZ).iterator();
                while (it2.hasNext()) {
                    linkedList.offer(it2.next());
                }
                Iterator it3 = ((ArrayList) c361980EHc.LJIILL).iterator();
                while (it3.hasNext()) {
                    linkedList.offer(it3.next());
                }
            } else {
                return c361980EHc;
            }
        }
        return null;
    }

    public final int LIZJ(C361980EHc c361980EHc) {
        if (Intrinsics.LJFF(c361980EHc, this.LIZIZ)) {
            return this.LIZJ;
        }
        C361980EHc c361980EHcLIZIZ = c361980EHc.LIZIZ;
        if ((!(c361980EHcLIZIZ instanceof C361980EHc) || c361980EHcLIZIZ == null) && (c361980EHcLIZIZ = LIZIZ(this.LIZIZ, c361980EHc)) == null) {
            return this.LIZJ;
        }
        this.LIZJ++;
        return LIZJ(c361980EHcLIZIZ);
    }

    public static C361980EHc LIZIZ(C361980EHc c361980EHc, C361980EHc c361980EHc2) {
        if (((ArrayList) c361980EHc.LIZ).contains(c361980EHc2)) {
            return c361980EHc;
        }
        Iterator it2 = ((ArrayList) c361980EHc.LIZ).iterator();
        while (it2.hasNext()) {
            C361980EHc c361980EHcLIZIZ = LIZIZ((C361980EHc) it2.next(), c361980EHc2);
            if (c361980EHcLIZIZ != null) {
                return c361980EHcLIZIZ;
            }
        }
        return null;
    }
}
