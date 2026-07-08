package X;

/* JADX INFO: renamed from: X.1B0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2197911B0j extends RuntimeException {
    public final EnumC2197951B0n LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final C0KPG LLILZ;

    public int LIZ() {
        return this.LLILLJJLI;
    }

    public C0KPG LIZIZ() {
        return this.LLILZ;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LLILLL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC2197911B0j(EnumC2197951B0n enumC2197951B0n, int i, String str, C0KPG c0kpg, Throwable th, int i2) {
        i = (i2 & 4) != 0 ? EnumC1792020wjY.UNDEFINED.getValue() : i;
        str = (i2 & 8) != 0 ? null : str;
        c0kpg = (i2 & 16) != 0 ? null : c0kpg;
        super(str, (i2 & 32) != 0 ? null : th);
        this.LL = enumC2197951B0n;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = c0kpg;
    }
}
