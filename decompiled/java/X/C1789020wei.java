package X;

import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0wei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1789020wei implements InterfaceC560980LzM<String, Unit> {
    public final InterfaceC1786800wb8 LIZ;
    public final InterfaceC1786480wac LIZIZ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "iap_env_action";
    }

    public C1789020wei(InterfaceC1786800wb8 interfaceC1786800wb8, InterfaceC1786480wac interfaceC1786480wac) {
        this.LIZ = interfaceC1786800wb8;
        this.LIZIZ = interfaceC1786480wac;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    @Override // X.InterfaceC560980LzM
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            r15 = this;
            r3 = r17
            r12 = r16
            boolean r0 = r3 instanceof X.C1789030wej
            r9 = r15
            if (r0 == 0) goto L2f
            r8 = r3
            X.0wej r8 = (X.C1789030wej) r8
            int r2 = r8.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2f
            int r2 = r2 - r1
            r8.LLILZLL = r2
        L17:
            java.lang.Object r2 = r8.LLILZ
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILZLL
            r6 = 1
            if (r0 == 0) goto L41
            if (r0 != r6) goto L39
            long r0 = r8.LLILLL
            java.lang.Object r14 = r8.LLILLJJLI
            java.util.Map r14 = (java.util.Map) r14
            java.lang.Object r12 = r8.LL
            java.lang.String r12 = (java.lang.String) r12
            goto L35
        L2f:
            X.0wej r8 = new X.0wej
            r8.<init>(r9, r3)
            goto L17
        L35:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L7f
            goto L75
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L41:
            X.C155000ia.LIZIZ(r2)
            long r0 = java.lang.System.currentTimeMillis()
            X.0wac r5 = r9.LIZIZ
            X.0wek r4 = new X.C1786600wao<X.C1789050wel>() { // from class: X.0wek
                static {
                    /*
                        X.0wek r0 = new X.0wek
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0wek) X.0wek.LIZJ X.0wek
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1789040wek.<clinit>():void");
                }

                public final boolean equals(java.lang.Object r3) {
                    /*
                        r2 = this;
                        r1 = 1
                        if (r2 != r3) goto L4
                        return r1
                    L4:
                        boolean r0 = r3 instanceof X.C1789040wek
                        if (r0 != 0) goto La
                        r0 = 0
                        return r0
                    La:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1789040wek.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    /*
                        r1 = this;
                        r0 = 836950731(0x31e2dacb, float:6.6023396E-9)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1789040wek.hashCode():int");
                }

                public final java.lang.String toString() {
                    /*
                        r1 = this;
                        java.lang.String r0 = "Start"
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1789040wek.toString():java.lang.String");
                }

                {
                    /*
                        r2 = this;
                        X.0wel r1 = new X.0wel
                        r1.<init>()
                        java.lang.String r0 = "livesdk_iap_env_precheck_start"
                        r2.<init>(r0, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1789040wek.<init>():void");
                }
            }
            kotlin.jvm.internal.AwS77S1000000_27 r3 = new kotlin.jvm.internal.AwS77S1000000_27
            r2 = 15
            r3.<init>(r12, r2)
            r4.getClass()
            X.0wan r2 = new X.0wan
            r2.<init>(r4, r3)
            r5.LIZ(r2)
            X.0wb8 r2 = r9.LIZ
            java.util.Map r14 = r2.getCommonEventInfo()
            X.0wb8 r2 = r9.LIZ     // Catch: java.lang.Throwable -> L7d
            r8.LL = r12     // Catch: java.lang.Throwable -> L7d
            r8.LLILLJJLI = r14     // Catch: java.lang.Throwable -> L7d
            r8.LLILLL = r0     // Catch: java.lang.Throwable -> L7d
            r8.LLILZLL = r6     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r2 = r2.checkEnvironment(r8)     // Catch: java.lang.Throwable -> L7d
            if (r2 != r7) goto L75
            return r7
        L75:
            kotlin.Unit r3 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L7b
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L7b
            goto L8b
        L7b:
            r2 = move-exception
            goto L80
        L7d:
            r2 = move-exception
            goto L80
        L7f:
            r2 = move-exception
        L80:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r2)
            X.C189200o6.m2constructorimpl(r3)
        L8b:
            boolean r2 = X.C189200o6.m8isSuccessimpl(r3)
            if (r2 == 0) goto L9a
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r0
            r13 = 0
            r9.LIZJ(r10, r12, r13, r14)
        L9a:
            java.lang.Throwable r13 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r13 != 0) goto La3
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La3:
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r0
            r9.LIZJ(r10, r12, r13, r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1789020wei.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LIZJ(long j, String str, Throwable th, Map map) {
        boolean z;
        C1786910wbJ c1786910wbJ;
        if (th == null) {
            z = true;
        } else {
            z = false;
        }
        if (th instanceof C1786910wbJ) {
            c1786910wbJ = (C1786910wbJ) th;
        } else {
            c1786910wbJ = null;
        }
        InterfaceC1786480wac interfaceC1786480wac = this.LIZIZ;
        C1789080weo c1789080weo = new C1786600wao<C1789070wen>() { // from class: X.0weo
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1789080weo);
            }

            public final int hashCode() {
                return -66181756;
            }

            public final String toString() {
                return "End";
            }

            {
                new C1789070wen();
            }
        };
        C1789060wem c1789060wem = new C1789060wem(str, c1786910wbJ, z, j, map);
        c1789080weo.getClass();
        interfaceC1786480wac.LIZ(new C1786590wan(c1789080weo, c1789060wem));
    }
}
