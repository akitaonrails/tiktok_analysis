package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.007d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0267007d {
    public final List<User> LIZ;
    public final long LIZIZ;

    public C0267007d() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0267007d)) {
            return false;
        }
        C0267007d c0267007d = (C0267007d) obj;
        return Intrinsics.LJFF(this.LIZ, c0267007d.LIZ) && this.LIZIZ == c0267007d.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RevealSocialProofSceneState(users=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0267007d(int i) {
        this(C13BV.INSTANCE, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0267007d(List<? extends User> list, long j) {
        this.LIZ = list;
        this.LIZIZ = j;
    }
}
