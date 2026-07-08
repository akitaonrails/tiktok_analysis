package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;

/* JADX INFO: renamed from: X.0sbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633110sbF {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final Map<String, String> LJFF;
    public final boolean LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final int LJIIJ;

    public static C1633110sbF LIZ(C1633110sbF c1633110sbF, int i) {
        String str = c1633110sbF.LIZ;
        String str2 = c1633110sbF.LIZIZ;
        String str3 = c1633110sbF.LIZJ;
        int i2 = c1633110sbF.LIZLLL;
        int i3 = c1633110sbF.LJ;
        Map<String, String> map = c1633110sbF.LJFF;
        boolean z = c1633110sbF.LJI;
        String str4 = c1633110sbF.LJII;
        boolean z2 = c1633110sbF.LJIIIIZZ;
        boolean z3 = c1633110sbF.LJIIIZ;
        c1633110sbF.getClass();
        return new C1633110sbF(str, str2, str3, i2, i3, map, z, str4, z2, z3, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1633110sbF(String str, String str2, int i, Map map, String str3, int i2) {
        int i3;
        Map mapLJ = map;
        String str4 = str3;
        int i4 = i;
        String str5 = (i2 & 1) != 0 ? null : str;
        String str6 = (i2 & 2) != 0 ? CardStruct.IStatusCode.DEFAULT : null;
        i4 = (i2 & 8) != 0 ? 60 : i4;
        mapLJ = (i2 & 32) != 0 ? C2097608Jq.LJ() : mapLJ;
        str4 = (i2 & 128) != 0 ? "" : str4;
        if ((i2 & 1024) != 0) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        this(str5, str6, str2, i4, 0, mapLJ, false, str4, false, false, i3);
    }

    public C1633110sbF(String str, String str2, String str3, int i, int i2, Map<String, String> map, boolean z, String str4, boolean z2, boolean z3, int i3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = map;
        this.LJI = z;
        this.LJII = str4;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = z3;
        this.LJIIJ = i3;
    }
}
