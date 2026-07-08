package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;

/* JADX INFO: renamed from: X.0Vet, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803090Vet extends AbstractC802540Ve0 {
    public static C803090Vet LJIIJ;
    public int LJII;
    public boolean LJIIIIZZ;
    public C803010Vel LJIIIZ;

    @Override // X.AbstractC802540Ve0
    public final void LIZIZ() {
        if (this.LJIIIIZZ || this.LJII != 0) {
            return;
        }
        this.LJII = 1;
        this.LJIIIIZZ = true;
        new BPEAThread() { // from class: X.0Ven
            /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ() {
                /*
                    Method dump skipped, instruction units count: 219
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C803030Ven.LIZJ():void");
            }

            @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("FdTrackAdapter@2e5d.executeMonitor$1");
                boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                try {
                    LIZJ();
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("FdTrackAdapter@2e5d.executeMonitor$1");
            }

            {
                super("npthFdTracker");
            }
        }.start();
    }
}
