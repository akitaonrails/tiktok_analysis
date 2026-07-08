package X;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.094a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23118094a {
    public static C1DFK LIZ() {
        return new C1DFK(null);
    }

    public static void LJ(CoroutineContext coroutineContext) {
        Sequence<C09AE> sequenceLIZ;
        C09AE c09ae = (C09AE) coroutineContext.get(C09AE.LJJLJ);
        if (c09ae != null && (sequenceLIZ = c09ae.LIZ()) != null) {
            Iterator<C09AE> it2 = sequenceLIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(null);
            }
        }
    }

    public static void LJFF(C09AE c09ae) {
        Iterator<C09AE> it2 = c09ae.LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(null);
        }
    }

    public static final void LJI(CoroutineContext coroutineContext) {
        C09AE c09ae = (C09AE) coroutineContext.get(C09AE.LJJLJ);
        if (c09ae != null && !c09ae.isActive()) {
            throw c09ae.LJJJLL();
        }
    }

    public static final C09AE LJII(CoroutineContext coroutineContext) {
        C09AE c09ae = (C09AE) coroutineContext.get(C09AE.LJJLJ);
        if (c09ae != null) {
            return c09ae;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Current context doesn't contain Job in it: ");
        sbLIZ.append(coroutineContext);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public static final boolean LJIIIIZZ(CoroutineContext coroutineContext) {
        C09AE c09ae = (C09AE) coroutineContext.get(C09AE.LJJLJ);
        if (c09ae != null) {
            return c09ae.isActive();
        }
        return true;
    }

    public static final void LIZJ(CoroutineContext coroutineContext, CancellationException cancellationException) {
        C09AE c09ae = (C09AE) coroutineContext.get(C09AE.LJJLJ);
        if (c09ae != null) {
            c09ae.LIZIZ(cancellationException);
        }
    }

    public static final Object LIZLLL(C09AE c09ae, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        c09ae.LIZIZ(null);
        Object objLJJZ = c09ae.LJJZ(interfaceC1364105Vn);
        if (objLJJZ != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJJZ;
    }

    public static final void LIZIZ(String str, Throwable th, C09AE c09ae) {
        c09ae.LIZIZ(C2239008pw.LIZ(str, th));
    }
}
