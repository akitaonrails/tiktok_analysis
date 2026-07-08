package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.13Pz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20007313Pz extends AbstractC20000013Ne {
    public final /* synthetic */ C20005513Ph LIZ;
    public final /* synthetic */ List<String> LIZIZ;
    public final /* synthetic */ C13MA<String[]> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC20000013Ne
    public final void execute() {
        try {
            this.LIZ.LIZJ().LIZLLL(false, this.LIZIZ, null);
            C13MA<String[]> c13ma = this.LIZJ;
            if (c13ma != 0) {
                c13ma.onSuccess(this.LIZIZ.toArray(new String[0]));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13MA<String[]> c13ma2 = this.LIZJ;
            if (c13ma2 != null) {
                c13ma2.onFail(null, new C1662010tLr(e));
            }
        }
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
    }

    @Override // X.AbstractC20000013Ne, X.InterfaceC20001313Nr
    public final void pause(boolean z) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20007313Pz(C20005513Ph c20005513Ph, List<String> list, C13MA<String[]> c13ma, String str) {
        super(str, null);
        this.LIZ = c20005513Ph;
        this.LIZIZ = list;
        this.LIZJ = c13ma;
    }
}
