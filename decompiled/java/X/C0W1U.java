package X;

import java.io.File;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0W1U, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W1U {
    public final String LIZ;
    public final long[] LIZIZ;
    public boolean LIZJ;
    public C0W1T LIZLLL;
    public final /* synthetic */ C0W1V LJ;

    public final String LIZJ() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.LIZIZ) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }

    public final C0VSJ LIZ(int i) {
        File file = this.LJ.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(e3.d);
        sbLIZ.append(i);
        return new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C0VSJ LIZIZ(int i) {
        File file = this.LJ.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(e3.d);
        sbLIZ.append(i);
        sbLIZ.append(".tmp");
        return new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ));
    }

    public C0W1U(C0W1V c0w1v, String str) {
        this.LJ = c0w1v;
        this.LIZ = str;
        this.LIZIZ = new long[c0w1v.LLILZLL];
    }
}
