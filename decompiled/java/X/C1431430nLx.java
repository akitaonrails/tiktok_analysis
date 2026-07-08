package X;

/* JADX INFO: renamed from: X.0nLx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431430nLx extends C1431180nLY {
    public static final C1431440nLy Companion = new Object() { // from class: X.0nLy
    };
    public final int LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final Throwable LLIZ;
    public final String LLIZLLLIL;

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishDebugMockException(stage=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", stageDescription='");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append("', extra=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1431180nLY, java.lang.Throwable
    public Throwable getCause() {
        return this.LLIZ;
    }

    @Override // X.C1431180nLY, java.lang.Throwable
    public String getMessage() {
        return this.LLIZLLLIL;
    }

    public C1431430nLx(Throwable th, String str) {
        this(-1, EnumC1434810nRP.COMPILE.getDesc(), null, str, th);
    }

    public static final C1431430nLx create(int i, String str) {
        Companion.getClass();
        return new C1431430nLx(i, str, null, null, null);
    }

    public static final C1431430nLx createWithCauseAndMessage(Throwable th, String str) {
        Companion.getClass();
        return new C1431430nLx(th, str);
    }

    public static final C1431430nLx create(int i, String str, String str2) {
        Companion.getClass();
        return new C1431430nLx(i, str, str2, null, null);
    }

    public C1431430nLx(int i, String str, String str2, String str3, Throwable th) {
        super(null, null);
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = th;
        this.LLIZLLLIL = str3;
        C0CHQ.LIZ().LJIIJJI();
    }
}
