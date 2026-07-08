package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440510HPd implements InterfaceC0148002o {
    public final List<EnumC440890HQp> LL;
    public final EnumC440360HOo LLILLJJLI;
    public final EnumC440380HOq LLILLL;
    public final C291001Au<Unit> LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C440510HPd)) {
            return false;
        }
        C440510HPd c440510HPd = (C440510HPd) obj;
        return Intrinsics.LJFF(this.LL, c440510HPd.LL) && this.LLILLJJLI == c440510HPd.LLILLJJLI && this.LLILLL == c440510HPd.LLILLL && Intrinsics.LJFF(this.LLILZ, c440510HPd.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<Unit> c291001Au = this.LLILZ;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixStudioBaseState(pageStack=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterGenerationPanelEnterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterResultPanelEnterMethod=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", albumPermission=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C440510HPd(List<? extends EnumC440890HQp> list, EnumC440360HOo enumC440360HOo, EnumC440380HOq enumC440380HOq, C291001Au<Unit> c291001Au) {
        this.LL = list;
        this.LLILLJJLI = enumC440360HOo;
        this.LLILLL = enumC440380HOq;
        this.LLILZ = c291001Au;
    }

    public static C440510HPd LIZ(C440510HPd c440510HPd, List list, EnumC440360HOo enumC440360HOo, EnumC440380HOq enumC440380HOq, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            list = c440510HPd.LL;
        }
        if ((i & 2) != 0) {
            enumC440360HOo = c440510HPd.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            enumC440380HOq = c440510HPd.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au = c440510HPd.LLILZ;
        }
        c440510HPd.getClass();
        return new C440510HPd(list, enumC440360HOo, enumC440380HOq, c291001Au);
    }
}
