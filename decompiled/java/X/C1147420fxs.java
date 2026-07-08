package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fxs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147420fxs {
    public final long LIZ;
    public final List<C1147330fxj> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1147420fxs)) {
            return false;
        }
        C1147420fxs c1147420fxs = (C1147420fxs) obj;
        return this.LIZ == c1147420fxs.LIZ && Intrinsics.LJFF(this.LIZIZ, c1147420fxs.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicGiftPageModel(moodId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tabs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1147420fxs(long j, List<C1147330fxj> list) {
        this.LIZ = j;
        this.LIZIZ = list;
    }
}
