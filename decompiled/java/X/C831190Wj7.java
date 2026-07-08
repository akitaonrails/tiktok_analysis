package X;

import com.google.android.gms.common.Feature;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Wj7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831190Wj7 extends AbstractC831200Wj8<Boolean> {
    public final C831450WjX<?> LIZJ;

    @Override // X.AbstractC831170Wj5
    public final /* bridge */ /* synthetic */ void LIZLLL(C831150Wj3 c831150Wj3, boolean z) {
    }

    @Override // X.AbstractC831260WjE
    public final boolean LJFF(C831140Wj2<?> c831140Wj2) {
        C831270WjF c831270WjF = (C831270WjF) ((HashMap) c831140Wj2.LLILZLL).get(this.LIZJ);
        if (c831270WjF != null && c831270WjF.LIZ.LIZJ) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC831260WjE
    public final Feature[] LJI(C831140Wj2<?> c831140Wj2) {
        C831270WjF c831270WjF = (C831270WjF) ((HashMap) c831140Wj2.LLILZLL).get(this.LIZJ);
        if (c831270WjF == null) {
            return null;
        }
        return c831270WjF.LIZ.LIZIZ;
    }

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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v7 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // X.AbstractC831200Wj8
    public final void LJII(X.C831140Wj2<?> r5) {
        /*
            r4 = this;
            java.util.Map<X.0WjX<?>, X.0WjF> r1 = r5.LLILZLL
            X.0WjX<?> r0 = r4.LIZJ
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r3 = r1.remove(r0)
            X.0WjF r3 = (X.C831270WjF) r3
            if (r3 == 0) goto L25
            X.0Wjd<java.lang.Object, ?> r0 = r3.LIZIZ
            X.0Wj4 r2 = r5.LLILLJJLI
            X.0Wq6<T> r1 = r4.LIZIZ
            X.0Wji r0 = (X.C831560Wji) r0
            X.0WjK r0 = r0.LIZIZ
            X.0WjH<A, X.0Wq6<java.lang.Boolean>> r0 = r0.LIZIZ
            r0.LIZ(r2, r1)
            X.0WjJ<java.lang.Object, ?> r0 = r3.LIZ
            X.0WjV<L> r1 = r0.LIZ
            r0 = 0
            r1.LIZIZ = r0
            return
        L25:
            X.0Wq6<T> r1 = r4.LIZIZ
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.LIZLLL(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C831190Wj7.LJII(X.0Wj2):void");
    }

    public C831190Wj7(C831450WjX<?> c831450WjX, C835520Wq6<Boolean> c835520Wq6) {
        super(4, c835520Wq6);
        this.LIZJ = c831450WjX;
    }
}
