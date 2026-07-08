package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS286S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletedExceptionally;

/* JADX INFO: renamed from: X.099c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23250099c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T LJ(kotlin.coroutines.CoroutineContext r6, kotlin.jvm.functions.Function2<? super X.InterfaceC497601wk, ? super X.InterfaceC1364105Vn<? super T>, ? extends java.lang.Object> r7) throws java.lang.Throwable {
        /*
            java.lang.Thread r3 = X.C786410Ut5.u3()
            X.094u r0 = X.InterfaceC23139094v.LJJLIIJ
            kotlin.coroutines.CoroutineContext$Element r2 = r6.get(r0)
            X.094v r2 = (X.InterfaceC23139094v) r2
            r4 = 0
            if (r2 != 0) goto L28
            X.1DEs r2 = X.C23262099o.LIZ()
            X.03Hh r1 = X.C817503Hh.LL
            kotlin.coroutines.CoroutineContext r0 = r6.plus(r2)
            kotlin.coroutines.CoroutineContext r0 = X.C23252099e.LIZIZ(r1, r0)
        L1d:
            X.099f r6 = new X.099f
            r6.<init>(r0, r3, r2)
            X.099V r0 = X.C099V.DEFAULT
            r0.invoke(r7, r6, r6)
            goto L4a
        L28:
            boolean r0 = r2 instanceof X.AbstractC2252601DEs
            if (r0 == 0) goto L48
            X.1DEs r2 = (X.AbstractC2252601DEs) r2
        L2e:
            if (r2 == 0) goto L39
            boolean r0 = r2.shouldBeProcessedFromContext()
            if (r0 != 0) goto L37
            r2 = r4
        L37:
            if (r2 != 0) goto L41
        L39:
            java.lang.ThreadLocal<X.1DEs> r0 = X.C23262099o.LIZ
            java.lang.Object r2 = r0.get()
            X.1DEs r2 = (X.AbstractC2252601DEs) r2
        L41:
            X.03Hh r0 = X.C817503Hh.LL
            kotlin.coroutines.CoroutineContext r0 = X.C23252099e.LIZIZ(r0, r6)
            goto L1d
        L48:
            r2 = r4
            goto L2e
        L4a:
            X.1DEs r0 = r6.LLILZIL     // Catch: java.lang.Throwable -> L9f
            r5 = 1
            r3 = 0
            if (r0 == 0) goto L53
            X.AbstractC2252601DEs.incrementUseCount$default(r0, r3, r5, r4)     // Catch: java.lang.Throwable -> L9f
        L53:
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L8d
            X.1DEs r0 = r6.LLILZIL     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L6b
            long r1 = r0.processNextEvent()     // Catch: java.lang.Throwable -> L96
        L61:
            boolean r0 = r6.isCompleted()     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L71
            java.util.concurrent.locks.LockSupport.parkNanos(r6, r1)     // Catch: java.lang.Throwable -> L96
            goto L53
        L6b:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L61
        L71:
            X.1DEs r0 = r6.LLILZIL     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L78
            X.AbstractC2252601DEs.decrementUseCount$default(r0, r3, r5, r4)     // Catch: java.lang.Throwable -> L9f
        L78:
            java.lang.Object r0 = r6.LJJJJZI()
            java.lang.Object r1 = X.C1DFI.LIZ(r0)
            boolean r0 = r1 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L87
            r4 = r1
            kotlinx.coroutines.CompletedExceptionally r4 = (kotlinx.coroutines.CompletedExceptionally) r4
        L87:
            if (r4 != 0) goto L8a
            return r1
        L8a:
            java.lang.Throwable r0 = r4.cause
            throw r0
        L8d:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L96
            r0.<init>()     // Catch: java.lang.Throwable -> L96
            r6.LJJIIZI(r0)     // Catch: java.lang.Throwable -> L96
            throw r0     // Catch: java.lang.Throwable -> L96
        L96:
            r1 = move-exception
            X.1DEs r0 = r6.LLILZIL     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L9e
            X.AbstractC2252601DEs.decrementUseCount$default(r0, r3, r5, r4)     // Catch: java.lang.Throwable -> L9f
        L9e:
            throw r1     // Catch: java.lang.Throwable -> L9f
        L9f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23250099c.LJ(kotlin.coroutines.CoroutineContext, kotlin.jvm.functions.Function2):java.lang.Object");
    }

    public static final Object LJI(InterfaceC1364105Vn interfaceC1364105Vn, CoroutineContext coroutineContext, Function2 function2) throws Throwable {
        CoroutineContext coroutineContextLIZ;
        Object objLIZ;
        CoroutineContext context = interfaceC1364105Vn.getContext();
        boolean z = false;
        if (!((Boolean) coroutineContext.fold(Boolean.FALSE, AFwS286S0000000_3.get$arr$(15))).booleanValue()) {
            coroutineContextLIZ = context.plus(coroutineContext);
        } else {
            coroutineContextLIZ = C23252099e.LIZ(context, coroutineContext, false);
        }
        C23118094a.LJI(coroutineContextLIZ);
        if (coroutineContextLIZ == context) {
            C099Z c099z = new C099Z(interfaceC1364105Vn, coroutineContextLIZ);
            objLIZ = C099C.LIZ(c099z, c099z, function2);
        } else {
            C23138094u c23138094u = InterfaceC23139094v.LJJLIIJ;
            if (Intrinsics.LJFF(coroutineContextLIZ.get(c23138094u), context.get(c23138094u))) {
                C23251099d c23251099d = new C23251099d(interfaceC1364105Vn, coroutineContextLIZ);
                CoroutineContext coroutineContext2 = c23251099d.LLILLL;
                Object objLIZJ = C09AQ.LIZJ(coroutineContext2, null);
                try {
                    objLIZ = C099C.LIZ(c23251099d, c23251099d, function2);
                } finally {
                    C09AQ.LIZ(coroutineContext2, objLIZJ);
                }
            } else {
                C23249099b c23249099b = new C23249099b(interfaceC1364105Vn, coroutineContextLIZ);
                C099T.LIZ(function2, c23249099b, c23249099b);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C23249099b.LLILZIL;
                while (true) {
                    int i = atomicIntegerFieldUpdater.get(c23249099b);
                    if (i != 0) {
                        if (i != 2) {
                            "Already suspended".toString();
                            throw new IllegalStateException("Already suspended");
                        }
                    } else if (C23249099b.LLILZIL.compareAndSet(c23249099b, 0, 1)) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    objLIZ = C099R.LJFF();
                } else {
                    objLIZ = C1DFI.LIZ(c23249099b.LJJJJZI());
                    if (objLIZ instanceof CompletedExceptionally) {
                        throw ((CompletedExceptionally) objLIZ).cause;
                    }
                }
            }
        }
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static final C099G LIZ(InterfaceC497601wk interfaceC497601wk, CoroutineContext coroutineContext, C099V c099v, final Function2 function2) {
        C099G c099g;
        final CoroutineContext coroutineContextLIZIZ = C23252099e.LIZIZ(interfaceC497601wk, coroutineContext);
        if (c099v.isLazy()) {
            c099g = new C099G<T>(coroutineContextLIZIZ, function2) { // from class: X.099H
                public final InterfaceC1364105Vn<Unit> LLILZ;

                @Override // kotlinx.coroutines.JobSupport
                public final void LJJLJ() {
                    try {
                        InterfaceC1364105Vn interfaceC1364105VnLIZLLL = C099M.LIZLLL(this.LLILZ);
                        Unit unit = Unit.LIZ;
                        C189200o6.m2constructorimpl(unit);
                        C2252641DEw.LIZ(unit, null, interfaceC1364105VnLIZLLL);
                    } catch (Throwable th) {
                        C098200Yq c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                        resumeWith(c098200Yq);
                        throw th;
                    }
                }

                {
                    this.LLILZ = C099M.LIZIZ(function2, this, this);
                }
            };
        } else {
            c099g = new C099G(coroutineContextLIZIZ, true);
        }
        c099v.invoke(function2, c099g, c099g);
        return c099g;
    }

    public static final AnonymousClass0956 LIZJ(InterfaceC497601wk interfaceC497601wk, CoroutineContext coroutineContext, C099V c099v, final Function2 function2) {
        AnonymousClass0956 anonymousClass0956;
        final CoroutineContext coroutineContextLIZIZ = C23252099e.LIZIZ(interfaceC497601wk, coroutineContext);
        if (c099v.isLazy()) {
            anonymousClass0956 = new AnonymousClass0956(coroutineContextLIZIZ, function2) { // from class: X.099I
                public final InterfaceC1364105Vn<Unit> LLILZ;

                @Override // kotlinx.coroutines.JobSupport
                public final void LJJLJ() {
                    try {
                        InterfaceC1364105Vn interfaceC1364105VnLIZLLL = C099M.LIZLLL(this.LLILZ);
                        Unit unit = Unit.LIZ;
                        C189200o6.m2constructorimpl(unit);
                        C2252641DEw.LIZ(unit, null, interfaceC1364105VnLIZLLL);
                    } catch (Throwable th) {
                        C098200Yq c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                        resumeWith(c098200Yq);
                        throw th;
                    }
                }

                {
                    this.LLILZ = C099M.LIZIZ(function2, this, this);
                }
            };
        } else {
            anonymousClass0956 = new AnonymousClass0956(coroutineContextLIZIZ, true);
        }
        c099v.invoke(function2, anonymousClass0956, anonymousClass0956);
        return anonymousClass0956;
    }

    public static /* synthetic */ C099G LIZIZ(InterfaceC497601wk interfaceC497601wk, CoroutineContext.Element element, C099V c099v, Function2 function2, int i) {
        CoroutineContext coroutineContext = element;
        if ((i & 1) != 0) {
            coroutineContext = C23271099x.INSTANCE;
        }
        if ((i & 2) != 0) {
            c099v = C099V.DEFAULT;
        }
        return LIZ(interfaceC497601wk, coroutineContext, c099v, function2);
    }

    public static /* synthetic */ AnonymousClass0956 LIZLLL(InterfaceC497601wk interfaceC497601wk, CoroutineContext coroutineContext, C099V c099v, Function2 function2, int i) {
        if ((i & 1) != 0) {
            coroutineContext = C23271099x.INSTANCE;
        }
        if ((i & 2) != 0) {
            c099v = C099V.DEFAULT;
        }
        return LIZJ(interfaceC497601wk, coroutineContext, c099v, function2);
    }
}
