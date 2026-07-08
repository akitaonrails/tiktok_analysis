package X;

/* JADX INFO: renamed from: X.08EF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08EF extends IllegalStateException {
    public static final long serialVersionUID = 1644750035281290266L;

    /* JADX WARN: Illegal instructions before constructor call */
    public C08EF(Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ");
        sbLIZ.append(th);
        super(C2188811AlT.LIZIZ(sbLIZ), th);
    }
}
