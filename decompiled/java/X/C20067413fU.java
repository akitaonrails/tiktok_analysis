package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.13fU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20067413fU {
    public final C20066713fN<C20066813fO> LIZ;
    public final C20067813fY LIZIZ;
    public boolean LIZJ;

    public final boolean LIZ(long j) {
        Object obj;
        List<C20066913fP> list = this.LIZIZ.LIZ;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = ListProtector.get(list, i);
                if (C05U1.LIZ(((C20066913fP) obj).LIZ, j)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        C20066913fP c20066913fP = (C20066913fP) obj;
        if (c20066913fP == null) {
            return false;
        }
        return c20066913fP.LJII;
    }

    public C20067413fU(C20066713fN<C20066813fO> c20066713fN, C20067813fY c20067813fY) {
        this.LIZ = c20066713fN;
        this.LIZIZ = c20067813fY;
    }
}
