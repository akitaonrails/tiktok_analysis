package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0dDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1041880dDe<T> implements InterfaceC1041910dDh<T> {
    public final String LIZ;
    public final InterfaceC1041900dDg<T> LIZIZ;
    public final T LIZJ;
    public T LIZLLL;

    public final T LIZJ() {
        T t = this.LIZLLL;
        return t == null ? this.LIZJ : t;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Param(");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("){key: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value: ");
        sbLIZ.append(LIZJ());
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZLLL(T t) {
        this.LIZLLL = t;
    }

    @Override // X.InterfaceC1041910dDh
    public final <R> void LIZ(Class<R> cls, R r) {
        T tInvoke;
        Function2<R, String, T> function2LIZIZ = this.LIZIZ.LIZIZ(cls);
        if (function2LIZIZ != null && (tInvoke = function2LIZIZ.invoke(r, this.LIZ)) != null) {
            LIZLLL(tInvoke);
        }
    }

    @Override // X.InterfaceC1041910dDh
    public final <R> R LIZIZ(Class<R> cls, R r) {
        T t;
        InterfaceC1631620sYq<R, String, T, R> interfaceC1631620sYqLIZ = this.LIZIZ.LIZ(cls);
        if (interfaceC1631620sYqLIZ != null && (t = this.LIZLLL) != null) {
            return interfaceC1631620sYqLIZ.invoke(r, this.LIZ, t);
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1041880dDe(String str, C1053010dVb c1053010dVb, Object obj) {
        this.LIZ = str;
        this.LIZIZ = c1053010dVb;
        this.LIZJ = obj;
    }
}
