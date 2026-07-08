package com.bytedance.als;

import X.C259800zU;
import X.C385670FAf;
import X.C540930LJj;
import Y.AObjectS303S0200000_8;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LiveStateTransformationsKt {
    /* JADX WARN: Type inference failed for: r0v3, types: [T, X.0FAf<R>, X.0LJi] */
    public static final <T, R> C385670FAf<R> LIZ(final C385670FAf<T> c385670FAf, Function1<? super T, ? extends R> function1) {
        C259800zU c259800zU = new C259800zU();
        final AObjectS303S0200000_8 aObjectS303S0200000_8 = new AObjectS303S0200000_8(c259800zU, function1, 0);
        final MutableLiveData<R> mutableLiveData = new MutableLiveData<R>(function1.invoke(c385670FAf.LIZJ())) { // from class: com.bytedance.als.LiveStateTransformationsKt$map$liveData$1
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
            @Override // androidx.lifecycle.LiveData
            public void onActive() {
                super.onActive();
                c385670FAf.LIZLLL(aObjectS303S0200000_8);
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
            @Override // androidx.lifecycle.LiveData
            public void onInactive() {
                super.onInactive();
                c385670FAf.LIZIZ(aObjectS303S0200000_8);
            }
        };
        C540930LJj<T> c540930LJj = new C540930LJj<T>(mutableLiveData) { // from class: X.0LJi
            @Override // X.C540930LJj, X.C385670FAf
            public final void LJFF(T t) {
                if (!Intrinsics.LJFF(LIZJ(), t)) {
                    super.LJFF(t);
                }
            }

            @Override // X.C540930LJj
            public final void LJII(T t) {
                if (!Intrinsics.LJFF(LIZJ(), t)) {
                    super.LJII(t);
                }
            }
        };
        c259800zU.element = c540930LJj;
        return c540930LJj;
    }
}
