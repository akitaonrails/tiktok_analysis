package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionFilterConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Od5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623610Od5 implements InterfaceC0148002o {
    public final WorkBenchNoticeResponse LL;
    public final EnumC623590Od3 LLILLJJLI;
    public final boolean LLILLL;
    public final List<MissionFilterConfig> LLILZ;
    public final List<InterfaceC1891350zJl> LLILZIL;
    public final C291001Au<Boolean> LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C623610Od5)) {
            return false;
        }
        C623610Od5 c623610Od5 = (C623610Od5) obj;
        return Intrinsics.LJFF(this.LL, c623610Od5.LL) && this.LLILLJJLI == c623610Od5.LLILLJJLI && this.LLILLL == c623610Od5.LLILLL && Intrinsics.LJFF(this.LLILZ, c623610Od5.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c623610Od5.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c623610Od5.LLILZLL);
    }

    public final int hashCode() {
        WorkBenchNoticeResponse workBenchNoticeResponse = this.LL;
        int iHashCode = (((((workBenchNoticeResponse == null ? 0 : workBenchNoticeResponse.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        List<MissionFilterConfig> list = this.LLILZ;
        return ((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorkBenchVMState(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isInitFetch=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", filterConfig=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", filterList=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", filterEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C623610Od5(WorkBenchNoticeResponse workBenchNoticeResponse, EnumC623590Od3 enumC623590Od3, boolean z, List<MissionFilterConfig> list, List<InterfaceC1891350zJl> list2, C291001Au<Boolean> c291001Au) {
        this.LL = workBenchNoticeResponse;
        this.LLILLJJLI = enumC623590Od3;
        this.LLILLL = z;
        this.LLILZ = list;
        this.LLILZIL = list2;
        this.LLILZLL = c291001Au;
    }

    public static C623610Od5 LIZ(C623610Od5 c623610Od5, WorkBenchNoticeResponse workBenchNoticeResponse, EnumC623590Od3 enumC623590Od3, boolean z, List list, List list2, C291001Au c291001Au, int i) {
        C291001Au c291001Au2 = c291001Au;
        List list3 = list2;
        List list4 = list;
        boolean z2 = z;
        EnumC623590Od3 enumC623590Od32 = enumC623590Od3;
        WorkBenchNoticeResponse workBenchNoticeResponse2 = workBenchNoticeResponse;
        if ((i & 1) != 0) {
            workBenchNoticeResponse2 = c623610Od5.LL;
        }
        if ((i & 2) != 0) {
            enumC623590Od32 = c623610Od5.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z2 = c623610Od5.LLILLL;
        }
        if ((i & 8) != 0) {
            list4 = c623610Od5.LLILZ;
        }
        if ((i & 16) != 0) {
            list3 = c623610Od5.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au2 = c623610Od5.LLILZLL;
        }
        c623610Od5.getClass();
        return new C623610Od5(workBenchNoticeResponse2, enumC623590Od32, z2, list4, list3, c291001Au2);
    }
}
