package X;

import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lGK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351060lGK {
    public final CommentItemList LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final boolean LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1351060lGK)) {
            return false;
        }
        C1351060lGK c1351060lGK = (C1351060lGK) obj;
        return Intrinsics.LJFF(this.LIZ, c1351060lGK.LIZ) && this.LIZIZ == c1351060lGK.LIZIZ && this.LIZJ == c1351060lGK.LIZJ && this.LIZLLL == c1351060lGK.LIZLLL && this.LJ == c1351060lGK.LJ && this.LJFF == c1351060lGK.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF;
    }

    public C1351060lGK(CommentItemList commentItemList, boolean z, int i) {
        boolean z2;
        int i2;
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z = (i & 16) != 0 ? true : z;
        if ((i & 32) != 0) {
            i2 = (int) commentItemList.total;
        } else {
            i2 = 0;
        }
        this.LIZ = commentItemList;
        this.LIZIZ = 0;
        this.LIZJ = false;
        this.LIZLLL = z2;
        this.LJ = z;
        this.LJFF = i2;
    }
}
