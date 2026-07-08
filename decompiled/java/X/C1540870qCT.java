package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qCT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1540870qCT implements InterfaceC1541060qCm {
    public final String LIZ;
    public final Context LIZIZ;
    public final EnumC1540990qCf LIZJ;
    public final SparkContext LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final boolean LJI;
    public final C1537070q6L LJII;
    public final InterfaceC1631620sYq<Context, String, C1537480q70, InterfaceC1540940qCa> LJIIIIZZ;
    public final Function2<C1532720pzK, C1532720pzK, Boolean> LJIIIZ;
    public boolean LJIIJ;
    public final C1532720pzK LJIIJJI;
    public int LJIIL;
    public String LJIILIIL;
    public boolean LJIILJJIL;
    public Integer LJIILL;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[PHI: r2
      0x0045: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:13:0x0039, B:15:0x0043, B:11:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ() {
        /*
            r5 = this;
            boolean r0 = r5.LJIILJJIL
            if (r0 == 0) goto L7
            java.lang.String r0 = r5.LJIILIIL
            return r0
        L7:
            X.0pzK r1 = r5.LJIIJJI
            java.lang.String r0 = "channel"
            java.lang.String r4 = r1.LIZJ(r0)
            r3 = 0
            if (r4 == 0) goto L31
            X.0pzK r1 = r5.LJIIJJI
            java.lang.String r0 = "bundle"
            java.lang.String r2 = r1.LIZJ(r0)
            if (r2 == 0) goto L31
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r4)
            r0 = 47
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            if (r2 != 0) goto L45
        L31:
            X.0pzK r1 = r5.LJIIJJI
            java.lang.String r0 = "surl"
            java.lang.String r2 = r1.LIZJ(r0)
            if (r2 != 0) goto L45
            X.0pzK r1 = r5.LJIIJJI
            java.lang.String r0 = "url"
            java.lang.String r2 = r1.LIZJ(r0)
            if (r2 == 0) goto L5a
        L45:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r5.LIZ
            r1.append(r0)
            r0 = 45
            r1.append(r0)
            r1.append(r2)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
        L5a:
            r5.LJIILIIL = r3
            r0 = 1
            r5.LJIILJJIL = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1540870qCT.LIZIZ():java.lang.String");
    }

    @Override // X.InterfaceC1541060qCm
    public final int hashCode() {
        Integer num = this.LJIILL;
        int iIntValue = num != null ? num.intValue() : this.LIZ.hashCode();
        this.LJIILL = Integer.valueOf(iIntValue);
        return iIntValue;
    }

    @Override // X.InterfaceC1541060qCm
    public final String toString() {
        String str = this.LJFF;
        if (str != null) {
            return str;
        }
        String strLIZIZ = LIZIZ();
        if (strLIZIZ != null) {
            return strLIZIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("-no_identifier");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1541060qCm
    public final C1535940q4W LIZ(InterfaceC1541060qCm interfaceC1541060qCm, C1535940q4W c1535940q4W) {
        if (interfaceC1541060qCm == this) {
            return c1535940q4W;
        }
        if (!(interfaceC1541060qCm instanceof C1540870qCT)) {
            return null;
        }
        String str = this.LJFF;
        C1540870qCT c1540870qCT = (C1540870qCT) interfaceC1541060qCm;
        String str2 = c1540870qCT.LJFF;
        if (str != null && str2 != null && Intrinsics.LJFF(str, str2)) {
            return c1535940q4W;
        }
        Function2<C1532720pzK, C1532720pzK, Boolean> function2 = this.LJIIIZ;
        if (function2 != null && function2.invoke(c1540870qCT.LJIIJJI, this.LJIIJJI).booleanValue()) {
            return c1535940q4W;
        }
        Function2<C1532720pzK, C1532720pzK, Boolean> function22 = c1540870qCT.LJIIIZ;
        if (function22 != null && function22.invoke(c1540870qCT.LJIIJJI, this.LJIIJJI).booleanValue()) {
            return c1535940q4W;
        }
        String strLIZIZ = LIZIZ();
        String strLIZIZ2 = c1540870qCT.LIZIZ();
        if (strLIZIZ == null || strLIZIZ2 == null || !Intrinsics.LJFF(strLIZIZ, strLIZIZ2)) {
            return null;
        }
        return c1535940q4W;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1540870qCT(String str, Context context, EnumC1540990qCf enumC1540990qCf, SparkContext sparkContext, boolean z, String str2, boolean z2, C1537070q6L c1537070q6L, InterfaceC1631620sYq<? super Context, ? super String, ? super C1537480q70, ? extends InterfaceC1540940qCa> interfaceC1631620sYq, Function2<? super C1532720pzK, ? super C1532720pzK, Boolean> function2) {
        this.LIZ = str;
        this.LIZIZ = context;
        this.LIZJ = enumC1540990qCf;
        this.LIZLLL = sparkContext;
        this.LJ = z;
        this.LJFF = str2;
        this.LJI = z2;
        this.LJII = c1537070q6L;
        this.LJIIIIZZ = interfaceC1631620sYq;
        this.LJIIIZ = function2;
        this.LJIIJJI = C1532730pzL.LIZIZ(sparkContext.LJIJI(), null, null, EnumC838370Wuh.FUZZY);
    }
}
