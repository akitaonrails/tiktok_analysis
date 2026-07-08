package X;

import com.ss.android.ugc.profile.business.profile.menu.data.ProfileMenuData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596330NaB implements InterfaceC0148002o {
    public final C291001Au<ProfileMenuData> LL;
    public final C291001Au<Throwable> LLILLJJLI;
    public final boolean LLILLL;
    public final C291001Au<Unit> LLILZ;

    public C596330NaB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C596330NaB)) {
            return false;
        }
        C596330NaB c596330NaB = (C596330NaB) obj;
        return Intrinsics.LJFF(this.LL, c596330NaB.LL) && Intrinsics.LJFF(this.LLILLJJLI, c596330NaB.LLILLJJLI) && this.LLILLL == c596330NaB.LLILLL && Intrinsics.LJFF(this.LLILZ, c596330NaB.LLILZ);
    }

    public final int hashCode() {
        C291001Au<ProfileMenuData> c291001Au = this.LL;
        int iHashCode = (((((c291001Au == null ? 0 : c291001Au.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        C291001Au<Unit> c291001Au2 = this.LLILZ;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileMenuState(requestResult=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", requestError=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isVisible=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", scrollChanged=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C596330NaB(int i) {
        this(null, new C291001Au(null), null, false);
    }

    public C596330NaB(C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, boolean z) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = z;
        this.LLILZ = c291001Au3;
    }

    public static C596330NaB LIZ(C596330NaB c596330NaB, boolean z, C291001Au c291001Au, int i) {
        C291001Au<ProfileMenuData> c291001Au2;
        C291001Au<Throwable> c291001Au3 = null;
        if ((i & 1) != 0) {
            c291001Au2 = c596330NaB.LL;
        } else {
            c291001Au2 = null;
        }
        if ((i & 2) != 0) {
            c291001Au3 = c596330NaB.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = c596330NaB.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au = c596330NaB.LLILZ;
        }
        c596330NaB.getClass();
        return new C596330NaB(c291001Au2, c291001Au3, c291001Au, z);
    }
}
