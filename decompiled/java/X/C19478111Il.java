package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11Il, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19478111Il<T> extends AbstractC19484711Kz<T> {
    public final C11IV LL;
    public final Callable<? extends T> LLILLJJLI;
    public final T LLILLL;

    @Override // X.AbstractC19484711Kz
    public final void LJJIJ(final InterfaceC19474811He<? super T> interfaceC19474811He) {
        this.LL.LIZIZ(new C11IY(interfaceC19474811He) { // from class: X.11Im
            public final InterfaceC19474811He<? super T> LL;

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
            @Override // X.C11IY
            public final void onComplete() throws Throwable {
                Object objCall;
                C19478111Il c19478111Il = this.LLILLJJLI;
                Callable<? extends T> callable = c19478111Il.LLILLJJLI;
                if (callable != 0) {
                    try {
                        objCall = callable.call();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C11SP.LIZ(th);
                        this.LL.onError(th);
                        return;
                    }
                } else {
                    objCall = c19478111Il.LLILLL;
                }
                if (objCall == null) {
                    this.LL.onError(new NullPointerException("The value supplied is null"));
                } else {
                    this.LL.onSuccess(objCall);
                }
            }

            @Override // X.C11IY
            public final void onError(Throwable th) {
                this.LL.onError(th);
            }

            @Override // X.C11IY
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                this.LL.onSubscribe(interfaceC420801kM);
            }

            {
                this.LL = interfaceC19474811He;
            }
        });
    }

    public C19478111Il(C11IV c11iv, Callable<? extends T> callable, T t) {
        this.LL = c11iv;
        this.LLILLL = t;
        this.LLILLJJLI = callable;
    }
}
