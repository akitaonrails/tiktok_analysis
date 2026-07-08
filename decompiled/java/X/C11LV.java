package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.11LV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11LV<T> implements InterfaceC19474811He<T> {
    public final C19484811La LL;
    public final InterfaceC19474811He<? super T> LLILLJJLI;
    public final /* synthetic */ C11LU LLILLL;

    @Override // X.InterfaceC19474811He
    public final void onError(final Throwable th) {
        long j;
        C19484811La c19484811La = this.LL;
        C11LU c11lu = this.LLILLL;
        C11RO c11ro = c11lu.LLILZ;
        Runnable runnable = new Runnable(th) { // from class: X.11LX
            public final Throwable LL;

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.LLILLJJLI.LLILLJJLI.onError(this.LL);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (!C2179971ATj.LIZ(th2)) {
                        throw th2;
                    }
                }
            }

            {
                this.LL = th;
            }
        };
        if (c11lu.LLILZIL) {
            j = c11lu.LLILLJJLI;
        } else {
            j = 0;
        }
        c19484811La.replace(c11ro.LIZJ(runnable, j, c11lu.LLILLL));
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        this.LL.replace(interfaceC420801kM);
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(final T t) {
        C19484811La c19484811La = this.LL;
        C11LU c11lu = this.LLILLL;
        c19484811La.replace(c11lu.LLILZ.LIZJ(new Runnable(t) { // from class: X.11LW
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
                    this.LLILLJJLI.LLILLJJLI.onSuccess(this.LL);
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
        }, c11lu.LLILLJJLI, c11lu.LLILLL));
    }

    public C11LV(C11LU c11lu, C19484811La c19484811La, InterfaceC19474811He<? super T> interfaceC19474811He) {
        this.LLILLL = c11lu;
        this.LL = c19484811La;
        this.LLILLJJLI = interfaceC19474811He;
    }
}
