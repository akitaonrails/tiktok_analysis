package X;

import com.bytedance.im.core.proto.Response;

/* JADX INFO: renamed from: X.0XzC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C866640XzC extends AbstractC866690XzH<InterfaceC864330XvT> implements InterfaceC864330XvT {
    @Override // X.InterfaceC864330XvT
    public final void clear() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("clear"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIILLIIL().clear();
        }
    }

    public C866640XzC(C0YEF c0yef) {
        super(c0yef, "RemoteFetcherProxy");
    }

    @Override // X.InterfaceC864330XvT
    public final boolean LJIIZILJ(long j) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("receiveWsFailureAck"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return c0yedLIZIZ.LJIJI().LJIILLIIL().LJIIZILJ(j);
    }

    @Override // X.AbstractC866690XzH
    public final InterfaceC864330XvT LLLJ(C0YED c0yed) {
        return c0yed.LJIJI().LJIILLIIL();
    }

    @Override // X.InterfaceC864330XvT
    public final Object LJJLIIIJ(Response response, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("receiveWs"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return c0yedLIZIZ.LJIJI().LJIILLIIL().LJJLIIIJ(response, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    @Override // X.InterfaceC864330XvT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLIIL(java.lang.String r7, byte[] r8, X.InterfaceC1364105Vn<? super X.C189200o6<com.bytedance.im.core.proto.Response>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C866650XzD
            if (r0 == 0) goto L69
            r5 = r9
            X.0XzD r5 = (X.C866650XzD) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L6f
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
        L28:
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.0YEF r2 = r6.LL
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r6.LLILLJJLI
            r1.append(r0)
            java.lang.String r0 = ".decodeResponse"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.0YED r0 = r2.LIZIZ(r0)
            if (r0 != 0) goto L58
            X.0Y8K r3 = new X.0Y8K
            java.lang.String r2 = "No active session"
            r1 = 0
            r0 = -1
            r3.<init>(r0, r2, r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r3)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L58:
            X.0YDA r0 = r0.LJIJI()
            X.0XvT r0 = r0.LJIILLIIL()
            r5.LLILLL = r3
            java.lang.Object r0 = r0.LJJJLIIL(r7, r8, r5)
            if (r0 != r4) goto L28
            return r4
        L69:
            X.0XzD r5 = new X.0XzD
            r5.<init>(r6, r9)
            goto L12
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C866640XzC.LJJJLIIL(java.lang.String, byte[], X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC864330XvT
    public final Object LLLIILIL(C0YCX c0ycx, boolean z, InterfaceC1364105Vn<? super C864760XwA> interfaceC1364105Vn) throws C0Y8K {
        C0YEF c0yef = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(".fetch");
        C0YED c0yedLIZIZ = c0yef.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIJI().LJIILLIIL().LLLIILIL(c0ycx, z, interfaceC1364105Vn);
        }
        throw new C0Y8K(-1, "No active session", null);
    }
}
