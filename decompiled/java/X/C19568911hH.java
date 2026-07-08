package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11hH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editSticker.text.effect.EffectDownloadListener$onSuccessed$1", f = "EffectTextResDownloader.kt", l = {60, 61}, m = "invokeSuspend")
public final class C19568911hH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19568811hG<T> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19568911hH(C19568811hG<T> c19568811hG, InterfaceC1364105Vn<? super C19568911hH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19568811hG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19568911hH(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "EffectDownloadListener@e3c.onSuccessed$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L4d
            if (r0 == r1) goto L66
            if (r0 != r2) goto L7f
            X.C155000ia.LIZIZ(r6)
        L16:
            X.11hG<T> r0 = r5.LLILLJJLI
            X.11hC<T extends X.11UL, java.lang.Void> r1 = r0.LL
            r0 = 3
            r1.LIZ(r0)
            X.11hG<T> r0 = r5.LLILLJJLI
            X.11hC<T extends X.11UL, java.lang.Void> r1 = r0.LL
            r1.getClass()
            X.11hF<T extends X.11UL, java.lang.Void> r0 = r0.LLILLL
            r0.LIZ(r1)
            X.11hG<T> r0 = r5.LLILLJJLI
            X.11hC<T extends X.11UL, java.lang.Void> r0 = r0.LL
            Param r1 = r0.LIZIZ
            boolean r0 = r1 instanceof X.C11UK
            if (r0 == 0) goto L41
            X.11hM r0 = X.C196916122o.LIZJ
            if (r0 == 0) goto L3b
            r0.LIZIZ()
        L3b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L41:
            boolean r0 = r1 instanceof X.C2280608we
            if (r0 == 0) goto L3b
            X.11hM r0 = X.C196916122o.LIZJ
            if (r0 == 0) goto L3b
            r0.LIZJ()
            goto L3b
        L4d:
            X.C155000ia.LIZIZ(r6)
            X.11hG<T> r0 = r5.LLILLJJLI
            X.11hC<T extends X.11UL, java.lang.Void> r0 = r0.LL
            Param r0 = r0.LIZIZ
            X.11UL r0 = (X.C11UL) r0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.effect
            r5.LL = r1
            java.lang.Object r0 = X.C2223808nU.LIZIZ(r0, r5)
            if (r0 != r3) goto L69
            X.C1C7U.LIZIZ(r4)
            return r3
        L66:
            X.C155000ia.LIZIZ(r6)
        L69:
            X.11hG<T> r0 = r5.LLILLJJLI
            kotlin.jvm.functions.Function2<T extends X.11UL, X.05Vn<? super kotlin.Unit>, java.lang.Object> r1 = r0.LLILLJJLI
            if (r1 == 0) goto L16
            X.11hC<T extends X.11UL, java.lang.Void> r0 = r0.LL
            Param r0 = r0.LIZIZ
            r5.LL = r2
            java.lang.Object r0 = r1.invoke(r0, r5)
            if (r0 != r3) goto L16
            X.C1C7U.LIZIZ(r4)
            return r3
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19568911hH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
