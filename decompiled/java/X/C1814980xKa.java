package X;

import com.bytedance.android.livesdk.model.RecommendBoardInfo;

/* JADX INFO: renamed from: X.0xKa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814980xKa {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final RecommendBoardInfo LJI;
    public String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1814980xKa() {
        long j = 0;
        this(j, j, (String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (RecommendBoardInfo) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 1023);
    }

    public /* synthetic */ C1814980xKa(long j, long j2, String str, String str2, String str3, String str4, RecommendBoardInfo recommendBoardInfo, String str5, String str6, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? null : recommendBoardInfo, (String) null, (i & 256) != 0 ? null : str5, (i & 512) == 0 ? str6 : "");
    }

    public C1814980xKa(long j, long j2, String str, String str2, String str3, String str4, RecommendBoardInfo recommendBoardInfo, String str5, String str6, String str7) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = recommendBoardInfo;
        this.LJII = str5;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = str7;
    }
}
