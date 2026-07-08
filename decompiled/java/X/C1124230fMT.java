package X;

import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fMT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124230fMT extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1124230fMT(int i, int i2) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1094360eaI c1094360eaIHP = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_panel_tab_reddot_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(C150300hp.LIZ());
        c474500IjALIZ.LJJII(Integer.valueOf(c1094360eaIHP != null ? c1094360eaIHP.LIZ : 0), "user_level");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LL), "tab_id");
        C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
        c474500IjALIZ.LJJII(C1128460fTI.LJIIJ(Integer.valueOf(this.LL), ""), "tab_name");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILLJJLI), "tab_location");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
