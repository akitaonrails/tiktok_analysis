package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.videoarch.liveplayer.VideoLiveManager;

/* JADX INFO: renamed from: X.0ooc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1487640ooc extends AbstractC1469000oKY {
    public InterfaceC1467950oIr LIZLLL;
    public VideoLiveManager LJ;
    public VideoLiveManager LJFF;
    public final Object LJI = new Object();
    public EnumC1487700ooi LJII = EnumC1487700ooi.IDLE;
    public EnumC1487710ooj LJIIIIZZ = EnumC1487710ooj.IDLE;
    public EnumC1487690ooh LJIIIZ = EnumC1487690ooh.IDLE;

    public final EnumC1487700ooi LJIIIZ() {
        EnumC1487700ooi enumC1487700ooi;
        synchronized (this.LJI) {
            try {
                enumC1487700ooi = this.LJII;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return enumC1487700ooi;
    }

    public final void LJIIJ(EnumC1487700ooi enumC1487700ooi) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPrepareFlvStatus:");
        sbLIZ.append(enumC1487700ooi);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        synchronized (this.LJI) {
            try {
                this.LJII = enumC1487700ooi;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
