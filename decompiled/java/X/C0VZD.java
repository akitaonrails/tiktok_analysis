package X;

/* JADX INFO: renamed from: X.0VZD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VZD extends C0VZC {
    public final /* synthetic */ C0VZB LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0VZD(final C0CCZ c0ccz, C0VZB c0vzb, final int i) {
        new RunnableC799600VYg(c0ccz, i) { // from class: X.0VZC
            @Override // X.RunnableC799600VYg, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FirstWindowFocusTriggerV2$FirstWindowFocusRunnable@53a8.run");
                try {
                    super.run();
                    ((C0VZD) this).LLILZ.LIZLLL();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FirstWindowFocusTriggerV2$FirstWindowFocusRunnable@53a8.run");
            }
        };
        this.LLILZ = c0vzb;
    }
}
