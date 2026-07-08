package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import kotlin.jvm.internal.AwS102S1000000_18;
import kotlin.jvm.internal.AwS167S1100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g71, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153090g71 {
    public static final C1153090g71 LIZ = new C1153090g71();

    public static void LJI() {
        try {
            C189200o6.m2constructorimpl(C1153110g73.LIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static String LIZLLL(Class cls) {
        C07QN c07qn;
        String strValue;
        try {
            c07qn = (C07QN) cls.getAnnotation(C07QN.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c07qn = null;
        }
        if (c07qn == null || (strValue = c07qn.value()) == null) {
            return "";
        }
        return strValue;
    }

    public static String LJ(Class cls) {
        String strValue;
        InterfaceC1153100g72 interfaceC1153100g72 = (InterfaceC1153100g72) cls.getAnnotation(InterfaceC1153100g72.class);
        if (interfaceC1153100g72 == null || (strValue = interfaceC1153100g72.value()) == null) {
            return "tako_client";
        }
        return strValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJFF(java.lang.Class r7) {
        /*
            java.lang.String r6 = LJ(r7)
            java.lang.String r3 = LIZLLL(r7)
            java.lang.reflect.Field[] r0 = r7.getDeclaredFields()
            X.089E r5 = new X.089E
            r5.<init>(r0)
            r4 = 0
            r2 = r4
        L13:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r1 = r5.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Class<X.09DK> r0 = X.C09DK.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            X.09DK r0 = (X.C09DK) r0
            if (r0 == 0) goto L13
            boolean r0 = r0.isDefault()
            if (r0 == 0) goto L56
            r2 = r1
        L30:
            if (r2 != 0) goto L45
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Can not find @TakoABGroup in "
            r1.append(r0)
            java.lang.String r0 = r7.getName()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        L45:
            if (r2 == 0) goto L4b
            r0 = 1
            r2.setAccessible(r0)
        L4b:
            if (r2 == 0) goto L54
            java.lang.Class r2 = r2.getType()
        L51:
            if (r2 != 0) goto L58
            return r4
        L54:
            r2 = r4
            goto L51
        L56:
            r2 = r1
            goto L13
        L58:
            java.lang.String r0 = "tako_client"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 == 0) goto L93
            com.google.gson.n r1 = X.C1153110g73.LIZ()
            boolean r0 = r1.LJJIJIIJIL(r3)
            if (r0 == 0) goto L7b
            com.google.gson.k r1 = r1.LJJIIZ(r3)     // Catch: java.lang.Exception -> L83
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()     // Catch: java.lang.Exception -> L83
            com.google.gson.Gson r0 = r0.getGson()     // Catch: java.lang.Exception -> L83
            java.lang.Object r0 = r0.LIZJ(r1, r2)     // Catch: java.lang.Exception -> L83
            goto L8f
        L7b:
            kotlin.jvm.internal.AwS102S1000000_18 r1 = new kotlin.jvm.internal.AwS102S1000000_18
            r0 = 39
            r1.<init>(r3, r0)
            goto L8e
        L83:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            kotlin.jvm.internal.AwS167S1100000_18 r1 = new kotlin.jvm.internal.AwS167S1100000_18
            r0 = 37
            r1.<init>(r3, r2, r0)
        L8e:
            r0 = r4
        L8f:
            if (r0 == 0) goto L92
            return r0
        L92:
            return r4
        L93:
            kotlin.jvm.internal.AwS102S1000000_18 r1 = new kotlin.jvm.internal.AwS102S1000000_18
            r0 = 32
            r1.<init>(r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1153090g71.LJFF(java.lang.Class):java.lang.Object");
    }

    public static boolean LIZ(Class cls, boolean z) {
        String strLJ = LJ(cls);
        String strLIZLLL = LIZLLL(cls);
        if (Intrinsics.LJFF(strLJ, "tako_client")) {
            n nVarLIZ = C1153110g73.LIZ();
            if (nVarLIZ.LJJIJIIJIL(strLIZLLL)) {
                try {
                    z = nVarLIZ.LJJIIZ(strLIZLLL).LJ();
                    return z;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    new AwS167S1100000_18(strLIZLLL, e, 33);
                    return z;
                }
            }
            new AwS102S1000000_18(strLIZLLL, 33);
            return z;
        }
        new AwS102S1000000_18(strLIZLLL, 30);
        return z;
    }

    public static int LIZIZ(int i, Class cls) {
        String strLJ = LJ(cls);
        String strLIZLLL = LIZLLL(cls);
        if (Intrinsics.LJFF(strLJ, "tako_client")) {
            n nVarLIZ = C1153110g73.LIZ();
            if (nVarLIZ.LJJIJIIJIL(strLIZLLL)) {
                try {
                    i = nVarLIZ.LJJIIZ(strLIZLLL).LJIIJJI();
                    return i;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    new AwS167S1100000_18(strLIZLLL, e, 34);
                    return i;
                }
            }
            new AwS102S1000000_18(strLIZLLL, 35);
            return i;
        }
        new AwS102S1000000_18(strLIZLLL, 34);
        return i;
    }

    public static long LIZJ(Class cls, long j) {
        String strLJ = LJ(cls);
        String strLIZLLL = LIZLLL(cls);
        if (Intrinsics.LJFF(strLJ, "tako_client")) {
            n nVarLIZ = C1153110g73.LIZ();
            if (nVarLIZ.LJJIJIIJIL(strLIZLLL)) {
                try {
                    j = nVarLIZ.LJJIIZ(strLIZLLL).LJIIZILJ();
                    return j;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    new AwS167S1100000_18(strLIZLLL, e, 36);
                    return j;
                }
            }
            new AwS102S1000000_18(strLIZLLL, 38);
            return j;
        }
        new AwS102S1000000_18(strLIZLLL, 31);
        return j;
    }
}
