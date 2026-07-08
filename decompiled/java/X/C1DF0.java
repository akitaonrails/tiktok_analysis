package X;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.1DF0, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DF0 {
    public static final <T> void LIZ(AbstractC2252631DEv<? super T> abstractC2252631DEv, InterfaceC1364105Vn<? super T> interfaceC1364105Vn, boolean z) {
        Object objLJ;
        C23251099d<?> c23251099dLIZJ;
        boolean zLJLJJL;
        Object objLJIIIIZZ = abstractC2252631DEv.LJIIIIZZ();
        Throwable thLIZJ = abstractC2252631DEv.LIZJ(objLJIIIIZZ);
        if (thLIZJ != null) {
            objLJ = new C098200Yq(thLIZJ);
        } else {
            objLJ = abstractC2252631DEv.LJ(objLJIIIIZZ);
        }
        C189200o6.m2constructorimpl(objLJ);
        if (z) {
            C2252621DEu c2252621DEu = (C2252621DEu) interfaceC1364105Vn;
            InterfaceC1364105Vn<T> interfaceC1364105Vn2 = c2252621DEu.LLILZIL;
            Object obj = c2252621DEu.LLIZ;
            CoroutineContext context = interfaceC1364105Vn2.getContext();
            Object objLIZJ = C09AQ.LIZJ(context, obj);
            if (objLIZJ != C09AQ.LIZ) {
                c23251099dLIZJ = C23252099e.LIZJ(interfaceC1364105Vn2, context, objLIZJ);
            } else {
                c23251099dLIZJ = null;
            }
            try {
                c2252621DEu.LLILZIL.resumeWith(objLJ);
                if (c23251099dLIZJ != null) {
                    if (!zLJLJJL) {
                        return;
                    }
                }
                return;
            } finally {
                if (c23251099dLIZJ == null || c23251099dLIZJ.LJLJJL()) {
                    C09AQ.LIZ(context, objLIZJ);
                }
            }
        }
        interfaceC1364105Vn.resumeWith(objLJ);
    }
}
