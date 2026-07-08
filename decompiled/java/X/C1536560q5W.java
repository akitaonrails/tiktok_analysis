package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q5W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536560q5W extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ C1537910q7h LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AbstractC1299910jvp<byte[]> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536560q5W(C1537910q7h c1537910q7h, String str, AbstractC1299910jvp<byte[]> abstractC1299910jvp) {
        super(1);
        this.LL = c1537910q7h;
        this.LLILLJJLI = str;
        this.LLILLL = abstractC1299910jvp;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1533790q13 c1533790q13) {
        C1536760q5q c1536760q5q;
        C1533790q13 c1533790q132 = c1533790q13;
        if (c1533790q132.LIZIZ) {
            C1537910q7h c1537910q7h = this.LL;
            if (c1537910q7h != null && (c1536760q5q = c1537910q7h.LJIJI) != null) {
                c1536760q5q.LIZLLL(this.LLILLJJLI, c1533790q132);
            }
            byte[] bArrLJIIIZ = c1533790q132.LJIIIZ();
            AbstractC1299910jvp<byte[]> abstractC1299910jvp = this.LLILLL;
            if (bArrLJIIIZ != null) {
                abstractC1299910jvp.LIZ(C1299210juh.LIZ(bArrLJIIIZ));
                C1490740otc.LIZ.LIZ("get external js resource success", EnumC1490770otf.I, "ExternalJSProvider");
            } else {
                abstractC1299910jvp.LIZ(new C1299210juh<>((Throwable) new Error("load succeeded but bytes empty")));
                C1490740otc.LIZ.LIZ("get external js resource failed: load succeeded but bytes empty", EnumC1490770otf.E, "ExternalJSProvider");
            }
        } else {
            String string = c1533790q132.LIZLLL.toString();
            this.LLILLL.LIZ(new C1299210juh<>(new Throwable(string)));
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get external js resource failed: ");
            sbLIZ.append(string);
            c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "ExternalJSProvider");
        }
        return Unit.LIZ;
    }
}
