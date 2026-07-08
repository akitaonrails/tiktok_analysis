package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;
import com.ss.android.ugc.aweme.relation.ffp.ui.FFPMainFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dwh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1069810dwh implements InterfaceC0148002o {
    public final FindFriendsPageArg LL;
    public final AbstractC1623806Xk<C1074840e4o> LLILLJJLI;
    public final AbstractC1623806Xk<List<User>> LLILLL;
    public final C13IQ<? extends Fragment> LLILZ;
    public final C1073970e3P LLILZIL;
    public final boolean LLILZLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1069810dwh() {
        this(null, 0 == true ? 1 : 0, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1069810dwh)) {
            return false;
        }
        C1069810dwh c1069810dwh = (C1069810dwh) obj;
        return Intrinsics.LJFF(this.LL, c1069810dwh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1069810dwh.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1069810dwh.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1069810dwh.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1069810dwh.LLILZIL) && this.LLILZLL == c1069810dwh.LLILZLL;
    }

    public final int hashCode() {
        return (((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FindFriendsPageVMState(pageNavArg=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", syncContactState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", syncFacebookState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", fullFragment=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", trackInfo=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", reportFFPShowFindFriendsPageEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1069810dwh(C19719912Dl c19719912Dl, C1073970e3P c1073970e3P, int i) {
        FindFriendsPageArg findFriendsPageArg;
        C491101vh c491101vh;
        C1073970e3P c1073970e3P2 = c1073970e3P;
        C19719912Dl c19719912DlLIZ = c19719912Dl;
        if ((i & 1) != 0) {
            findFriendsPageArg = new FindFriendsPageArg(false, 0, "", "", EnumC666200QBe.DEFAULT, null, 0, false, -1, null);
        } else {
            findFriendsPageArg = null;
        }
        if ((i & 2) != 0) {
            c491101vh = C491101vh.LIZ;
        } else {
            c491101vh = null;
        }
        C491101vh c491101vh2 = (i & 4) != 0 ? C491101vh.LIZ : null;
        c19719912DlLIZ = (i & 8) != 0 ? C13LE.LIZ(FFPMainFragment.class) : c19719912DlLIZ;
        if ((i & 16) != 0) {
            String str = null;
            c1073970e3P2 = new C1073970e3P(str, str, str, str, 31);
        }
        this(findFriendsPageArg, c491101vh, c491101vh2, c19719912DlLIZ, c1073970e3P2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1069810dwh(FindFriendsPageArg findFriendsPageArg, AbstractC1623806Xk<C1074840e4o> abstractC1623806Xk, AbstractC1623806Xk<? extends List<? extends User>> abstractC1623806Xk2, C13IQ<? extends Fragment> c13iq, C1073970e3P c1073970e3P, boolean z) {
        this.LL = findFriendsPageArg;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = abstractC1623806Xk2;
        this.LLILZ = c13iq;
        this.LLILZIL = c1073970e3P;
        this.LLILZLL = z;
    }

    public static C1069810dwh LIZ(C1069810dwh c1069810dwh, FindFriendsPageArg findFriendsPageArg, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, C13IQ c13iq, C1073970e3P c1073970e3P, boolean z, int i) {
        boolean z2 = z;
        C1073970e3P c1073970e3P2 = c1073970e3P;
        C13IQ c13iq2 = c13iq;
        AbstractC1623806Xk abstractC1623806Xk3 = abstractC1623806Xk2;
        AbstractC1623806Xk abstractC1623806Xk4 = abstractC1623806Xk;
        FindFriendsPageArg findFriendsPageArg2 = findFriendsPageArg;
        if ((i & 1) != 0) {
            findFriendsPageArg2 = c1069810dwh.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk4 = c1069810dwh.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk3 = c1069810dwh.LLILLL;
        }
        if ((i & 8) != 0) {
            c13iq2 = c1069810dwh.LLILZ;
        }
        if ((i & 16) != 0) {
            c1073970e3P2 = c1069810dwh.LLILZIL;
        }
        if ((i & 32) != 0) {
            z2 = c1069810dwh.LLILZLL;
        }
        c1069810dwh.getClass();
        return new C1069810dwh(findFriendsPageArg2, abstractC1623806Xk4, abstractC1623806Xk3, c13iq2, c1073970e3P2, z2);
    }
}
