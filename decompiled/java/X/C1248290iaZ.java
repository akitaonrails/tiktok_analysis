package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iaZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248290iaZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1248290iaZ(long j, boolean z) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(this.LL, "profile_init_view_cost_time");
        c2344009Gk.LJIIIIZZ("report_scene", "profile_platform_data_statistics");
        c2344009Gk.LJ(Boolean.valueOf(this.LLILLJJLI), "is_my_profile");
        C20684815ws.LJIILLIIL("profile_performance_data_statistics", c2344009Gk.LIZ);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobForProfilePlatformInitViewCostTime costTime: ");
        sbLIZ.append(this.LL);
        C1720106oR.LJI("ProfilePlatformStatistics", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
