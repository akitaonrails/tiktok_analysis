package X;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mK9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391870mK9<E> {
    public final int LIZ;
    public final C13E8<E> LIZIZ;

    public final String toString() {
        return this.LIZIZ.toString();
    }

    public C1391870mK9(int i) {
        this.LIZ = i;
        this.LIZIZ = new C13E8<>(i);
    }

    public final void LIZ(E e) {
        if (this.LIZIZ.size() == this.LIZ) {
            this.LIZIZ.removeFirst();
        }
        this.LIZIZ.addLast(e);
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
    public final void LIZIZ(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (E e : this.LIZIZ) {
            if (!z && Intrinsics.LJFF(e, obj)) {
                z = true;
            } else {
                arrayList.add(e);
            }
        }
        if (z) {
            this.LIZIZ.clear();
            this.LIZIZ.addAll(arrayList);
        }
    }
}
