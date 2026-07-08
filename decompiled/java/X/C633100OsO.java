package X;

import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0OsO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C633100OsO {
    public static final C633100OsO LIZ = new C633100OsO();
    public static final int LIZIZ = 15000;
    public static final C603820NmG<String, C633090OsN> LIZJ = new C603820NmG<>(16);
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3409));

    public static MusicDetail LIZ(String str, String str2) {
        C603820NmG<String, C633090OsN> c603820NmG = LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('&');
        sbLIZ.append(str2);
        C633090OsN c633090OsNLIZJ = c603820NmG.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c633090OsNLIZJ != null && System.currentTimeMillis() - c633090OsNLIZJ.LIZIZ < LIZIZ) {
            return c633090OsNLIZJ.LIZ;
        }
        return null;
    }

    public static MusicAwemeList LIZIZ(int i, String str, long j, int i2, String str2) {
        if (j != 0) {
            return null;
        }
        C603820NmG c603820NmG = (C603820NmG) LIZLLL.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('&');
        sbLIZ.append(j);
        sbLIZ.append('&');
        sbLIZ.append(i);
        sbLIZ.append('&');
        sbLIZ.append(i2);
        sbLIZ.append(str2);
        sbLIZ.append("normal");
        C633110OsP c633110OsP = (C633110OsP) c603820NmG.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c633110OsP == null || System.currentTimeMillis() - c633110OsP.LIZIZ >= LIZIZ) {
            return null;
        }
        return c633110OsP.LIZ;
    }

    public static long LIZJ(int i, long j, int i2, String str, String str2) {
        C603820NmG c603820NmG = (C603820NmG) LIZLLL.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('&');
        sbLIZ.append(j);
        sbLIZ.append('&');
        sbLIZ.append(i);
        sbLIZ.append('&');
        sbLIZ.append(i2);
        sbLIZ.append(str2);
        C633110OsP c633110OsP = (C633110OsP) c603820NmG.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c633110OsP != null) {
            return c633110OsP.LIZIZ;
        }
        return -1L;
    }
}
