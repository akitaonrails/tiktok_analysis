package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04Af, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1053904Af extends C09AY implements Function1<PdpMainState, PdpMainState> {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ ProductPackStruct LLILLJJLI;
    public final /* synthetic */ PdpViewModel LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1053904Af(C118300cf c118300cf, ProductPackStruct productPackStruct, PdpViewModel pdpViewModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(1);
        this.LL = c118300cf;
        this.LLILLJJLI = productPackStruct;
        this.LLILLL = pdpViewModel;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
        this.LLIZ = z4;
        this.LLIZLLLIL = z5;
        this.LLJ = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0171 A[PHI: r12
      0x0171: PHI (r12v20 java.lang.String) = (r12v19 java.lang.String), (r12v22 java.lang.String), (r12v22 java.lang.String), (r12v22 java.lang.String) binds: [B:92:0x0132, B:94:0x0136, B:96:0x013a, B:98:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0358 A[PHI: r4 r14
      0x0358: PHI (r4v22 int) = (r4v21 int), (r4v29 int), (r4v29 int) binds: [B:243:0x0354, B:208:0x029b, B:210:0x029f] A[DONT_GENERATE, DONT_INLINE]
      0x0358: PHI (r14v15 com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem) = 
      (r14v14 com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem)
      (r14v18 com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem)
      (r14v18 com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem)
     binds: [B:243:0x0354, B:208:0x029b, B:210:0x029f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0537 A[PHI: r3
      0x0537: PHI (r3v163 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = 
      (r3v162 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
      (r3v170 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
     binds: [B:358:0x0535, B:350:0x0521] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0134 A[PHI: r12
      0x0134: PHI (r12v22 java.lang.String) = (r12v19 java.lang.String), (r12v23 java.lang.String) binds: [B:92:0x0132, B:90:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v0, types: [T, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r10v9, types: [T, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String[]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState invoke(com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState r49) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053904Af.invoke(java.lang.Object):java.lang.Object");
    }
}
