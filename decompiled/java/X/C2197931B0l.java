package X;

/* JADX INFO: renamed from: X.1B0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2197931B0l extends AbstractC2197911B0j {
    public final int LLILZIL;
    public final String LLILZLL;
    public final C0KM0 LLIZ;

    @Override // X.AbstractC2197911B0j
    public final int LIZ() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2197911B0j, java.lang.Throwable
    public final String getMessage() {
        return this.LLILZLL;
    }

    public C2197931B0l(int i, String str, C0KM0 c0km0) {
        super(EnumC2197951B0n.ENTITLEMENT_PRECHECK_FAILED, i, str, null, null, 114);
        this.LLILZIL = i;
        this.LLILZLL = str;
        this.LLIZ = c0km0;
    }
}
