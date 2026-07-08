package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q5X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536570q5X extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ C1537910q7h LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ InterfaceC1299830jvh LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536570q5X(C1537910q7h c1537910q7h, String str, C1299760jva c1299760jva) {
        super(1);
        this.LL = c1537910q7h;
        this.LLILLJJLI = str;
        this.LLILLL = c1299760jva;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1533790q13 c1533790q13) {
        String strLIZIZ;
        C1536760q5q c1536760q5q;
        C1533790q13 c1533790q132 = c1533790q13;
        if (c1533790q132.LIZIZ) {
            C1537910q7h c1537910q7h = this.LL;
            if (c1537910q7h != null && (c1536760q5q = c1537910q7h.LJIJI) != null) {
                c1536760q5q.LIZ(this.LLILLJJLI, c1533790q132);
            }
            byte[] bArrLJIIIZ = c1533790q132.LJIIIZ();
            InterfaceC1299830jvh interfaceC1299830jvh = this.LLILLL;
            if (bArrLJIIIZ != null) {
                ((C1299760jva) interfaceC1299830jvh).LIZ(bArrLJIIIZ, null);
            } else {
                ((C1299760jva) interfaceC1299830jvh).LIZ(null, new Throwable("load succeeded but empty bytes"));
            }
        } else {
            InterfaceC1299830jvh interfaceC1299830jvh2 = this.LLILLL;
            C1533810q15 c1533810q15 = c1533790q132.LIZLLL;
            if (c1533810q15 == null || (strLIZIZ = c1533810q15.toString()) == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("failed to get Response from ");
                sbLIZ.append(this.LLILLJJLI);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            ((C1299760jva) interfaceC1299830jvh2).LIZ(null, new Throwable(strLIZIZ));
        }
        return Unit.LIZ;
    }
}
