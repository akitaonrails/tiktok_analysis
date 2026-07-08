package X;

import android.content.Context;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wzc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801980wzc implements InterfaceC1802030wzh {
    public final Context LIZ;
    public final C1802190wzx LIZIZ;
    public final IMinisRevisitMissionService LIZJ;
    public String LIZLLL;
    public C1781330wSJ LJ;
    public Function1<? super String, Unit> LJFF;
    public int LJI;

    @Override // X.InterfaceC1802030wzh
    public final void onDismiss() {
    }

    @Override // X.InterfaceC1802030wzh
    public final void LIZ() {
        C2196701AyC c2196701AyC = C2196701AyC.LIZ;
        c2196701AyC.getClass();
        C2196701AyC.LJJIII(c2196701AyC, "tm_win_reward_banner_click", null, null, false, 14);
        Function1<? super String, Unit> function1 = this.LJFF;
        if (function1 != null) {
            function1.invoke(this.LIZLLL);
        }
    }

    @Override // X.InterfaceC1802030wzh
    public final C1802010wzf LIZIZ() {
        C1799850wwB c1799850wwBLIZIZ;
        C07ZA c07za;
        boolean z;
        IMinisRevisitMissionService iMinisRevisitMissionService = this.LIZJ;
        if (iMinisRevisitMissionService == null || (c1799850wwBLIZIZ = iMinisRevisitMissionService.LIZIZ(this.LIZLLL)) == null || (c07za = c1799850wwBLIZIZ.LIZ) == null) {
            return null;
        }
        int i = C1800040wwU.LIZ[c1799850wwBLIZIZ.LIZIZ.ordinal()];
        if (i == 1) {
            z = false;
        } else {
            if (i != 2) {
                return null;
            }
            z = true;
        }
        if (c1799850wwBLIZIZ.LIZ == null) {
            return null;
        }
        C1800010wwR c1800010wwR = C1800010wwR.LIZ;
        String str = this.LIZLLL;
        EnumC1799930wwJ enumC1799930wwJ = c07za.LIZ;
        c1800010wwR.getClass();
        if (!C1800010wwR.LIZ(enumC1799930wwJ, str)) {
            return null;
        }
        C1781330wSJ c1781330wSJ = this.LJ;
        return new C1802010wzf(c1781330wSJ != null ? c1781330wSJ.LIZIZ : null, this.LIZ.getString(2131822373), Mp4ScreenVideoLoadTimeout.CONTROL, z, EnumC992990bwn.REVISIT_REWARD);
    }

    @Override // X.InterfaceC1802030wzh
    public final void LIZJ() {
        C1799850wwB c1799850wwBLIZIZ;
        C07ZA c07za;
        C2196701AyC c2196701AyC = C2196701AyC.LIZ;
        c2196701AyC.getClass();
        C2196701AyC.LJJIII(c2196701AyC, "tm_win_reward_banner_show", null, null, false, 14);
        IMinisRevisitMissionService iMinisRevisitMissionService = this.LIZJ;
        EnumC1799930wwJ enumC1799930wwJ = (iMinisRevisitMissionService == null || (c1799850wwBLIZIZ = iMinisRevisitMissionService.LIZIZ(this.LIZLLL)) == null || (c07za = c1799850wwBLIZIZ.LIZ) == null) ? null : c07za.LIZ;
        C1800010wwR c1800010wwR = C1800010wwR.LIZ;
        String str = this.LIZLLL;
        c1800010wwR.getClass();
        C1800010wwR.LIZJ(enumC1799930wwJ, str);
    }

    @Override // X.InterfaceC1802030wzh
    public final void LIZLLL() {
        this.LJI++;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
    }

    public C1801980wzc(Context context, C1802190wzx c1802190wzx, IMinisRevisitMissionService iMinisRevisitMissionService) {
        this.LIZ = context;
        this.LIZIZ = c1802190wzx;
        this.LIZJ = iMinisRevisitMissionService;
    }
}
