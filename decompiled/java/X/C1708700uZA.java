package X;

/* JADX INFO: renamed from: X.0uZA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708700uZA {
    public final ThreadLocal<String> LIZ = new ThreadLocal<>();
    public final ThreadLocal<String> LIZIZ = new ThreadLocal<>();
    public final ThreadLocal<String> LIZJ = new ThreadLocal<>();

    public final String LIZ() {
        String str = this.LIZIZ.get();
        if (str == null) {
            return "";
        }
        this.LIZIZ.remove();
        return str;
    }

    public final String LIZIZ() {
        String str = this.LIZJ.get();
        if (str == null) {
            return "";
        }
        this.LIZJ.remove();
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1708700uZA.LIZJ(java.lang.Object):void");
    }

    public final C1708700uZA LIZLLL(String str, String str2) {
        this.LIZIZ.set(str);
        this.LIZJ.set(str2);
        return this;
    }
}
