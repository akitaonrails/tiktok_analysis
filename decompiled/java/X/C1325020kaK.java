package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.0kaK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1325020kaK {
    public final InterfaceC1324680kZm LIZ;
    public final C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> LIZIZ;
    public final LinkedHashSet<InterfaceC1324680kZm> LIZLLL = new LinkedHashSet<>();
    public final C1325060kaO LIZJ = new C1325060kaO(this);

    public final C1323050kX9<AbstractC1327750kej> LIZLLL() {
        InterfaceC1324680kZm next;
        C1323050kX9<AbstractC1327750kej> c1323050kX9LJJIIZI;
        do {
            synchronized (this) {
                Iterator<InterfaceC1324680kZm> it2 = this.LIZLLL.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    it2.remove();
                } else {
                    next = null;
                }
            }
            if (next == null) {
                return null;
            }
            try {
                c1323050kX9LJJIIZI = this.LIZIZ.LJJIIZI(next);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        } while (c1323050kX9LJJIIZI == null);
        return c1323050kX9LJJIIZI;
    }

    public void LIZIZ(final int i) {
        if (i == -1) {
            return;
        }
        this.LIZIZ.LJJIIZ(new InterfaceC1325100kaS<InterfaceC1324680kZm>() { // from class: X.0kaL
            @Override // X.InterfaceC1325100kaS
            public final boolean apply(InterfaceC1324680kZm interfaceC1324680kZm) {
                return new C1324700kZo(this.LIZIZ.LIZ, i).equals(interfaceC1324680kZm);
            }
        });
    }

    public final boolean LIZJ(int i) {
        boolean zLIZIZ;
        C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> c1329310khF = this.LIZIZ;
        C1324700kZo c1324700kZo = new C1324700kZo(this.LIZ, i);
        synchronized (c1329310khF) {
            zLIZIZ = c1329310khF.LLILLJJLI.LIZIZ(c1324700kZo);
        }
        return zLIZIZ;
    }

    public C1325020kaK(C1322470kWD c1322470kWD, C1329310khF c1329310khF) {
        this.LIZ = c1322470kWD;
        this.LIZIZ = c1329310khF;
    }

    public final C1323050kX9 LIZ(C1323050kX9 c1323050kX9, int i) {
        return this.LIZIZ.LJFF(new C1324700kZo(this.LIZ, i), c1323050kX9, this.LIZJ);
    }
}
