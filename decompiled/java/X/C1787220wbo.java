package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0wbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1787220wbo implements InterfaceC560980LzM<Pair<? extends C1787830wcn, ? extends InterfaceC346201Wa<? extends C1882807Za>>, C1787830wcn> {
    public final InterfaceC1788520wdu LIZ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "listen_to_web_payment_update";
    }

    public C1787220wbo(InterfaceC1788520wdu interfaceC1788520wdu) {
        this.LIZ = interfaceC1788520wdu;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    @Override // X.InterfaceC560980LzM
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(kotlin.Pair<X.C1787830wcn, ? extends X.InterfaceC346201Wa<X.C1882807Za>> r9, X.InterfaceC1364105Vn<? super X.C1787830wcn> r10) throws X.C1786940wbM {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1787230wbp
            if (r0 == 0) goto L77
            r7 = r10
            X.0wbp r7 = (X.C1787230wbp) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r2 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L4b
            if (r0 != r4) goto La4
            X.0wcn r3 = r7.LL
            X.C155000ia.LIZIZ(r2)
        L25:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L9c
            int r1 = r2.hashCode()
            r0 = -1867170238(0xffffffff90b53e42, float:-7.1487835E-29)
            if (r1 == r0) goto L8d
            r0 = -1309235419(0xffffffffb1f6a725, float:-7.1785444E-9)
            if (r1 == r0) goto L7d
            r0 = 476588369(0x1c682951, float:7.681576E-22)
            if (r1 != r0) goto L9c
            java.lang.String r0 = "cancelled"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9c
            X.0wbY r0 = X.EnumC1787060wbY.CANCELLED
            X.0wcn r0 = X.C1787830wcn.LIZ(r3, r0)
            return r0
        L4b:
            X.C155000ia.LIZIZ(r2)
            java.lang.Object r3 = r9.getFirst()
            X.0wcn r3 = (X.C1787830wcn) r3
            java.lang.Object r2 = r9.getSecond()
            X.01Wa r2 = (X.InterfaceC346201Wa) r2
            X.0wbY r1 = r3.LJ
            X.0wbY r0 = X.EnumC1787060wbY.PENDING
            if (r1 == r0) goto L67
            X.0wbY r0 = X.EnumC1787060wbY.CANCELLED
            X.0wcn r0 = X.C1787830wcn.LIZ(r3, r0)
            return r0
        L67:
            X.0wbr r0 = new X.0wbr
            r0.<init>(r2, r8, r3, r5)
            r7.LL = r3
            r7.LLILZ = r4
            java.lang.Object r2 = X.C2296808zG.LJ(r0, r7)
            if (r2 != r6) goto L25
            return r6
        L77:
            X.0wbp r7 = new X.0wbp
            r7.<init>(r8, r10)
            goto L12
        L7d:
            java.lang.String r0 = "expired"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9c
            X.0wbM r1 = new X.0wbM
            java.lang.String r0 = "Payment timeout error"
            r1.<init>(r0)
            throw r1
        L8d:
            java.lang.String r0 = "succeed"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9c
            X.0wbY r0 = X.EnumC1787060wbY.VERIFIED
            X.0wcn r0 = X.C1787830wcn.LIZ(r3, r0)
            return r0
        L9c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported payment status"
            r1.<init>(r0)
            throw r1
        La4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1787220wbo.LIZ(kotlin.Pair, X.05Vn):java.lang.Object");
    }
}
