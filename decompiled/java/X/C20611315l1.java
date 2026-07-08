package X;

import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.List;

/* JADX INFO: renamed from: X.15l1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20611315l1 {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Word LJFF;
    public final List<Position> LJI;
    public final int LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    public C20611315l1(String str, String str2, boolean z, String str3, String str4, Word word, List list, int i, String str5, String str6, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        str2 = (i2 & 2) != 0 ? "" : str2;
        z = (i2 & 4) != 0 ? false : z;
        str3 = (i2 & 8) != 0 ? "" : str3;
        str4 = (i2 & 16) != 0 ? "" : str4;
        word = (i2 & 64) != 0 ? null : word;
        list = (i2 & 128) != 0 ? C13BV.INSTANCE : list;
        i = (i2 & 256) != 0 ? 0 : i;
        str5 = (i2 & 512) != 0 ? "" : str5;
        str6 = (i2 & 1024) != 0 ? null : str6;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = word;
        this.LJI = list;
        this.LJII = i;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = str6;
    }
}
