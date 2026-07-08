package X;

import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.ImpressionInfo;

/* JADX INFO: renamed from: X.12B4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12B4 {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final C12B8 LJ;
    public final C12B9 LJFF;
    public final Integer LJI;
    public final ImpressionInfo LJII;

    public C12B4(boolean z, String str, String str2, Integer num, C12B8 c12b8, C12B9 c12b9, Integer num2, ImpressionInfo impressionInfo, int i) {
        str = (i & 4) != 0 ? null : str;
        str2 = (i & 8) != 0 ? null : str2;
        num = (i & 16) != 0 ? null : num;
        c12b8 = (i & 32) != 0 ? null : c12b8;
        c12b9 = (i & 64) != 0 ? null : c12b9;
        num2 = (i & 128) != 0 ? null : num2;
        impressionInfo = (i & 256) != 0 ? null : impressionInfo;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = num;
        this.LJ = c12b8;
        this.LJFF = c12b9;
        this.LJI = num2;
        this.LJII = impressionInfo;
    }
}
