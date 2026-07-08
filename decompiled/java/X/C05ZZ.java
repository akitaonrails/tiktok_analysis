package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05ZZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05ZZ {
    public static final float LIZ = ((float) 0.125d) / 18;

    public static final boolean LJFF(C20067313fT c20067313fT, long j) {
        Object obj;
        List<C20066813fO> list = c20067313fT.LIZ;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                obj = ListProtector.get(list, i);
                if (C05U1.LIZ(((C20066813fO) obj).LIZ, j)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        C20066813fO c20066813fO = (C20066813fO) obj;
        if (c20066813fO != null && c20066813fO.LIZLLL) {
            z = true;
        }
        return true ^ z;
    }

    public static final float LJI(InterfaceC1374305Zl interfaceC1374305Zl, int i) {
        if (i == 2) {
            return interfaceC1374305Zl.LIZJ() * LIZ;
        }
        return interfaceC1374305Zl.LIZJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        if ((!X.C1378605aS.LIZJ(X.C05ZS.LJ(r8, true), 0)) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0096 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.C05ZT r14, long r15, X.InterfaceC1364105Vn<? super X.C20066813fO> r17) {
        /*
            r3 = r17
            boolean r0 = r3 instanceof X.C1373505Zd
            if (r0 == 0) goto Lae
            r6 = r3
            X.05Zd r6 = (X.C1373505Zd) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lae
            int r2 = r2 - r1
            r6.LLILZ = r2
        L14:
            java.lang.Object r11 = r6.LLILLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r13 = 0
            r4 = 1
            if (r0 == 0) goto L6a
            if (r0 != r4) goto Lb5
            X.00w2 r7 = r6.LLILLJJLI
            X.05ZT r14 = r6.LL
            X.C155000ia.LIZIZ(r11)
        L29:
            X.13fT r11 = (X.C20067313fT) r11
            java.util.List<X.13fO> r12 = r11.LIZ
            int r10 = r12.size()
            r9 = 0
        L32:
            if (r9 >= r10) goto L48
            java.lang.Object r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r12, r9)
            r0 = r8
            X.13fO r0 = (X.C20066813fO) r0
            long r2 = r0.LIZ
            long r0 = r7.element
            boolean r0 = X.C05U1.LIZ(r2, r0)
            if (r0 != 0) goto L49
            int r9 = r9 + 1
            goto L32
        L48:
            r8 = r13
        L49:
            X.13fO r8 = (X.C20066813fO) r8
            if (r8 == 0) goto Lbd
            boolean r0 = X.C05ZS.LIZJ(r8)
            if (r0 == 0) goto L99
            java.util.List<X.13fO> r9 = r11.LIZ
            int r3 = r9.size()
            r2 = 0
        L5a:
            if (r2 >= r3) goto L81
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r2)
            r0 = r1
            X.13fO r0 = (X.C20066813fO) r0
            boolean r0 = r0.LIZLLL
            if (r0 != 0) goto L82
            int r2 = r2 + 1
            goto L5a
        L6a:
            X.C155000ia.LIZIZ(r11)
            X.13fT r0 = r14.LJJJJJL()
            r1 = r15
            boolean r0 = LJFF(r0, r1)
            if (r0 == 0) goto L79
            return r13
        L79:
            X.00w2 r7 = new X.00w2
            r7.<init>()
            r7.element = r1
            goto L8a
        L81:
            r1 = r13
        L82:
            X.13fO r1 = (X.C20066813fO) r1
            if (r1 == 0) goto La7
            long r0 = r1.LIZ
            r7.element = r0
        L8a:
            r6.LL = r14
            r6.LLILLJJLI = r7
            r6.LLILZ = r4
            X.13fE r0 = X.EnumC20065813fE.Main
            java.lang.Object r11 = r14.LJJIJIL(r0, r6)
            if (r11 != r5) goto L29
            return r5
        L99:
            long r2 = X.C05ZS.LJ(r8, r4)
            r0 = 0
            boolean r0 = X.C1378605aS.LIZJ(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L8a
        La7:
            boolean r0 = r8.LIZIZ()
            if (r0 != 0) goto Lbd
            return r8
        Lae:
            X.05Zd r6 = new X.05Zd
            r6.<init>(r3)
            goto L14
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lbd:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05ZZ.LIZ(X.05ZT, long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, X.13fO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(X.C05ZT r11, long r12, X.InterfaceC1364105Vn<? super X.C20066813fO> r14) {
        /*
            boolean r0 = r14 instanceof X.C1373405Zc
            if (r0 == 0) goto L27
            r8 = r14
            X.05Zc r8 = (X.C1373405Zc) r8
            int r2 = r8.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r8.LLILZIL = r2
        L12:
            java.lang.Object r3 = r8.LLILZ
            java.lang.Object r7 = X.C099R.LJFF()
            int r1 = r8.LLILZIL
            r9 = 1
            r0 = 0
            if (r1 == 0) goto L35
            if (r1 != r9) goto L2d
            X.013C r2 = r8.LLILLL
            X.00zU r10 = r8.LLILLJJLI
            X.13fO r6 = r8.LL
            goto L95
        L27:
            X.05Zc r8 = new X.05Zc
            r8.<init>(r14)
            goto L12
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.C155000ia.LIZIZ(r3)
            X.13fT r1 = r11.LJJJJJL()
            boolean r1 = LJFF(r1, r12)
            if (r1 == 0) goto L43
            return r0
        L43:
            X.13fT r1 = r11.LJJJJJL()
            java.util.List<X.13fO> r5 = r1.LIZ
            int r4 = r5.size()
            r3 = 0
        L4e:
            if (r3 >= r4) goto L62
            java.lang.Object r6 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r3)
            r1 = r6
            X.13fO r1 = (X.C20066813fO) r1
            long r1 = r1.LIZ
            boolean r1 = X.C05U1.LIZ(r1, r12)
            if (r1 != 0) goto L63
            int r3 = r3 + 1
            goto L4e
        L62:
            r6 = r0
        L63:
            X.13fO r6 = (X.C20066813fO) r6
            if (r6 != 0) goto L68
            return r0
        L68:
            X.00zU r10 = new X.00zU
            r10.<init>()
            X.00zU r5 = new X.00zU
            r5.<init>()
            r5.element = r6
            X.05Zl r1 = r11.getViewConfiguration()
            long r3 = r1.LJII()
            X.013C r2 = new X.013C     // Catch: X.C1516370pYx -> La1
            r2.<init>()     // Catch: X.C1516370pYx -> La1
            X.05ZQ r1 = new X.05ZQ     // Catch: X.C1516370pYx -> La1
            r1.<init>(r2, r5, r10, r0)     // Catch: X.C1516370pYx -> La1
            r8.LL = r6     // Catch: X.C1516370pYx -> La1
            r8.LLILLJJLI = r10     // Catch: X.C1516370pYx -> La1
            r8.LLILLL = r2     // Catch: X.C1516370pYx -> La1
            r8.LLILZIL = r9     // Catch: X.C1516370pYx -> La1
            java.lang.Object r1 = r11.LJJJJIZL(r3, r1, r8)     // Catch: X.C1516370pYx -> La1
            if (r1 != r7) goto L98
            return r7
        L95:
            X.C155000ia.LIZIZ(r3)     // Catch: X.C1516370pYx -> La1
        L98:
            boolean r1 = r2.element     // Catch: X.C1516370pYx -> La1
            if (r1 == 0) goto Laa
            T r0 = r10.element     // Catch: X.C1516370pYx -> La1
            if (r0 != 0) goto Laa
            return r6
        La1:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            T r0 = r10.element
            if (r0 != 0) goto Laa
            return r6
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05ZZ.LIZIZ(X.05ZT, long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004e -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJ(X.C05ZT r5, long r6, kotlin.jvm.functions.Function1<? super X.C20066813fO, kotlin.Unit> r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            boolean r0 = r9 instanceof X.C1373605Ze
            if (r0 == 0) goto L51
            r4 = r9
            X.05Ze r4 = (X.C1373605Ze) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 != r1) goto L57
            kotlin.jvm.functions.Function1 r8 = r4.LLILLJJLI
            X.05ZT r5 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L26:
            X.13fO r3 = (X.C20066813fO) r3
            if (r3 != 0) goto L30
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L30:
            boolean r0 = X.C05ZS.LIZJ(r3)
            if (r0 == 0) goto L3f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L3b:
            X.C155000ia.LIZIZ(r3)
            goto L44
        L3f:
            r8.invoke(r3)
            long r6 = r3.LIZ
        L44:
            r4.LL = r5
            r4.LLILLJJLI = r8
            r4.LLILZ = r1
            java.lang.Object r3 = LIZ(r5, r6, r4)
            if (r3 != r2) goto L26
            return r2
        L51:
            X.05Ze r4 = new X.05Ze
            r4.<init>(r9)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05ZZ.LJ(X.05ZT, long, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
    
        if (LJFF(r15.LJJJJJL(), r1) != false) goto L39;
     */
    /* JADX WARN: Path cross not found for [B:21:0x005c, B:26:0x0073], limit reached: 64 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00e0 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJII(X.C05ZT r15, long r16, kotlin.jvm.internal.AwS581S0100000_2 r18, X.InterfaceC1364105Vn r19) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05ZZ.LJII(X.05ZT, long, kotlin.jvm.internal.AwS581S0100000_2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r11.LIZIZ() == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0101 -> B:49:0x010f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x010b -> B:49:0x010f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0128 -> B:12:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZJ(X.C05ZT r13, long r14, int r16, kotlin.jvm.internal.AwS616S0100000_2 r17, X.InterfaceC1364105Vn r18) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05ZZ.LIZJ(X.05ZT, long, int, kotlin.jvm.internal.AwS616S0100000_2, X.05Vn):java.lang.Object");
    }

    public static final Object LIZLLL(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1631620sYq<? super C20066813fO, ? super C20066813fO, ? super C1378605aS, Unit> interfaceC1631620sYq, Function1<? super C20066813fO, Unit> function1, Function0<Unit> function0, Function0<Boolean> function02, EnumC1684030tvN enumC1684030tvN, Function2<? super C20066813fO, ? super C1378605aS, Unit> function2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZIZ = C1363905Vl.LIZIZ(interfaceC1369205Xm, new C05ZV(function02, new C238400w2(), enumC1684030tvN, interfaceC1631620sYq, function2, function0, function1, null), interfaceC1364105Vn);
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }
}
