package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.RecFriendsFragment;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dwr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1069910dwr implements InterfaceC0148002o {
    public final C13IQ<? extends Fragment> LL;
    public final C13IQ<? extends Fragment> LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final C291001Au<Unit> LLILZIL;

    public C1069910dwr() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1069910dwr)) {
            return false;
        }
        C1069910dwr c1069910dwr = (C1069910dwr) obj;
        return Intrinsics.LJFF(this.LL, c1069910dwr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1069910dwr.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1069910dwr.LLILLL) && this.LLILZ == c1069910dwr.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1069910dwr.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C13IQ<? extends Fragment> c13iq = this.LLILLJJLI;
        int iHashCode2 = (((((iHashCode + (c13iq == null ? 0 : c13iq.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        C291001Au<Unit> c291001Au = this.LLILZIL;
        return iHashCode2 + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FFPMainVMState(showFragment=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", prevFragment=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", searchKeyword=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showSeparator=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", hideKeyboard=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1069910dwr(int i) {
        this(C13LE.LIZ(RecFriendsFragment.class), null, "", false, null);
    }

    public C1069910dwr(C13IQ<? extends Fragment> c13iq, C13IQ<? extends Fragment> c13iq2, String str, boolean z, C291001Au<Unit> c291001Au) {
        this.LL = c13iq;
        this.LLILLJJLI = c13iq2;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = c291001Au;
    }

    public static C1069910dwr LIZ(C1069910dwr c1069910dwr, C13IQ c13iq, C13IQ c13iq2, String str, boolean z, C291001Au c291001Au, int i) {
        C291001Au c291001Au2 = c291001Au;
        boolean z2 = z;
        String str2 = str;
        C13IQ c13iq3 = c13iq2;
        C13IQ c13iq4 = c13iq;
        if ((i & 1) != 0) {
            c13iq4 = c1069910dwr.LL;
        }
        if ((i & 2) != 0) {
            c13iq3 = c1069910dwr.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str2 = c1069910dwr.LLILLL;
        }
        if ((i & 8) != 0) {
            z2 = c1069910dwr.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au2 = c1069910dwr.LLILZIL;
        }
        c1069910dwr.getClass();
        return new C1069910dwr(c13iq4, c13iq3, str2, z2, c291001Au2);
    }
}
