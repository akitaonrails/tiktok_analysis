package X;

/* JADX INFO: renamed from: X.095k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23154095k {
    public final C23155095l LIZ;
    public final AnonymousClass0961 LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public C23154095k(C23155095l c23155095l, AnonymousClass0961 anonymousClass0961, int i, boolean z) {
        this.LIZ = c23155095l;
        this.LIZIZ = anonymousClass0961;
        this.LIZJ = i;
        this.LIZLLL = z;
        String str = anonymousClass0961.LJIIJJI;
        if (!new C0VSJ(str).exists()) {
            new C0VSJ(str).mkdirs();
        }
        String str2 = anonymousClass0961.LJIIIZ;
        if (!new C0VSJ(str2).exists()) {
            new C0VSJ(str2).mkdirs();
        }
    }
}
