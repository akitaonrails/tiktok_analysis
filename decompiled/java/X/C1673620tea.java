package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673620tea {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1673620tea)) {
            return false;
        }
        C1673620tea c1673620tea = (C1673620tea) obj;
        return Intrinsics.LJFF(this.LIZ, c1673620tea.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1673620tea.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1673620tea.LIZJ) && this.LIZLLL == c1673620tea.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryRevealItemUi(itemId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isOn=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1673620tea LIZ(C1673620tea c1673620tea, boolean z) {
        String str = c1673620tea.LIZ;
        String str2 = c1673620tea.LIZIZ;
        String str3 = c1673620tea.LIZJ;
        c1673620tea.getClass();
        return new C1673620tea(str, str2, str3, z);
    }

    public C1673620tea(String str, String str2, String str3, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
    }
}
