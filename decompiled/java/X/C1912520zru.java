package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.journey.step.slogan.ControlSloganFragment;
import com.ss.android.ugc.aweme.journey.step.slogan.SloganAndConsentFragment;
import com.ss.android.ugc.aweme.journey.step.slogan.SplashSloganFragment;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912520zru extends C10PJ<C1869040yjm> implements InterfaceC1912580zs0 {
    @Override // X.InterfaceC1912580zs0
    public final void LIZIZ() {
        LJ();
    }

    @Override // X.C10P7
    public final C10NW type() {
        return C10NW.JOURNEY_SLOGAN_ID;
    }

    @Override // X.C10PJ
    public final NUJComponentFragment LJI(C1869040yjm c1869040yjm) {
        NUJComponentFragment controlSloganFragment;
        C19233810Mm.LIZ.getClass();
        C19233810Mm.LIZ(C10MR.class);
        String strLJFF = C10MR.LJFF();
        if (Intrinsics.LJFF(strLJFF, "revamp")) {
            controlSloganFragment = new SloganAndConsentFragment();
        } else if (Intrinsics.LJFF(strLJFF, "splash")) {
            controlSloganFragment = new SplashSloganFragment();
        } else {
            controlSloganFragment = new ControlSloganFragment();
        }
        C1912560zry c1912560zryLJFF = this.LIZ.LIZ.LJFF();
        Bundle bundle = new Bundle();
        int i = c1912560zryLJFF.LIZIZ;
        if (i > 0) {
            bundle.putInt("extra_optimize_option", i);
            bundle.putBoolean("extra_is_saveinstance", c1912560zryLJFF.LIZJ);
        }
        bundle.putBoolean("extra_new_version", false);
        bundle.putBoolean("useNewAppUpdateSloganUI", false);
        controlSloganFragment.setArguments(bundle);
        return controlSloganFragment;
    }

    public C1912520zru(C1912470zrp c1912470zrp, C10P6 c10p6) {
        super(c1912470zrp, c10p6);
    }

    @Override // X.C10PJ, X.C10P5, X.C10P7
    public final void LIZLLL(C1912470zrp c1912470zrp, C1869040yjm c1869040yjm, Function1<? super C19240810Pe, Unit> function1) {
        C1911410zq7.LIZ("NewSloganPageComponent", "execute");
        C1912370zrf.LIZ.getClass();
        C1912370zrf.LIZ(this);
        super.LIZLLL(c1912470zrp, c1869040yjm, function1);
    }
}
