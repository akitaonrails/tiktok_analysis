package X;

import android.content.Context;

/* JADX INFO: renamed from: X.00HP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00HP {
    public final Context LIZ;
    public final boolean LIZIZ;
    public final C004O LIZJ;
    public final C004L LIZLLL;
    public final EnumC1235690iGF LJ;
    public final long LJFF;
    public final Integer LJI;
    public final boolean LJII;

    public C00HP(Context context, boolean z, C004O c004o, C004L c004l, EnumC1235690iGF enumC1235690iGF, long j, Integer num, boolean z2, int i) {
        enumC1235690iGF = (i & 16) != 0 ? EnumC1235690iGF.TOP : enumC1235690iGF;
        j = (i & 32) != 0 ? -1001L : j;
        num = (i & 64) != 0 ? null : num;
        z2 = (i & 128) != 0 ? false : z2;
        this.LIZ = context;
        this.LIZIZ = z;
        this.LIZJ = c004o;
        this.LIZLLL = c004l;
        this.LJ = enumC1235690iGF;
        this.LJFF = j;
        this.LJI = num;
        this.LJII = z2;
    }
}
