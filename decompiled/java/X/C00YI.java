package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00YI, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YI {
    public final List<ImageModel> LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final User LIZLLL;
    public final long LJ;
    public final String LJFF;

    public C00YI() {
        this(null, 0, 0, null, 0L, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00YI)) {
            return false;
        }
        C00YI c00yi = (C00YI) obj;
        return Intrinsics.LJFF(this.LIZ, c00yi.LIZ) && this.LIZIZ == c00yi.LIZIZ && this.LIZJ == c00yi.LIZJ && Intrinsics.LJFF(this.LIZLLL, c00yi.LIZLLL) && this.LJ == c00yi.LJ && Intrinsics.LJFF(this.LJFF, c00yi.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C00YI(List<? extends ImageModel> list, int i, int i2, User user, long j, String str) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = user;
        this.LJ = j;
        this.LJFF = str;
    }
}
