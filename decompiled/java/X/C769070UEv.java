package X;

/* JADX INFO: renamed from: X.0UEv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C769070UEv {
    public final Integer LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Boolean LIZLLL;

    public C769070UEv() {
        this(null, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C769070UEv(Integer num, int i) {
        Boolean bool;
        num = (i & 1) != 0 ? -1 : num;
        if ((i & 8) != 0) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        this(num, null, null, bool);
    }

    public C769070UEv(Integer num, String str, String str2, Boolean bool) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = bool;
    }
}
