package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PAO, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PAO extends C0PAL {
    public final int LIZ;
    public final Aweme LIZIZ;
    public final C0PBZ LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PAO)) {
            return false;
        }
        C0PAO c0pao = (C0PAO) obj;
        return this.LIZ == c0pao.LIZ && Intrinsics.LJFF(this.LIZIZ, c0pao.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0pao.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        C0PBZ c0pbz = this.LIZJ;
        return iHashCode + (c0pbz == null ? 0 : c0pbz.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Valid(position=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", locatorTask=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PAO(int i, Aweme aweme, C0PBZ c0pbz) {
        this.LIZ = i;
        this.LIZIZ = aweme;
        this.LIZJ = c0pbz;
    }
}
