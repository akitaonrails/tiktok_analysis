package X;

import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0PEz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641710PEz implements C0PWT {
    public final boolean LL;

    public C641710PEz() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C641710PEz) && this.LL == ((C641710PEz) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchVideoCoverLoadStateAction(isCoverLoadSuccess=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Y30().LIZIZ(C13LE.LIZ(C641710PEz.class), AFwS293S0000000_10.get$arr$(201));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C641710PEz(boolean z) {
        this.LL = z;
    }
}
