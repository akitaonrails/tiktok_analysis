package X;

import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0i4I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228280i4I extends C1225970i0Z {
    public final C1225910i0T LLILLL;
    public C099G LLILZ;
    public List<? extends AbstractC1223800hx4> LLILZIL;
    public final C01GW LLILZLL;

    @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
    public final void LJJIIJ() {
        this.LLILZ = C23250099c.LIZIZ(C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ)), null, null, new C1228240i4E(this, null), 3);
    }

    public C1228280i4I(C1225910i0T c1225910i0T) {
        super(c1225910i0T);
        this.LLILLL = c1225910i0T;
        this.LLILZLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(828));
    }

    @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
    public final Object LJJIL(InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        return C2296808zG.LJ(new C1228250i4F(this, null), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJIZL(X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMUser>>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C1228290i4J
            if (r0 == 0) goto L22
            r6 = r9
            X.0i4J r6 = (X.C1228290i4J) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r7 = 1
            if (r0 == 0) goto L30
            if (r0 != r7) goto L28
            java.lang.Object r4 = r6.LL
            goto L84
        L22:
            X.0i4J r6 = new X.0i4J
            r6.<init>(r8, r9)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ     // Catch: java.lang.Throwable -> L8b
            r0.getClass()     // Catch: java.lang.Throwable -> L8b
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()     // Catch: java.lang.Throwable -> L8b
            X.06pF r1 = r0.LIZ()     // Catch: java.lang.Throwable -> L8b
            X.01GW r0 = r8.LLILZLL     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L8b
            java.util.List r0 = r1.LJFF(r0, r7)     // Catch: java.lang.Throwable -> L8b
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8b
            r4.<init>()     // Catch: java.lang.Throwable -> L8b
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L8b
        L55:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L77
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L8b
            r0 = r2
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r0     // Catch: java.lang.Throwable -> L8b
            X.1BFw r1 = com.ss.android.ugc.aweme.im.contacts.api.model.IMUser.Companion     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r0.getUid()     // Catch: java.lang.Throwable -> L8b
            r1.getClass()     // Catch: java.lang.Throwable -> L8b
            boolean r0 = X.C2201941BFw.LJFF(r0)     // Catch: java.lang.Throwable -> L8b
            r0 = r0 ^ 1
            if (r0 == 0) goto L55
            r4.add(r2)     // Catch: java.lang.Throwable -> L8b
            goto L55
        L77:
            java.lang.String r0 = "MUF"
            r6.LL = r4     // Catch: java.lang.Throwable -> L8b
            r6.LLILZ = r7     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r8.LJJJJJL(r0, r4, r6)     // Catch: java.lang.Throwable -> L8b
            if (r0 != r5) goto L87
            return r5
        L84:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L8b
        L87:
            X.C189200o6.m2constructorimpl(r4)     // Catch: java.lang.Throwable -> L8b
            return r4
        L8b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r4 = new X.00Yq
            r4.<init>(r0)
            X.C189200o6.m2constructorimpl(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1228280i4I.LJJJJIZL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[RETURN] */
    /* JADX WARN: Type inference failed for: r18v0, types: [X.0i4I] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJ(X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMUser>> r19) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1228280i4I.LJJJJJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(java.lang.String r11, java.util.List r12, X.InterfaceC1364105Vn r13) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1228280i4I.LJJJJJL(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }
}
