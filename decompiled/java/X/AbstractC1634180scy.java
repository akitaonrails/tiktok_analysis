package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0scy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1634180scy<RESULT, INFO> implements InterfaceC1632640saU<Effect, RESULT, INFO> {
    public final Function0<InterfaceC1635390sev> LIZ;

    public abstract Exception LIZLLL(ExceptionResult exceptionResult);

    public abstract C1634230sd3 LJ(Effect effect, Effect effect2, ExceptionResult exceptionResult);

    public abstract C1634230sd3 LJFF(Effect effect, Effect effect2);

    public abstract Effect LJI(Effect effect, Effect effect2);

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1634180scy(Function0<? extends InterfaceC1635390sev> function0) {
        this.LIZ = function0;
    }

    @Override // X.InterfaceC1632640saU
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public void LIZIZ(final Effect effect, final InterfaceC1632620saS<Effect, RESULT, INFO> interfaceC1632620saS) {
        this.LIZ.invoke().LJIIL(effect, new IEffectDownloadProgressListener() { // from class: X.0scz
            public long LIZ = System.currentTimeMillis();

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect2) {
                this.LIZ = System.currentTimeMillis();
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
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v1 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                */
            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(com.ss.android.ugc.effectmanager.effect.model.Effect r9) {
                /*
                    r8 = this;
                    com.ss.android.ugc.effectmanager.effect.model.Effect r9 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r9
                    long r6 = java.lang.System.currentTimeMillis()
                    long r0 = r8.LIZ
                    long r6 = r6 - r0
                    X.0saS<com.ss.android.ugc.effectmanager.effect.model.Effect, RESULT, INFO> r2 = r3
                    com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r4
                    X.0scy<RESULT, INFO> r0 = r5
                    com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r0.LJI(r3, r9)
                    X.0scy<RESULT, INFO> r1 = r5
                    com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r4
                    X.0sd3 r5 = r1.LJFF(r0, r9)
                    r2.LIZ(r3, r4, r5, r6)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1634190scz.onSuccess(java.lang.Object):void");
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
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v1 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                */
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(com.ss.android.ugc.effectmanager.effect.model.Effect r9, com.ss.android.ugc.effectmanager.common.task.ExceptionResult r10) {
                /*
                    r8 = this;
                    long r6 = java.lang.System.currentTimeMillis()
                    long r0 = r8.LIZ
                    long r6 = r6 - r0
                    X.0saS<com.ss.android.ugc.effectmanager.effect.model.Effect, RESULT, INFO> r2 = r3
                    com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r4
                    X.0scy<RESULT, INFO> r0 = r5
                    java.lang.Exception r4 = r0.LIZLLL(r10)
                    X.0scy<RESULT, INFO> r1 = r5
                    com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r4
                    X.0sd3 r5 = r1.LJ(r0, r9, r10)
                    r2.LIZIZ(r3, r4, r5, r6)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1634190scz.onFail(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.common.task.ExceptionResult):void");
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
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
            public final void onProgress(Effect effect2, int i, long j) {
                interfaceC1632620saS.LIZJ(i, effect);
            }
        });
    }
}
