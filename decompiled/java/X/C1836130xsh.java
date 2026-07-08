package X;

import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xsh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836130xsh<T> {
    public static final /* synthetic */ int LIZJ = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(149));
    public T LIZIZ;

    public final LinkedList<Function1<T, Unit>> LIZIZ() {
        return (LinkedList) this.LIZ.getValue();
    }

    public final void LIZ() {
        Iterator<Function1<T, Unit>> it2 = LIZIZ().iterator();
        while (it2.hasNext()) {
            it2.next().invoke(this.LIZIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1836130xsh(Object obj) {
        LIZJ(obj);
    }

    public final void LIZJ(T t) {
        if (!Intrinsics.LJFF(this.LIZIZ, t)) {
            this.LIZIZ = t;
            Iterator<Function1<T, Unit>> it2 = LIZIZ().iterator();
            while (it2.hasNext()) {
                it2.next().invoke(t);
            }
        }
        this.LIZIZ = t;
    }
}
