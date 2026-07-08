package X;

import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.lynx.tasm.TemplateBundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536700q5k extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ IResourceServiceX LLILLJJLI;
    public final /* synthetic */ InterfaceC20236714Gf<C1536920q66> LLILLL;
    public final /* synthetic */ C1537480q70 LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536700q5k(long j, IResourceServiceX iResourceServiceX, C2252611DEt c2252611DEt, C1537480q70 c1537480q70, String str) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = iResourceServiceX;
        this.LLILLL = c2252611DEt;
        this.LLILZ = c1537480q70;
        this.LLILZIL = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1533790q13 c1533790q13) {
        String strLIZIZ;
        Type type;
        C1533790q13 c1533790q132 = c1533790q13;
        if (c1533790q132.LIZIZ) {
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load template cost: ");
            sbLIZ.append(System.currentTimeMillis() - this.LL);
            C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "DeferredLynxTemplateTool", 2);
            if (C1535630q41.LJIJI && (this.LLILLJJLI instanceof C1533840q18)) {
                AbstractC1534220q1k<?> abstractC1534220q1kLIZ = c1533790q132.LIZ();
                if (abstractC1534220q1kLIZ != null && (type = abstractC1534220q1kLIZ.LIZLLL) != 0) {
                    C1537480q70 c1537480q70 = this.LLILZ;
                    InterfaceC20236714Gf<C1536920q66> interfaceC20236714Gf = this.LLILLL;
                    if (type instanceof byte[]) {
                        c1537480q70.LJJ(byte[].class, type);
                        c1537480q70.LJJ(C1533790q13.class, c1533790q132);
                        c1537480q70.LJIJI();
                        C1536920q66 c1536920q66 = new C1536920q66(c1533790q132, null, (byte[]) type, null, null, 8148);
                        C189200o6.m2constructorimpl(c1536920q66);
                        interfaceC20236714Gf.resumeWith(c1536920q66);
                    } else if (type instanceof TemplateBundle) {
                        c1537480q70.LJJ(TemplateBundle.class, type);
                        c1537480q70.LJJ(C1533790q13.class, c1533790q132);
                        c1537480q70.LJIJI();
                        C1536920q66 c1536920q662 = new C1536920q66(c1533790q132, null, null, null, (TemplateBundle) type, 8028);
                        C189200o6.m2constructorimpl(c1536920q662);
                        interfaceC20236714Gf.resumeWith(c1536920q662);
                    } else {
                        c1537480q70.LJIJI();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(c1533790q132.LIZLLL);
                        sbLIZ2.append(", forest load succeeded but null bytes");
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C1536920q66 c1536920q663 = new C1536920q66(null, null, null, null, null, 8094);
                        C189200o6.m2constructorimpl(c1536920q663);
                        interfaceC20236714Gf.resumeWith(c1536920q663);
                    }
                }
            } else {
                byte[] bArrLJIIIZ = c1533790q132.LJIIIZ();
                if (bArrLJIIIZ == null) {
                    InterfaceC20236714Gf<C1536920q66> interfaceC20236714Gf2 = this.LLILLL;
                    this.LLILZ.LJIJI();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(c1533790q132.LIZLLL);
                    sbLIZ3.append(", forest load succeeded but null bytes");
                    C2188811AlT.LIZIZ(sbLIZ3);
                    C1536920q66 c1536920q664 = new C1536920q66(null, null, null, null, null, 8094);
                    C189200o6.m2constructorimpl(c1536920q664);
                    interfaceC20236714Gf2.resumeWith(c1536920q664);
                } else {
                    this.LLILZ.LJJ(byte[].class, bArrLJIIIZ);
                    this.LLILZ.LJJ(C1533790q13.class, c1533790q132);
                    InterfaceC20236714Gf<C1536920q66> interfaceC20236714Gf3 = this.LLILLL;
                    this.LLILZ.LJIJI();
                    C1536920q66 c1536920q665 = new C1536920q66(c1533790q132, null, bArrLJIIIZ, null, null, 8148);
                    C189200o6.m2constructorimpl(c1536920q665);
                    interfaceC20236714Gf3.resumeWith(c1536920q665);
                }
            }
        } else {
            InterfaceC20236714Gf<C1536920q66> interfaceC20236714Gf4 = this.LLILLL;
            this.LLILZ.LJIJI();
            C1533810q15 c1533810q15 = c1533790q132.LIZLLL;
            if (c1533810q15 == null || c1533810q15.toString() == null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("cannot get Response url: ");
                sbLIZ4.append(this.LLILZIL);
                C2188811AlT.LIZIZ(sbLIZ4);
            }
            C1536920q66 c1536920q666 = new C1536920q66(null, null, null, null, null, 8094);
            C189200o6.m2constructorimpl(c1536920q666);
            interfaceC20236714Gf4.resumeWith(c1536920q666);
            C1490740otc c1490740otc2 = C1490740otc.LIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("load template failed: ");
            C1533810q15 c1533810q152 = c1533790q132.LIZLLL;
            if (c1533810q152 == null || (strLIZIZ = c1533810q152.toString()) == null) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("cannot get Response url: ");
                sbLIZ6.append(this.LLILZIL);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
            }
            sbLIZ5.append(strLIZIZ);
            C1490740otc.LIZIZ(c1490740otc2, C2188811AlT.LIZIZ(sbLIZ5), null, "DeferredLynxTemplateTool", 2);
        }
        return Unit.LIZ;
    }
}
