package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01vd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C490701vd implements InterfaceC0148002o {
    public final long LL;
    public final C489801vU LLILLJJLI;
    public final List<UserState> LLILLL;
    public final AbstractC1623806Xk<C938960aXe> LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;

    public C490701vd() {
        this(0L, (C489801vU) null, (List) null, (String) null, (String) null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C490701vd)) {
            return false;
        }
        C490701vd c490701vd = (C490701vd) obj;
        return this.LL == c490701vd.LL && Intrinsics.LJFF(this.LLILLJJLI, c490701vd.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c490701vd.LLILLL) && Intrinsics.LJFF(this.LLILZ, c490701vd.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c490701vd.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c490701vd.LLILZLL);
    }

    public final int hashCode() {
        int iY2 = ((((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        String str = this.LLILZIL;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZLL;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkStatusState(clientVersion=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", layoutUIState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", linkUserState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", stateChangeStatus=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", sharedBgStickerId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", aigcWallpaperUrl=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C490701vd(long j, C489801vU c489801vU, List list, String str, String str2, int i) {
        C491101vh c491101vh;
        String str3 = str;
        List list2 = list;
        C489801vU c489801vULIZ = c489801vU;
        long j2 = (i & 1) != 0 ? 0L : j;
        c489801vULIZ = (i & 2) != 0 ? C489901vV.LIZ() : c489801vULIZ;
        list2 = (i & 4) != 0 ? C13BV.INSTANCE : list2;
        if ((i & 8) != 0) {
            c491101vh = C491101vh.LIZ;
        } else {
            c491101vh = null;
        }
        this(j2, c489801vULIZ, (List<UserState>) list2, c491101vh, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? str2 : null);
    }

    public C490701vd(long j, C489801vU c489801vU, List<UserState> list, AbstractC1623806Xk<C938960aXe> abstractC1623806Xk, String str, String str2) {
        this.LL = j;
        this.LLILLJJLI = c489801vU;
        this.LLILLL = list;
        this.LLILZ = abstractC1623806Xk;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    public static C490701vd LIZ(C490701vd c490701vd, long j, C489801vU c489801vU, List list, AbstractC1623806Xk abstractC1623806Xk, String str, String str2, int i) {
        String str3 = str2;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        List list2 = list;
        C489801vU c489801vU2 = c489801vU;
        String str4 = str;
        long j2 = j;
        if ((i & 1) != 0) {
            j2 = c490701vd.LL;
        }
        if ((i & 2) != 0) {
            c489801vU2 = c490701vd.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            list2 = c490701vd.LLILLL;
        }
        if ((i & 8) != 0) {
            abstractC1623806Xk2 = c490701vd.LLILZ;
        }
        if ((i & 16) != 0) {
            str4 = c490701vd.LLILZIL;
        }
        if ((i & 32) != 0) {
            str3 = c490701vd.LLILZLL;
        }
        c490701vd.getClass();
        return new C490701vd(j2, c489801vU2, (List<UserState>) list2, (AbstractC1623806Xk<C938960aXe>) abstractC1623806Xk2, str4, str3);
    }
}
