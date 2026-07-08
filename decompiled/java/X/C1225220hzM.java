package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225220hzM extends AbstractC1223800hx4 {
    public final long LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1225220hzM)) {
            return false;
        }
        C1225220hzM c1225220hzM = (C1225220hzM) obj;
        return this.LL == c1225220hzM.LL && Intrinsics.LJFF(this.LLILLJJLI, c1225220hzM.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1225220hzM.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1225220hzM.LLILZ) && this.LLILZIL == c1225220hzM.LLILZIL && this.LLILZLL == c1225220hzM.LLILZLL && this.LLIZ == c1225220hzM.LLIZ && this.LLIZLLLIL == c1225220hzM.LLIZLLLIL && this.LLJ == c1225220hzM.LLJ;
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LL) * 31;
        String str = this.LLILLJJLI;
        int iHashCode = (((iY2 + (str == null ? 0 : str.hashCode())) * 31) + this.LLILLL.hashCode()) * 31;
        String str2 = this.LLILZ;
        return ((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FanGroupChooseGroupRowItem(conversationShortId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isClickable=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", hasSelectBox=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isCurrentSelected=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isCurrentDisable=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", isHidden=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1223800hx4, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1225220hzM)) {
            return false;
        }
        C1225220hzM c1225220hzM = (C1225220hzM) interfaceC1891350zJl;
        if (c1225220hzM.LL != this.LL || !Intrinsics.LJFF(c1225220hzM.LLILLJJLI, this.LLILLJJLI) || !Intrinsics.LJFF(c1225220hzM.LLILLL, this.LLILLL) || !Intrinsics.LJFF(c1225220hzM.LLILZ, this.LLILZ) || c1225220hzM.LLIZ != this.LLIZ || c1225220hzM.LLIZLLLIL != this.LLIZLLLIL || c1225220hzM.LLILZLL != this.LLILZLL || c1225220hzM.LLJ != this.LLJ) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1223800hx4, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1225220hzM) || ((C1225220hzM) interfaceC1891350zJl).LL != this.LL) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1223800hx4, X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        final boolean z;
        final boolean z2;
        final boolean z3;
        final boolean z4;
        if (!(interfaceC1891350zJl instanceof C1225220hzM)) {
            return null;
        }
        C1225220hzM c1225220hzM = (C1225220hzM) interfaceC1891350zJl;
        final boolean z5 = !Intrinsics.LJFF(c1225220hzM.LLILLJJLI, this.LLILLJJLI);
        final boolean z6 = !Intrinsics.LJFF(c1225220hzM.LLILLL, this.LLILLL);
        final boolean z7 = !Intrinsics.LJFF(c1225220hzM.LLILZ, this.LLILZ);
        if (c1225220hzM.LLIZ != this.LLIZ) {
            z = true;
        } else {
            z = false;
        }
        if (c1225220hzM.LLIZLLLIL != this.LLIZLLLIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c1225220hzM.LLILZLL != this.LLILZLL) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c1225220hzM.LLJ != this.LLJ) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new Object(z5, z6, z7, z, z2, z3, z4) { // from class: X.0048
            public final boolean LIZ;
            public final boolean LIZIZ;
            public final boolean LIZJ;
            public final boolean LIZLLL;
            public final boolean LJ;
            public final boolean LJFF;
            public final boolean LJI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnonymousClass0048)) {
                    return false;
                }
                AnonymousClass0048 anonymousClass0048 = (AnonymousClass0048) obj;
                return this.LIZ == anonymousClass0048.LIZ && this.LIZIZ == anonymousClass0048.LIZIZ && this.LIZJ == anonymousClass0048.LIZJ && this.LIZLLL == anonymousClass0048.LIZLLL && this.LJ == anonymousClass0048.LJ && this.LJFF == anonymousClass0048.LJFF && this.LJI == anonymousClass0048.LJI;
            }

            public final int hashCode() {
                return (((((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FanGroupChooseGroupRowItemDiffStatus(isAvatarChange=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", isNameChange=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", isDescChange=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", isSelectedChanged=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", isDisableChanged=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(", isSelectBoxChange=");
                sbLIZ.append(this.LJFF);
                sbLIZ.append(", isHiddenChanged=");
                sbLIZ.append(this.LJI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = z5;
                this.LIZIZ = z6;
                this.LIZJ = z7;
                this.LIZLLL = z;
                this.LJ = z2;
                this.LJFF = z3;
                this.LJI = z4;
            }
        };
    }

    public C1225220hzM(long j, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = z3;
        this.LLIZLLLIL = z4;
        this.LLJ = z5;
    }
}
