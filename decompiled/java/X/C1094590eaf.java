package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;

/* JADX INFO: renamed from: X.0eaf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1094590eaf {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final EnumC1095860eci LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final Map<String, String> LJIIIIZZ;

    public C1094590eaf() {
        throw null;
    }

    public C1094590eaf(String str, boolean z, boolean z2, EnumC1095860eci enumC1095860eci, int i, String str2, String str3, String str4, Map map, int i2) {
        i = (i2 & 16) != 0 ? -1 : i;
        str2 = (i2 & 32) != 0 ? "" : str2;
        str3 = (i2 & 64) != 0 ? CardStruct.IStatusCode.DEFAULT : str3;
        str4 = (i2 & 128) != 0 ? "other" : str4;
        map = (i2 & 256) != 0 ? null : map;
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = enumC1095860eci;
        this.LJ = i;
        this.LJFF = str2;
        this.LJI = str3;
        this.LJII = str4;
        this.LJIIIIZZ = map;
    }
}
