package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0blp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class RunnableC986190blp implements Runnable {
    public static final RunnableC986190blp LL = new RunnableC986190blp();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AICommentaryPlayer@aab7.timeOutRunnable$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AICommentaryPlayer@aab7.timeOutRunnable$1");
    }

    public static void LIZ() {
        InterfaceC986180blo interfaceC986180blo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timeOutRunnable run finishCompleted ");
        sbLIZ.append(C1300300jwS.LJIIIIZZ);
        sbLIZ.append(", aiCommentaryPlayListener ");
        WeakReference<InterfaceC986180blo> weakReference = C1300300jwS.LJII;
        sbLIZ.append((weakReference != null ? weakReference.get() : null) != null);
        C20441214yg.LIZIZ("AICommentaryPlayer", C2188811AlT.LIZIZ(sbLIZ));
        WeakReference<InterfaceC986180blo> weakReference2 = C1300300jwS.LJII;
        if (weakReference2 == null || weakReference2.get() == null || C1300300jwS.LJIIIIZZ) {
            return;
        }
        WeakReference<InterfaceC986180blo> weakReference3 = C1300300jwS.LJII;
        if (weakReference3 != null && (interfaceC986180blo = weakReference3.get()) != null) {
            interfaceC986180blo.onComplete("play timeout");
        }
        C1300300jwS.LJIIIIZZ = true;
    }
}
