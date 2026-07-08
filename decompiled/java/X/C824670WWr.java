package X;

import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0WWr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824670WWr {
    public static final C095D LIZ(AbstractC796540VMm abstractC796540VMm, String[] strArr, Callable callable) {
        return new C095D(new C05XZ(false, abstractC796540VMm, strArr, callable, null));
    }

    public static final Object LIZJ(AbstractC796540VMm abstractC796540VMm, Callable callable, InterfaceC1364105Vn interfaceC1364105Vn) {
        CoroutineContext coroutineContextLIZIZ;
        if (abstractC796540VMm.isOpen() && abstractC796540VMm.inTransaction()) {
            return callable.call();
        }
        C824900WXo c824900WXo = (C824900WXo) interfaceC1364105Vn.getContext().get(C824900WXo.LLILZ);
        if (c824900WXo == null || (coroutineContextLIZIZ = c824900WXo.LLILLJJLI) == null) {
            coroutineContextLIZIZ = C824680WWs.LIZIZ(abstractC796540VMm);
        }
        return C23250099c.LJI(interfaceC1364105Vn, coroutineContextLIZIZ, new C05XY(callable, null));
    }

    public static final Object LIZIZ(AbstractC796540VMm abstractC796540VMm, CancellationSignal cancellationSignal, Callable callable, InterfaceC1364105Vn interfaceC1364105Vn) {
        CoroutineContext coroutineContextLIZ;
        if (abstractC796540VMm.isOpen() && abstractC796540VMm.inTransaction()) {
            return callable.call();
        }
        C824900WXo c824900WXo = (C824900WXo) interfaceC1364105Vn.getContext().get(C824900WXo.LLILZ);
        if (c824900WXo == null || (coroutineContextLIZ = c824900WXo.LLILLJJLI) == null) {
            coroutineContextLIZ = C824680WWs.LIZ(abstractC796540VMm);
        }
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        c2252611DEt.LJJII(new C824690WWt(cancellationSignal, C23250099c.LIZLLL(C817503Hh.LL, coroutineContextLIZ, null, new C05XX(callable, c2252611DEt, null), 2)));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ != C099R.LJFF()) {
            return objLJIJ;
        }
        C099Q.LIZJ(interfaceC1364105Vn);
        return objLJIJ;
    }
}
