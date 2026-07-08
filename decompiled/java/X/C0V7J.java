package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0V7J, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V7J {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public volatile boolean LIZ;
    public volatile C0V5O LIZIZ;
    public C0V7P LIZJ;
    public C0V7W LIZLLL;
    public volatile boolean LJ;
    public long LJFF;
    public final C0V7O LJI = new C0V7U() { // from class: X.0V7O
        @Override // X.C0V7U, X.InterfaceC792690V7r
        public final void LIZLLL() {
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isStopWhenBackground:");
                C0V7P c0v7p = this.LIZ.LIZJ;
                sbLIZ.append(c0v7p != null && c0v7p.LIZJ);
                C792910V8n.LIZ("APM-Memory", C2188811AlT.LIZIZ(sbLIZ));
            }
            C0V7J c0v7j = this.LIZ;
            C0V7P c0v7p2 = c0v7j.LIZJ;
            if (c0v7p2 == null || !c0v7p2.LIZJ) {
                return;
            }
            c0v7j.LIZ();
        }

        @Override // X.C0V7U, X.InterfaceC792690V7r
        public final void onBackground() {
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isStopWhenBackground:");
                C0V7P c0v7p = this.LIZ.LIZJ;
                sbLIZ.append(c0v7p != null && c0v7p.LIZJ);
                C792910V8n.LIZ("APM-Memory", C2188811AlT.LIZIZ(sbLIZ));
            }
            C0V7J c0v7j = this.LIZ;
            C0V7P c0v7p2 = c0v7j.LIZJ;
            if (c0v7p2 == null || !c0v7p2.LIZJ) {
                return;
            }
            c0v7j.LIZIZ();
        }
    };
    public final List<C0V7Y> LJII = new CopyOnWriteArrayList();

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0V7W] */
    public final synchronized void LIZ() {
        if (!this.LJ) {
            this.LJ = true;
            if (C792190V5t.LIZ()) {
                C792910V8n.LIZ("APM-Memory", "start");
            }
            if (this.LIZLLL == null) {
                if (C792190V5t.LIZ()) {
                    C792910V8n.LIZ("APM-Memory", "scheduleCollectMemory");
                }
                final long j = this.LJFF;
                this.LIZLLL = new AbstractRunnableC792500V6y(j) { // from class: X.0V7W
                    /* JADX WARN: Code restructure failed: missing block: B:43:0x013b, code lost:
                    
                        r42 = r42 * 1024;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:44:0x0141, code lost:
                    
                        if (r42 <= 0) goto L42;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ() {
                        /*
                            Method dump skipped, instruction units count: 530
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0V7W.LIZ():void");
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("MemoryCollector@a7e3.scheduleCollectMemory$3");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("MemoryCollector@a7e3.scheduleCollectMemory$3");
                    }
                };
                C792490V6x.LIZ(EnumC792970V8t.LIGHT_WEIGHT).LIZJ(this.LIZLLL);
            }
        }
    }

    public final synchronized void LIZIZ() {
        if (this.LJ) {
            this.LJ = false;
            if (C792190V5t.LIZ()) {
                C792910V8n.LIZ("APM-Memory", "cancelCollectMemory");
            }
            if (this.LIZLLL != null) {
                C792490V6x.LIZ(EnumC792970V8t.LIGHT_WEIGHT).LIZIZ(this.LIZLLL);
                this.LIZLLL = null;
            }
        }
    }

    public final synchronized void LIZJ(C0V7P c0v7p) {
        if (c0v7p == null) {
            return;
        }
        this.LIZJ = c0v7p;
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateConfig: ");
            sbLIZ.append(c0v7p);
            C792910V8n.LIZ("APM-Memory", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!c0v7p.LJFF) {
            LIZIZ();
            C0V7R c0v7r = (C0V7R) C792590V7h.LIZ(C0V7R.class);
            if (c0v7r != null) {
                c0v7r.LIZJ(this.LJI);
            }
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("isApm6SampleEnable: ");
                sbLIZ2.append(c0v7p.LJFF);
                C792910V8n.LIZ("APM-Memory", C2188811AlT.LIZIZ(sbLIZ2));
            }
            return;
        }
        C0V7R c0v7r2 = (C0V7R) C792590V7h.LIZ(C0V7R.class);
        if (c0v7r2 != null) {
            if (c0v7p.LIZJ) {
                c0v7r2.LIZJ(this.LJI);
                c0v7r2.LIZ(this.LJI);
            } else {
                c0v7r2.LIZJ(this.LJI);
            }
        }
        long j = c0v7p.LIZ * 1000;
        this.LJFF = j;
        if (j < 30000) {
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("pollingIntervalMillis: ");
                sbLIZ3.append(this.LJFF);
                C792910V8n.LIZ("APM-Memory", C2188811AlT.LIZIZ(sbLIZ3));
            }
            this.LJFF = 30000L;
        }
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("result pollingIntervalMillis: ");
            sbLIZ4.append(this.LJFF);
            C792910V8n.LIZ("APM-Memory", C2188811AlT.LIZIZ(sbLIZ4));
        }
        C0V7W c0v7w = this.LIZLLL;
        if (c0v7w != null && c0v7w.LLILLL != this.LJFF) {
            LIZIZ();
        }
        LIZ();
        InterfaceC791620V3o interfaceC791620V3o = (InterfaceC791620V3o) C792590V7h.LIZ(InterfaceC791620V3o.class);
        if (interfaceC791620V3o != null) {
            interfaceC791620V3o.start();
        }
    }
}
