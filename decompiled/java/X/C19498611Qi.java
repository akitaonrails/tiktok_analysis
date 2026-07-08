package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Qi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19498611Qi<T> extends C11NZ<T> implements InterfaceC420801kM {
    public final InterfaceC19498711Qj LL;
    public final String LLILLJJLI = "UplinkRequestObservable";
    public final AtomicReference<InterfaceC420801kM> LLILLL = new AtomicReference<>();
    public boolean LLILZ;
    public boolean LLILZIL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this.LLILLL);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(this.LLILLL.get());
    }

    public C19498611Qi(C19665911wv c19665911wv) {
        this.LL = c19665911wv;
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
    @Override // X.C11NZ
    public final void LJJZZIII(final InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        if (interfaceC626120Oh8 != null) {
            interfaceC626120Oh8.onSubscribe(this);
        }
        this.LL.LIZ(new InterfaceC19503211Sc<T>() { // from class: X.11Qh
            @Override // X.InterfaceC19503211Sc
            public final void LIZ(Throwable th) throws Throwable {
                String str = this.LLILLJJLI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isDisposed: ");
                sbLIZ.append(this.isDisposed());
                sbLIZ.append(", terminated: ");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(", onErrored: ");
                sbLIZ.append(this.LLILZIL);
                sbLIZ.append(", sendRequest, onFail error: ");
                sbLIZ.append(th);
                C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
                if (!this.isDisposed()) {
                    C19498611Qi<T> c19498611Qi = this;
                    if (!c19498611Qi.LLILZ && !c19498611Qi.LLILZIL) {
                        c19498611Qi.LLILZIL = true;
                        try {
                            InterfaceC626120Oh8<? super T> interfaceC626120Oh82 = interfaceC626120Oh8;
                            if (interfaceC626120Oh82 != null) {
                                interfaceC626120Oh82.onError(th);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            String str2 = this.LLILLJJLI;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("sendRequest, onFail error: ");
                            sbLIZ2.append(th2);
                            C20441214yg.LJ(str2, C2188811AlT.LIZIZ(sbLIZ2));
                            C11SP.LIZ(th2);
                            C19489211Ms.LIZIZ(new C0VYA(th, th2));
                        }
                    }
                }
            }

            @Override // X.InterfaceC19503211Sc
            public final void onSuccess(T t) throws Throwable {
                try {
                    InterfaceC626120Oh8<? super T> interfaceC626120Oh82 = interfaceC626120Oh8;
                    if (interfaceC626120Oh82 != null) {
                        interfaceC626120Oh82.onNext(t);
                    }
                    if (!this.isDisposed()) {
                        this.LLILZ = true;
                        InterfaceC626120Oh8<? super T> interfaceC626120Oh83 = interfaceC626120Oh8;
                        if (interfaceC626120Oh83 != null) {
                            interfaceC626120Oh83.onComplete();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C19498611Qi<T> c19498611Qi = this;
                    if (c19498611Qi.LLILZ) {
                        C19489211Ms.LIZIZ(th);
                        String str = this.LLILLJJLI;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("sendRequest, onSuccess error: ");
                        sbLIZ.append(th);
                        C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    if (c19498611Qi.isDisposed()) {
                        return;
                    }
                    try {
                        this.LLILZIL = true;
                        InterfaceC626120Oh8<? super T> interfaceC626120Oh84 = interfaceC626120Oh8;
                        if (interfaceC626120Oh84 == null) {
                            return;
                        }
                        interfaceC626120Oh84.onError(th);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        String str2 = this.LLILLJJLI;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("sendRequest, onSuccess error: ");
                        sbLIZ2.append(th);
                        C20441214yg.LJ(str2, C2188811AlT.LIZIZ(sbLIZ2));
                        C11SP.LIZ(th2);
                        C19489211Ms.LIZIZ(new C0VYA(th, th2));
                    }
                }
            }
        });
    }
}
