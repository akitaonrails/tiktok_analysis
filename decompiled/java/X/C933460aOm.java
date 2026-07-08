package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aOm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933460aOm {
    public final User LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final List<ImageModel> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C933460aOm)) {
            return false;
        }
        C933460aOm c933460aOm = (C933460aOm) obj;
        return Intrinsics.LJFF(this.LIZ, c933460aOm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c933460aOm.LIZIZ) && this.LIZJ == c933460aOm.LIZJ && this.LIZLLL == c933460aOm.LIZLLL && Intrinsics.LJFF(this.LJ, c933460aOm.LJ);
    }

    public final int hashCode() {
        User user = this.LIZ;
        int iHashCode = (((((((user == null ? 0 : user.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        List<ImageModel> list = this.LJ;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public /* synthetic */ C933460aOm(User user, String str, int i, boolean z, int i2) {
        this(user, str, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? false : z, (List<ImageModel>) null);
    }

    public C933460aOm(User user, String str, int i, boolean z, List<ImageModel> list) {
        this.LIZ = user;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = list;
    }
}
