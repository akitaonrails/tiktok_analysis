package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11Qd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19498111Qd<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC626120Oh8<? super T> LL;
    public final long LLILLJJLI;
    public final TimeUnit LLILLL;
    public final C11RN LLILZ;
    public final boolean LLILZIL;
    public InterfaceC420801kM LLILZLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILZLL.dispose();
        this.LLILZ.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZ.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LLILZ.LIZJ(new Runnable() { // from class: X.11Qe
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    try {
                        this.LL.LL.onComplete();
                        this.LL.LLILZ.dispose();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LL.LLILZ.dispose();
                        throw th;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (!C2179971ATj.LIZ(th2)) {
                        throw th2;
                    }
                }
            }
        }, this.LLILLJJLI, this.LLILLL);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(final Throwable th) {
        long j;
        C11RN c11rn = this.LLILZ;
        Runnable runnable = new Runnable(th) { // from class: X.11Qf
            public final Throwable LL;

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    try {
                        this.LLILLJJLI.LL.onError(this.LL);
                        this.LLILLJJLI.LLILZ.dispose();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        this.LLILLJJLI.LLILZ.dispose();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    if (!C2179971ATj.LIZ(th3)) {
                        throw th3;
                    }
                }
            }

            {
                this.LL = th;
            }
        };
        if (this.LLILZIL) {
            j = this.LLILLJJLI;
        } else {
            j = 0;
        }
        c11rn.LIZJ(runnable, j, this.LLILLL);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(final T t) {
        this.LLILZ.LIZJ(new Runnable(t) { // from class: X.11Qg
            public final T LL;

            /* JADX WARN: Multi-variable type inference failed */
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
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.LLILLJJLI.LL.onNext(this.LL);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }

            {
                this.LL = t;
            }
        }, this.LLILLJJLI, this.LLILLL);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILZLL, interfaceC420801kM)) {
            this.LLILZLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C19498111Qd(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, long j, TimeUnit timeUnit, C11RN c11rn, boolean z) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = j;
        this.LLILLL = timeUnit;
        this.LLILZ = c11rn;
        this.LLILZIL = z;
    }
}
