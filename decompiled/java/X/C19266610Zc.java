package X;

/* JADX INFO: renamed from: X.10Zc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC1841100y0i
public final class C19266610Zc {
    public static final C19266710Zd Companion = new C19266710Zd();
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C19266610Zc() {
        this(0);
    }

    public C19266610Zc(int i) {
        this.LIZ = -1L;
        this.LIZIZ = "default error";
        this.LIZJ = "";
    }

    public /* synthetic */ C19266610Zc(int i, long j, String str, String str2) {
        if (0 == 0) {
            this.LIZ = (i & 1) == 0 ? -1L : j;
            if ((i & 2) == 0) {
                this.LIZIZ = "default error";
            } else {
                this.LIZIZ = str;
            }
            if ((i & 4) == 0) {
                this.LIZJ = "";
                return;
            } else {
                this.LIZJ = str2;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, C13IO.LIZ.getDescriptor());
        throw null;
    }
}
