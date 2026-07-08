package X;

/* JADX INFO: renamed from: X.0TKC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TKC implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C0TKB LLILLJJLI;
    public final /* synthetic */ C0TKE LLILLL;
    public final /* synthetic */ C0TK8 LLILZ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ExperimentCache@e1ae.getValue$2");
        try {
            C0TKI.LIZ(new Runnable() { // from class: X.0TKD
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ2;
                    C1C7U.LIZ("ExperimentCache@e1ae.getValue$2$1");
                    try {
                        C0TKC c0tkc = this.LL;
                        c0tkc.LLILZ.LJII.LIZIZ(c0tkc.LL, c0tkc.LLILLJJLI, c0tkc.LLILLL.LIZ);
                    } finally {
                        if (!zLIZ2) {
                        }
                    }
                    C1C7U.LIZIZ("ExperimentCache@e1ae.getValue$2$1");
                }
            });
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExperimentCache@e1ae.getValue$2");
    }

    public C0TKC(C0TK8 c0tk8, String str, C0TKB c0tkb, C0TKE c0tke) {
        this.LLILZ = c0tk8;
        this.LL = str;
        this.LLILLJJLI = c0tkb;
        this.LLILLL = c0tke;
    }
}
