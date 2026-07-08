package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0WXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.util.EffectTemplateCategoryFragmentExtKt$useJustSubmittedEffect$2", f = "EffectTemplateCategoryFragmentExt.kt", l = {132}, m = "invokeSuspend")
public final class C824890WXn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1625410sOp LLILLJJLI;
    public final /* synthetic */ InterfaceC497601wk LLILLL;
    public final /* synthetic */ MobileEffect LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C824890WXn(InterfaceC1625410sOp interfaceC1625410sOp, InterfaceC497601wk interfaceC497601wk, MobileEffect mobileEffect, InterfaceC1364105Vn<? super C824890WXn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1625410sOp;
        this.LLILLL = interfaceC497601wk;
        this.LLILZ = mobileEffect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C824890WXn(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0sOT, X.0sP7] */
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
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectTemplateCategoryFragmentExtKt@4fc.useJustSubmittedEffect$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1625410sOp interfaceC1625410sOp = this.LLILLJJLI;
            InterfaceC497601wk interfaceC497601wk = this.LLILLL;
            final MobileEffect mobileEffect = this.LLILZ;
            this.LL = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            ?? r0 = new InterfaceC1625190sOT() { // from class: X.0sP7
                @Override // X.InterfaceC1625190sOT
                public final <T> C1625490sOx LIZ(InterfaceC1625180sOS<T> interfaceC1625180sOS) {
                    if (interfaceC1625180sOS.LIZ() == EnumC1448980noG.RECOVER) {
                        if (c2252611DEt.isActive()) {
                            InterfaceC20236714Gf<C824880WXm> interfaceC20236714Gf = c2252611DEt;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("intercept recover. ");
                            sbLIZ.append(interfaceC1625180sOS);
                            C824880WXm c824880WXm = new C824880WXm(this, C2188811AlT.LIZIZ(sbLIZ));
                            C189200o6.m2constructorimpl(c824880WXm);
                            interfaceC20236714Gf.resumeWith(c824880WXm);
                        }
                        return new C1625490sOx(true, "block for just submitted ame effect.");
                    }
                    if ((interfaceC1625180sOS instanceof C1625440sOs) && Intrinsics.LJFF(((C1625440sOs) interfaceC1625180sOS).LIZ, mobileEffect) && c2252611DEt.isActive()) {
                        InterfaceC20236714Gf<C824880WXm> interfaceC20236714Gf2 = c2252611DEt;
                        C824880WXm c824880WXm2 = new C824880WXm(this, "intercept just submitted");
                        C189200o6.m2constructorimpl(c824880WXm2);
                        interfaceC20236714Gf2.resumeWith(c824880WXm2);
                    }
                    return new C1625490sOx();
                }
            };
            interfaceC1625410sOp.LIZIZ(r0);
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C824870WXl(c2252611DEt, r0, null), 3);
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EffectTemplateCategoryFragmentExtKt@4fc.useJustSubmittedEffect$2");
                return objLJFF;
            }
        }
        C824880WXm c824880WXm = (C824880WXm) obj;
        this.LLILLJJLI.LJ(c824880WXm.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("useJustSubmittedEffectIfNeed, removeInterceptor, reason=");
        sbLIZ.append(c824880WXm.LIZIZ);
        C201955140j.LIZIZ("EffectTemplateCategoryFragment", C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectTemplateCategoryFragmentExtKt@4fc.useJustSubmittedEffect$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
