package X;

import androidx.lifecycle.JediViewHolderProxyViewModelStore;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.10E7, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10E7 {
    public static final /* synthetic */ int LIZJ = 0;
    public final ViewModelProvider.Factory LIZ;
    public final JediViewHolderProxyViewModelStore LIZIZ;

    public C10E7(ViewModelProvider.Factory factory, JediViewHolderProxyViewModelStore jediViewHolderProxyViewModelStore) {
        this.LIZ = factory;
        this.LIZIZ = jediViewHolderProxyViewModelStore;
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
    public final <VM extends ViewModel> VM LIZ(String str, Class<VM> cls) {
        VM vm;
        VM vm2 = (VM) this.LIZIZ.get(str);
        if (cls.isInstance(vm2)) {
            return vm2;
        }
        synchronized (cls) {
            try {
                vm = (VM) this.LIZ.create(cls);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LIZIZ.put(str, vm);
        return vm;
    }
}
