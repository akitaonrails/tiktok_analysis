package Y;

import X.AbstractC21342018fa;
import X.C1891380zJo;
import X.C1891440zJu;
import X.C1C7U;
import X.C21341918fZ;
import X.C21342318fd;
import X.C259800zU;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes29.dex */
public class ARunnableS0S0511000_28 implements Runnable {
    public final int $t;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((C1891380zJo) this.l0).LJI == this.i6) {
            if (this.z5) {
                C1891380zJo c1891380zJo = (C1891380zJo) this.l0;
                ArrayList arrayList = (ArrayList) this.l1;
                c1891380zJo.getClass();
                ArrayList<Integer> arrayListLIZ = C1891380zJo.LIZ(arrayList);
                C1891380zJo c1891380zJo2 = (C1891380zJo) this.l0;
                ArrayList arrayList2 = (ArrayList) this.l1;
                synchronized (c1891380zJo2) {
                    try {
                        c1891380zJo2.LJII = arrayList2;
                        c1891380zJo2.LJIIIIZZ = arrayListLIZ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } else {
                C1891380zJo c1891380zJo3 = (C1891380zJo) this.l0;
                ArrayList arrayList3 = (ArrayList) this.l1;
                synchronized (c1891380zJo3) {
                    try {
                        c1891380zJo3.LJII = arrayList3;
                        c1891380zJo3.LJIIIIZZ = C1891380zJo.LIZ(arrayList3);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }
            ((C1891380zJo) this.l0).LIZLLL((C21341918fZ) this.l2, (C1891440zJu) this.l3, (List) ((C259800zU) this.l4).element, (ArrayList) this.l1);
        }
    }

    public final void LIZ$1() {
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ((AbstractC21342018fa) this.l0, true);
        (((C1891440zJu) this.l1).LIZLLL ? (Executor) ((C1891380zJo) this.l2).LJIIL.getValue() : (Executor) ((C1891380zJo) this.l2).LJIIIZ.getValue()).execute(new ARunnableS0S0511000_28((C1891380zJo) this.l2, (ArrayList) this.l3, c21341918fZLIZ, this.i6, this.z5, (C1891440zJu) this.l1, (C259800zU) this.l4, 0));
    }

    public static final void run$0(ARunnableS0S0511000_28 aRunnableS0S0511000_28) {
        boolean zLIZ;
        C1C7U.LIZ("PowerDiffer@9633.notifyDiffer$3$1$1");
        try {
            aRunnableS0S0511000_28.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PowerDiffer@9633.notifyDiffer$3$1$1");
    }

    public static final void run$1(ARunnableS0S0511000_28 aRunnableS0S0511000_28) {
        boolean zLIZ;
        C1C7U.LIZ("PowerDiffer@9633.notifyDiffer$3$1");
        try {
            aRunnableS0S0511000_28.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PowerDiffer@9633.notifyDiffer$3$1");
    }

    public ARunnableS0S0511000_28(Object obj, Object obj2, Object obj3, int i, boolean z, Object obj4, Object obj5, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i6 = i;
        this.z5 = z;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
