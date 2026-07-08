package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uT4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.DefaultResourceProvider$onFetchCategorySuccess$2", f = "DefaultResourceProvider.kt", l = {}, m = "invokeSuspend")
public final class C1704920uT4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1705310uTh LL;
    public final /* synthetic */ CategoryPageModel LLILLJJLI;
    public final /* synthetic */ AbstractC1705790uUT<T> LLILLL;
    public final /* synthetic */ InterfaceC1705380uTo<T> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1704920uT4(C1705310uTh c1705310uTh, CategoryPageModel categoryPageModel, AbstractC1705790uUT<T> abstractC1705790uUT, InterfaceC1705380uTo<? super T> interfaceC1705380uTo, boolean z, InterfaceC1364105Vn<? super C1704920uT4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1705310uTh;
        this.LLILLJJLI = categoryPageModel;
        this.LLILLL = abstractC1705790uUT;
        this.LLILZ = interfaceC1705380uTo;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704920uT4(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v1 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.String r3 = "DefaultResourceProvider@b5b8.onFetchCategorySuccess$2"
            X.C1C7U.LIZ(r3)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r5)
            X.0uTh r0 = r4.LL
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r0.LIZIZ
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r0 = r4.LLILLJJLI
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r0 = r0.getCategoryEffects()
            if (r0 == 0) goto L59
            java.util.List r0 = r0.getEffects()
        L1b:
            X.C1705310uTh.LJJ(r1, r0)
            X.0uUT<T> r1 = r4.LLILLL
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r0 = r4.LLILLJJLI
            java.lang.Object r2 = r1.LJ(r0)
            X.0uTo<T> r1 = r4.LLILZ
            boolean r0 = r4.LLILZIL
            r1.LIZIZ(r2, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onFetchCategorySuccess(listener = "
            r1.append(r0)
            X.0uTo<T> r0 = r4.LLILZ
            r1.append(r0)
            java.lang.String r0 = ", cache = "
            r1.append(r0)
            boolean r0 = r4.LLILZIL
            r1.append(r0)
            java.lang.String r0 = ",)"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "DefaultResourceProvider"
            X.C1706630uVp.LJFF(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r3)
            return r0
        L59:
            r0 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1704920uT4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
