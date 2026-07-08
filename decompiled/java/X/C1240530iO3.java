package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iO3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240530iO3 implements InterfaceC1240590iO9 {
    public final InterfaceC1240540iO4 LL;
    public final C1240520iO2 LLILLJJLI;
    public final C07YE LLILLL;
    public final String LLILZ;
    public Map<String, String> LLILZIL;
    public final C0PGF LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final boolean LLJ;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1240530iO3)) {
            return false;
        }
        C1240530iO3 c1240530iO3 = (C1240530iO3) obj;
        return Intrinsics.LJFF(this.LL, c1240530iO3.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1240530iO3.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1240530iO3.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1240530iO3.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1240530iO3.LLILZIL) && this.LLILZLL == c1240530iO3.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1240530iO3.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1240530iO3.LLIZLLLIL) && this.LLJ == c1240530iO3.LLJ;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C1240520iO2 c1240520iO2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c1240520iO2 == null ? 0 : c1240520iO2.hashCode())) * 31;
        C07YE c07ye = this.LLILLL;
        int iHashCode3 = (((((((iHashCode2 + (c07ye == null ? 0 : c07ye.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        String str = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLIZLLLIL;
        return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMNewSearchCommonItem(searchCellDelegate=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", accountsSortData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", messageSortData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", uniqueId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", eventParams=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", needReport=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1240590iO9
    public final Map<String, String> getEventParams() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1240590iO9
    public final String getId() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1240590iO9
    public final boolean getNeedReport() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1240590iO9
    public final String getTabName() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1240590iO9
    public final C0PGF getType() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1240590iO9
    public final String getUniqueId() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1240530iO3)) {
            return false;
        }
        return this.LL.LJIIJ(((C1240530iO3) interfaceC1891350zJl).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1240530iO3)) {
            return false;
        }
        return this.LL.LIZJ(((C1240530iO3) interfaceC1891350zJl).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1240530iO3)) {
            return null;
        }
        return this.LL.LJIIIZ(((C1240530iO3) interfaceC1891350zJl).LL);
    }

    public static C1240530iO3 LIZ(C1240530iO3 c1240530iO3, String str, Map map, int i) {
        InterfaceC1240540iO4 interfaceC1240540iO4;
        C1240520iO2 c1240520iO2;
        C07YE c07ye;
        C0PGF c0pgf;
        String str2;
        boolean z;
        Map map2 = map;
        String str3 = str;
        String str4 = null;
        if ((i & 1) != 0) {
            interfaceC1240540iO4 = c1240530iO3.LL;
        } else {
            interfaceC1240540iO4 = null;
        }
        if ((i & 2) != 0) {
            c1240520iO2 = c1240530iO3.LLILLJJLI;
        } else {
            c1240520iO2 = null;
        }
        if ((i & 4) != 0) {
            c07ye = c1240530iO3.LLILLL;
        } else {
            c07ye = null;
        }
        if ((i & 8) != 0) {
            str3 = c1240530iO3.LLILZ;
        }
        if ((i & 16) != 0) {
            map2 = c1240530iO3.LLILZIL;
        }
        if ((i & 32) != 0) {
            c0pgf = c1240530iO3.LLILZLL;
        } else {
            c0pgf = null;
        }
        if ((i & 64) != 0) {
            str2 = c1240530iO3.LLIZ;
        } else {
            str2 = null;
        }
        if ((i & 128) != 0) {
            str4 = c1240530iO3.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            z = c1240530iO3.LLJ;
        } else {
            z = false;
        }
        return new C1240530iO3(interfaceC1240540iO4, c1240520iO2, c07ye, str3, map2, c0pgf, str2, str4, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1240530iO3(InterfaceC1240540iO4 interfaceC1240540iO4, C1240520iO2 c1240520iO2, C07YE c07ye, C0PGF c0pgf, String str, String str2, int i) {
        String str3;
        Map mapLJ;
        boolean z;
        C07YE c07ye2 = c07ye;
        C1240520iO2 c1240520iO22 = (i & 2) != 0 ? null : c1240520iO2;
        c07ye2 = (i & 4) != 0 ? null : c07ye2;
        if ((i & 8) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        if ((i & 16) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        String str4 = (i & 128) == 0 ? str2 : null;
        if ((i & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(interfaceC1240540iO4, c1240520iO22, c07ye2, str3, mapLJ, c0pgf, str, str4, z);
    }

    public C1240530iO3(InterfaceC1240540iO4 interfaceC1240540iO4, C1240520iO2 c1240520iO2, C07YE c07ye, String str, Map<String, String> map, C0PGF c0pgf, String str2, String str3, boolean z) {
        this.LL = interfaceC1240540iO4;
        this.LLILLJJLI = c1240520iO2;
        this.LLILLL = c07ye;
        this.LLILZ = str;
        this.LLILZIL = map;
        this.LLILZLL = c0pgf;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = z;
        this.LLJI = "";
        this.LLJIJIL = "";
        this.LLJILJIL = "";
    }
}
