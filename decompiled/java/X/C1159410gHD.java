package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gHD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159410gHD implements InterfaceC0148002o {
    public final AbstractC1623806Xk<List<C1159480gHK>> LL;
    public final AbstractC1623806Xk<Boolean> LLILLJJLI;
    public final C291001Au<String> LLILLL;
    public final Boolean LLILZ;
    public final Boolean LLILZIL;
    public final String LLILZLL;

    public C1159410gHD() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159410gHD)) {
            return false;
        }
        C1159410gHD c1159410gHD = (C1159410gHD) obj;
        return Intrinsics.LJFF(this.LL, c1159410gHD.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1159410gHD.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1159410gHD.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1159410gHD.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1159410gHD.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1159410gHD.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        C291001Au<String> c291001Au = this.LLILLL;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        Boolean bool = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.LLILZLL;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ManageTopicsContentVMState(contentState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enableSave=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", routeUriEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", exitEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", guideShow=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", versionAlert=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1159410gHD(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1159410gHD(AbstractC1623806Xk<? extends List<C1159480gHK>> abstractC1623806Xk, AbstractC1623806Xk<Boolean> abstractC1623806Xk2, C291001Au<String> c291001Au, Boolean bool, Boolean bool2, String str) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = c291001Au;
        this.LLILZ = bool;
        this.LLILZIL = bool2;
        this.LLILZLL = str;
    }

    public static C1159410gHD LIZ(C1159410gHD c1159410gHD, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, C291001Au c291001Au, Boolean bool, Boolean bool2, String str, int i) {
        String str2 = str;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        C291001Au c291001Au2 = c291001Au;
        AbstractC1623806Xk abstractC1623806Xk3 = abstractC1623806Xk2;
        AbstractC1623806Xk abstractC1623806Xk4 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk4 = c1159410gHD.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk3 = c1159410gHD.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c1159410gHD.LLILLL;
        }
        if ((i & 8) != 0) {
            bool4 = c1159410gHD.LLILZ;
        }
        if ((i & 16) != 0) {
            bool3 = c1159410gHD.LLILZIL;
        }
        if ((i & 32) != 0) {
            str2 = c1159410gHD.LLILZLL;
        }
        c1159410gHD.getClass();
        return new C1159410gHD(abstractC1623806Xk4, abstractC1623806Xk3, c291001Au2, bool4, bool3, str2);
    }
}
