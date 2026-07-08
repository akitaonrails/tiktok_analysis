package X;

/* JADX INFO: renamed from: X.13K2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i
public final class C13K2 {
    public static final C13K3 Companion = new Object() { // from class: X.13K3
        public final C13HG<C13K2> serializer() {
            return C13K1.LIZ;
        }
    };
    public final String LIZ;
    public final String LIZIZ;

    public C13K2() {
        this.LIZ = "";
        this.LIZIZ = null;
    }

    public /* synthetic */ C13K2(int i, String str, String str2) {
        if (0 == 0) {
            this.LIZ = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.LIZIZ = null;
                return;
            } else {
                this.LIZIZ = str2;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, C13K1.LIZ.getDescriptor());
        throw null;
    }
}
