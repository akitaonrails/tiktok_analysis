package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.19oz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21655119oz {
    public String LIZ;
    public final String LIZIZ;
    public long LIZJ;
    public EnumC2176421AFs LIZLLL;
    public String LJ;
    public int LJFF;

    public final void LIZ(C21655119oz c21655119oz) {
        EnumC2176421AFs enumC2176421AFs;
        int i;
        if (!TextUtils.equals(this.LIZIZ, c21655119oz.LIZIZ)) {
            return;
        }
        if (TextUtils.isEmpty(this.LJ) && !TextUtils.isEmpty(c21655119oz.LJ)) {
            this.LJ = c21655119oz.LJ;
        }
        if (this.LJFF < 0 && (i = c21655119oz.LJFF) >= 0) {
            this.LJFF = i;
        }
        if (TextUtils.isEmpty(this.LIZ) && !TextUtils.isEmpty(c21655119oz.LIZ)) {
            this.LIZ = c21655119oz.LIZ;
        }
        if (this.LIZJ <= 0) {
            long j = c21655119oz.LIZJ;
            if (j > 0) {
                this.LIZJ = j;
            }
        }
        if (this.LIZLLL == null && (enumC2176421AFs = c21655119oz.LIZLLL) != null) {
            this.LIZLLL = enumC2176421AFs;
        }
    }

    public C21655119oz(long j, EnumC2176421AFs enumC2176421AFs, String str, String str2) {
        this(null, -1, str, str2, j, enumC2176421AFs);
    }

    public C21655119oz(String str, int i, String str2, String str3, long j, EnumC2176421AFs enumC2176421AFs) {
        this.LJ = str;
        this.LJFF = i;
        this.LIZ = str2;
        this.LIZIZ = str3;
        this.LIZJ = j;
        this.LIZLLL = enumC2176421AFs;
    }
}
