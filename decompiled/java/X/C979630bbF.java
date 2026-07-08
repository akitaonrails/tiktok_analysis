package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C979630bbF {
    public static final /* synthetic */ int LJFF = 0;
    public final boolean LIZ;
    public final String LIZIZ;
    public final List<C006T> LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C979630bbF)) {
            return false;
        }
        C979630bbF c979630bbF = (C979630bbF) obj;
        return this.LIZ == c979630bbF.LIZ && Intrinsics.LJFF(this.LIZIZ, c979630bbF.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c979630bbF.LIZJ) && this.LIZLLL == c979630bbF.LIZLLL && this.LJ == c979630bbF.LJ;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendSuggestionBannerViewState(isVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", titleText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", avatarSlots=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showChevron=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", clickActionEnabled=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C979630bbF(String str, boolean z, boolean z2, boolean z3, List list) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = z2;
        this.LJ = z3;
    }
}
