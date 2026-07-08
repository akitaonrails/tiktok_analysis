package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N3M, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N3M {
    public final int LIZ;
    public final Aweme LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0N3M)) {
            return false;
        }
        C0N3M c0n3m = (C0N3M) obj;
        return this.LIZ == c0n3m.LIZ && Intrinsics.LJFF(this.LIZIZ, c0n3m.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InsertItem(index=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0N3M(int i, Aweme aweme) {
        this.LIZ = i;
        this.LIZIZ = aweme;
    }
}
