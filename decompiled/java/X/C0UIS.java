package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UIS, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.sticker.StickerMonitorEffectHelper$applyMonitorEffect$1", f = "StickerMonitorEffectHelper.kt", l = {94, 100, 101}, m = "invokeSuspend")
public final class C0UIS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public LiveEffect LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ Runnable LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UIS(Runnable runnable, String str, String str2, boolean z, InterfaceC1364105Vn<? super C0UIS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = runnable;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0UIS c0uis = new C0UIS(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c0uis.LLILZIL = obj;
        return c0uis;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "StickerMonitorEffectHelper@a9e4.applyMonitorEffect$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r9.LLILZ
            r5 = 3
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L28
            if (r0 == r6) goto L45
            if (r0 == r7) goto L6a
            if (r0 != r5) goto L94
            java.lang.Object r0 = r9.LLILZIL
            X.C155000ia.LIZIZ(r10)
        L1b:
            if (r0 != 0) goto L22
        L1d:
            java.lang.Runnable r0 = r9.LLILZLL
            r0.run()
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L28:
            X.C155000ia.LIZIZ(r10)
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r10 = X.C0UIT.LIZIZ
            if (r10 != 0) goto L50
            java.lang.String r3 = r9.LLIZ
            java.lang.String r2 = r9.LLIZLLLIL
            boolean r1 = r9.LLJ
            X.0UIT r0 = X.C0UIT.LIZ
            r9.LLILLL = r1
            r9.LLILZ = r6
            java.lang.Object r10 = r0.LIZLLL(r3, r2, r9)
            if (r10 != r4) goto L4a
            X.C1C7U.LIZIZ(r8)
            return r4
        L45:
            boolean r1 = r9.LLILLL
            X.C155000ia.LIZIZ(r10)
        L4a:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r10 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r10
            if (r1 == 0) goto L50
            X.C0UIT.LIZIZ = r10
        L50:
            if (r10 == 0) goto L1d
            java.lang.Runnable r3 = r9.LLILZLL
            X.0UIT r0 = X.C0UIT.LIZ
            r9.LLILZIL = r10
            r9.LL = r3
            r9.LLILLJJLI = r10
            r9.LLILZ = r7
            java.lang.Object r0 = r0.LIZJ(r10, r9)
            if (r0 != r4) goto L68
            X.C1C7U.LIZIZ(r8)
            return r4
        L68:
            r6 = r10
            goto L76
        L6a:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r6 = r9.LLILLJJLI
            java.lang.Object r3 = r9.LL
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            java.lang.Object r0 = r9.LLILZIL
            X.C155000ia.LIZIZ(r10)
            r10 = r0
        L76:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0UIR r1 = new X.0UIR
            r0 = 0
            r1.<init>(r6, r3, r0)
            r9.LLILZIL = r10
            r9.LL = r0
            r9.LLILLJJLI = r0
            r9.LLILZ = r5
            java.lang.Object r0 = X.C23250099c.LJI(r9, r2, r1)
            if (r0 != r4) goto L92
            X.C1C7U.LIZIZ(r8)
            return r4
        L92:
            r0 = r10
            goto L1b
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UIS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
