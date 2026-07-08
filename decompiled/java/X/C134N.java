package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: X.134N, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C134N<V> extends C134M<V> {
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
    public final boolean LJIIIZ(V v) {
        if (v == null) {
            v = (V) C134M.LLIZ;
        }
        if (C134M.LLILZLL.LIZIZ(this, null, v)) {
            C134M.LIZIZ(this);
            return true;
        }
        return false;
    }

    public final boolean LJIIJ(Throwable th) {
        th.getClass();
        if (C134M.LLILZLL.LIZIZ(this, null, new C134V(th))) {
            C134M.LIZIZ(this);
            return true;
        }
        return false;
    }

    public final boolean LJIIL(ListenableFuture<? extends V> listenableFuture) {
        C134V c134v;
        listenableFuture.getClass();
        Object obj = this.LL;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!C134M.LLILZLL.LIZIZ(this, null, C134M.LJ(listenableFuture))) {
                    return false;
                }
                C134M.LIZIZ(this);
            } else {
                C134O c134o = new C134O(this, listenableFuture);
                if (C134M.LLILZLL.LIZIZ(this, null, c134o)) {
                    try {
                        listenableFuture.LJIIJJI(c134o, AnonymousClass0807.LL);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            c134v = new C134V(th);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c134v = C134V.LIZIZ;
                        }
                        C134M.LLILZLL.LIZIZ(this, c134o, c134v);
                    }
                } else {
                    obj = this.LL;
                }
            }
            return true;
        }
        if (!(obj instanceof C134U)) {
            return false;
        }
        listenableFuture.cancel(((C134U) obj).LIZ);
        return false;
    }
}
