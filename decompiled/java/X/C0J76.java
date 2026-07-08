package X;

/* JADX INFO: renamed from: X.0J76, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J76 {
    public final String LIZ;
    public final Integer LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C0J76() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0J76(String str, Integer num, int i) {
        boolean z;
        str = (i & 1) != 0 ? null : str;
        num = (i & 2) != 0 ? null : num;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(num, str, false, z);
    }

    public C0J76(Integer num, String str, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
