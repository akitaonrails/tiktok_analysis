package X;

import Y.ARunnableS89S0200000_20;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0kgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1328660kgC<T> extends AbstractC1328840kgU<T, T> {
    public final /* synthetic */ C1328600kg6 LIZJ;

    @Override // X.AbstractC1328840kgU, X.AbstractC1327820keq
    public final void LJFF() {
        this.LIZIZ.LIZIZ();
        LJIIJJI();
    }

    public final void LJIIJJI() {
        Pair<InterfaceC1328020kfA<T>, InterfaceC1327930kf1> pairPoll;
        synchronized (this.LIZJ) {
            try {
                pairPoll = this.LIZJ.LIZJ.poll();
                if (pairPoll == null) {
                    C1328600kg6 c1328600kg6 = this.LIZJ;
                    c1328600kg6.LIZIZ--;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (pairPoll != null) {
            this.LIZJ.LIZLLL.execute(new ARunnableS89S0200000_20(this, pairPoll, 156));
        }
    }

    @Override // X.AbstractC1328840kgU, X.AbstractC1327820keq
    public final void LJI(Throwable th) {
        this.LIZIZ.onFailure(th);
        LJIIJJI();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1328660kgC(C1328600kg6 c1328600kg6, InterfaceC1328020kfA interfaceC1328020kfA) {
        super(interfaceC1328020kfA);
        this.LIZJ = c1328600kg6;
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
    @Override // X.AbstractC1327820keq
    public final void LJII(int i, Object obj) {
        this.LIZIZ.LIZJ(i, obj);
        if (AbstractC1327820keq.LIZLLL(i)) {
            LJIIJJI();
        }
    }
}
