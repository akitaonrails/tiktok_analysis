package X;

/* JADX INFO: renamed from: X.1B0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2198021B0u extends AbstractC2197911B0j {
    public final String LLILZIL;

    @Override // X.AbstractC2197911B0j, java.lang.Throwable
    public final String getMessage() {
        return this.LLILZIL;
    }

    public C2198021B0u(int i, String str, Throwable th) {
        super(EnumC2197951B0n.USER_SYNC_FAILED, 0, str, null, th, 20);
        this.LLILZIL = str;
    }
}
