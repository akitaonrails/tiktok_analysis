package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KXP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KXP extends C09AY implements Function0<Runnable> {
    public final /* synthetic */ C0KXL LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KXP(C0KXL c0kxl) {
        super(0);
        this.LL = c0kxl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Runnable invoke() {
        final C0KXL c0kxl = this.LL;
        return new Runnable() { // from class: X.0KXN
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SubOnlyChatSceneStrategy@5ad9.delayCheck$2$1");
                try {
                    if (c0kxl.LIZIZ()) {
                        C0KXL c0kxl2 = c0kxl;
                        c0kxl2.LLILLL.LJ(c0kxl2);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SubOnlyChatSceneStrategy@5ad9.delayCheck$2$1");
            }
        };
    }
}
