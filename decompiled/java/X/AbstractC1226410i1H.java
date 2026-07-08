package X;

/* JADX INFO: renamed from: X.0i1H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1226410i1H extends C1225970i0Z {
    public final EnumC1226540i1U LLILLL;
    public final AbstractC1225770i0F LLILZ;

    @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
    public final Object LJJIL(InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        return LJJJJJ(0L, interfaceC1364105Vn);
    }

    @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
    public final Object LJJJI(Object obj, InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        Long l;
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            return LJJJJJ(l.longValue(), interfaceC1364105Vn);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invalid cursor: ");
        sbLIZ.append(obj);
        return new C1223680hws(new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ)));
    }

    public final Object LJJJJIZL(long j, C1226420i1I c1226420i1I) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c1226420i1I));
        c2252611DEt.LJIJJ();
        C0YUN c0yun = C0YUN.LIZ;
        C1226400i1G c1226400i1G = new C1226400i1G(this, c2252611DEt);
        c0yun.getClass();
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIJ(j, C0Y6U.GROUP_NAME, new C0Z9N[]{C0Z9N.ORDINARY, C0Z9N.OWNER, C0Z9N.ADMIN}, Boolean.FALSE, c1226400i1G);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c1226420i1I);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJ(long r6, X.InterfaceC1364105Vn<? super X.AbstractC1223670hwr> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1226420i1I
            if (r0 == 0) goto L22
            r4 = r8
            X.0i1I r4 = (X.C1226420i1I) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 != r0) goto L28
            long r6 = r4.LL
            goto L3e
        L22:
            X.0i1I r4 = new X.0i1I
            r4.<init>(r5, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r6     // Catch: java.lang.Exception -> L44 java.util.concurrent.CancellationException -> L6a
            r4.LLILZ = r0     // Catch: java.lang.Exception -> L44 java.util.concurrent.CancellationException -> L6a
            java.lang.Object r3 = r5.LJJJJIZL(r6, r4)     // Catch: java.lang.Exception -> L44 java.util.concurrent.CancellationException -> L6a
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L44 java.util.concurrent.CancellationException -> L6a
        L41:
            X.0hwr r3 = (X.AbstractC1223670hwr) r3     // Catch: java.lang.Exception -> L44 java.util.concurrent.CancellationException -> L6a
            return r3
        L44:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0i0F r0 = r5.LLILZ
            r0.getTag()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fetchGroupList failed at cursor="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            X.0hws r3 = new X.0hws
            r3.<init>(r2)
            return r3
        L6a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1226410i1H.LJJJJJ(long, X.05Vn):java.lang.Object");
    }

    public AbstractC1226410i1H(EnumC1226540i1U enumC1226540i1U, AbstractC1225770i0F abstractC1225770i0F, C1223510hwb c1223510hwb) {
        super(c1223510hwb);
        this.LLILLL = enumC1226540i1U;
        this.LLILZ = abstractC1225770i0F;
    }
}
