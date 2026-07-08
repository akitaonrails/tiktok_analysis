package X;

import com.tiktok.myna.render.render.bindinfo.MynaBindForConfig;
import java.util.Map;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18da, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21329618da {
    public static final /* synthetic */ int LJIIL = 0;
    public final Map<String, String> LIZ;
    public final Map<String, String> LIZIZ;
    public final Map<String, String> LIZJ;
    public final Map<String, String> LIZLLL;
    public final MynaBindForConfig LJ;
    public final Map<String, String> LJFF;
    public final Map<String, String> LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;

    public final boolean LIZ(C21325918cz c21325918cz, Map<String, ? extends Object> map, C21329718db c21329718db) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        String str3;
        String str4;
        String str5 = this.LJIIIZ;
        if ((str5 != null && str5.length() != 0) || (((str = this.LJIIJ) != null && str.length() != 0) || ((str2 = this.LJIIJJI) != null && str2.length() != 0))) {
            String str6 = this.LJIIIZ;
            if (str6 != null && str6.length() != 0) {
                c21329718db.LIZ = true;
                c21329718db.LIZIZ = false;
                if (C1903107cr.LJ(c21325918cz.LIZ.LIZJ.LIZ(this.LJIIIZ, map, c21325918cz, c21325918cz.LJJIII))) {
                    c21329718db.LIZIZ = true;
                }
                return false;
            }
            String str7 = this.LJIIJ;
            if (str7 != null && str7.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 && ((str4 = this.LJIIJJI) == null || str4.length() == 0)) {
                C1325860kbg.LIZIZ(null, new AwS576S0100000_32(this, 703), C2097608Jq.LJ());
            } else {
                if (!c21329718db.LIZ) {
                    C1325860kbg.LIZIZ(null, AFwS223S0000000_32.get$arr$(223), C2097608Jq.LJ());
                } else if (!c21329718db.LIZIZ) {
                    String str8 = this.LJIIJ;
                    if (str8 != null && str8.length() != 0) {
                        str3 = this.LJIIJ;
                    } else {
                        String str9 = this.LJIIJJI;
                        if (str9 != null && str9.length() != 0) {
                            str3 = this.LJIIJJI;
                        } else {
                            str3 = "";
                        }
                    }
                    if (C1903107cr.LJ(c21325918cz.LIZ.LIZJ.LIZ(str3, map, c21325918cz, c21325918cz.LJJIII))) {
                        c21329718db.LIZIZ = true;
                    }
                }
                return false;
            }
        }
        String str10 = this.LJII;
        if (str10 != null && str10.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            Object objLIZ = c21325918cz.LIZ.LIZJ.LIZ(this.LJII, map, c21325918cz, c21325918cz.LJJIII);
            if (objLIZ != null && "none".equals(objLIZ)) {
                return false;
            }
        } else {
            String str11 = this.LJIIIIZZ;
            if (str11 != null && "none".equals(str11)) {
                return false;
            }
        }
        return true;
    }

    public C21329618da(Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, MynaBindForConfig mynaBindForConfig, Map<String, String> map5, Map<String, String> map6, String str, String str2, String str3, String str4, String str5) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = map3;
        this.LIZLLL = map4;
        this.LJ = mynaBindForConfig;
        this.LJFF = map5;
        this.LJI = map6;
        this.LJII = str;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = str3;
        this.LJIIJ = str4;
        this.LJIIJJI = str5;
    }
}
