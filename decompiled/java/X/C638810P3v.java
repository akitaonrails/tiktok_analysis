package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0P3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C638810P3v {
    public final EnumC912680ZrG LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Map<String, String> LJI;
    public final Map<String, String> LJII;

    public C638810P3v(EnumC912680ZrG enumC912680ZrG, String str, List list, String str2, String str3, String str4, Map map, int i) {
        list = (i & 4) != 0 ? C13BV.INSTANCE : list;
        str2 = (i & 8) != 0 ? "" : str2;
        str3 = (i & 16) != 0 ? "" : str3;
        map = (i & 64) != 0 ? null : map;
        this.LIZ = enumC912680ZrG;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = map;
        this.LJII = null;
    }
}
