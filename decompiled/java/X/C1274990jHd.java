package X;

import android.text.TextUtils;
import com.ss.bytertc.engine.type.LocalVideoStats;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0jHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274990jHd implements InterfaceC1275920jJ8 {
    public final C1274290jGV LIZ;
    public final C1275550jIX LIZIZ;
    public final C1274910jHV LIZJ;
    public final boolean LIZLLL;

    public final C1275630jIf LIZIZ() {
        if (!this.LIZLLL) {
            return null;
        }
        C1274290jGV c1274290jGV = this.LIZ;
        if (c1274290jGV.LJJIIJ == null) {
            c1274290jGV.LJJIIJ = new C1275630jIf();
        }
        return c1274290jGV.LJJIIJ;
    }

    public final Map<String, C1275340jIC> LIZJ() {
        Map<String, C1275340jIC> map;
        C1275550jIX c1275550jIX = this.LIZIZ;
        if (c1275550jIX == null) {
            return null;
        }
        synchronized (c1275550jIX) {
            map = c1275550jIX.LIZ;
        }
        return map;
    }

    public final void LIZLLL() {
        C1274290jGV c1274290jGV = this.LIZ;
        if (c1274290jGV != null) {
            synchronized (c1274290jGV) {
            }
        }
    }

    public final void LIZ() {
        C1275630jIf c1275630jIfLIZIZ = LIZIZ();
        if (c1275630jIfLIZIZ == null || c1275630jIfLIZIZ.LIZIZ != 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1275630jIfLIZIZ.LIZIZ = jCurrentTimeMillis;
        long j = c1275630jIfLIZIZ.LIZ;
        if (j != 0) {
            c1275630jIfLIZIZ.LIZJ = jCurrentTimeMillis - j;
        }
    }

    public C1274990jHd(C1275030jHh c1275030jHh) {
        c1275030jHh.getClass();
        this.LIZLLL = false;
        boolean z = c1275030jHh.LJJIZ;
        EnumC1275210jHz enumC1275210jHz = c1275030jHh.LJJIFFI;
        this.LIZ = new C1274290jGV(enumC1275210jHz == EnumC1275210jHz.SERVER_MIX || enumC1275210jHz == EnumC1275210jHz.NONE);
        this.LIZIZ = new C1275550jIX();
        if (z) {
            C1274910jHV c1274910jHV = new C1274910jHV();
            this.LIZJ = c1274910jHV;
            c1274910jHV.setVideoFrozenLimitMSec(c1275030jHh.LJJJJ);
        }
    }

    public final void LJFF(LocalVideoStats localVideoStats) {
        C1274290jGV c1274290jGV = this.LIZ;
        if (c1274290jGV != null) {
            synchronized (c1274290jGV) {
                double d = localVideoStats.sentFrameRate;
                float f = c1274290jGV.LJIILLIIL;
                int i = c1274290jGV.LJIILL;
                float f2 = i;
                double d2 = i + 1;
                c1274290jGV.LJIILLIIL = (float) ((d + ((double) (f * f2))) / d2);
                c1274290jGV.LJIIZILJ = (float) ((localVideoStats.encoderOutputFrameRate + ((double) (c1274290jGV.LJIIZILJ * f2))) / d2);
                if (!TextUtils.isEmpty(localVideoStats.simEncInfo)) {
                    List<Integer> list = c1274290jGV.LJIJ;
                    ArrayList<Integer> arrayList = localVideoStats.simEncWidth;
                    ArrayList arrayList2 = (ArrayList) list;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    List<Integer> list2 = c1274290jGV.LJIJI;
                    ArrayList<Integer> arrayList3 = localVideoStats.simEncHeight;
                    ArrayList arrayList4 = (ArrayList) list2;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    List<Integer> list3 = c1274290jGV.LJIJJ;
                    ArrayList<Integer> arrayList5 = localVideoStats.simEncFramerate;
                    ArrayList arrayList6 = (ArrayList) list3;
                    arrayList6.clear();
                    arrayList6.addAll(arrayList5);
                    List<Integer> list4 = c1274290jGV.LJIJJLI;
                    ArrayList<Integer> arrayList7 = localVideoStats.simEncFramerate;
                    ArrayList arrayList8 = (ArrayList) list4;
                    arrayList8.clear();
                    arrayList8.addAll(arrayList7);
                }
                c1274290jGV.LJIILL++;
                c1274290jGV.LJIL = localVideoStats.encodedFrameWidth;
                c1274290jGV.LJJ = localVideoStats.encodedFrameHeight;
                c1274290jGV.LJJI = localVideoStats.isHardwareCodec;
                c1274290jGV.LJJIFFI = localVideoStats.codecType;
            }
        }
    }

    public final void LJ(int i, int i2) {
        C1274290jGV c1274290jGV = this.LIZ;
        if (c1274290jGV != null) {
            synchronized (c1274290jGV) {
            }
        }
    }
}
