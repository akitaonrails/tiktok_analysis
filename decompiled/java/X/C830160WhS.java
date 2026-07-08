package X;

/* JADX INFO: renamed from: X.0WhS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830160WhS extends Exception {
    public static final long serialVersionUID = 6569838532917408380L;
    public final EnumC2273771DzD LL;

    public EnumC2273771DzD getStatus() {
        return this.LL;
    }

    public C830160WhS(EnumC2273771DzD enumC2273771DzD, String str) {
        super(str);
        this.LL = enumC2273771DzD;
    }

    public C830160WhS(EnumC2273771DzD enumC2273771DzD, String str, Exception exc) {
        super(str, exc);
        this.LL = enumC2273771DzD;
    }
}
