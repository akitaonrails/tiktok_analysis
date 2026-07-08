package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.13ZV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ZV {
    public static void LIZ(C13ZE c13ze, List list, InterfaceC20030213Yu interfaceC20030213Yu) {
        Object obj;
        C20030013Ys c20030013Ys;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int iLJIIJ = ((C13Z7) ListProtector.get(list, i)).LIZ;
                if (iLJIIJ < 0) {
                    iLJIIJ += c13ze.LJIIJ();
                }
                int iLJJIJL = c13ze.LJJIJL(c13ze.LJIILIIL(iLJIIJ), c13ze.LIZIZ);
                int iLJ = c13ze.LJ(c13ze.LJIILIIL(iLJIIJ + 1), c13ze.LIZIZ);
                if (iLJJIJL <= iLJJIJL && iLJJIJL < iLJ) {
                    obj = c13ze.LIZJ[c13ze.LJFF(iLJJIJL)];
                } else {
                    InterfaceC1680500tpg.LIZ.getClass();
                    obj = C1680510tph.LIZIZ;
                }
                if ((obj instanceof C20030013Ys) && (c20030013Ys = (C20030013Ys) obj) != null) {
                    c20030013Ys.LIZIZ = interfaceC20030213Yu;
                }
            }
        }
    }
}
