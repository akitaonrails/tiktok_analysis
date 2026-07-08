package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.utils.PdpImagePreloadServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0miP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.utils.PdpImagePreloadServiceImpl$preloadImages$1", f = "PdpImagePreloadServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1406910miP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1406870miL LL;
    public final /* synthetic */ PdpImagePreloadServiceImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1406910miP(AbstractC1406870miL abstractC1406870miL, PdpImagePreloadServiceImpl pdpImagePreloadServiceImpl, InterfaceC1364105Vn<? super C1406910miP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1406870miL;
        this.LLILLJJLI = pdpImagePreloadServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1406910miP(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0277, code lost:
    
        if (r13.equals("sku_exchange") == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x027e, code lost:
    
        if (r13.equals("sku_enriched") == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0285, code lost:
    
        if (r13.equals("sku") == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0288, code lost:
    
        r0 = kotlin.jvm.internal.Intrinsics.LJFF(com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSkuItemImagePreloadConfig.LIZ().preloadImageOnSku, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0415, code lost:
    
        if (r2.equals("sku_exchange") == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x041c, code lost:
    
        if (r2.equals("sku_enriched") == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0424, code lost:
    
        if (r2.equals("sku") == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0428, code lost:
    
        r0 = kotlin.jvm.internal.Intrinsics.LJFF(com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSkuItemImagePreloadConfig.LIZ().preloadImageOnSku, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04c3, code lost:
    
        if (r11.equals("sku_exchange") == false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x04ca, code lost:
    
        if (r11.equals("sku_enriched") == false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04d1, code lost:
    
        if (r11.equals("sku") == false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04d4, code lost:
    
        r0 = kotlin.jvm.internal.Intrinsics.LJFF(com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSkuItemImagePreloadConfig.LIZ().preloadImageOnSku, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05e5, code lost:
    
        if (r1.equals("sku_exchange") == false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x05ec, code lost:
    
        if (r1.equals("sku_enriched") == false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x05f3, code lost:
    
        if (r1.equals("sku") == false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x05f6, code lost:
    
        r0 = kotlin.jvm.internal.Intrinsics.LJFF(com.ss.android.ugc.aweme.ecommerce.core.ab.EcomProductDescriptionImagePreloadConfig.LIZ().preloadImageOnSku, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x06ba, code lost:
    
        if (r1.equals("sku_exchange") == false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x06c1, code lost:
    
        if (r1.equals("sku_enriched") == false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x06c8, code lost:
    
        if (r1.equals("sku") == false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x06cb, code lost:
    
        r0 = kotlin.jvm.internal.Intrinsics.LJFF(com.ss.android.ugc.aweme.ecommerce.core.ab.EcomProductDescriptionImagePreloadConfig.LIZ().preloadImageOnSku, r3);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03fe A[PHI: r1 r11
      0x03fe: PHI (r1v26 int) = (r1v25 int), (r1v30 int) binds: [B:217:0x03f9, B:203:0x03b6] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r11v5 int) = (r11v3 int), (r11v9 int) binds: [B:217:0x03f9, B:203:0x03b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x044c A[PHI: r2 r11
      0x044c: PHI (r2v11 int) = (r2v8 int), (r2v12 int) binds: [B:238:0x044b, B:204:0x03b8] A[DONT_GENERATE, DONT_INLINE]
      0x044c: PHI (r11v6 int) = (r11v0 int), (r11v7 int) binds: [B:238:0x044b, B:204:0x03b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x06e5  */
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
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 1896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1406910miP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
