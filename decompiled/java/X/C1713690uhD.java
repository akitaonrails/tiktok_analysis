package X;

import androidx.fragment.app.Fragment;
import java.util.Map;

/* JADX INFO: renamed from: X.0uhD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713690uhD {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final Fragment LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final C1708530uYt LJI;
    public final Map<String, String> LJII;

    static {
        new C1713490ugt();
    }

    public static C1713690uhD LIZ(C1713690uhD c1713690uhD, Fragment fragment, String str, String str2, int i) {
        String str3;
        String str4;
        String str5;
        C1708530uYt c1708530uYt;
        String str6 = str2;
        String str7 = str;
        Fragment fragment2 = fragment;
        if ((i & 1) != 0) {
            fragment2 = c1713690uhD.LIZ;
        }
        Map<String, String> map = null;
        if ((i & 2) != 0) {
            str3 = c1713690uhD.LIZIZ;
        } else {
            str3 = null;
        }
        if ((i & 4) != 0) {
            str4 = c1713690uhD.LIZJ;
        } else {
            str4 = null;
        }
        if ((i & 8) != 0) {
            str7 = c1713690uhD.LIZLLL;
        }
        if ((i & 16) != 0) {
            str6 = c1713690uhD.LJ;
        }
        if ((i & 32) != 0) {
            str5 = c1713690uhD.LJFF;
        } else {
            str5 = null;
        }
        if ((i & 64) != 0) {
            c1708530uYt = c1713690uhD.LJI;
        } else {
            c1708530uYt = null;
        }
        if ((i & 128) != 0) {
            map = c1713690uhD.LJII;
        }
        return new C1713690uhD(fragment2, str3, str4, str7, str6, str5, c1708530uYt, map);
    }

    public /* synthetic */ C1713690uhD(Fragment fragment, String str, String str2, String str3, String str4, C1708530uYt c1708530uYt, Map map, int i) {
        this((i & 1) != 0 ? null : fragment, str, str2, (String) null, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : c1708530uYt, (Map<String, String>) ((i & 128) != 0 ? null : map));
    }

    public C1713690uhD(Fragment fragment, String str, String str2, String str3, String str4, String str5, C1708530uYt c1708530uYt, Map<String, String> map) {
        this.LIZ = fragment;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = c1708530uYt;
        this.LJII = map;
    }
}
