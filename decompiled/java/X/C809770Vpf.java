package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0Vpf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809770Vpf {
    public Context LIZ;
    public String LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public int LJ = 1;

    public final C809790Vph LIZ() {
        String str;
        int i = this.LJ;
        if (i == 1 && this.LIZ == null) {
            throw new IllegalArgumentException("context is null");
        }
        String str2 = this.LIZIZ;
        if (str2 != null && (str = this.LIZJ) != null) {
            return new C809790Vph(this.LIZ, str2, str, i, this.LIZLLL);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sdkName or sdkVersion is invalid. sdkName = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sdkVersion = ");
        sbLIZ.append(this.LIZJ);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
