package X;

/* JADX INFO: renamed from: X.13Lv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19996513Lv {
    public C13M6 LIZ;
    public C13NB LIZIZ;
    public EnumC356380Dy8 LIZJ;
    public C13ND LIZLLL;

    public final C13N5 LIZ() {
        if (this.LIZIZ == null) {
            throw new IllegalArgumentException("networkClient is required to setup!");
        }
        if (this.LIZ == null) {
            throw new IllegalArgumentException("cacheStrategy is required to setup!");
        }
        C13NB c13nb = this.LIZIZ;
        if (c13nb == null) {
            c13nb = null;
        }
        C13M6 c13m6 = this.LIZ;
        return new C13N5(c13nb, c13m6 != null ? c13m6 : null, this.LIZLLL, this.LIZJ);
    }
}
