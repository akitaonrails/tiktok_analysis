package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0mM9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393110mM9 {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public static C1393110mM9 LIZ(C1393110mM9 c1393110mM9, boolean z, String str, String str2, int i) {
        String str3;
        String str4;
        String str5;
        int i2;
        String str6;
        String str7 = str2;
        String str8 = str;
        boolean z2 = z;
        if ((i & 1) != 0) {
            z2 = c1393110mM9.LIZ;
        }
        String str9 = null;
        if ((i & 2) != 0) {
            str3 = c1393110mM9.LIZIZ;
        } else {
            str3 = null;
        }
        if ((i & 4) != 0) {
            str4 = c1393110mM9.LIZJ;
        } else {
            str4 = null;
        }
        if ((i & 8) != 0) {
            str5 = c1393110mM9.LIZLLL;
        } else {
            str5 = null;
        }
        if ((i & 16) != 0) {
            i2 = c1393110mM9.LJ;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            str8 = c1393110mM9.LJFF;
        }
        if ((i & 64) != 0) {
            str6 = c1393110mM9.LJI;
        } else {
            str6 = null;
        }
        if ((i & 128) != 0) {
            str9 = c1393110mM9.LJII;
        }
        if ((i & 256) != 0) {
            str7 = c1393110mM9.LJIIIIZZ;
        }
        c1393110mM9.getClass();
        return new C1393110mM9(i2, str3, str4, str5, str8, str6, str9, str7, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1393110mM9(boolean z, String str, String str2, String str3, int i, String str4, String str5, int i2) {
        String str6;
        String str7 = str5;
        if ((i2 & 64) != 0) {
            str6 = "";
        } else {
            str6 = null;
        }
        this(i, str, str2, str3, str4, str6, (i2 & 128) == 0 ? null : "", (i2 & 256) != 0 ? CardStruct.IStatusCode.DEFAULT : str7, z);
    }

    public C1393110mM9(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = i;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
    }
}
