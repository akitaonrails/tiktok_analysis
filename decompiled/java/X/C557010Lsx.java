package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Lsx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557010Lsx implements C0LUM {
    public final Function1<InterfaceC1364105Vn<? super Unit>, Object> LIZ;
    public final Function1<InterfaceC1364105Vn<? super Unit>, Object> LIZIZ;
    public final C563400M7u LIZJ = new C563400M7u(0);
    public final C557050Lt1 LIZLLL = new C557050Lt1(false);
    public final C054G LJ = C2296808zG.LIZ(new C2232408os(C786410Ut5.h4()).plus(C2296908zH.LIZ()));
    public final C1DEK LJFF;

    @Override // X.C0LUM
    public final void LIZ() {
        int iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefCount increased to ");
        sbLIZ.append(iLIZLLL);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        if (iLIZLLL == 1) {
            LIZJ("RefCount reached 1, scheduling initialize");
            C23250099c.LIZLLL(this.LJ, null, null, new C557000Lsw(this, null), 3);
        }
    }

    @Override // X.C0LUM
    public final void LIZIZ() {
        if (this.LIZJ.LIZJ() == 0) {
            LIZJ("RefCount decrease called but already at 0");
            return;
        }
        int iLIZIZ = this.LIZJ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefCount decreased to ");
        sbLIZ.append(iLIZIZ);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        if (iLIZIZ == 0) {
            LIZJ("RefCount reached 0, scheduling clear");
            C23250099c.LIZLLL(this.LJ, null, null, new C556990Lsv(this, null), 3);
        }
    }

    public static void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[RefCountImpl] ");
        sbLIZ.append(str);
        C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C557030Lsz
            if (r0 == 0) goto L3d
            r4 = r6
            X.0Lsz r4 = (X.C557030Lsz) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L43
            X.C155000ia.LIZIZ(r3)
        L22:
            java.lang.String r0 = "onClear completed"
            LIZJ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2a:
            X.C155000ia.LIZIZ(r3)
            java.lang.String r0 = "Executing onClear"
            LIZJ(r0)
            kotlin.jvm.functions.Function1<X.05Vn<? super kotlin.Unit>, java.lang.Object> r0 = r5.LIZIZ
            r4.LLILLL = r1
            java.lang.Object r0 = r0.invoke(r4)
            if (r0 != r2) goto L22
            return r2
        L3d:
            X.0Lsz r4 = new X.0Lsz
            r4.<init>(r5, r6)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557010Lsx.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C557040Lt0
            if (r0 == 0) goto L3d
            r4 = r6
            X.0Lt0 r4 = (X.C557040Lt0) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L43
            X.C155000ia.LIZIZ(r3)
        L22:
            java.lang.String r0 = "onInitialize completed"
            LIZJ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2a:
            X.C155000ia.LIZIZ(r3)
            java.lang.String r0 = "Executing onInitialize"
            LIZJ(r0)
            kotlin.jvm.functions.Function1<X.05Vn<? super kotlin.Unit>, java.lang.Object> r0 = r5.LIZ
            r4.LLILLL = r1
            java.lang.Object r0 = r0.invoke(r4)
            if (r0 != r2) goto L22
            return r2
        L3d:
            X.0Lt0 r4 = new X.0Lt0
            r4.<init>(r5, r6)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557010Lsx.LJ(X.05Vn):java.lang.Object");
    }

    public C557010Lsx(C2180708gX c2180708gX, C2180808gY c2180808gY) {
        this.LIZ = c2180708gX;
        this.LIZIZ = c2180808gY;
        C054G c054gLIZ = C2296808zG.LIZ(new C2232408os(C786410Ut5.h4()).plus(C2296908zH.LIZ()));
        this.LJFF = C095G.LIZ(1, EnumC2252401DDy.DROP_LATEST, 4);
        C23250099c.LIZLLL(c054gLIZ, null, null, new C557020Lsy(this, null), 3);
    }
}
