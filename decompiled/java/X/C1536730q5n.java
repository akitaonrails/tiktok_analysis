package X;

import com.lynx.tasm.TemplateBundle;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q5n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536730q5n extends C09AY implements Function1<C1532310pyf, Unit> {
    public final /* synthetic */ AbstractC1536860q60 LL;
    public final /* synthetic */ C1537480q70 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536730q5n(AbstractC1536860q60 abstractC1536860q60, C1537480q70 c1537480q70) {
        super(1);
        this.LL = abstractC1536860q60;
        this.LLILLJJLI = c1537480q70;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1532310pyf c1532310pyf) {
        Type type;
        C1532310pyf c1532310pyf2 = c1532310pyf;
        if (c1532310pyf2.isSuccess()) {
            if (C1535630q41.LJIJI) {
                AbstractC1532350pyj<?> abstractC1532350pyjLJII = c1532310pyf2.LJII();
                if (abstractC1532350pyjLJII != null && (type = abstractC1532350pyjLJII.LIZ) != 0) {
                    C1537480q70 c1537480q70 = this.LLILLJJLI;
                    AbstractC1536860q60 abstractC1536860q60 = this.LL;
                    if (type instanceof ByteBuffer) {
                        c1537480q70.LJJ(ByteBuffer.class, type);
                        c1537480q70.LJJ(C1532310pyf.class, c1532310pyf2);
                        if (abstractC1536860q60 != null) {
                            abstractC1536860q60.LJI(null, null, c1532310pyf2);
                        }
                    } else if (type instanceof byte[]) {
                        c1537480q70.LJJ(byte[].class, type);
                        c1537480q70.LJJ(C1532310pyf.class, c1532310pyf2);
                        if (abstractC1536860q60 != null) {
                            abstractC1536860q60.LJI((byte[]) type, null, c1532310pyf2);
                        }
                    } else if (type instanceof TemplateBundle) {
                        c1537480q70.LJJ(TemplateBundle.class, type);
                        c1537480q70.LJJ(C1532310pyf.class, c1532310pyf2);
                        if (abstractC1536860q60 != null) {
                            abstractC1536860q60.LJI(null, null, c1532310pyf2);
                        }
                    } else if (abstractC1536860q60 != null) {
                        abstractC1536860q60.LJ(c1532310pyf2.LIZJ.LIZJ());
                    }
                }
            } else {
                byte[] bArrLJIIJ = c1532310pyf2.LJIIJ();
                if (bArrLJIIJ == null) {
                    AbstractC1536860q60 abstractC1536860q602 = this.LL;
                    if (abstractC1536860q602 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c1532310pyf2.LIZJ.LIZJ());
                        sbLIZ.append(", forest load succeeded but null bytes");
                        abstractC1536860q602.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    this.LLILLJJLI.LJJ(byte[].class, bArrLJIIJ);
                    this.LLILLJJLI.LJJ(C1532310pyf.class, c1532310pyf2);
                    AbstractC1536860q60 abstractC1536860q603 = this.LL;
                    if (abstractC1536860q603 != null) {
                        abstractC1536860q603.LJI(bArrLJIIJ, null, c1532310pyf2);
                    }
                }
            }
        } else {
            AbstractC1536860q60 abstractC1536860q604 = this.LL;
            if (abstractC1536860q604 != null) {
                abstractC1536860q604.LJ(c1532310pyf2.LIZJ.LIZJ());
            }
        }
        return Unit.LIZ;
    }
}
