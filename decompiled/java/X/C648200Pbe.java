package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Pbe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648200Pbe<T> {
    public final C2252321DDq LIZ;
    public final CopyOnWriteArraySet<Function1<T, Unit>> LIZIZ = new CopyOnWriteArraySet<>();
    public T LIZJ;
    public final /* synthetic */ C648160Pba LIZLLL;

    public final T LIZ() {
        return (T) this.LIZ.getValue();
    }

    public final void LIZIZ(T t) {
        this.LIZJ = (T) this.LIZ.getValue();
        this.LIZ.setValue(t);
        CopyOnWriteArraySet<Function1<T, Unit>> copyOnWriteArraySet = this.LIZIZ;
        C648160Pba c648160Pba = this.LIZLLL;
        Iterator<Function1<T, Unit>> it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            C23250099c.LIZLLL(c648160Pba.LIZ, null, null, new C312601Jc(t, it2.next(), null), 3);
        }
    }

    public C648200Pbe(C648160Pba c648160Pba, T t) {
        this.LIZLLL = c648160Pba;
        this.LIZ = C1BNE.LIZ(t);
    }
}
