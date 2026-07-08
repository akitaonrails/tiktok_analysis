package X;

import com.ss.android.ugc.aweme.tars.settings.TarsConfig;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Z1X, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z1X implements C0Z0H {
    public final TarsConfig.TaskConfig LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1447));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1446));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1453));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1444));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1442));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1443));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1441));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1454));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1456));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1455));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1449));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1448));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1450));
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1451));
    public final C01GW LJIILL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1452));
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1445));
    public final String LJIIZILJ;

    @Override // X.C0Z03
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.C0Z03
    public final boolean LJ() {
        return true;
    }

    @Override // X.C0Z03
    public final void releaseResource() {
    }

    public final int LJIILIIL() {
        return ((Number) this.LJIIJ.getValue()).intValue();
    }

    public final int LJIILJJIL() {
        return ((Number) this.LJIIIZ.getValue()).intValue();
    }

    @Override // X.InterfaceC892680Z0g, X.C0Z03
    public final TarsConfig.TaskConfig LJIIIIZZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC892680Z0g
    public final String getName() {
        return this.LJIIZILJ;
    }

    public C0Z1X(TarsConfig.TaskConfig taskConfig) {
        this.LIZ = taskConfig;
        this.LJIIZILJ = taskConfig.task;
    }

    public static C443120HZe LJIILL(String str) {
        float fFloatValue;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        if (listLJJLIIIJILLIZJL == null) {
            return null;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        for (Object obj : listLJJLIIIJILLIZJL) {
            int i2 = i + 1;
            if (i >= 0) {
                Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(u.LJJIFFI(a0.LJLIIIL((String) obj).toString(), "f", "", false));
                if (fLJIIIIZZ != null) {
                    fFloatValue = fLJIIIIZZ.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            f3 = fFloatValue;
                        }
                    } else {
                        f2 = fFloatValue;
                    }
                } else {
                    f = fFloatValue;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return new C443120HZe(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
    }

    @Override // X.C0Z03
    public final Object LIZ(C0Z01 c0z01) {
        return C882580Yjo.LIZIZ(this, c0z01);
    }

    @Override // X.C0Z03
    public final Object LIZIZ(InterfaceC882520Yji interfaceC882520Yji, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C882580Yjo.LIZ(interfaceC882520Yji);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0389 A[PHI: r12 r15
      0x0389: PHI (r12v2 float) = (r12v1 float), (r12v1 float), (r12v3 float) binds: [B:44:0x01f2, B:46:0x01ff, B:89:0x0387] A[DONT_GENERATE, DONT_INLINE]
      0x0389: PHI (r15v2 java.lang.Object) = (r15v1 android.graphics.Bitmap), (r15v1 android.graphics.Bitmap), (r15v3 ??) binds: [B:44:0x01f2, B:46:0x01ff, B:89:0x0387] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r15v10, types: [float[]] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v7, types: [float[]] */
    /* JADX WARN: Type inference failed for: r15v8 */
    @Override // X.C0Z0H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC882480Yje r23, X.InterfaceC1364105Vn<? super kotlin.Unit> r24) throws X.C892820Z0u {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z1X.LJFF(X.0Yje, X.05Vn):java.lang.Object");
    }

    @Override // X.C0Z03
    public final Object LJI(C0Z08 c0z08, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C882580Yjo.LIZJ(c0z08);
    }

    public static Pair LJIIL(int i, int i2, int i3, int i4) {
        C531650Kt9 it2 = C13LZ.LJIIIZ(i, 0).iterator();
        while (it2.LLILLL) {
            int iNextInt = it2.nextInt();
            if (iNextInt % i4 == 0 && iNextInt <= i3) {
                C531650Kt9 it3 = C13LZ.LJIIIZ(i2, 0).iterator();
                while (it3.LLILLL) {
                    int iNextInt2 = it3.nextInt();
                    if (iNextInt2 % i4 == 0 && iNextInt2 <= i3) {
                        return new Pair(Integer.valueOf(iNextInt), Integer.valueOf(iNextInt2));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
