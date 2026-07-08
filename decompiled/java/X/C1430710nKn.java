package X;

/* JADX INFO: renamed from: X.0nKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430710nKn extends C1431180nLY {
    public static final int $stable = 8;
    public final String LLILZ;
    public final Throwable LLILZIL;

    public C1430710nKn() {
        this(null, null);
    }

    public final String getAvatarPath() {
        return this.LLILZ;
    }

    @Override // X.C1431180nLY, java.lang.Throwable
    public Throwable getCause() {
        return this.LLILZIL;
    }

    public C1430710nKn(String str) {
        this(str, null);
    }

    public C1430710nKn(String str, Throwable th) {
        super(null, th);
        this.LLILZ = str;
        this.LLILZIL = th;
    }
}
