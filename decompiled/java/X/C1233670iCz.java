package X;

import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233670iCz implements InterfaceC636340Oxc<C1233670iCz, C1233750iD7> {
    public final C627660Ojc<C1233750iD7> LL;
    public final AbstractC1623806Xk<AddVerificationResponse> LLILLJJLI;
    public final AbstractC1623806Xk<AddVerificationResponse> LLILLL;
    public final boolean LLILZ;
    public final C1233730iD5 LLILZIL;

    public C1233670iCz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1233670iCz)) {
            return false;
        }
        C1233670iCz c1233670iCz = (C1233670iCz) obj;
        return Intrinsics.LJFF(this.LL, c1233670iCz.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1233670iCz.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1233670iCz.LLILLL) && this.LLILZ == c1233670iCz.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1233670iCz.LLILZIL);
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TwoStepVerificationActivityVMState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadingPageData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", actionResponse=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enableTurnOn=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", popUpParam=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1233750iD7> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<C1233750iD7> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1233670iCz(int i) {
        C627660Ojc c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        C491101vh c491101vh = C491101vh.LIZ;
        this(c627660Ojc, c491101vh, c491101vh, false, new C1233730iD5(null, null));
    }

    public C1233670iCz(C627660Ojc<C1233750iD7> c627660Ojc, AbstractC1623806Xk<AddVerificationResponse> abstractC1623806Xk, AbstractC1623806Xk<AddVerificationResponse> abstractC1623806Xk2, boolean z, C1233730iD5 c1233730iD5) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = abstractC1623806Xk2;
        this.LLILZ = z;
        this.LLILZIL = c1233730iD5;
    }

    public static C1233670iCz LIZ(C1233670iCz c1233670iCz, C627660Ojc c627660Ojc, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, boolean z, C1233730iD5 c1233730iD5, int i) {
        C1233730iD5 c1233730iD52 = c1233730iD5;
        boolean z2 = z;
        AbstractC1623806Xk abstractC1623806Xk3 = abstractC1623806Xk2;
        AbstractC1623806Xk abstractC1623806Xk4 = abstractC1623806Xk;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1233670iCz.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk4 = c1233670iCz.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk3 = c1233670iCz.LLILLL;
        }
        if ((i & 8) != 0) {
            z2 = c1233670iCz.LLILZ;
        }
        if ((i & 16) != 0) {
            c1233730iD52 = c1233670iCz.LLILZIL;
        }
        c1233670iCz.getClass();
        return new C1233670iCz(c627660Ojc2, abstractC1623806Xk4, abstractC1623806Xk3, z2, c1233730iD52);
    }
}
