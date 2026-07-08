package X;

/* JADX INFO: renamed from: X.1B0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2197971B0p extends AbstractC2197911B0j {
    public final int LLILZIL;
    public final String LLILZLL;

    @Override // X.AbstractC2197911B0j
    public final int LIZ() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2197911B0j, java.lang.Throwable
    public final String getMessage() {
        return this.LLILZLL;
    }

    public C2197971B0p(int i, String str) {
        super(EnumC2197951B0n.ENVIRONMENT_PRECHECK_FAILED, i, str, null, null, 114);
        this.LLILZIL = i;
        this.LLILZLL = str;
    }
}
