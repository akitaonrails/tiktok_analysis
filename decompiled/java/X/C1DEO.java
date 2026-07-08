package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1DEO, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DEO {
    public static final C09AU LIZ = new C09AU("CLOSED");

    public static final <S extends C1DET<S>> Object LIZ(S s, long j, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s.LLILLL >= j && !s.LIZJ()) {
                return s;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1DES.LL;
            Object obj = atomicReferenceFieldUpdater.get(s);
            C09AU c09au = LIZ;
            if (obj == c09au) {
                return c09au;
            }
            S sInvoke = (S) ((C1DES) obj);
            if (sInvoke == null) {
                sInvoke = function2.invoke(Long.valueOf(s.LLILLL + 1), s);
                while (!atomicReferenceFieldUpdater.compareAndSet(s, null, sInvoke)) {
                    if (atomicReferenceFieldUpdater.get(s) != null) {
                        break;
                    }
                }
                if (s.LIZJ()) {
                    s.LIZLLL();
                }
            }
            s = (Object) sInvoke;
        }
    }
}
