package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0e4J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1074530e4J extends C2217421BqW implements Function1<Throwable, Unit> {
    public C1074530e4J(Object obj) {
        super(1, obj, C1074580e4O.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        C1074580e4O c1074580e4O = (C1074580e4O) this.receiver;
        c1074580e4O.getClass();
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZIZ("FBComp", "list error", th);
        C1749280vcc c1749280vcc = c1074580e4O.LLILZ;
        if (c1749280vcc != null) {
            C1074450e4B c1074450e4B = c1074580e4O.LLJIJIL;
            C1074450e4B c1074450e4B2 = null;
            if (c1074450e4B == null) {
                c1074450e4B = null;
            }
            C1722300uv6 c1722300uv6 = c1074450e4B.LJII;
            if (c1722300uv6 != null) {
                c1749280vcc.setStatus(c1722300uv6);
                C786410Ut5.LJLLLLLL(0, c1749280vcc);
                C481090Itn c481090Itn = c1074580e4O.LLILLL;
                if (c481090Itn != null) {
                    C786410Ut5.LJLLLLLL(8, c481090Itn);
                }
            } else if (((Boolean) c1074580e4O.LLIZ.getValue()).booleanValue()) {
                c1074580e4O.LIZJ();
                C1074450e4B c1074450e4B3 = c1074580e4O.LLJIJIL;
                if (c1074450e4B3 != null) {
                    c1074450e4B2 = c1074450e4B3;
                }
                c1074580e4O.LIZ(c1074450e4B2);
            } else {
                c1074580e4O.LIZIZ();
            }
        }
        return Unit.LIZ;
    }
}
