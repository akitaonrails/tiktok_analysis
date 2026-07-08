package X;

import com.ss.android.ugc.aweme.recommendationcard.data.CardContent;
import java.util.List;

/* JADX INFO: renamed from: X.12AJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12AJ {
    public final String LIZ;
    public final String LIZIZ;
    public final List<CardContent> LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;
    public final String LJII;

    public C12AJ() {
        this(0);
    }

    public /* synthetic */ C12AJ(int i) {
        this(null, null, null, null, null, null, false, null);
    }

    public C12AJ(String str, String str2, List<CardContent> list, String str3, String str4, String str5, boolean z, String str6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = z;
        this.LJII = str6;
    }

    public static C12AJ LIZ(C12AJ c12aj, String str, String str2, List list, String str3, String str4, String str5, boolean z, String str6, int i) {
        String str7 = str6;
        boolean z2 = z;
        String str8 = str5;
        String str9 = str4;
        String str10 = str3;
        List list2 = list;
        String str11 = str2;
        String str12 = str;
        if ((i & 1) != 0) {
            str12 = c12aj.LIZ;
        }
        if ((i & 2) != 0) {
            str11 = c12aj.LIZIZ;
        }
        if ((i & 4) != 0) {
            list2 = c12aj.LIZJ;
        }
        if ((i & 8) != 0) {
            str10 = c12aj.LIZLLL;
        }
        if ((i & 16) != 0) {
            str9 = c12aj.LJ;
        }
        if ((i & 32) != 0) {
            str8 = c12aj.LJFF;
        }
        if ((i & 64) != 0) {
            z2 = c12aj.LJI;
        }
        if ((i & 128) != 0) {
            str7 = c12aj.LJII;
        }
        return new C12AJ(str12, str11, list2, str10, str9, str8, z2, str7);
    }
}
