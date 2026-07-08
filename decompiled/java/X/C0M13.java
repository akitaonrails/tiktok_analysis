package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M13, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0M13 {
    public final C561900M2a LIZ;

    public void LJ(EnumC562200M3e enumC562200M3e) {
    }

    public C0M13(C561900M2a c561900M2a) {
        this.LIZ = c561900M2a;
    }

    public void LIZ(List<? extends C561950M2f> list) {
        if (list.isEmpty()) {
            return;
        }
        this.LIZ.LLLFZ(list);
    }

    public void LIZIZ(List<? extends C561950M2f> list) {
        if (((ArrayList) list).isEmpty()) {
            return;
        }
        this.LIZ.LLLIILIL(list);
    }

    public void LIZJ(List<C0M0P> list) {
        if (list.isEmpty()) {
            return;
        }
        C561900M2a c561900M2a = this.LIZ;
        c561900M2a.getClass();
        for (C0M0P c0m0p : list) {
            Iterator it2 = ((ArrayList) c561900M2a.LLILLJJLI).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    C561950M2f c561950M2f = (C561950M2f) next;
                    if ((c561950M2f instanceof C0M0P) && Intrinsics.LJFF(((C0M0P) c561950M2f).LJ, c0m0p.LJ)) {
                        if (next != null) {
                            c561900M2a.LLILLL.remove(c0m0p.LJ);
                            int iIndexOf = ((ArrayList) c561900M2a.LLILLJJLI).indexOf(next);
                            if (iIndexOf >= 0) {
                                ListProtector.remove(c561900M2a.LLILLJJLI, iIndexOf);
                                c561900M2a.notifyItemRemoved(iIndexOf);
                                c561900M2a.notifyItemRangeChanged(iIndexOf, ((ArrayList) c561900M2a.LLILLJJLI).size() - iIndexOf);
                            }
                        }
                    }
                }
            }
        }
    }

    public void LIZLLL(C0M0P c0m0p) {
        this.LIZ.LLLIL(c0m0p);
    }
}
