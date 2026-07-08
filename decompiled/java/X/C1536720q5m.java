package X;

import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.lynx.tasm.TemplateBundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536720q5m extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ IResourceServiceX LL;
    public final /* synthetic */ AbstractC1536860q60 LLILLJJLI;
    public final /* synthetic */ C1537480q70 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536720q5m(IResourceServiceX iResourceServiceX, AbstractC1536860q60 abstractC1536860q60, C1537480q70 c1537480q70) {
        super(1);
        this.LL = iResourceServiceX;
        this.LLILLJJLI = abstractC1536860q60;
        this.LLILLL = c1537480q70;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1533790q13 c1533790q13) {
        Type type;
        C1533790q13 c1533790q132 = c1533790q13;
        if (c1533790q132.LIZIZ) {
            if (C1535630q41.LJIJI && (this.LL instanceof C1533840q18)) {
                AbstractC1534220q1k<?> abstractC1534220q1kLIZ = c1533790q132.LIZ();
                if (abstractC1534220q1kLIZ != null && (type = abstractC1534220q1kLIZ.LIZLLL) != 0) {
                    C1537480q70 c1537480q70 = this.LLILLL;
                    AbstractC1536860q60 abstractC1536860q60 = this.LLILLJJLI;
                    if (type instanceof byte[]) {
                        c1537480q70.LJJ(byte[].class, type);
                        c1537480q70.LJJ(C1533790q13.class, c1533790q132);
                        if (abstractC1536860q60 != null) {
                            abstractC1536860q60.LJI((byte[]) type, c1533790q132, null);
                        }
                    } else if (type instanceof TemplateBundle) {
                        c1537480q70.LJJ(TemplateBundle.class, type);
                        c1537480q70.LJJ(C1533790q13.class, c1533790q132);
                        if (abstractC1536860q60 != null) {
                            abstractC1536860q60.LJI(null, c1533790q132, null);
                        }
                    } else if (abstractC1536860q60 != null) {
                        abstractC1536860q60.LJ(c1533790q132.LIZLLL.toString());
                    }
                }
            } else {
                byte[] bArrLJIIIZ = c1533790q132.LJIIIZ();
                if (bArrLJIIIZ == null) {
                    AbstractC1536860q60 abstractC1536860q602 = this.LLILLJJLI;
                    if (abstractC1536860q602 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c1533790q132.LIZLLL);
                        sbLIZ.append(", forest load succeeded but null bytes");
                        abstractC1536860q602.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    this.LLILLL.LJJ(byte[].class, bArrLJIIIZ);
                    this.LLILLL.LJJ(C1533790q13.class, c1533790q132);
                    AbstractC1536860q60 abstractC1536860q603 = this.LLILLJJLI;
                    if (abstractC1536860q603 != null) {
                        abstractC1536860q603.LJI(bArrLJIIIZ, c1533790q132, null);
                    }
                }
            }
        } else {
            AbstractC1536860q60 abstractC1536860q604 = this.LLILLJJLI;
            if (abstractC1536860q604 != null) {
                abstractC1536860q604.LJ(c1533790q132.LIZLLL.toString());
            }
        }
        return Unit.LIZ;
    }
}
