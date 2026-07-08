package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uT3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.DefaultResourceProvider$onFetchPanelSuccess$2", f = "DefaultResourceProvider.kt", l = {}, m = "invokeSuspend")
public final class C1704910uT3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1705310uTh LL;
    public final /* synthetic */ EffectChannelResponse LLILLJJLI;
    public final /* synthetic */ AbstractC1705800uUU<T> LLILLL;
    public final /* synthetic */ InterfaceC1705380uTo<T> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1704910uT3(C1705310uTh c1705310uTh, EffectChannelResponse effectChannelResponse, AbstractC1705800uUU<T> abstractC1705800uUU, InterfaceC1705380uTo<? super T> interfaceC1705380uTo, boolean z, InterfaceC1364105Vn<? super C1704910uT3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1705310uTh;
        this.LLILLJJLI = effectChannelResponse;
        this.LLILLL = abstractC1705800uUU;
        this.LLILZ = interfaceC1705380uTo;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704910uT3(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v3 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "DefaultResourceProvider@b5b8.onFetchPanelSuccess$2"
            X.C1C7U.LIZ(r5)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r7)
            X.0uTh r0 = r6.LL
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r0.LIZIZ
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r0 = r6.LLILLJJLI
            java.util.List r0 = r0.getAllCategoryEffects()
            X.C1705310uTh.LJJ(r1, r0)
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r0 = r6.LLILLJJLI
            java.util.List r0 = r0.getAllCategoryEffects()
            X.0uTh r4 = r6.LL
            java.util.Iterator r3 = r0.iterator()
        L24:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r2
            java.util.List r0 = r2.getChildEffects()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L24
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r4.LIZIZ
            java.util.List r0 = r2.getChildEffects()
            X.C1705310uTh.LJJ(r1, r0)
            goto L24
        L46:
            X.0uUU<T> r1 = r6.LLILLL
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r0 = r6.LLILLJJLI
            java.lang.Object r2 = r1.LJ(r0)
            X.0uTo<T> r1 = r6.LLILZ
            boolean r0 = r6.LLILZIL
            r1.LIZIZ(r2, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1704910uT3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
