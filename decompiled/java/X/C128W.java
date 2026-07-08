package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.128W, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C128W {
    public final ViewModelStore LIZ;
    public final ViewModelProvider.Factory LIZIZ;
    public final AbstractC903280Zc6 LIZJ;
    public final C128X LIZLLL = new C128X();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.lifecycle.ViewModelStore] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.ViewModelProvider$Factory] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.lifecycle.ViewModelProvider$Factory] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.lifecycle.ViewModelProvider$Factory] */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.lifecycle.ViewModel] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.lifecycle.ViewModel] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.lifecycle.ViewModel] */
    /* JADX WARN: Type inference failed for: r1v8, types: [androidx.lifecycle.ViewModel] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13IQ] */
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
    public final ViewModel LIZ(String str, C13IQ c13iq) {
        ?? Create;
        ?? r1;
        synchronized (this.LIZLLL) {
            try {
                ViewModel viewModel = this.LIZ.get(str);
                if (c13iq.LIZIZ(viewModel)) {
                    Object obj = this.LIZIZ;
                    r1 = viewModel;
                    if (obj instanceof ViewModelProvider.OnRequeryFactory) {
                        ((ViewModelProvider.OnRequeryFactory) obj).onRequery(viewModel);
                        r1 = viewModel;
                    }
                } else {
                    C903290Zc7 c903290Zc7 = new C903290Zc7(this.LIZJ);
                    c903290Zc7.LIZIZ(ViewModelProvider.VIEW_MODEL_KEY, str);
                    ?? Create2 = this.LIZIZ;
                    try {
                        Create2 = Create2.create(c13iq, c903290Zc7);
                        Create = Create2;
                    } catch (AbstractMethodError e) {
                        TryCatchGuardChecker.doCheck(e);
                        try {
                            Create2 = Create2.create(C09R7.LIZ(c13iq), c903290Zc7);
                            Create = Create2;
                        } catch (AbstractMethodError e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            Create = Create2.create(C09R7.LIZ(c13iq));
                        }
                    }
                    this.LIZ.put(str, Create);
                    r1 = Create;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return r1;
    }

    public C128W(ViewModelStore viewModelStore, ViewModelProvider.Factory factory, AbstractC903280Zc6 abstractC903280Zc6) {
        this.LIZ = viewModelStore;
        this.LIZIZ = factory;
        this.LIZJ = abstractC903280Zc6;
    }
}
