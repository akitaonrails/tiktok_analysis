package X;

import com.bytedance.forest.Forest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0q5o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.lynx.hybrid.DeferredLynxTemplateTool$preCodeCache$2", f = "DeferredLynxTemplateTool.kt", l = {417, 417}, m = "invokeSuspend")
public final class C1536740q5o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1536920q66>, Object> {
    public int LL;
    public final /* synthetic */ C1537480q70 LLILLJJLI;
    public final /* synthetic */ Forest LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536740q5o(C1537480q70 c1537480q70, Forest forest, InterfaceC1364105Vn<? super C1536740q5o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1537480q70;
        this.LLILLL = forest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1536740q5o(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "DeferredLynxTemplateTool@5017.preCodeCache$2"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r7.LL
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L47
            if (r0 == r2) goto L5a
            if (r0 != r3) goto Lab
            X.C155000ia.LIZIZ(r8)
        L16:
            X.0q66 r8 = (X.C1536920q66) r8
            X.0q70 r0 = r7.LLILLJJLI
            java.lang.String r0 = r0.LJIJI()
            com.bytedance.lynx.hybrid.param.HybridSchemaParam r1 = X.C1545460qJs.LIZ(r0)
            java.lang.String r0 = r1.getUrl()
            if (r0 == 0) goto L2f
            int r0 = r0.length()
            if (r0 == 0) goto L2f
            r2 = 0
        L2f:
            if (r2 != 0) goto L3e
            java.lang.String r0 = r1.getUrl()
            android.net.Uri r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
        L39:
            com.lynx.tasm.TemplateBundle r5 = r8.LJ
            if (r5 == 0) goto L9c
            goto L6b
        L3e:
            java.lang.String r0 = r1.getSurl()
            android.net.Uri r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            goto L39
        L47:
            X.C155000ia.LIZIZ(r8)
            X.0q70 r1 = r7.LLILLJJLI
            com.bytedance.forest.Forest r0 = r7.LLILLL
            r7.LL = r2
            X.099G r8 = X.C1536900q64.LIZIZ(r1, r0)
            if (r8 != r4) goto L5d
            X.C1C7U.LIZIZ(r6)
            return r4
        L5a:
            X.C155000ia.LIZIZ(r8)
        L5d:
            X.0957 r8 = (X.AnonymousClass0957) r8
            r7.LL = r3
            java.lang.Object r8 = r8.LJLIIIL(r7)
            if (r8 != r4) goto L16
            X.C1C7U.LIZIZ(r6)
            return r4
        L6b:
            X.0q70 r2 = r7.LLILLJJLI     // Catch: java.lang.Throwable -> La0
            java.lang.Class<X.0pyf> r0 = X.C1532310pyf.class
            java.lang.Object r4 = r2.LJFF(r0)     // Catch: java.lang.Throwable -> La0
            X.0pyf r4 = (X.C1532310pyf) r4     // Catch: java.lang.Throwable -> La0
            boolean r0 = X.C1535630q41.LJIL     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L7c
            if (r4 == 0) goto L9c
            goto L8e
        L7c:
            X.0q7f r1 = X.C1537890q7f.LIZ     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> La0
            r1.getClass()     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = X.C1537890q7f.LIZIZ(r2, r0)     // Catch: java.lang.Throwable -> La0
            r0 = 0
            r5.LJI(r1, r0)     // Catch: java.lang.Throwable -> La0
            goto L9c
        L8e:
            X.0q4a r3 = X.C1535980q4a.LIZ     // Catch: java.lang.Throwable -> La0
            java.lang.String r2 = "DeferredLynxTemplateTool"
            X.0pzJ r1 = r4.LIZ     // Catch: java.lang.Throwable -> La0
            X.0pyT r0 = r4.LJII     // Catch: java.lang.Throwable -> La0
            r3.getClass()     // Catch: java.lang.Throwable -> La0
            X.C1535980q4a.LIZLLL(r2, r1, r0, r5)     // Catch: java.lang.Throwable -> La0
        L9c:
            X.C1C7U.LIZIZ(r6)     // Catch: java.lang.Throwable -> La0
            return r8
        La0:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0.getMessage()
            X.C1C7U.LIZIZ(r6)
            return r8
        Lab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1536740q5o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1536920q66> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
