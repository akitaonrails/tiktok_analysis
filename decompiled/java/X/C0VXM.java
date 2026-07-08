package X;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: X.0VXM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VXM {
    public static volatile boolean LIZIZ;
    public static C0VSJ LIZJ;
    public static C0VSJ LIZLLL;
    public static C0VSJ LJ;
    public static C0VSJ LJFF;
    public static final C0VXM LJI = new C0VXM();
    public boolean LIZ;

    public static File LIZ() {
        C0VSJ c0vsj = LJFF;
        if (c0vsj != null) {
            return c0vsj;
        }
        if (!LIZIZ) {
            C0VSJ c0vsj2 = new C0VSJ(C0VX9.LJFF(), "processTrack");
            LIZJ = c0vsj2;
            C2112008Pe.LIZJ(c0vsj2);
            C0VSJ c0vsj3 = new C0VSJ(LIZJ, String.valueOf(C0VX9.LIZJ() / 86400000));
            LIZLLL = c0vsj3;
            C2112008Pe.LIZJ(c0vsj3);
            C0VSJ c0vsj4 = new C0VSJ(LIZLLL, C802270VdZ.LIZJ());
            LJ = c0vsj4;
            C2112008Pe.LIZJ(c0vsj4);
            LIZIZ = true;
        }
        if (LJ == null) {
            return LJFF;
        }
        C0VSJ c0vsj5 = new C0VSJ(LJ, String.valueOf(C0VX9.LIZJ()));
        LJFF = c0vsj5;
        return c0vsj5;
    }

    public static C0VSJ LIZIZ(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strValueOf = String.valueOf(j / 86400000);
        String strValueOf2 = String.valueOf(j);
        C0VSJ c0vsjLJFF = C0VX9.LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processTrack");
        String str2 = File.separator;
        sbLIZ.append(str2);
        sbLIZ.append(strValueOf);
        sbLIZ.append(str2);
        sbLIZ.append(str);
        sbLIZ.append(str2);
        sbLIZ.append(strValueOf2);
        return new C0VSJ(c0vsjLJFF, C2188811AlT.LIZIZ(sbLIZ));
    }
}
