package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533720KwU<T> {
    public final Function1<String, T> LIZ;
    public final Function1<T, Unit> LIZIZ;
    public String LIZJ;
    public T LIZLLL;

    public final synchronized T LIZ() {
        String uid;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser == null || (uid = currentUser.getUid()) == null) {
            uid = "null_user";
        }
        T t = this.LIZLLL;
        if (t == null) {
            T tInvoke = this.LIZ.invoke(uid);
            this.LIZJ = uid;
            this.LIZLLL = tInvoke;
            return tInvoke;
        }
        if (Intrinsics.LJFF(uid, this.LIZJ)) {
            return t;
        }
        Function1<T, Unit> function1 = this.LIZIZ;
        if (function1 != null) {
            function1.invoke(t);
        }
        T tInvoke2 = this.LIZ.invoke(uid);
        this.LIZJ = uid;
        this.LIZLLL = tInvoke2;
        return tInvoke2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C533720KwU(Function1<? super String, ? extends T> function1, Function1<? super T, Unit> function12) {
        this.LIZ = function1;
        this.LIZIZ = function12;
    }
}
