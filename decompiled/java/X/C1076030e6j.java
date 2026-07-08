package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e6j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076030e6j implements InterfaceC1076060e6m {
    public final boolean LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final EnumC993700bxw LLILZ;
    public final Set<String> LLILZIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1076030e6j() {
        this(null, 0 == true ? 1 : 0, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1076030e6j)) {
            return false;
        }
        C1076030e6j c1076030e6j = (C1076030e6j) obj;
        return this.LL == c1076030e6j.LL && Intrinsics.LJFF(this.LLILLJJLI, c1076030e6j.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1076030e6j.LLILLL) && this.LLILZ == c1076030e6j.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1076030e6j.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        String str = this.LLILLJJLI;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC993700bxw enumC993700bxw = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (enumC993700bxw == null ? 0 : enumC993700bxw.hashCode())) * 31;
        Set<String> set = this.LLILZIL;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRevisitNavTabFilterItem(selected=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", textForSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", textForDefault=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selectedCategorySet=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1076030e6j) || !areItemTheSame(interfaceC1891350zJl)) {
            return false;
        }
        C1076030e6j c1076030e6j = (C1076030e6j) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LLILLJJLI, c1076030e6j.LLILLJJLI) || this.LL != c1076030e6j.LL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1076030e6j)) {
            return false;
        }
        return Intrinsics.LJFF(this.LLILLL, ((C1076030e6j) interfaceC1891350zJl).LLILLL);
    }

    public /* synthetic */ C1076030e6j(String str, EnumC993700bxw enumC993700bxw, int i) {
        this(false, null, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : enumC993700bxw, null);
    }

    public C1076030e6j(boolean z, String str, String str2, EnumC993700bxw enumC993700bxw, Set<String> set) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = enumC993700bxw;
        this.LLILZIL = set;
    }

    public static C1076030e6j LIZ(C1076030e6j c1076030e6j, boolean z, String str, Set set, int i) {
        String str2;
        Set set2 = set;
        String str3 = str;
        boolean z2 = z;
        if ((i & 1) != 0) {
            z2 = c1076030e6j.LL;
        }
        if ((i & 2) != 0) {
            str3 = c1076030e6j.LLILLJJLI;
        }
        EnumC993700bxw enumC993700bxw = null;
        if ((i & 4) != 0) {
            str2 = c1076030e6j.LLILLL;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            enumC993700bxw = c1076030e6j.LLILZ;
        }
        if ((i & 16) != 0) {
            set2 = c1076030e6j.LLILZIL;
        }
        c1076030e6j.getClass();
        return new C1076030e6j(z2, str3, str2, enumC993700bxw, set2);
    }
}
