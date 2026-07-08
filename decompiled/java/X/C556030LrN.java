package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS622S0100000_8;

/* JADX INFO: renamed from: X.0LrN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C556030LrN implements InterfaceC556470Ls5 {
    public final C552940LmO LIZ;
    public final C555910LrB LIZIZ;
    public final C1D80 LIZJ;
    public final C556080LrS LIZLLL;
    public final C23119094b LJ;
    public final C054G LJFF;
    public final ConcurrentHashMap<String, AbstractC1406905f1> LJI;
    public final C556050LrP LJII;
    public final AnonymousClass0950 LJIIIIZZ;

    @Override // X.InterfaceC556470Ls5
    public final C1346605Ou getState() {
        if (this.LJI.isEmpty()) {
            return null;
        }
        return new C1346605Ou(C2097608Jq.LJIIZILJ(this.LJI));
    }

    @Override // X.InterfaceC556470Ls5
    public final C556050LrP LIZ() {
        return this.LJII;
    }

    @Override // X.InterfaceC556470Ls5
    public final C552940LmO LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC556470Ls5
    public final C555910LrB LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC556470Ls5
    public final AnonymousClass0950 getEvents() {
        return this.LJIIIIZZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // X.InterfaceC556470Ls5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C556020LrM
            if (r0 == 0) goto L58
            r5 = r7
            X.0LrM r5 = (X.C556020LrM) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L5e
            X.C155000ia.LIZIZ(r1)
        L22:
            X.0LrB r0 = r6.LIZIZ
            r1 = 0
            r0.LIZJ = r1
            X.094b r0 = r6.LJ
            r0.LIZIZ(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2f:
            X.C155000ia.LIZIZ(r1)
            X.0LX3 r2 = X.C0LX3.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "dispose: workflowId="
            r1.append(r0)
            X.0LmO r0 = r6.LIZ
            java.lang.String r0 = r0.LIZ
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "AIGCWorkflowSessionImpl"
            X.C201955140j.LJIILL(r2, r0, r1)
            X.0LrS r0 = r6.LIZLLL
            r5.LLILLL = r3
            java.lang.Object r0 = r0.LIZIZ(r5)
            if (r0 != r4) goto L22
            return r4
        L58:
            X.0LrM r5 = new X.0LrM
            r5.<init>(r6, r7)
            goto L12
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C556030LrN.LIZJ(X.05Vn):java.lang.Object");
    }

    public C556030LrN(C552940LmO c552940LmO, C555910LrB c555910LrB, C1D80 c1d80, C556080LrS c556080LrS, Map<String, ? extends AbstractC1406905f1> map) {
        this.LIZ = c552940LmO;
        this.LIZIZ = c555910LrB;
        this.LIZJ = c1d80;
        this.LIZLLL = c556080LrS;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        this.LJ = c23119094bLIZ;
        this.LJFF = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C0PEM.LIZJ));
        this.LJI = new ConcurrentHashMap<>(map);
        c555910LrB.LIZJ = new AwS622S0100000_8(this, 47);
        c556080LrS.LJII = new C555970LrH(this, null);
        this.LJII = new C556050LrP(this);
        this.LJIIIIZZ = c556080LrS.LJIIIZ;
    }
}
