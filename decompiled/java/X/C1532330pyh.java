package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0pyh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532330pyh extends C09AY implements Function1<C1532340pyi, Unit> {
    public final /* synthetic */ Function2<Boolean, C1532340pyi, Unit> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Thread LLILLL;
    public final /* synthetic */ InterfaceC1532520pz0<Object, C1532340pyi> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1532330pyh(C1532300pye c1532300pye, Function2<? super Boolean, ? super C1532340pyi, Unit> function2, boolean z, Thread thread, InterfaceC1532520pz0<Object, C1532340pyi> interfaceC1532520pz0) {
        super(1);
        this.LL = function2;
        this.LLILLJJLI = z;
        this.LLILLL = thread;
        this.LLILZ = interfaceC1532520pz0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(X.C1532340pyi r11) {
        /*
            r10 = this;
            kotlin.jvm.functions.Function2<java.lang.Boolean, X.0pyi, kotlin.Unit> r2 = r10.LL
            boolean r0 = r10.LLILLJJLI
            java.lang.Thread r1 = r10.LLILLL
            if (r0 != 0) goto L10
            java.lang.Thread r0 = X.C786410Ut5.u3()     // Catch: java.lang.Throwable -> L1e
            if (r0 != r1) goto L10
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L1e
            r2.invoke(r0, r11)     // Catch: java.lang.Throwable -> L1e
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L1e
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L1e
            goto L2a
        L1e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L2a:
            X.0pz0<java.lang.Object, X.0pyi> r2 = r10.LLILZ
            java.lang.Throwable r7 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r7 == 0) goto L50
            X.0pze r3 = X.C1532920pze.LIZJ
            java.lang.String r4 = "ResourceProcessChain"
            java.lang.String r5 = "processSingleProcessor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "error occurs when async callback on "
            r1.<init>(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            r8 = 0
            r9 = 32
            X.C1532760pzO.LIZIZ(r3, r4, r5, r6, r7, r8, r9)
        L50:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1532330pyh.invoke(java.lang.Object):java.lang.Object");
    }
}
