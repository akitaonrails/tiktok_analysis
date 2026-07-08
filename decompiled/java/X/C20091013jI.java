package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13jI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20091013jI {
    public static final float LIZ = 400;

    public static final float LIZLLL(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 > 0.0f) {
            if (f > f2) {
                return f2;
            }
        } else if (f < f2) {
            return f2;
        }
        return f;
    }

    public static final void LIZIZ(C1677830tlN c1677830tlN, InterfaceC1392705cj interfaceC1392705cj, Function1 function1, float f) {
        float fLIZJ;
        try {
            fLIZJ = interfaceC1392705cj.LIZJ(f);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            c1677830tlN.LIZ();
            fLIZJ = 0.0f;
        }
        function1.invoke(Float.valueOf(fLIZJ));
        if (Math.abs(f - fLIZJ) > 0.5f) {
            c1677830tlN.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.InterfaceC1392705cj r6, float r7, X.C1677580tky r8, X.InterfaceC1677940tlY r9, kotlin.jvm.internal.AwS396S0200000_30 r10, X.InterfaceC1364105Vn r11) {
        /*
            boolean r0 = r11 instanceof X.C20091113jJ
            if (r0 == 0) goto L65
            r4 = r11
            X.13jJ r4 = (X.C20091113jJ) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r1 = r4.LLILZ
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r5 = 1
            if (r0 == 0) goto L35
            if (r0 != r5) goto L6b
            float r7 = r4.LL
            X.03Hg r2 = r4.LLILLL
            X.0tky r8 = r4.LLILLJJLI
            X.C155000ia.LIZIZ(r1)
        L28:
            X.0tyx r3 = new X.0tyx
            float r0 = r2.element
            float r7 = r7 - r0
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r7)
            r3.<init>(r0, r8)
            return r3
        L35:
            X.C155000ia.LIZIZ(r1)
            X.03Hg r2 = new X.03Hg
            r2.<init>()
            java.lang.Object r0 = r8.LJIIL()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L63
            r0 = 1
        L4d:
            r1 = r0 ^ 1
            X.13jH r0 = new X.13jH
            r0.<init>(r7, r2, r6, r10)
            r4.LLILLJJLI = r8
            r4.LLILLL = r2
            r4.LL = r7
            r4.LLILZIL = r5
            java.lang.Object r0 = X.C1677810tlL.LIZLLL(r8, r9, r1, r0, r4)
            if (r0 != r3) goto L28
            return r3
        L63:
            r0 = 0
            goto L4d
        L65:
            X.13jJ r4 = new X.13jJ
            r4.<init>(r11)
            goto L12
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20091013jI.LIZ(X.05cj, float, X.0tky, X.0tlY, kotlin.jvm.internal.AwS396S0200000_30, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZJ(X.InterfaceC1392705cj r13, float r14, float r15, X.C1677580tky r16, X.InterfaceC1677030tk5 r17, kotlin.jvm.functions.Function1 r18, X.InterfaceC1364105Vn r19) {
        /*
            r7 = r16
            r3 = r19
            boolean r0 = r3 instanceof X.C20091213jK
            if (r0 == 0) goto L93
            r12 = r3
            X.13jK r12 = (X.C20091213jK) r12
            int r2 = r12.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L93
            int r2 = r2 - r1
            r12.LLILZLL = r2
        L16:
            java.lang.Object r6 = r12.LLILZIL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r12.LLILZLL
            r3 = 0
            r5 = 1
            if (r0 == 0) goto L50
            if (r0 != r5) goto L9a
            float r1 = r12.LLILLJJLI
            float r14 = r12.LL
            X.03Hg r2 = r12.LLILZ
            X.0tky r7 = r12.LLILLL
            X.C155000ia.LIZIZ(r6)
        L2f:
            java.lang.Object r0 = r7.LJIIL()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r5 = LIZLLL(r0, r1)
            X.0tyx r4 = new X.0tyx
            float r0 = r2.element
            float r14 = r14 - r0
            java.lang.Float r1 = X.C2286608xc.LIZLLL(r14)
            r0 = 29
            X.0tky r0 = X.C1677590tkz.LIZJ(r7, r3, r5, r0)
            r4.<init>(r1, r0)
            return r4
        L50:
            X.C155000ia.LIZIZ(r6)
            X.03Hg r2 = new X.03Hg
            r2.<init>()
            java.lang.Object r0 = r7.LJIIL()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            java.lang.Float r8 = X.C2286608xc.LIZLLL(r14)
            java.lang.Object r0 = r7.LJIIL()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L91
            r0 = 1
        L75:
            r10 = r0 ^ 1
            X.05di r11 = new X.05di
            r0 = r18
            r11.<init>(r15, r2, r13, r0)
            r12.LLILLL = r7
            r12.LLILZ = r2
            r12.LL = r14
            r12.LLILLJJLI = r1
            r12.LLILZLL = r5
            r9 = r17
            java.lang.Object r0 = X.C1677810tlL.LJ(r7, r8, r9, r10, r11, r12)
            if (r0 != r4) goto L2f
            return r4
        L91:
            r0 = 0
            goto L75
        L93:
            X.13jK r12 = new X.13jK
            r12.<init>(r3)
            goto L16
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20091013jI.LIZJ(X.05cj, float, float, X.0tky, X.0tk5, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
