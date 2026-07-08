package X;

import com.ss.android.ugc.aweme.web.share.model.SearchShareUIConfig;

/* JADX INFO: renamed from: X.0e66, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075640e66 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final SearchShareUIConfig LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public C1075640e66(String str, String str2, String str3, String str4, String str5, String str6, SearchShareUIConfig searchShareUIConfig, String str7, String str8, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        str4 = (i & 8) != 0 ? "" : str4;
        str5 = (i & 16) != 0 ? "" : str5;
        str6 = (i & 32) != 0 ? "" : str6;
        searchShareUIConfig = (i & 64) != 0 ? new SearchShareUIConfig(0, 0) : searchShareUIConfig;
        str7 = (i & 128) != 0 ? null : str7;
        str8 = (i & 256) != 0 ? "search_result_share" : str8;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = searchShareUIConfig;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
    }
}
