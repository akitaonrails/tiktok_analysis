package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0i65, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229390i65 {
    public final List<String> LIZ;
    public final EnumC1219960hqs LIZIZ;
    public final EnumC913760Zt0 LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Map<String, Object> LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public C1229390i65(List list, EnumC1219960hqs enumC1219960hqs, EnumC913760Zt0 enumC913760Zt0, String str, String str2, Map map, String str3, String str4, String str5, int i) {
        enumC1219960hqs = (i & 2) != 0 ? EnumC1219960hqs.UNKNOWN : enumC1219960hqs;
        enumC913760Zt0 = (i & 4) != 0 ? EnumC913760Zt0.NORMAL_GROUP_CHAT : enumC913760Zt0;
        str = (i & 8) != 0 ? null : str;
        str2 = (i & 16) != 0 ? null : str2;
        map = (i & 32) != 0 ? null : map;
        str3 = (i & 64) != 0 ? null : str3;
        str4 = (i & 128) != 0 ? null : str4;
        str5 = (i & 256) != 0 ? null : str5;
        this.LIZ = list;
        this.LIZIZ = enumC1219960hqs;
        this.LIZJ = enumC913760Zt0;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = map;
        this.LJI = str3;
        this.LJII = str4;
        this.LJIIIIZZ = str5;
    }
}
