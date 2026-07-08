package X;

import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletedExceptionally;

/* JADX INFO: renamed from: X.0tpk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680540tpk {
    public static final C1680570tpn LIZ = new Object() { // from class: X.0tpn
    };

    public static final void LJII(Function0 function0, InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJII(function0);
    }

    public static final InterfaceC497601wk LJIIIIZZ(CoroutineContext coroutineContext, InterfaceC1680500tpg interfaceC1680500tpg) {
        if (coroutineContext.get(C09AE.LJJLJ) != null) {
            C1DFK c1dfkLIZ = C23118094a.LIZ();
            c1dfkLIZ.LJJLIIIJILLIZJL(new CompletedExceptionally(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false, 2, null));
            return C2296808zG.LIZ(c1dfkLIZ);
        }
        return new C2328109Ah(interfaceC1680500tpg.LJJIJ(), coroutineContext);
    }

    public static final void LIZIZ(Object obj, Function1 function1, InterfaceC1680500tpg interfaceC1680500tpg) {
        boolean zLJJIIJ = interfaceC1680500tpg.LJJIIJ(obj);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        if (!zLJJIIJ) {
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ != C1680510tph.LIZIZ) {
                return;
            }
        }
        interfaceC1680500tpg.LJJIJIIJI(new C1680550tpl(function1));
    }

    public static final void LIZJ(Object[] objArr, Function1 function1, InterfaceC1680500tpg interfaceC1680500tpg) {
        boolean zLJJIIJ = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zLJJIIJ |= interfaceC1680500tpg.LJJIIJ(obj);
        }
        Object objLJJ = interfaceC1680500tpg.LJJ();
        if (!zLJJIIJ) {
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ != C1680510tph.LIZIZ) {
                return;
            }
        }
        interfaceC1680500tpg.LJJIJIIJI(new C1680550tpl(function1));
    }

    public static final void LJFF(Object obj, Function2 function2, InterfaceC1680500tpg interfaceC1680500tpg) {
        CoroutineContext coroutineContextLJJIJ = interfaceC1680500tpg.LJJIJ();
        boolean zLJJIIJ = interfaceC1680500tpg.LJJIIJ(obj);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        if (!zLJJIIJ) {
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ != C1680510tph.LIZIZ) {
                return;
            }
        }
        interfaceC1680500tpg.LJJIJIIJI(new C23120094c(coroutineContextLJJIJ, function2));
    }

    public static final void LJI(Object[] objArr, Function2 function2, InterfaceC1680500tpg interfaceC1680500tpg) {
        CoroutineContext coroutineContextLJJIJ = interfaceC1680500tpg.LJJIJ();
        boolean zLJJIIJ = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zLJJIIJ |= interfaceC1680500tpg.LJJIIJ(obj);
        }
        Object objLJJ = interfaceC1680500tpg.LJJ();
        if (!zLJJIIJ) {
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ != C1680510tph.LIZIZ) {
                return;
            }
        }
        interfaceC1680500tpg.LJJIJIIJI(new C23120094c(coroutineContextLJJIJ, function2));
    }

    public static final void LIZ(Object obj, Object obj2, Function1 function1, InterfaceC1680500tpg interfaceC1680500tpg) {
        boolean zLJJIIJ = interfaceC1680500tpg.LJJIIJ(obj) | interfaceC1680500tpg.LJJIIJ(obj2);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        if (!zLJJIIJ) {
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ != C1680510tph.LIZIZ) {
                return;
            }
        }
        interfaceC1680500tpg.LJJIJIIJI(new C1680550tpl(function1));
    }

    public static final void LJ(Object obj, Object obj2, Function2 function2, InterfaceC1680500tpg interfaceC1680500tpg) {
        CoroutineContext coroutineContextLJJIJ = interfaceC1680500tpg.LJJIJ();
        boolean zLJJIIJ = interfaceC1680500tpg.LJJIIJ(obj) | interfaceC1680500tpg.LJJIIJ(obj2);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        if (!zLJJIIJ) {
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ != C1680510tph.LIZIZ) {
                return;
            }
        }
        interfaceC1680500tpg.LJJIJIIJI(new C23120094c(coroutineContextLJJIJ, function2));
    }

    public static final void LIZLLL(Object obj, Object obj2, Object obj3, Function2 function2, InterfaceC1680500tpg interfaceC1680500tpg) {
        CoroutineContext coroutineContextLJJIJ = interfaceC1680500tpg.LJJIJ();
        boolean zLJJIIJ = interfaceC1680500tpg.LJJIIJ(obj) | interfaceC1680500tpg.LJJIIJ(obj2) | interfaceC1680500tpg.LJJIIJ(obj3);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        if (!zLJJIIJ) {
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ != C1680510tph.LIZIZ) {
                return;
            }
        }
        interfaceC1680500tpg.LJJIJIIJI(new C23120094c(coroutineContextLJJIJ, function2));
    }
}
