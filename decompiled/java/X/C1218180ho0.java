package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ho0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218180ho0 {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final IMUser LIZ;
    public final String LIZIZ;
    public final C0Y8T LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final String LJFF;
    public final IMUser LJI;
    public final String LJII;

    public C1218180ho0() {
        this(null, null, null, 0L, 0L, null, null, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1218180ho0)) {
            return false;
        }
        C1218180ho0 c1218180ho0 = (C1218180ho0) obj;
        return Intrinsics.LJFF(this.LIZ, c1218180ho0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1218180ho0.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1218180ho0.LIZJ) && this.LIZLLL == c1218180ho0.LIZLLL && this.LJ == c1218180ho0.LJ && Intrinsics.LJFF(this.LJFF, c1218180ho0.LJFF) && Intrinsics.LJFF(this.LJI, c1218180ho0.LJI) && Intrinsics.LJFF(this.LJII, c1218180ho0.LJII);
    }

    public final int hashCode() {
        IMUser iMUser = this.LIZ;
        int iHashCode = (iMUser == null ? 0 : iMUser.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C0Y8T c0y8t = this.LIZJ;
        int iHashCode3 = (((((iHashCode2 + (c0y8t == null ? 0 : c0y8t.hashCode())) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31;
        String str2 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IMUser iMUser2 = this.LJI;
        return ((iHashCode4 + (iMUser2 != null ? iMUser2.hashCode() : 0)) * 31) + this.LJII.hashCode();
    }

    public C1218180ho0(IMUser iMUser, String str, C0Y8T c0y8t, long j, long j2, String str2, IMUser iMUser2, String str3) {
        this.LIZ = iMUser;
        this.LIZIZ = str;
        this.LIZJ = c0y8t;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = str2;
        this.LJI = iMUser2;
        this.LJII = str3;
    }
}
