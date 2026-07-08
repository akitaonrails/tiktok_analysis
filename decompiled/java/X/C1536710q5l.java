package X;

import com.lynx.tasm.TemplateBundle;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q5l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536710q5l extends C09AY implements Function1<C1532310pyf, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ InterfaceC20236714Gf<C1536920q66> LLILLJJLI;
    public final /* synthetic */ C1537480q70 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536710q5l(long j, C2252611DEt c2252611DEt, C1537480q70 c1537480q70) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = c2252611DEt;
        this.LLILLL = c1537480q70;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1532310pyf c1532310pyf) {
        Type type;
        C1532310pyf c1532310pyf2 = c1532310pyf;
        if (c1532310pyf2.isSuccess()) {
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load template cost: ");
            sbLIZ.append(System.currentTimeMillis() - this.LL);
            C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "DeferredLynxTemplateTool", 2);
            if (C1535630q41.LJIJI) {
                AbstractC1532350pyj<?> abstractC1532350pyjLJII = c1532310pyf2.LJII();
                if (abstractC1532350pyjLJII != null && (type = abstractC1532350pyjLJII.LIZ) != 0) {
                    C1537480q70 c1537480q70 = this.LLILLL;
                    InterfaceC20236714Gf<C1536920q66> interfaceC20236714Gf = this.LLILLJJLI;
                    if (type instanceof ByteBuffer) {
                        c1537480q70.LJJ(ByteBuffer.class, type);
                        c1537480q70.LJJ(C1532310pyf.class, c1532310pyf2);
                        c1537480q70.LJIJI();
                        C1536920q66 c1536920q66 = new C1536920q66(null, c1532310pyf2, null, (ByteBuffer) type, null, 8138);
                        C189200o6.m2constructorimpl(c1536920q66);
                        interfaceC20236714Gf.resumeWith(c1536920q66);
                    } else if (type instanceof byte[]) {
                        c1537480q70.LJJ(byte[].class, type);
                        c1537480q70.LJJ(C1532310pyf.class, c1532310pyf2);
                        c1537480q70.LJIJI();
                        C1536920q66 c1536920q662 = new C1536920q66(null, c1532310pyf2, (byte[]) type, null, null, 8146);
                        C189200o6.m2constructorimpl(c1536920q662);
                        interfaceC20236714Gf.resumeWith(c1536920q662);
                    } else if (type instanceof TemplateBundle) {
                        c1537480q70.LJJ(TemplateBundle.class, type);
                        c1537480q70.LJJ(C1532310pyf.class, c1532310pyf2);
                        c1537480q70.LJIJI();
                        C1536920q66 c1536920q663 = new C1536920q66(null, c1532310pyf2, null, null, (TemplateBundle) type, 8026);
                        C189200o6.m2constructorimpl(c1536920q663);
                        interfaceC20236714Gf.resumeWith(c1536920q663);
                    } else {
                        c1537480q70.LJIJI();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(c1532310pyf2.LIZJ.LIZJ());
                        sbLIZ2.append(", forestx load succeeded but null bytes");
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C1536920q66 c1536920q664 = new C1536920q66(null, null, null, null, null, 8094);
                        C189200o6.m2constructorimpl(c1536920q664);
                        interfaceC20236714Gf.resumeWith(c1536920q664);
                    }
                }
            } else {
                byte[] bArrLJIIJ = c1532310pyf2.LJIIJ();
                if (bArrLJIIJ == null) {
                    InterfaceC20236714Gf<C1536920q66> interfaceC20236714Gf2 = this.LLILLJJLI;
                    this.LLILLL.LJIJI();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(c1532310pyf2.LIZJ.LIZJ());
                    sbLIZ3.append(", forestx load succeeded but null bytes");
                    C2188811AlT.LIZIZ(sbLIZ3);
                    C1536920q66 c1536920q665 = new C1536920q66(null, null, null, null, null, 8094);
                    C189200o6.m2constructorimpl(c1536920q665);
                    interfaceC20236714Gf2.resumeWith(c1536920q665);
                } else {
                    this.LLILLL.LJJ(byte[].class, bArrLJIIJ);
                    this.LLILLL.LJJ(C1532310pyf.class, c1532310pyf2);
                    InterfaceC20236714Gf<C1536920q66> interfaceC20236714Gf3 = this.LLILLJJLI;
                    this.LLILLL.LJIJI();
                    C1536920q66 c1536920q666 = new C1536920q66(null, c1532310pyf2, bArrLJIIJ, null, null, 8146);
                    C189200o6.m2constructorimpl(c1536920q666);
                    interfaceC20236714Gf3.resumeWith(c1536920q666);
                }
            }
        } else {
            InterfaceC20236714Gf<C1536920q66> interfaceC20236714Gf4 = this.LLILLJJLI;
            this.LLILLL.LJIJI();
            c1532310pyf2.LIZJ.LIZJ();
            C1536920q66 c1536920q667 = new C1536920q66(null, null, null, null, null, 8094);
            C189200o6.m2constructorimpl(c1536920q667);
            interfaceC20236714Gf4.resumeWith(c1536920q667);
            C1490740otc c1490740otc2 = C1490740otc.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("load template failed: ");
            sbLIZ4.append(c1532310pyf2.LIZJ.LIZJ());
            C1490740otc.LIZIZ(c1490740otc2, C2188811AlT.LIZIZ(sbLIZ4), null, "DeferredLynxTemplateTool", 2);
        }
        return Unit.LIZ;
    }
}
