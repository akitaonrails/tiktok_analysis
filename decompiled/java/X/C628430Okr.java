package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Okr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628430Okr implements InterfaceC0148002o {
    public final boolean LL;
    public final C375830EoP<Boolean> LLILLJJLI;

    public C628430Okr() {
        this(3, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C628430Okr)) {
            return false;
        }
        C628430Okr c628430Okr = (C628430Okr) obj;
        return this.LL == c628430Okr.LL && Intrinsics.LJFF(this.LLILLJJLI, c628430Okr.LLILLJJLI);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        C375830EoP<Boolean> c375830EoP = this.LLILLJJLI;
        return iZ2 + (c375830EoP == null ? 0 : c375830EoP.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateFavoriteState(isFavorite=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", favoriteNetResultEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C628430Okr(int i, boolean z) {
        this((C375830EoP) null, (i & 1) != 0 ? false : z);
    }

    public C628430Okr(C375830EoP c375830EoP, boolean z) {
        this.LL = z;
        this.LLILLJJLI = c375830EoP;
    }

    public static C628430Okr LIZ(C628430Okr c628430Okr, boolean z, C375830EoP c375830EoP, int i) {
        if ((i & 1) != 0) {
            z = c628430Okr.LL;
        }
        if ((i & 2) != 0) {
            c375830EoP = c628430Okr.LLILLJJLI;
        }
        c628430Okr.getClass();
        return new C628430Okr(c375830EoP, z);
    }
}
