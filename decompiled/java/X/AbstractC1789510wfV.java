package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;

/* JADX INFO: renamed from: X.0wfV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1789510wfV<IN, OUT> extends AbstractC1789150wev<IN, OUT, EnumC1787180wbk> {
    public final InterfaceC1786480wac LIZ;
    public final Gson LIZIZ = new Gson();

    @Override // X.AbstractC1789150wev, X.InterfaceC1789330wfD
    public Object LIZ(Object obj, AbstractC23140094w abstractC23140094w) {
        return LJIIIIZZ(this, obj, abstractC23140094w);
    }

    public abstract String LJI();

    public void LJIIIZ(IN in, long j, AbstractC1789120wes<OUT, C1788880weU<EnumC1787180wbk>> abstractC1789120wes) {
    }

    public void LJIIJ(IN in) {
    }

    public AbstractC1789510wfV(InterfaceC1786480wac interfaceC1786480wac) {
        this.LIZ = interfaceC1786480wac;
    }

    public String LJFF(IN in) {
        return GsonProtectorUtils.toJson(this.LIZIZ, in);
    }

    public String LJII(OUT out) {
        return GsonProtectorUtils.toJson(this.LIZIZ, out);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN, OUT> java.lang.Object LJIIIIZZ(X.AbstractC1789510wfV<IN, OUT> r12, IN r13, X.InterfaceC1364105Vn<? super X.AbstractC1789120wes<OUT, X.C1788880weU<X.EnumC1787180wbk>>> r14) {
        /*
            r3 = r14
            r9 = r12
            r10 = r13
            boolean r0 = r3 instanceof X.C1789500wfU
            if (r0 == 0) goto L9a
            r8 = r3
            X.0wfU r8 = (X.C1789500wfU) r8
            int r2 = r8.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9a
            int r2 = r2 - r1
            r8.LLILZLL = r2
        L15:
            java.lang.Object r11 = r8.LLILZ
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILZLL
            r6 = 1
            if (r0 == 0) goto L68
            if (r0 != r6) goto La7
            long r1 = r8.LLILLL
            java.lang.Object r10 = r8.LLILLJJLI
            X.0wfV r9 = r8.LL
            X.C155000ia.LIZIZ(r11)
        L2b:
            X.0wes r11 = (X.AbstractC1789120wes) r11
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r1
            r9.getClass()
            boolean r0 = r11 instanceof X.C1789100weq
            if (r0 == 0) goto L52
            X.0wfX r0 = new X.C1786600wao<X.C1789520wfW>() { // from class: X.0wfX
                static {
                    /*
                        X.0wfX r0 = new X.0wfX
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0wfX) X.0wfX.LIZJ X.0wfX
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1789530wfX.<clinit>():void");
                }

                public final boolean equals(java.lang.Object r3) {
                    /*
                        r2 = this;
                        r1 = 1
                        if (r2 != r3) goto L4
                        return r1
                    L4:
                        boolean r0 = r3 instanceof X.C1789530wfX
                        if (r0 != 0) goto La
                        r0 = 0
                        return r0
                    La:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1789530wfX.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    /*
                        r1 = this;
                        r0 = 660541290(0x275f0f6a, float:3.0955823E-15)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1789530wfX.hashCode():int");
                }

                public final java.lang.String toString() {
                    /*
                        r1 = this;
                        java.lang.String r0 = "End"
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1789530wfX.toString():java.lang.String");
                }

                {
                    /*
                        r2 = this;
                        X.0wfW r1 = new X.0wfW
                        r1.<init>()
                        java.lang.String r0 = "livesdk_iap_engine_end"
                        r2.<init>(r0, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1789530wfX.<init>():void");
                }
            }
            kotlin.jvm.internal.AwS17S0300100_27 r8 = new kotlin.jvm.internal.AwS17S0300100_27
            r14 = 7
            r8.<init>(r9, r10, r11, r12, r14)
            r0.getClass()
            X.0wan r1 = new X.0wan
            r1.<init>(r0, r8)
        L49:
            X.0wac r0 = r9.LIZ
            r0.LIZ(r1)
            r9.LJIIIZ(r10, r12, r11)
            return r11
        L52:
            boolean r0 = r11 instanceof X.C1789110wer
            if (r0 == 0) goto La1
            X.0wfX r0 = X.C1789530wfX.LIZJ
            kotlin.jvm.internal.AwS17S0300100_27 r8 = new kotlin.jvm.internal.AwS17S0300100_27
            r14 = 8
            r8.<init>(r9, r10, r11, r12, r14)
            r0.getClass()
            X.0wan r1 = new X.0wan
            r1.<init>(r0, r8)
            goto L49
        L68:
            X.C155000ia.LIZIZ(r11)
            long r1 = java.lang.System.currentTimeMillis()
            r9.getClass()
            X.0wfY r5 = new X.C1786600wao<X.C1789550wfZ>() { // from class: X.0wfY
                static {
                    /*
                        X.0wfY r0 = new X.0wfY
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0wfY) X.0wfY.LIZJ X.0wfY
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1789540wfY.<clinit>():void");
                }

                public final boolean equals(java.lang.Object r3) {
                    /*
                        r2 = this;
                        r1 = 1
                        if (r2 != r3) goto L4
                        return r1
                    L4:
                        boolean r0 = r3 instanceof X.C1789540wfY
                        if (r0 != 0) goto La
                        r0 = 0
                        return r0
                    La:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1789540wfY.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    /*
                        r1 = this;
                        r0 = -861871311(0xffffffffcca0e331, float:-8.435137E7)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1789540wfY.hashCode():int");
                }

                public final java.lang.String toString() {
                    /*
                        r1 = this;
                        java.lang.String r0 = "Start"
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1789540wfY.toString():java.lang.String");
                }

                {
                    /*
                        r2 = this;
                        X.0wfZ r1 = new X.0wfZ
                        r1.<init>()
                        java.lang.String r0 = "livesdk_iap_engine_start"
                        r2.<init>(r0, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1789540wfY.<init>():void");
                }
            }
            kotlin.jvm.internal.AwS393S0200000_27 r4 = new kotlin.jvm.internal.AwS393S0200000_27
            r0 = 98
            r4.<init>(r9, r10, r0)
            r5.getClass()
            X.0wan r3 = new X.0wan
            r3.<init>(r5, r4)
            X.0wac r0 = r9.LIZ
            r0.LIZ(r3)
            r9.LJIIJ(r10)
            r8.LL = r9
            r8.LLILLJJLI = r10
            r8.LLILLL = r1
            r8.LLILZLL = r6
            java.lang.Object r11 = X.AbstractC1789150wev.LJ(r9, r10, r8)
            if (r11 != r7) goto L2b
            return r7
        L9a:
            X.0wfU r8 = new X.0wfU
            r8.<init>(r9, r3)
            goto L15
        La1:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        La7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1789510wfV.LJIIIIZZ(X.0wfV, java.lang.Object, X.05Vn):java.lang.Object");
    }
}
