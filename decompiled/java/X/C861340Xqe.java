package X;

import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.profile.business.effect.EffectProfileListViewModel;

/* JADX INFO: renamed from: X.0Xqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C861340Xqe {
    public View LIZ;
    public EffectProfileListViewModel LIZIZ;

    public final void LIZ(boolean z, boolean z2) {
        boolean z3;
        EffectProfileListViewModel effectProfileListViewModel;
        if (!z2) {
            return;
        }
        if (this.LIZ != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setUserVisibleHint, isVisibleToUser ");
        sbLIZ.append(z);
        sbLIZ.append(", hasFloatingNotice ");
        sbLIZ.append(z3);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("EffectUserLevelNoticeController", C2188811AlT.LIZIZ(sbLIZ));
        if (z3) {
            if (z) {
                View view = this.LIZ;
                if (view != null) {
                    C337180DJs.LIZJ(view);
                    return;
                }
                return;
            }
            View view2 = this.LIZ;
            if (view2 == null) {
                return;
            }
            C337180DJs.LIZ(view2);
            return;
        }
        if (!z || (effectProfileListViewModel = this.LIZIZ) == null) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(effectProfileListViewModel), C0PEM.LIZJ, null, new C861290XqZ(effectProfileListViewModel, null), 2);
    }
}
