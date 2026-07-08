package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I16, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I16 {
    public final C0I18 LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final Integer LJFF;
    public final int LJI;
    public final int LJII;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C0I16() {
        int i = 0;
        this(null, 0 == true ? 1 : 0, i, i, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I16)) {
            return false;
        }
        C0I16 c0i16 = (C0I16) obj;
        return this.LIZ == c0i16.LIZ && this.LIZIZ == c0i16.LIZIZ && this.LIZJ == c0i16.LIZJ && this.LIZLLL == c0i16.LIZLLL && this.LJ == c0i16.LJ && Intrinsics.LJFF(this.LJFF, c0i16.LJFF) && this.LJI == c0i16.LJI && this.LJII == c0i16.LJII;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        Integer num = this.LJFF;
        return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LJI) * 31) + this.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionPanelViewConfig(attachMode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showMaskLayer=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showMemberLoadingSkeleton=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", alignMemberListToTop=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", matchHostBounds=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", memberListTopPadding=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", memberListBottomPadding=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0I16(C0I18 c0i18, Integer num, int i, int i2, int i3) {
        boolean z;
        int i4 = i2;
        int i5 = i;
        Integer num2 = num;
        C0I18 c0i182 = (i3 & 1) != 0 ? C0I18.VIEW_STUB : c0i18;
        if ((i3 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(c0i182, z, false, false, false, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? 0 : i5, (i3 & 128) != 0 ? 0 : i4);
    }

    public C0I16(C0I18 c0i18, boolean z, boolean z2, boolean z3, boolean z4, Integer num, int i, int i2) {
        this.LIZ = c0i18;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = z4;
        this.LJFF = num;
        this.LJI = i;
        this.LJII = i2;
    }
}
