package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.125F, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C125F {
    public static C125F LIZJ;
    public final List<C125I> LIZ;
    public int LIZIZ;

    public static C125F LIZIZ() {
        if (LIZJ == null) {
            synchronized (C125F.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C125F();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final C125I LIZ() {
        if (this.LIZIZ == ((ArrayList) this.LIZ).size()) {
            this.LIZIZ = 0;
        }
        return (C125I) ListProtector.get(this.LIZ, this.LIZIZ);
    }

    public C125F() {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        arrayList.add(new C125I(-1, new int[]{-16716612, -16745761}));
        arrayList.add(new C125I(-1, new int[]{-20071, -55717}));
        arrayList.add(new C125I(-1, new int[]{-14625300, -5938690, -119723}));
        arrayList.add(new C125I(-1, new int[]{-468142, -42147}));
        arrayList.add(new C125I(-1, new int[]{-16352892, -15726275}));
        arrayList.add(new C125I(-16777216, new int[]{-1773591, -7100977}));
        arrayList.add(new C125I(-1, new int[]{-12369085, -16777216}));
    }
}
