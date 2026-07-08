package X;

/* JADX INFO: renamed from: X.0wee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788980wee implements InterfaceC560980LzM<Object, Object> {
    public final String LIZ;
    public final /* synthetic */ InterfaceC1789000weg LIZIZ;
    public final /* synthetic */ InterfaceC560980LzM<Object, Object> LIZJ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return this.LIZ;
    }

    public C1788980wee(InterfaceC560980LzM interfaceC560980LzM, InterfaceC1789000weg interfaceC1789000weg) {
        this.LIZIZ = interfaceC1789000weg;
        this.LIZJ = interfaceC560980LzM;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("retryWith(");
        sbLIZ.append(interfaceC1789000weg.getName());
        sbLIZ.append(')');
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0074 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0077 -> B:12:0x002f). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC560980LzM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.Object r10, X.InterfaceC1364105Vn<? super java.lang.Object> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C1788990wef
            if (r0 == 0) goto L79
            r8 = r11
            X.0wef r8 = (X.C1788990wef) r8
            int r2 = r8.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L79
            int r2 = r2 - r1
            r8.LLIZ = r2
        L12:
            java.lang.Object r1 = r8.LLILZIL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLIZ
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L40
            if (r0 == r5) goto L34
            if (r0 != r6) goto L87
            boolean r4 = r8.LLILZ
            int r3 = r8.LLILLL
            java.lang.Object r2 = r8.LLILLJJLI
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r10 = r8.LL
            X.C155000ia.LIZIZ(r1)
        L2f:
            if (r4 != 0) goto L45
            if (r2 == 0) goto L7f
            throw r2
        L34:
            int r3 = r8.LLILLL
            java.lang.Object r2 = r8.LLILLJJLI
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r10 = r8.LL
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L56
            goto L8f
        L40:
            X.C155000ia.LIZIZ(r1)
            r3 = 0
            r2 = 0
        L45:
            X.0LzM<java.lang.Object, java.lang.Object> r0 = r9.LIZJ     // Catch: java.lang.Exception -> L54
            r8.LL = r10     // Catch: java.lang.Exception -> L54
            r8.LLILLJJLI = r2     // Catch: java.lang.Exception -> L54
            r8.LLILLL = r3     // Catch: java.lang.Exception -> L54
            r8.LLIZ = r5     // Catch: java.lang.Exception -> L54
            java.lang.Object r1 = r0.LIZ(r10, r8)     // Catch: java.lang.Exception -> L54
            goto L90
        L54:
            r1 = move-exception
            goto L57
        L56:
            r1 = move-exception
        L57:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            int r3 = r3 + 1
            X.0weg r0 = r9.LIZIZ
            boolean r4 = r0.LIZIZ(r3, r1)
            if (r4 == 0) goto L77
            X.0weg r0 = r9.LIZIZ
            r8.LL = r10
            r8.LLILLJJLI = r2
            r8.LLILLL = r3
            r8.LLILZ = r4
            r8.LLIZ = r6
            java.lang.Object r0 = r0.LIZ(r3, r8)
            if (r0 != r7) goto L2f
            return r7
        L77:
            r2 = r1
            goto L2f
        L79:
            X.0wef r8 = new X.0wef
            r8.<init>(r9, r11)
            goto L12
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Retry loop finished unexpectedly."
            r1.<init>(r0)
            throw r1
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8f:
            return r1
        L90:
            if (r1 != r7) goto L93
            return r7
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1788980wee.LIZ(java.lang.Object, X.05Vn):java.lang.Object");
    }
}
