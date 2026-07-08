package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0e4U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1074640e4U extends C2217421BqW implements Function1<Throwable, Unit> {
    public C1074640e4U(Object obj) {
        super(1, obj, C1074610e4R.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        C1074630e4T c1074630e4T;
        C1074610e4R c1074610e4R = (C1074610e4R) this.receiver;
        c1074610e4R.getClass();
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZIZ("ContactComp", "list error", th);
        C1749280vcc c1749280vcc = c1074610e4R.LLILZIL;
        if (c1749280vcc != null) {
            C1074630e4T c1074630e4T2 = c1074610e4R.LLJ;
            if (c1074630e4T2 == null) {
                c1074630e4T = null;
            } else {
                c1074630e4T = c1074630e4T2;
            }
            if (c1074630e4T.LJIIL) {
                if (c1074630e4T2 == null) {
                    c1074630e4T2 = null;
                }
                C1722300uv6 c1722300uv6 = c1074630e4T2.LJIILLIIL;
                if (c1722300uv6 != null) {
                    c1749280vcc.setStatus(c1722300uv6);
                    C786410Ut5.LJLLLLLL(0, c1749280vcc);
                    C481090Itn c481090Itn = c1074610e4R.LLILZ;
                    if (c481090Itn != null) {
                        C786410Ut5.LJLLLLLL(8, c481090Itn);
                    }
                } else {
                    c1074610e4R.LIZLLL();
                }
            }
        }
        return Unit.LIZ;
    }
}
