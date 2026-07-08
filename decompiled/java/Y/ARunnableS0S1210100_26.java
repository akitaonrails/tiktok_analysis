package Y;

import X.C1701210uN5;
import X.C1701250uN9;
import X.C1C7U;
import X.C201954140i;
import X.C201955140j;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C786840Utm;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import joo.f;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS0S1210100_26 implements Runnable {
    public final int $t;
    public long j4;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LargeTransaction write disk begin uuid: ");
        sbLIZ.append(this.s0);
        C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
        String str = this.s0;
        byte[] bArr = (byte[]) this.l2;
        boolean z = this.z3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        f.LJFF.LJ(str, bArr, z);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        long jCurrentTimeMillis3 = System.currentTimeMillis() - this.j4;
        Runnable runnable = (Runnable) this.l1;
        if (runnable != null) {
            runnable.run();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LargeTransaction write disk finish uuid: ");
        sbLIZ2.append(this.s0);
        sbLIZ2.append(", execute cost ");
        sbLIZ2.append(jCurrentTimeMillis3);
        sbLIZ2.append(" ms, actual execute cost ");
        sbLIZ2.append(jCurrentTimeMillis2);
        sbLIZ2.append(" ms");
        C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ2));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jCurrentTimeMillis3, "execute_cost");
        c2344009Gk.LIZLLL(jCurrentTimeMillis2, "actual_execute_cost");
        C20684815ws.LJIILLIIL("LargeTransaction", c2344009Gk.LIZ);
        ArrayList arrayList = (ArrayList) f.LJI;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            f.LJIIIIZZ.countDown();
        }
    }

    public final void LIZ$1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LargeTransaction write disk begin uuid: ");
        sbLIZ.append(this.s0);
        C786840Utm.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        String str = this.s0;
        byte[] bArr = (byte[]) this.l2;
        boolean z = this.z3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1701210uN5 c1701210uN5 = C1701250uN9.LJFF;
        ((Keva) c1701210uN5.LIZ.getValue()).storeBytesJustDisk(str, bArr);
        if (z) {
            ((Keva) c1701210uN5.LIZJ.getValue()).storeLong(str, SystemClock.uptimeMillis());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LargeTransaction save bundle uuid: ");
            sbLIZ2.append(str);
            sbLIZ2.append(" recycle policy timestamp");
            C786840Utm.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            ((Keva) c1701210uN5.LIZIZ.getValue()).storeInt(str, 1);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("LargeTransaction save bundle uuid: ");
            sbLIZ3.append(str);
            sbLIZ3.append(" recycle policy count ref");
            C786840Utm.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        long jCurrentTimeMillis3 = System.currentTimeMillis() - this.j4;
        Runnable runnable = (Runnable) this.l1;
        if (runnable != null) {
            runnable.run();
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("LargeTransaction write disk finish uuid: ");
        sbLIZ4.append(this.s0);
        sbLIZ4.append(", execute cost ");
        sbLIZ4.append(jCurrentTimeMillis3);
        sbLIZ4.append(" ms, actual execute cost ");
        sbLIZ4.append(jCurrentTimeMillis2);
        sbLIZ4.append(" ms");
        C786840Utm.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
        ArrayList arrayList = (ArrayList) C1701250uN9.LJI;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            C1701250uN9.LJIIIIZZ.countDown();
        }
    }

    public static final void run$0(ARunnableS0S1210100_26 aRunnableS0S1210100_26) {
        boolean zLIZ;
        C1C7U.LIZ("LargeTransaction@7195.writeDiskIfNecessary$runnable$1");
        try {
            aRunnableS0S1210100_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LargeTransaction@7195.writeDiskIfNecessary$runnable$1");
    }

    public static final void run$1(ARunnableS0S1210100_26 aRunnableS0S1210100_26) {
        boolean zLIZ;
        C1C7U.LIZ("LargeTransaction@30f6.writeDiskIfNecessary$runnable$1");
        try {
            aRunnableS0S1210100_26.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LargeTransaction@30f6.writeDiskIfNecessary$runnable$1");
    }

    public ARunnableS0S1210100_26(String str, long j, Runnable runnable, byte[] bArr, boolean z, int i) {
        this.$t = i;
        this.s0 = str;
        this.j4 = j;
        this.l1 = runnable;
        this.l2 = bArr;
        this.z3 = z;
    }
}
