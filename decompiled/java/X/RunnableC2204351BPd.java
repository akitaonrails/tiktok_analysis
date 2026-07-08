package X;

import android.text.TextUtils;
import com.bytedance.pia.core.bridge.protocol.ProtocolMessage;
import com.bytedance.pia.core.utils.GsonUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1BPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class RunnableC2204351BPd implements Runnable {
    public final /* synthetic */ C1BP6 LL;
    public final /* synthetic */ C1BQC LLILLJJLI;

    public /* synthetic */ RunnableC2204351BPd(C1BP6 c1bp6, C1BQC c1bqc) {
        this.LL = c1bp6;
        this.LLILLJJLI = c1bqc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1BPq] */
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
        final C1BP6 c1bp6 = this.LL;
        final C1BQC c1bqc = this.LLILLJJLI;
        c1bp6.getClass();
        C1C7U.LIZ("PiaBridge@7fb5.start$1L");
        c1bp6.LJFF = c1bqc;
        C1BPD<n> c1bpd = c1bp6.LJ;
        Objects.requireNonNull(c1bqc);
        c1bpd.LIZJ(new InterfaceC1530550pvp() { // from class: X.1BQD
            @Override // X.InterfaceC1530550pvp
            public final void accept(Object obj) {
                c1bqc.LIZIZ((n) obj);
            }
        });
        c1bqc.LIZ(new InterfaceC1530550pvp() { // from class: X.1BPq
            @Override // X.InterfaceC1530550pvp
            public final void accept(Object obj) {
                final C1BP6 c1bp62 = c1bp6;
                final n nVar = (n) obj;
                c1bp62.getClass();
                C1287700jc8.LIZJ(new Runnable() { // from class: X.1BPb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object c098200Yq;
                        Integer num;
                        Integer num2;
                        final C1BP6 c1bp63 = c1bp62;
                        n nVar2 = nVar;
                        c1bp63.getClass();
                        C1C7U.LIZ("PiaBridge@7fb5.handleRemoteMessage$1L");
                        try {
                            c098200Yq = (ProtocolMessage) GsonUtils.LIZ().LIZJ(nVar2, ProtocolMessage.class);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        ProtocolMessage protocolMessage = (ProtocolMessage) c098200Yq;
                        if (protocolMessage == null) {
                            C1C7U.LIZIZ("PiaBridge@7fb5.handleRemoteMessage$1L");
                            return;
                        }
                        if (ProtocolMessage.Type.Invocation == protocolMessage.type && !TextUtils.isEmpty(protocolMessage.name) && (num2 = protocolMessage.id) != null) {
                            final C1BQ2 c1bq2 = new C1BQ2(num2.intValue(), protocolMessage.name, protocolMessage.data);
                            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            c1bp63.LIZIZ(new InterfaceC1530550pvp<n>() { // from class: X.1BPa
                                @Override // X.InterfaceC1530550pvp
                                public final void accept(n nVar3) {
                                    n nVarLIZ = ProtocolMessage.LIZ(new C2204551BPx(c1bq2.LIZ, 1, nVar3, null));
                                    if (nVarLIZ != null && atomicBoolean.compareAndSet(false, true)) {
                                        c1bp63.LJ.LIZ(nVarLIZ);
                                    }
                                }
                            }, new InterfaceC1530550pvp() { // from class: X.1BPF
                                @Override // X.InterfaceC1530550pvp
                                public final void accept(Object obj2) {
                                    n nVar3;
                                    C1BP6 c1bp64 = c1bp63;
                                    C1BQ2 c1bq22 = c1bq2;
                                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                                    C2204191BOn c2204191BOn = (C2204191BOn) obj2;
                                    c1bp64.getClass();
                                    if (c2204191BOn.getMessage() != null && c2204191BOn.getMessage().startsWith("{")) {
                                        try {
                                            p pVar = GsonUtils.LIZIZ;
                                            String message = c2204191BOn.getMessage();
                                            pVar.getClass();
                                            nVar3 = (n) p.LIZJ(message);
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            nVar3 = null;
                                        }
                                    } else {
                                        nVar3 = null;
                                    }
                                    n nVarLIZ = ProtocolMessage.LIZ(new C2204551BPx(c1bq22.LIZ, c2204191BOn.getCode(), nVar3, c2204191BOn.getMessage()));
                                    if (nVarLIZ != null && atomicBoolean2.compareAndSet(false, true)) {
                                        c1bp64.LJ.LIZ(nVarLIZ);
                                    }
                                }
                            }, c1bq2.LIZJ, c1bq2.LIZIZ);
                            C1C7U.LIZIZ("PiaBridge@7fb5.handleRemoteMessage$1L");
                            return;
                        }
                        if (ProtocolMessage.Type.Callback == protocolMessage.type && (num = protocolMessage.id) != null && num.intValue() != 0 && protocolMessage.status != null) {
                            C2204551BPx c2204551BPx = new C2204551BPx(protocolMessage.id.intValue(), protocolMessage.status.intValue(), protocolMessage.data, protocolMessage.message);
                            InterfaceC1530550pvp<C2204551BPx> interfaceC1530550pvp = c1bp63.LJII.get(c2204551BPx.LIZ);
                            if (interfaceC1530550pvp != null) {
                                c1bp63.LJII.remove(c2204551BPx.LIZ);
                                interfaceC1530550pvp.accept(c2204551BPx);
                            }
                        }
                        C1C7U.LIZIZ("PiaBridge@7fb5.handleRemoteMessage$1L");
                    }
                });
            }
        });
        C1C7U.LIZIZ("PiaBridge@7fb5.start$1L");
    }
}
