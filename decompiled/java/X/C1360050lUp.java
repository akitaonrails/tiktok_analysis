package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.0lUp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360050lUp {
    public final List<User> LIZ;
    public long LIZIZ;
    public final String LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public final boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;
    public boolean LJIIJJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1360050lUp(List list, long j, String str, int i, boolean z, String str2, boolean z2, int i2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = z2;
        boolean z8 = z;
        int i3 = i;
        String str3 = (i2 & 4) != 0 ? null : str;
        i3 = (i2 & 8) != 0 ? 0 : i3;
        if ((i2 & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        z8 = (i2 & 32) != 0 ? false : z8;
        if ((i2 & 64) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((i2 & 128) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((i2 & 256) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this(list, j, str3, i3, z3, z8, z4, z5, z6, (i2 & 512) == 0 ? str2 : null, (i2 & 1024) != 0 ? false : z7);
    }

    public C1360050lUp(List<User> list, long j, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, boolean z6) {
        this.LIZ = list;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = z4;
        this.LJIIIIZZ = z5;
        this.LJIIIZ = str2;
        this.LJIIJ = z6;
    }
}
