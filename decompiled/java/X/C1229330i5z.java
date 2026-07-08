package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0i5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229330i5z {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public String LIZLLL;
    public String LJ;
    public long LJFF;
    public long LJI;
    public final Map<EnumC1227850i3b, Long> LJII;
    public final Map<EnumC995320c0Y, Long> LJIIIIZZ;

    public C1229330i5z(String str, String str2, String str3, int i) {
        String str4;
        LinkedHashMap linkedHashMap;
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            str4 = "";
        } else {
            str4 = null;
        }
        String str5 = (i & 16) == 0 ? null : "";
        if ((i & 128) != 0) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = null;
        }
        LinkedHashMap linkedHashMap2 = (i & 256) != 0 ? new LinkedHashMap() : null;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = 0L;
        this.LJI = 0L;
        this.LJII = linkedHashMap;
        this.LJIIIIZZ = linkedHashMap2;
    }
}
