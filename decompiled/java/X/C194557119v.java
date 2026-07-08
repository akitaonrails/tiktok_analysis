package X;

/* JADX INFO: renamed from: X.119v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194557119v {
    public final C194556119u LIZ;

    public C194557119v() {
        this(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.119u] */
    public C194557119v(int i) {
        final int iMin = Math.min((int) (Runtime.getRuntime().maxMemory() / ((long) 8)), 1048576);
        this.LIZ = new C603820NmG<String, byte[]>(iMin) { // from class: X.119u
            @Override // X.C603820NmG
            public final int LJII(String str, byte[] bArr) {
                return bArr.length;
            }
        };
    }
}
