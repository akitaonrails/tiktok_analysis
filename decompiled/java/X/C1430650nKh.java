package X;

/* JADX INFO: renamed from: X.0nKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430650nKh extends C1431180nLY {
    public final String LLILZ;
    public final Throwable LLILZIL;

    public C1430650nKh() {
        this(null, null);
    }

    @Override // X.C1431180nLY, java.lang.Throwable
    public Throwable getCause() {
        return this.LLILZIL;
    }

    public final String getCoverPath() {
        return this.LLILZ;
    }

    public C1430650nKh(String str) {
        this(str, null);
    }

    public C1430650nKh(String str, Throwable th) {
        super(null, th);
        this.LLILZ = str;
        this.LLILZIL = th;
    }
}
