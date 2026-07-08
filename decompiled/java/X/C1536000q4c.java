package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.0q4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536000q4c {
    public final File LIZIZ() {
        C0VSJ c0vsj = AbstractC1536120q4o.LIZJ;
        if (c0vsj == null) {
            synchronized (this) {
                try {
                    c0vsj = AbstractC1536120q4o.LIZJ;
                    if (c0vsj == null) {
                        c0vsj = new C0VSJ(C1529330ptr.LIZ(), "js_code_cache_v2");
                        c0vsj.mkdirs();
                        AbstractC1536120q4o.LIZJ = c0vsj;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c0vsj;
    }

    public static AbstractC1536120q4o LIZ(C1532710pzJ c1532710pzJ, final String str, final String str2) {
        if (c1532710pzJ.LJJIJ != null) {
            final C1529350ptt c1529350ptt = c1532710pzJ.LJJIIJ;
            final String str3 = c1532710pzJ.LJJIII.LIZ;
            return new AbstractC1536120q4o(c1529350ptt, str, str2, str3) { // from class: X.0q4e
                public final String LIZLLL;
                public final C1529350ptt LJ;
                public final String LJFF;
                public final String LJI;
                public final C0VSJ LJII;

                @Override // X.AbstractC1536120q4o
                public final String LIZIZ() {
                    return this.LJI;
                }

                @Override // X.AbstractC1536120q4o
                public final C0VSJ LIZJ() {
                    return this.LJII;
                }

                @Override // X.AbstractC1536120q4o
                public final C1529350ptt LIZLLL() {
                    return this.LJ;
                }

                @Override // X.AbstractC1536120q4o
                public final String LJ() {
                    return this.LJFF;
                }

                @Override // X.AbstractC1536120q4o
                public final String LJFF() {
                    return this.LIZLLL;
                }

                {
                    this.LIZLLL = str;
                    this.LJ = c1529350ptt;
                    this.LJFF = str3;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cdn");
                    sbLIZ.append(File.separator);
                    sbLIZ.append(str2);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    this.LJI = strLIZIZ;
                    this.LJII = new C0VSJ(AbstractC1536120q4o.LIZIZ.LIZIZ(), strLIZIZ);
                }
            };
        }
        C1529350ptt c1529350ptt2 = c1532710pzJ.LJJIIJ;
        if (c1529350ptt2 != null) {
            return new C1536050q4h(c1529350ptt2, str, str2, c1532710pzJ.LJJIII.LIZ);
        }
        return null;
    }
}
