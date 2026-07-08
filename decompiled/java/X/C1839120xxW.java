package X;

import java.text.DecimalFormat;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xxW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839120xxW {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final EnumC1839040xxO LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1839120xxW)) {
            return false;
        }
        C1839120xxW c1839120xxW = (C1839120xxW) obj;
        return Intrinsics.LJFF(this.LIZ, c1839120xxW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1839120xxW.LIZIZ) && this.LIZJ == c1839120xxW.LIZJ && this.LIZLLL == c1839120xxW.LIZLLL && Intrinsics.LJFF(this.LJ, c1839120xxW.LJ) && Intrinsics.LJFF(this.LJFF, c1839120xxW.LJFF) && this.LJI == c1839120xxW.LJI;
    }

    public final String LIZ() {
        int i = this.LIZJ;
        return C786410Ut5.k4(null, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2));
    }

    public final String LIZIZ() {
        int iLJ = C13LZ.LJ((int) Math.floor(Math.log10(this.LIZLLL) / ((double) 3)), 0, 4);
        String str = new String[]{"", "K", "M", "B", "T"}[iLJ];
        if (str.length() == 0) {
            return String.valueOf(this.LIZLLL);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(new DecimalFormat("#0.0").format(((double) this.LIZLLL) / Math.pow(10.0d, ((double) iLJ) * 3.0d)));
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1839120xxW(String str, String str2, int i, int i2, String str3, String str4, EnumC1839040xxO enumC1839040xxO) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = enumC1839040xxO;
    }
}
