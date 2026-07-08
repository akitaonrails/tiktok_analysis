package X;

/* JADX INFO: renamed from: X.0UMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771050UMl<E, T> {
    public final E LIZ;
    public final T LIZIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C771050UMl() {
        Object obj = null;
        this(obj, obj, 3);
    }

    public final int LIZ() {
        E e = this.LIZ;
        if (!(e instanceof Throwable)) {
            return e instanceof C1662010tLr ? ((C1662010tLr) e).LIZ : e == null ? -2 : -1;
        }
        Throwable th = (Throwable) e;
        return th instanceof C501470JlZ ? ((C501520Jle) th).getErrorCode() : th instanceof C1811850xFX ? ((C1811850xFX) th).getCronetError() : th == null ? -2 : -1;
    }

    public final String LIZIZ() {
        E e = this.LIZ;
        if (e instanceof Throwable) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Throwable: ");
            sbLIZ.append(C0UN3.LIZ((Throwable) this.LIZ));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!(e instanceof C1662010tLr)) {
            return "UnknownError";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ExceptionResult: ");
        sbLIZ2.append(((C1662010tLr) this.LIZ).LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C771050UMl(E e, T t) {
        this.LIZ = e;
        this.LIZIZ = t;
    }

    public /* synthetic */ C771050UMl(Object obj, Object obj2, int i) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2);
    }
}
