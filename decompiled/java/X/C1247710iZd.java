package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iZd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247710iZd implements InterfaceC0148002o {
    public final C1252380ihA LL;
    public final AbstractC1623806Xk<FollowStatus> LLILLJJLI;
    public final AbstractC1623806Xk<BaseResponse> LLILLL;
    public final C291001Au<EnumC1252200igs> LLILZ;

    public C1247710iZd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1247710iZd)) {
            return false;
        }
        C1247710iZd c1247710iZd = (C1247710iZd) obj;
        return Intrinsics.LJFF(this.LL, c1247710iZd.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1247710iZd.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1247710iZd.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1247710iZd.LLILZ);
    }

    public final int hashCode() {
        C1252380ihA c1252380ihA = this.LL;
        int iHashCode = (((((c1252380ihA == null ? 0 : c1252380ihA.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<EnumC1252200igs> c291001Au = this.LLILZ;
        return iHashCode + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserProfileFollowState(followParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", followRequest=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", removeRequest=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", checkEventEnum=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1247710iZd(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(null, c491101vh, c491101vh, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1247710iZd(C1252380ihA c1252380ihA, AbstractC1623806Xk<FollowStatus> abstractC1623806Xk, AbstractC1623806Xk<? extends BaseResponse> abstractC1623806Xk2, C291001Au<? extends EnumC1252200igs> c291001Au) {
        this.LL = c1252380ihA;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = abstractC1623806Xk2;
        this.LLILZ = c291001Au;
    }

    public static C1247710iZd LIZ(C1247710iZd c1247710iZd, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, C291001Au c291001Au, int i) {
        C1252380ihA c1252380ihA;
        if ((i & 1) != 0) {
            c1252380ihA = c1247710iZd.LL;
        } else {
            c1252380ihA = null;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk = c1247710iZd.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk2 = c1247710iZd.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au = c1247710iZd.LLILZ;
        }
        c1247710iZd.getClass();
        return new C1247710iZd(c1252380ihA, abstractC1623806Xk, abstractC1623806Xk2, c291001Au);
    }
}
