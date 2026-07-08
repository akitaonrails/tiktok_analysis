package X;

import androidx.compose.foundation.gestures.AnchoredDraggableElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS445S0200000_9;

/* JADX INFO: renamed from: X.0tlZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677950tlZ {
    public static final AFwS266S0000000_25 LIZ = AFwS266S0000000_25.get$arr$(460);
    public static final AFwS240S0000000_9 LIZIZ = AFwS240S0000000_9.get$arr$(832);
    public static final C1677900tlU LIZJ = new C1677900tlU(new InterfaceC1677930tlX() { // from class: X.0tlg
        @Override // X.InterfaceC1677930tlX
        public final float LIZ() {
            return 0.0f;
        }

        @Override // X.InterfaceC1677930tlX
        public final float LIZIZ(float f, float f2) {
            return 0.0f;
        }

        @Override // X.InterfaceC1677930tlX
        public final float LIZJ(float f, long j) {
            return 0.0f;
        }

        @Override // X.InterfaceC1677930tlX
        public final float LIZLLL(float f, float f2, long j) {
            return 0.0f;
        }

        @Override // X.InterfaceC1677930tlX
        public final long LJ(float f) {
            return 0L;
        }
    });

    public static final C594950NVd LIZ(Function1 function1) {
        C1673090tdj c1673090tdj = new C1673090tdj();
        function1.invoke(c1673090tdj);
        List<T> list = c1673090tdj.LIZ;
        float[] fArr = c1673090tdj.LIZIZ;
        int size = ((ArrayList) list).size();
        C1691430u7J.LIZ(size, fArr.length);
        return new C594950NVd(list, Arrays.copyOfRange(fArr, 0, size));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZLLL(kotlin.jvm.functions.Function0 r5, kotlin.jvm.functions.Function2 r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C1677980tlc
            if (r0 == 0) goto L20
            r4 = r7
            X.0tlc r4 = (X.C1677980tlc) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            goto L26
        L20:
            X.0tlc r4 = new X.0tlc
            r4.<init>(r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: X.C1383805bI -> L44
            goto L48
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.05RC r1 = new X.05RC     // Catch: X.C1383805bI -> L44
            r0 = 0
            r1.<init>(r5, r6, r0)     // Catch: X.C1383805bI -> L44
            r4.LLILLJJLI = r2     // Catch: X.C1383805bI -> L44
            java.lang.Object r0 = X.C2296808zG.LJ(r1, r4)     // Catch: X.C1383805bI -> L44
            if (r0 != r3) goto L48
            return r3
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L48:
            kotlin.Unit r3 = kotlin.Unit.LIZ
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1677950tlZ.LIZLLL(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    public static Object LJFF(C594920NVa c594920NVa, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        InterfaceC1677030tk5 interfaceC1677030tk5;
        if (c594920NVa.LJFF()) {
            interfaceC1677030tk5 = c594920NVa.LIZLLL;
            if (interfaceC1677030tk5 == null) {
                interfaceC1677030tk5 = null;
            }
        } else {
            interfaceC1677030tk5 = C1678010tlf.LIZ;
        }
        Object objLIZ = c594920NVa.LIZ(obj, EnumC1384205bM.Default, new C0NVX(c594920NVa, interfaceC1677030tk5, null), interfaceC1364105Vn);
        if (objLIZ != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLIZ;
    }

    public static Object LJII(C594920NVa c594920NVa, Object obj, float f, AbstractC23140094w abstractC23140094w) {
        InterfaceC1677030tk5 interfaceC1677030tk5;
        InterfaceC1677940tlY<Float> interfaceC1677940tlY;
        C1677900tlU c1677900tlU = null;
        if (c594920NVa.LJFF()) {
            interfaceC1677030tk5 = c594920NVa.LIZLLL;
            if (interfaceC1677030tk5 == null) {
                interfaceC1677030tk5 = null;
            }
        } else {
            interfaceC1677030tk5 = C1678010tlf.LIZ;
        }
        if (c594920NVa.LJFF()) {
            interfaceC1677940tlY = c594920NVa.LJ;
            if (interfaceC1677940tlY == null) {
            }
            return LJI(c594920NVa, obj, f, interfaceC1677030tk5, interfaceC1677940tlY, abstractC23140094w);
        }
        c1677900tlU = C1678010tlf.LIZJ;
        interfaceC1677940tlY = c1677900tlU;
        return LJI(c594920NVa, obj, f, interfaceC1677030tk5, interfaceC1677940tlY, abstractC23140094w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (1 == 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZJ(X.InterfaceC594940NVc r7, float r8, float r9, kotlin.jvm.functions.Function1 r10, kotlin.jvm.functions.Function0 r11) {
        /*
            boolean r0 = java.lang.Float.isNaN(r8)
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L75
            float r0 = java.lang.Math.abs(r9)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 0
            if (r0 <= 0) goto L70
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6d
            r5 = 1
        L18:
            float r1 = java.lang.Math.abs(r9)
            java.lang.Object r0 = r11.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L33
            java.lang.Object r3 = r7.LJFF(r8, r5)
        L32:
            return r3
        L33:
            java.lang.Object r6 = r7.LJFF(r8, r2)
            float r4 = r7.LIZLLL(r6)
            java.lang.Object r3 = r7.LJFF(r8, r3)
            float r2 = r7.LIZLLL(r3)
            float r0 = r4 - r2
            float r0 = java.lang.Math.abs(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r10.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r1 = java.lang.Math.abs(r0)
            if (r5 != 0) goto L5e
            r4 = r2
        L5e:
            float r4 = r4 - r8
            float r0 = java.lang.Math.abs(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L6a
            if (r5 == 0) goto L6c
            return r3
        L6a:
            if (r5 == 0) goto L32
        L6c:
            return r6
        L6d:
            r5 = 0
            if (r3 != 0) goto L18
        L70:
            java.lang.Object r3 = r7.LIZ(r8)
            return r3
        L75:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The offset provided to computeTarget must not be NaN."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1677950tlZ.LIZJ(X.0NVc, float, float, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    public static InterfaceC1685750ty9 LJ(InterfaceC1685750ty9 interfaceC1685750ty9, C594920NVa c594920NVa, EnumC1684030tvN enumC1684030tvN, boolean z, int i) {
        boolean z2 = z;
        if ((i & 4) != 0) {
            z2 = true;
        }
        return interfaceC1685750ty9.LIZ(new AnchoredDraggableElement(c594920NVa, enumC1684030tvN, z2, null, null, null, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object LJI(X.C594920NVa<T> r12, T r13, float r14, X.InterfaceC1677030tk5<java.lang.Float> r15, X.InterfaceC1677940tlY<java.lang.Float> r16, X.InterfaceC1364105Vn<? super java.lang.Float> r17) {
        /*
            r3 = r17
            r7 = r14
            boolean r0 = r3 instanceof X.C1677970tlb
            if (r0 == 0) goto L54
            r4 = r3
            X.0tlb r4 = (X.C1677970tlb) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r4.LLILZ = r2
        L15:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L31
            if (r1 != r0) goto L5a
            float r7 = r4.LL
            X.03Hg r9 = r4.LLILLJJLI
            X.C155000ia.LIZIZ(r3)
        L29:
            float r0 = r9.element
            float r7 = r7 - r0
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r7)
            return r0
        L31:
            X.C155000ia.LIZIZ(r3)
            X.03Hg r9 = new X.03Hg
            r9.<init>()
            r9.element = r7
            X.0tla r5 = new X.0tla
            r11 = 0
            r10 = r16
            r6 = r12
            r8 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.LLILLJJLI = r9
            r4.LL = r7
            r4.LLILZ = r0
            X.05bM r0 = X.EnumC1384205bM.Default
            java.lang.Object r0 = r6.LIZ(r13, r0, r5, r4)
            if (r0 != r2) goto L29
            return r2
        L54:
            X.0tlb r4 = new X.0tlb
            r4.<init>(r3)
            goto L15
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1677950tlZ.LJI(X.0NVa, java.lang.Object, float, X.0tk5, X.0tlY, X.05Vn):java.lang.Object");
    }

    public static final Object LIZIZ(C594920NVa c594920NVa, float f, C0NVR c0nvr, InterfaceC594940NVc interfaceC594940NVc, Object obj, InterfaceC1677030tk5 interfaceC1677030tk5, InterfaceC1364105Vn interfaceC1364105Vn) {
        float fLIZLLL;
        Object objLIZ;
        float fLIZLLL2 = interfaceC594940NVc.LIZLLL(obj);
        C817403Hg c817403Hg = new C817403Hg();
        if (Float.isNaN(c594920NVa.LIZLLL())) {
            fLIZLLL = 0.0f;
        } else {
            fLIZLLL = c594920NVa.LIZLLL();
        }
        c817403Hg.element = fLIZLLL;
        if (!Float.isNaN(fLIZLLL2)) {
            float f2 = c817403Hg.element;
            if (f2 != fLIZLLL2 && (objLIZ = C1677810tlL.LIZ(f2, fLIZLLL2, f, interfaceC1677030tk5, new AwS445S0200000_9(c0nvr, c817403Hg, 29), interfaceC1364105Vn)) == C099R.LJFF()) {
                return objLIZ;
            }
        }
        return Unit.LIZ;
    }
}
