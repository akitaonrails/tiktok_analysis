package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0web, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788950web implements InterfaceC560980LzM<Unit, Unit> {
    public final InterfaceC1786800wb8 LIZ;
    public final InterfaceC1786480wac LIZIZ;
    public final InterfaceC1788970wed LIZJ;
    public final InterfaceC1788280wdW LIZLLL;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "initChannel";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1788960wec
            if (r0 == 0) goto L55
            r5 = r7
            X.0wec r5 = (X.C1788960wec) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 != r3) goto L5b
            X.C155000ia.LIZIZ(r1)
        L22:
            X.0wqx r3 = new X.C1786600wao<X.InterfaceC1796690wr5>() { // from class: X.0wqx
                static {
                    /*
                        X.0wqx r0 = new X.0wqx
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0wqx) X.0wqx.LIZJ X.0wqx
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1796610wqx.<clinit>():void");
                }

                public final boolean equals(java.lang.Object r3) {
                    /*
                        r2 = this;
                        r1 = 1
                        if (r2 != r3) goto L4
                        return r1
                    L4:
                        boolean r0 = r3 instanceof X.C1796610wqx
                        if (r0 != 0) goto La
                        r0 = 0
                        return r0
                    La:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1796610wqx.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    /*
                        r1 = this;
                        r0 = -1831075965(0xffffffff92dbff83, float:-1.3883832E-27)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1796610wqx.hashCode():int");
                }

                public final java.lang.String toString() {
                    /*
                        r1 = this;
                        java.lang.String r0 = "Start"
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1796610wqx.toString():java.lang.String");
                }

                {
                    /*
                        r2 = this;
                        X.0wr4 r0 = X.InterfaceC1796690wr5.LIZ
                        r0.getClass()
                        X.0wr6 r1 = X.C1796680wr4.LIZIZ
                        java.lang.String r0 = "livesdk_iap_init_sdk_result"
                        r2.<init>(r0, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1796610wqx.<init>():void");
                }
            }
            kotlin.jvm.internal.AwS606S0100000_27 r2 = new kotlin.jvm.internal.AwS606S0100000_27
            r0 = 573(0x23d, float:8.03E-43)
            r2.<init>(r6, r0)
            r3.getClass()
            X.0wan r1 = new X.0wan
            r1.<init>(r3, r2)
            X.0wac r0 = r6.LIZIZ
            r0.LIZ(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3b:
            X.C155000ia.LIZIZ(r1)
            X.0wb8 r2 = r6.LIZ
            X.0wed r0 = r6.LIZJ
            java.lang.String r1 = r0.LIZ()
            X.0wdW r0 = r6.LIZLLL
            boolean r0 = r0.LIZIZ()
            r5.LLILLL = r3
            java.lang.Object r0 = r2.initChannel(r1, r0, r5)
            if (r0 != r4) goto L22
            return r4
        L55:
            X.0wec r5 = new X.0wec
            r5.<init>(r6, r7)
            goto L12
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1788950web.LIZIZ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC560980LzM
    public final /* bridge */ /* synthetic */ Object LIZ(Unit unit, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LIZIZ(interfaceC1364105Vn);
    }

    public C1788950web(InterfaceC1786800wb8 interfaceC1786800wb8, InterfaceC1788970wed interfaceC1788970wed, InterfaceC1786480wac interfaceC1786480wac, InterfaceC1788280wdW interfaceC1788280wdW) {
        this.LIZ = interfaceC1786800wb8;
        this.LIZIZ = interfaceC1786480wac;
        this.LIZJ = interfaceC1788970wed;
        this.LIZLLL = interfaceC1788280wdW;
    }
}
