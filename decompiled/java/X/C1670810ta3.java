package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS45S0200100_25;

/* JADX INFO: renamed from: X.0ta3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670810ta3 {
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long LIZIZ(int r5, X.InterfaceC1680500tpg r6) {
        /*
            r0 = -1858934400(0xffffffff9132e980, float:-1.4113677E-28)
            r6.LJJIIJZLJL(r0)
            X.13DR r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.LIZIZ
            java.lang.Object r4 = r6.LJJIL(r0)
            android.content.Context r4 = (android.content.Context) r4
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r6.LJJIIJZLJL(r0)
            boolean r0 = r6.LJIJI(r5)
            r3 = 1
            if (r0 != 0) goto L64
            r2 = 0
        L1c:
            boolean r0 = r6.LJJIIJ(r4)
            r2 = r2 | r0
            java.lang.Object r1 = r6.LJJ()
            if (r2 != 0) goto L30
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L50
        L30:
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r0 = r4.getTheme()
            boolean r0 = r0.resolveAttribute(r5, r1, r3)
            if (r0 == 0) goto L66
            int r0 = r1.type
            if (r0 != r3) goto L61
            int r0 = r1.resourceId
            int r0 = X.C446980Hfs.LIZ(r4, r0)
        L49:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r6.LJJIJIIJI(r1)
        L50:
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            r6.LJ()
            long r0 = X.C1685850tyJ.LIZIZ(r0)
            r6.LJ()
            return r0
        L61:
            int r0 = r1.data
            goto L49
        L64:
            r2 = 1
            goto L1c
        L66:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Theme attr not found: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1670810ta3.LIZIZ(int, X.0tpg):long");
    }

    public static final InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC595010NVj interfaceC595010NVj, C20279814Wu c20279814Wu, Function0 function0, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        long j;
        boolean z;
        boolean z2;
        C20279814Wu c20279814Wu2 = c20279814Wu;
        InterfaceC595010NVj interfaceC595010NVj2 = interfaceC595010NVj;
        interfaceC1680500tpg.LJJIIJZLJL(668675950);
        if ((i2 & 1) != 0) {
            j = 300;
        } else {
            j = 0;
        }
        if ((i2 & 2) != 0) {
            interfaceC1680500tpg.LJJIIJZLJL(1849434622);
            Object objLJJ = interfaceC1680500tpg.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = new C612270Nzt();
                interfaceC1680500tpg.LJJIJIIJI(objLJJ);
            }
            interfaceC595010NVj2 = (InterfaceC595010NVj) objLJJ;
            interfaceC1680500tpg.LJ();
        }
        if ((i2 & 8) != 0) {
            c20279814Wu2 = null;
        }
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ2 == c1680520tpi) {
            objLJJ2 = C1696980uGG.LIZ(0L);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        InterfaceC1675750ti1 interfaceC1675750ti1 = (InterfaceC1675750ti1) objLJJ2;
        interfaceC1680500tpg.LJ();
        interfaceC1680500tpg.LJJIIJZLJL(-1746271574);
        if ((((i & 112) ^ 48) <= 32 || !interfaceC1680500tpg.LJIJJ(j)) && (i & 48) != 32) {
            z = false;
        } else {
            z = true;
        }
        if ((((458752 & i) ^ 196608) <= 131072 || !interfaceC1680500tpg.LJJIIJ(function0)) && (i & 196608) != 131072) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = z | z2;
        Object objLJJ3 = interfaceC1680500tpg.LJJ();
        if (z3 || objLJJ3 == c1680520tpi) {
            objLJJ3 = new AwS45S0200100_25(j, (long) function0, (Function0<Unit>) interfaceC1675750ti1, (InterfaceC1675750ti1) 4);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ3);
        }
        interfaceC1680500tpg.LJ();
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C634380OuS.LIZ(interfaceC1685750ty9, interfaceC595010NVj2, null, true, null, c20279814Wu2, (Function0) objLJJ3);
        interfaceC1680500tpg.LJ();
        return interfaceC1685750ty9LIZ;
    }
}
