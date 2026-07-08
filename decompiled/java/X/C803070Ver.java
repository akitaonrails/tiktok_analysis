package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.crash.resource.NativeResourceMonitor;

/* JADX INFO: renamed from: X.0Ver, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803070Ver extends AbstractC802540Ve0 {
    public static C803070Ver LJIIL;
    public int LJII;
    public boolean LJIIIIZZ;
    public final boolean LJIIIZ = true;
    public boolean LJIIJ;
    public C803000Vek LJIIJJI;

    @Override // X.AbstractC802540Ve0
    public final boolean LIZJ() {
        this.LJII = 0;
        this.LJIIJ = false;
        return true;
    }

    @Override // X.AbstractC802540Ve0
    public final void LIZIZ() {
        if (this.LJIIIIZZ) {
            return;
        }
        if (this.LJII != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("execute() Invalide state ");
            sbLIZ.append(LJFF());
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        this.LJIIIIZZ = true;
        boolean z = this.LJIIIZ;
        int iLJFF = NativeResourceMonitor.LJFF(0);
        if (iLJFF == 0) {
            this.LJII = 1;
            new BPEAThread() { // from class: X.0Veo
                /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0060 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0002 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZJ() {
                    /*
                        Method dump skipped, instruction units count: 406
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C803040Veo.LIZJ():void");
                }

                @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("NativeHeapTrackAdapter@36d7.executeMonitor$1");
                    boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                    try {
                        LIZJ();
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("NativeHeapTrackAdapter@36d7.executeMonitor$1");
                }

                {
                    super("NativeHeapTracker");
                }
            }.start();
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initNative failed ret:");
            sbLIZ2.append(iLJFF);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public final String LJFF() {
        switch (this.LJII) {
            case 0:
                return "[STATE_INIT]";
            case 1:
                return "[STATE_PREPARE]";
            case 2:
                return "[STATE_OBSERV]";
            case 3:
                return "[STATE_TRACK]";
            case 4:
                return "[STATE_WAIT]";
            case 5:
                return "[STATE_TRACING]";
            case 6:
                return "[STATE_EXIT]";
            default:
                return "[STATE_UNKNOWN]";
        }
    }

    public final void LJI() {
        boolean z = this.LJIIIZ;
        int iLJFF = NativeResourceMonitor.LJFF(1);
        if (iLJFF != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trackNative ret=");
            sbLIZ.append(iLJFF);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LJIIJ = true;
        }
    }
}
