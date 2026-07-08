package X;

/* JADX INFO: Add missing generic type declarations: [U] */
/* JADX INFO: renamed from: X.11R0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11R0<U> implements InterfaceC626120Oh8<U> {
    public final C19484811La LL;
    public final InterfaceC626120Oh8<? super T> LLILLJJLI;
    public boolean LLILLL;
    public final /* synthetic */ C19500311Qz LLILZ;

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
    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        this.LLILZ.LL.LIZIZ(new InterfaceC626120Oh8<T>() { // from class: X.11R1
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
                this.LL.LLILLJJLI.onComplete();
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
                this.LL.LLILLJJLI.onError(th);
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(T t) {
                this.LL.LLILLJJLI.onNext(t);
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                this.LL.LL.update(interfaceC420801kM);
            }
        });
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILLL) {
            C19489211Ms.LIZIZ(th);
        } else {
            this.LLILLL = true;
            this.LLILLJJLI.onError(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(U u) {
        onComplete();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        this.LL.update(interfaceC420801kM);
    }

    public C11R0(C19500311Qz c19500311Qz, C19484811La c19484811La, InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        this.LLILZ = c19500311Qz;
        this.LL = c19484811La;
        this.LLILLJJLI = interfaceC626120Oh8;
    }
}
