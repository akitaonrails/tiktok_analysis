package X;

/* JADX INFO: renamed from: X.0kZ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324280kZ8 extends RuntimeException {
    public static final long serialVersionUID = -6298857009889503852L;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1324280kZ8(Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ");
        sbLIZ.append(th);
        this(C2188811AlT.LIZIZ(sbLIZ), th);
    }

    public C1324280kZ8(String str, Throwable th) {
        super(str, th == null ? new NullPointerException() : th);
    }
}
