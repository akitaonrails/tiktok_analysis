package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0m4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382250m4d<R> extends AbstractC328380Cu4<R> {
    public static final /* synthetic */ int LJII = 0;
    public C1382300m4i<R> LIZIZ;
    public Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> LIZJ;
    public Function2<? super C1382130m4R<R>, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> LIZLLL;
    public Function2<? super List<R>, ? super InterfaceC1364105Vn<? super List<R>>, ? extends Object> LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(12));
    public volatile boolean LJI;

    public final boolean LIZLLL() {
        C1382300m4i<R> c1382300m4i;
        return (this.LJI || (c1382300m4i = this.LIZIZ) == null || new ArrayList((Collection) c1382300m4i.LIZ.getValue()).isEmpty() || this.LIZ == null) ? false : true;
    }

    public final boolean LJ() {
        C1382300m4i<R> c1382300m4i = this.LIZIZ;
        return (c1382300m4i == null || c1382300m4i.LIZIZ() == null) ? false : true;
    }

    public final void LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("combindloader load start, ts: ");
        sbLIZ.append(SystemClock.elapsedRealtime());
        C2188811AlT.LIZIZ(sbLIZ);
        if (LIZLLL()) {
            LJI(false);
        }
    }

    public final void LJIIIIZZ() {
        if (LIZLLL()) {
            LJI(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1382290m4h
            if (r0 == 0) goto L3d
            r4 = r6
            X.0m4h r4 = (X.C1382290m4h) r4
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
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L43
            X.C155000ia.LIZIZ(r3)
        L22:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r1 = r3.booleanValue()
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            kotlin.jvm.functions.Function1<? super X.05Vn<? super java.lang.Boolean>, ? extends java.lang.Object> r0 = r5.LIZJ
            if (r0 == 0) goto L28
            r4.LLILLL = r1
            java.lang.Object r3 = r0.invoke(r4)
            if (r3 != r2) goto L22
            return r2
        L3d:
            X.0m4h r4 = new X.0m4h
            r4.<init>(r5, r6)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1382250m4d.LIZJ(X.05Vn):java.lang.Object");
    }

    public final void LJI(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadInternal load more: ");
        sbLIZ.append(z);
        sbLIZ.append(", ts: ");
        sbLIZ.append(SystemClock.elapsedRealtime());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJI = true;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C328340Cu0(this, z, null), 3);
        ((C11NJ) this.LJFF.getValue()).LJ();
        ((C11NJ) this.LJFF.getValue()).LIZ((C11NJ) this.LJFF.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<R> r6, X.InterfaceC1364105Vn<? super java.util.List<R>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1382280m4g
            if (r0 == 0) goto L39
            r4 = r7
            X.0m4g r4 = (X.C1382280m4g) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L40
            java.lang.Object r6 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            if (r3 != 0) goto L3f
        L26:
            return r6
        L27:
            X.C155000ia.LIZIZ(r3)
            kotlin.jvm.functions.Function2<? super java.util.List<R>, ? super X.05Vn<? super java.util.List<R>>, ? extends java.lang.Object> r0 = r5.LJ
            if (r0 == 0) goto L26
            r4.LL = r6
            r4.LLILZ = r1
            java.lang.Object r3 = r0.invoke(r6, r4)
            if (r3 != r2) goto L24
            return r2
        L39:
            X.0m4g r4 = new X.0m4g
            r4.<init>(r5, r7)
            goto L12
        L3f:
            return r3
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1382250m4d.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C1382130m4R<R> r6, X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1382270m4f
            if (r0 == 0) goto L3f
            r4 = r7
            X.0m4f r4 = (X.C1382270m4f) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L45
            X.C155000ia.LIZIZ(r3)
        L22:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            kotlin.jvm.functions.Function2<? super X.0m4R<R>, ? super X.05Vn<? super java.lang.Boolean>, ? extends java.lang.Object> r0 = r5.LIZLLL
            if (r0 == 0) goto L3d
            r4.LLILLL = r1
            java.lang.Object r3 = r0.invoke(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L3d:
            r0 = 0
            goto L28
        L3f:
            X.0m4f r4 = new X.0m4f
            r4.<init>(r5, r7)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1382250m4d.LIZIZ(X.0m4R, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[PHI: r1
      0x002c: PHI (r1v12 java.lang.Object) = (r1v9 java.lang.Object), (r1v0 java.lang.Object) binds: [B:57:0x014e, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.0m4d, X.1D7a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0113 -> B:53:0x0135). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object LJII(X.C1382250m4d<R> r12, boolean r13, X.InterfaceC1364105Vn<? super java.util.List<R>> r14) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1382250m4d.LJII(X.0m4d, boolean, X.05Vn):java.lang.Object");
    }
}
