package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0VAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793550VAz {
    public static final C793550VAz LIZJ = new C793550VAz();
    public volatile C794230VDp LIZ;
    public C0V7S LIZIZ;

    public C793550VAz() {
        C0VB0 c0vb0 = new C0VB0() { // from class: X.0VAx
            @Override // X.C0VB0
            public final void LIZ(C0VB5 c0vb5) {
                if ((c0vb5 instanceof C0V6R) && c0vb5.LIZIZ() && ((C0V6R) c0vb5).LIZLLL && this.LIZ.LIZIZ != null) {
                    final C0VBK c0vbk = C0VBJ.LIZ;
                    c0vbk.getClass();
                    if (C792420V6q.LJIILJJIL()) {
                        C792490V6x.LIZ(EnumC792970V8t.IO).LIZJ(new AbstractRunnableC792500V6y() { // from class: X.0VAy
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("LogReporter@3f77.reportMemoryImmediately$1");
                                try {
                                    if (C792190V5t.LIZ()) {
                                        C792910V8n.LIZ("APM-Slardar", "reportMemoryImmediately");
                                    }
                                    c0vbk.LIZIZ();
                                    c0vbk.LJ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("LogReporter@3f77.reportMemoryImmediately$1");
                            }
                        });
                    }
                }
            }
        };
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) C0VBB.LIZJ;
        if (copyOnWriteArrayList.contains(c0vb0)) {
            return;
        }
        copyOnWriteArrayList.add(c0vb0);
    }

    public final boolean LIZ(String str, boolean z) {
        C794230VDp c794230VDp = this.LIZ;
        if (z || c794230VDp == null || !c794230VDp.LIZ.LIZLLL || C792750V7x.LIZIZ().LIZJ(str, false) != 0) {
            return false;
        }
        return true;
    }
}
