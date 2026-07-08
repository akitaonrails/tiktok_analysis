package X;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Lqa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555540Lqa<CFG extends Serializable> implements InterfaceC551900Lki<CFG> {
    public final CFG LIZ;
    public final String LIZIZ;
    public final Function1<C007G, Unit> LIZJ;
    public final C555570Lqd LIZLLL;
    public volatile Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> LJ;

    @Override // X.InterfaceC551900Lki
    public final CFG getConfig() {
        return this.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    @Override // X.InterfaceC551900Lki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555540Lqa.LIZ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC551900Lki
    public final Object LIZIZ(AbstractC23140094w abstractC23140094w) {
        Object objLJ = LJ(abstractC23140094w);
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC551900Lki
    public final void LIZJ(Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1) {
        this.LJ = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C555550Lqb
            if (r0 == 0) goto L27
            r6 = r9
            X.0Lqb r6 = (X.C555550Lqb) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r7 = 1
            if (r0 == 0) goto L33
            if (r0 == r7) goto L2d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L27:
            X.0Lqb r6 = new X.0Lqb
            r6.<init>(r8, r9)
            goto L12
        L2d:
            X.09aZ r5 = r6.LL
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L73
            goto L9a
        L33:
            X.C155000ia.LIZIZ(r1)
            X.0Lqd r0 = r8.LIZLLL
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.LIZIZ
            boolean r0 = r0.get()
            if (r0 != 0) goto L43
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L43:
            X.0Lqd r0 = r8.LIZLLL
            X.09aZ r5 = r0.LIZLLL
            X.0LX3 r3 = X.C0LX3.LIZIZ
            java.lang.String r2 = r8.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Cancel detected at checkpoint, reason="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZLLL(r3, r2, r0)
            X.09aZ r0 = X.EnumC2398509aZ.CANCEL
            if (r5 != r0) goto L9a
            kotlin.jvm.functions.Function1<? super X.05Vn<? super kotlin.Unit>, ? extends java.lang.Object> r0 = r8.LJ     // Catch: java.lang.Exception -> L71
            if (r0 == 0) goto L9a
            r6.LL = r5     // Catch: java.lang.Exception -> L71
            r6.LLILZ = r7     // Catch: java.lang.Exception -> L71
            java.lang.Object r0 = r0.invoke(r6)     // Catch: java.lang.Exception -> L71
            if (r0 != r4) goto L9a
            return r4
        L71:
            r4 = move-exception
            goto L74
        L73:
            r4 = move-exception
        L74:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            X.0LX3 r3 = X.C0LX3.LIZIZ
            java.lang.String r2 = r8.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "invokeOnCancel handler failed: "
            r1.append(r0)
            java.lang.String r0 = r4.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJIIIZ(r3, r2, r0, r4)
            X.01sO r0 = X.C470601sO.LIZ
            r0.getClass()
            X.C470601sO.LIZ(r4)
        L9a:
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Node cancelled at checkpoint, reason="
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555540Lqa.LJ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC551900Lki
    public final void log(String str) {
        C201955140j.LIZLLL(C0LX3.LIZIZ, this.LIZIZ, str);
    }

    @Override // X.InterfaceC551900Lki
    public final void LIZLLL(int i, long j, InterfaceC1406105et interfaceC1406105et) {
        this.LIZJ.invoke(new C555530LqZ(i, j, interfaceC1406105et));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C555540Lqa(Serializable serializable, String str, AwS587S0100000_8 awS587S0100000_8, C555570Lqd c555570Lqd) {
        this.LIZ = serializable;
        this.LIZIZ = str;
        this.LIZJ = awS587S0100000_8;
        this.LIZLLL = c555570Lqd;
    }
}
