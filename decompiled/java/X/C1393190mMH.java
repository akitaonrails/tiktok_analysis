package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0mMH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393190mMH {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1393190mMH(int i, String str, String str2, String str3, String str4, int i2) {
        String str5;
        String str6 = (i2 & 16) != 0 ? "" : str4;
        if ((i2 & 32) != 0) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str5 = null;
        }
        this(i, str, str2, str3, str6, str5, (i2 & 64) == 0 ? null : "");
    }

    public C1393190mMH(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
    }
}
