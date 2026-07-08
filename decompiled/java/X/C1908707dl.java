package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07dl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1908707dl {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Set<String> LIZ;
    public final Set<String> LIZIZ;
    public final Set<String> LIZJ;

    public C1908707dl() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1908707dl)) {
            return false;
        }
        C1908707dl c1908707dl = (C1908707dl) obj;
        return Intrinsics.LJFF(this.LIZ, c1908707dl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1908707dl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1908707dl.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TagsFilter(allOf=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", anyOf=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", noneOf=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        return (this.LIZ.isEmpty() ^ true) || (this.LIZIZ.isEmpty() ^ true) || (this.LIZJ.isEmpty() ^ true);
    }

    public C1908707dl(Set set, Set set2, int i) {
        C08CX c08cx;
        set = (i & 1) != 0 ? C08CX.INSTANCE : set;
        set2 = (i & 2) != 0 ? C08CX.INSTANCE : set2;
        if ((i & 4) != 0) {
            c08cx = C08CX.INSTANCE;
        } else {
            c08cx = null;
        }
        this.LIZ = set;
        this.LIZIZ = set2;
        this.LIZJ = c08cx;
    }
}
