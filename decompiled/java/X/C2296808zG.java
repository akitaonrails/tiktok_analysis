package X;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08zG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2296808zG {
    public static final C054G LIZIZ() {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        return new C054G(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ));
    }

    public static final C054G LIZ(CoroutineContext coroutineContext) {
        if (coroutineContext.get(C09AE.LJJLJ) == null) {
            coroutineContext = coroutineContext.plus(C23118094a.LIZ());
        }
        return new C054G(coroutineContext);
    }

    public static final void LJFF(InterfaceC497601wk interfaceC497601wk) {
        C23118094a.LJI(interfaceC497601wk.getCoroutineContext());
    }

    public static final boolean LJI(InterfaceC497601wk interfaceC497601wk) {
        C09AE c09ae = (C09AE) interfaceC497601wk.getCoroutineContext().get(C09AE.LJJLJ);
        if (c09ae != null) {
            return c09ae.isActive();
        }
        return true;
    }

    public static final void LIZJ(InterfaceC497601wk interfaceC497601wk, CancellationException cancellationException) {
        C09AE c09ae = (C09AE) interfaceC497601wk.getCoroutineContext().get(C09AE.LJJLJ);
        if (c09ae != null) {
            c09ae.LIZIZ(cancellationException);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scope cannot be cancelled because it does not have a job: ");
        sbLIZ.append(interfaceC497601wk);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public static void LIZLLL(InterfaceC497601wk interfaceC497601wk, String str) {
        LIZJ(interfaceC497601wk, C2239008pw.LIZ(str, null));
    }

    public static final <R> Object LJ(Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super R>, ? extends Object> function2, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        C099Z c099z = new C099Z(interfaceC1364105Vn, interfaceC1364105Vn.getContext());
        Object objLIZ = C099C.LIZ(c099z, c099z, function2);
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static final C054G LJII(InterfaceC497601wk interfaceC497601wk, CoroutineContext coroutineContext) {
        return new C054G(interfaceC497601wk.getCoroutineContext().plus(coroutineContext));
    }
}
