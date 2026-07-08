package X;

import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q93, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q93 implements InterfaceC0148002o {
    public SubFilterOptionStruct LL;
    public SubFilterOptionStruct LLILLJJLI;
    public SubFilterOptionStruct LLILLL;
    public SubFilterOptionStruct LLILZ;
    public SubFilterOptionStruct LLILZIL;
    public SubFilterOptionStruct LLILZLL;
    public boolean LLIZ;

    public C0Q93() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q93)) {
            return false;
        }
        C0Q93 c0q93 = (C0Q93) obj;
        return Intrinsics.LJFF(this.LL, c0q93.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0q93.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0q93.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0q93.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0q93.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0q93.LLILZLL) && this.LLIZ == c0q93.LLIZ;
    }

    public final int hashCode() {
        SubFilterOptionStruct subFilterOptionStruct = this.LL;
        int iHashCode = (subFilterOptionStruct == null ? 0 : subFilterOptionStruct.hashCode()) * 31;
        SubFilterOptionStruct subFilterOptionStruct2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (subFilterOptionStruct2 == null ? 0 : subFilterOptionStruct2.hashCode())) * 31;
        SubFilterOptionStruct subFilterOptionStruct3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (subFilterOptionStruct3 == null ? 0 : subFilterOptionStruct3.hashCode())) * 31;
        SubFilterOptionStruct subFilterOptionStruct4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (subFilterOptionStruct4 == null ? 0 : subFilterOptionStruct4.hashCode())) * 31;
        SubFilterOptionStruct subFilterOptionStruct5 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (subFilterOptionStruct5 == null ? 0 : subFilterOptionStruct5.hashCode())) * 31;
        SubFilterOptionStruct subFilterOptionStruct6 = this.LLILZLL;
        return ((iHashCode5 + (subFilterOptionStruct6 != null ? subFilterOptionStruct6.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchFilterState(selectCategoryStruct=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectSortStruct=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectFilterStruct=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selectFollowerNumberStruct=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selectProfilesTypesStruct=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", selectOtherPreferencesStruct=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isApply=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0Q93(int i) {
        this(null, null, null, null, null, null, false);
    }

    public C0Q93(SubFilterOptionStruct subFilterOptionStruct, SubFilterOptionStruct subFilterOptionStruct2, SubFilterOptionStruct subFilterOptionStruct3, SubFilterOptionStruct subFilterOptionStruct4, SubFilterOptionStruct subFilterOptionStruct5, SubFilterOptionStruct subFilterOptionStruct6, boolean z) {
        this.LL = subFilterOptionStruct;
        this.LLILLJJLI = subFilterOptionStruct2;
        this.LLILLL = subFilterOptionStruct3;
        this.LLILZ = subFilterOptionStruct4;
        this.LLILZIL = subFilterOptionStruct5;
        this.LLILZLL = subFilterOptionStruct6;
        this.LLIZ = z;
    }

    public static C0Q93 LIZ(C0Q93 c0q93, SubFilterOptionStruct subFilterOptionStruct, SubFilterOptionStruct subFilterOptionStruct2, SubFilterOptionStruct subFilterOptionStruct3, SubFilterOptionStruct subFilterOptionStruct4, SubFilterOptionStruct subFilterOptionStruct5, SubFilterOptionStruct subFilterOptionStruct6, boolean z, int i) {
        boolean z2 = z;
        SubFilterOptionStruct subFilterOptionStruct7 = subFilterOptionStruct6;
        SubFilterOptionStruct subFilterOptionStruct8 = subFilterOptionStruct5;
        SubFilterOptionStruct subFilterOptionStruct9 = subFilterOptionStruct4;
        SubFilterOptionStruct subFilterOptionStruct10 = subFilterOptionStruct3;
        SubFilterOptionStruct subFilterOptionStruct11 = subFilterOptionStruct2;
        SubFilterOptionStruct subFilterOptionStruct12 = subFilterOptionStruct;
        if ((i & 1) != 0) {
            subFilterOptionStruct12 = c0q93.LL;
        }
        if ((i & 2) != 0) {
            subFilterOptionStruct11 = c0q93.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            subFilterOptionStruct10 = c0q93.LLILLL;
        }
        if ((i & 8) != 0) {
            subFilterOptionStruct9 = c0q93.LLILZ;
        }
        if ((i & 16) != 0) {
            subFilterOptionStruct8 = c0q93.LLILZIL;
        }
        if ((i & 32) != 0) {
            subFilterOptionStruct7 = c0q93.LLILZLL;
        }
        if ((i & 64) != 0) {
            z2 = c0q93.LLIZ;
        }
        c0q93.getClass();
        return new C0Q93(subFilterOptionStruct12, subFilterOptionStruct11, subFilterOptionStruct10, subFilterOptionStruct9, subFilterOptionStruct8, subFilterOptionStruct7, z2);
    }
}
