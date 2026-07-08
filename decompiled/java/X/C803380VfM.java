package X;

import Y.ARunnableS113S0100000_13;
import android.content.Context;
import com.bytedance.crash.npth_repair.NpthRepair;
import com.bytedance.crash.npth_repair.monitor.SignalMonitor;
import com.bytedance.crash.npth_repair.nativeCrash.ArtDumpNativeStackFixer;
import com.bytedance.crash.npth_repair.nativeCrash.DvmSuspendTimeOpt;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0VfM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803380VfM {
    public static boolean LJI = false;
    public static boolean LJII = true;
    public static C803450VfT LJIIIIZZ;
    public static final C803530Vfb LJIIIZ = new InterfaceC803680Vfq() { // from class: X.0Vfb
        @Override // X.InterfaceC803680Vfq
        public final int LIZ(int i) {
            if (C803380VfM.LJI || (C803380VfM.LJII && (i & 1) != 0)) {
                return ArtDumpNativeStackFixer.LIZ();
            }
            return -1;
        }
    };
    public static final C803570Vff LJIIJ = new InterfaceC803680Vfq() { // from class: X.0Vff
        @Override // X.InterfaceC803680Vfq
        public final int LIZ(int i) {
            if ((i & 2) != 0) {
                return DvmSuspendTimeOpt.LIZ();
            }
            return -1;
        }
    };
    public static final C803430VfR LJIIJJI = new InterfaceC803680Vfq() { // from class: X.0VfR
        @Override // X.InterfaceC803680Vfq
        public final int LIZ(int i) {
            if ((i & 4) != 0) {
                return SignalMonitor.LIZIZ().LIZJ(C803380VfM.LJIIIIZZ.LIZLLL);
            }
            return -1;
        }
    };
    public boolean LIZ;
    public int LIZIZ = -1;
    public ArrayList<InterfaceC803680Vfq> LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;

    public final void LIZ() {
        C803450VfT c803450VfT = LJIIIIZZ;
        this.LIZLLL = c803450VfT.LIZIZ;
        this.LJ = c803450VfT.LIZ;
        this.LJFF = c803450VfT.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" debug: ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(" delayedTime: ");
        sbLIZ.append(this.LJ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LIZ) {
            this.LIZ = true;
            boolean z = this.LJFF;
            Context contextLJ = C0VX9.LJ();
            int iLIZ = contextLJ != null ? NpthRepair.LIZ(contextLJ, z) : -7;
            this.LIZIZ = iLIZ;
            if (iLIZ != 0) {
                return;
            }
            ArrayList<InterfaceC803680Vfq> arrayList = new ArrayList<>();
            this.LIZJ = arrayList;
            arrayList.add(LJIIIZ);
            this.LIZJ.add(LJIIJ);
            this.LIZJ.add(LJIIJJI);
        } else if (this.LIZIZ != 0) {
            return;
        }
        C0VXF.postDelayed(new ARunnableS113S0100000_13(this, 251), this.LJ);
    }
}
